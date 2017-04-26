package com.moonlightsource.idl.compiler.model;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.*;

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
        sources.forEach(source -> {
            source.getStructs().forEach(struct -> {
                struct.annotation().forEach(annotationCtx -> {
                    String className = annotationCtx.AnnotationLabel().getText();
                    String namespace;
                    if (annotationCtx.namespaceValue() != null) {
                        namespace = annotationCtx.namespaceValue().getText();
                    } else {
                        namespace = source.getImportNamespace(className);
                    }
                    if (!containClass(namespace, className)) {
                        throw new CompilingRuntimeException("the annotation [" + namespace + "." + className + "] is not found",
                                annotationCtx.AnnotationLabel(), source.getPath());
                    }
                });
                String className = struct.Identifier().getText();
                // TODO
            });

            source.getAnnotations().forEach(annotation -> {

            });
        });

        // TODO
    }

    private Source findSource(Path path) {
        return sources.parallelStream().filter(source -> source.getPath().equals(path)).findFirst().orElse(null);
    }

}
