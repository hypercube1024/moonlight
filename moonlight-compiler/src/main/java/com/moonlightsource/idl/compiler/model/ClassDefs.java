package com.moonlightsource.idl.compiler.model;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.*;

import static com.moonlightsource.idl.compiler.utils.ParseTreeUtils.*;

/**
 * @author Pengtao Qiu
 */
public class ClassDefs {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    private Map<String, Map<String, List<String>>> classDeclarationMap = new HashMap<>();
    private List<Source> sources = new ArrayList<>();
    private Map<Path, Map<String, Set<String>>> imports = new HashMap<>();

    public ClassDefs() {
        TypeEnum.BASE_TYPE_ENUMS.forEach(t -> putClassDeclaration("", t.getKeyword(), Collections.emptyList()));
        putClassDeclaration("", TypeEnum.LIST.getKeyword(), Collections.singletonList("T"));
        putClassDeclaration("", TypeEnum.SET.getKeyword(), Collections.singletonList("T"));
        putClassDeclaration("", TypeEnum.MAP.getKeyword(), Arrays.asList("T0", "T1"));
    }

    public synchronized void putNamespace(String namespace) {
        classDeclarationMap.computeIfAbsent(namespace, k -> new HashMap<>());
    }

    public synchronized void putClassDeclaration(String namespace, String className, List<String> parametricDefs) {
        if (containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class [" + namespace + "." + className + "] exists");
        }

        classDeclarationMap.computeIfAbsent(namespace, k -> new HashMap<>())
                           .computeIfAbsent(className, k -> new ArrayList<>())
                           .addAll(parametricDefs);
    }

    private Set<String> getClassNames(String namespace) {
        Map<String, List<String>> classNameAndParametricDeclaration = classDeclarationMap.get(namespace);
        if (classNameAndParametricDeclaration != null && !classNameAndParametricDeclaration.isEmpty()) {
            return classNameAndParametricDeclaration.keySet();
        } else {
            return Collections.emptySet();
        }
    }

    private boolean containNamespace(String namespace) {
        if (log.isDebugEnabled()) {
            log.debug("existed namespaces -> {}", classDeclarationMap.keySet());
        }
        return classDeclarationMap.keySet().contains(namespace);
    }

    private boolean containClass(String namespace, String className) {
        return getClassNames(namespace).contains(className);
    }

    private boolean checkParametricTypeCount(String namespace, String className, int count) {
        if (!containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class [" + namespace + "." + className + "] is not found");
        }

        return classDeclarationMap.get(namespace).get(className).size() == count;
    }

    public synchronized void addSource(Source source) {
        sources.add(source);
    }

    public List<Source> getSources() {
        return sources;
    }

    public synchronized void putImport(Path path, String namespace, String name) {
        imports.computeIfAbsent(path, k -> new HashMap<>())
               .computeIfAbsent(namespace, k -> new HashSet<>())
               .add(name);
    }

    public void checkSyntax() {
        // import semantic check
        if (log.isDebugEnabled()) {
            log.debug("all imports -> {}", imports);
            log.debug("all classes -> {}", classDeclarationMap);
        }

        imports.forEach((path, m) -> {
            Source source = findSource(path);
            if (source != null) {
                m.forEach((namespace, names) -> names.forEach(name -> {
                    if (name.equals("*")) {
                        if (!containNamespace(namespace)) {
                            throw new CompilingRuntimeException("the namespace [" + namespace + "] is not found");
                        }
                        getClassNames(namespace).forEach(n -> source.putImport(namespace, n));
                    } else {
                        if (!containClass(namespace, name)) {
                            throw new CompilingRuntimeException("the class [" + namespace + "." + name + "] is not found");
                        }
                        source.putImport(namespace, name);
                    }
                }));
            } else {
                throw new CompilingRuntimeException("the source " + path + " is not found");
            }
        });

        // class check
        sources.parallelStream().forEach(source -> {
            source.getFileAnnotations().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

            source.getStructs().parallelStream().forEach(struct -> {
                struct.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

                struct.structField().parallelStream().forEach(structFieldDef -> {
                    structFieldDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));
                    // TODO struct field check
                });
            });

            source.getInterfaces().parallelStream().forEach(interfaceDef -> {
                interfaceDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));
                interfaceDef.functionDeclaration().parallelStream().forEach(functionDef -> {
                    functionDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

                    functionDef.functionParameter().parallelStream().forEach(functionParamDef -> {
                        functionParamDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));
                        // TODO function field check
                    });

                    // TODO function return value check
                });

            });

            source.getAnnotations()
                  .parallelStream()
                  .forEach(annotationDef -> annotationDef.annotation().parallelStream()
                                                         .forEach(annotationCtx -> annotationCheck(annotationCtx, source)));

            source.getEnums().parallelStream().forEach(enumDef -> {
                enumDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));
                enumDef.enumField().parallelStream().forEach(enumFieldDef -> enumFieldDef.annotation().parallelStream()
                                                                                         .forEach(annotationCtx -> annotationCheck(annotationCtx, source)));
            });
        });
    }

    private void annotationCheck(MoonlightParser.AnnotationContext annotationCtx, Source source) {
        String className = getAnnotationClassName(annotationCtx);
        String namespace = getAnnotationNamespace(className, annotationCtx, source);

        if (!containClass(namespace, className)) {
            throw new CompilingRuntimeException("the annotation [" + namespace + "." + className + "] is not found",
                    annotationCtx.AnnotationLabel(), source.getPath());
        }

        // annotation field check
        MoonlightParser.AnnotationDeclarationContext annotationDef = sources.parallelStream()
                                                                            .filter(s -> s.getNamespace().equals(namespace))
                                                                            .filter(s -> s.findAnnotation(className) != null)
                                                                            .map(s -> s.findAnnotation(className))
                                                                            .findAny().orElse(null);
        if (annotationDef == null) {
            throw new CompilingRuntimeException("the annotation [" + namespace + "." + className + "] is not found",
                    annotationCtx.AnnotationLabel(), source.getPath());
        }

        annotationCtx.baseAssignment().parallelStream().forEach(baseAssignmentCtx -> {
            String fieldName = baseAssignmentCtx.Identifier().getText();

            Optional<MoonlightParser.BaseFieldContext> optional = annotationDef.baseField().parallelStream()
                                                                               .filter(baseFieldCtx -> fieldName.equals(getBaseFieldName(baseFieldCtx)))
                                                                               .findAny();
            if (!optional.isPresent()) {
                throw new CompilingRuntimeException("the annotation field [" + namespace + "." + className + "." + fieldName + "] is not found",
                        baseAssignmentCtx.Identifier(), source.getPath());
            }

            optional = annotationDef.baseField().parallelStream()
                                    .filter(baseFieldCtx -> fieldName.equals(getBaseFieldName(baseFieldCtx))
                                            && matchBaseFieldType(baseFieldCtx, baseAssignmentCtx))
                                    .findAny();

            if (!optional.isPresent()) {
                throw new CompilingRuntimeException("the annotation field [" + namespace + "." + className + "." + fieldName + "] type does not match.",
                        baseAssignmentCtx.Identifier(), source.getPath());
            }
        });
    }

    private Source findSource(Path path) {
        return sources.parallelStream().filter(source -> source.getPath().equals(path)).findFirst().orElse(null);
    }

}
