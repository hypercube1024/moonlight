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
            throw new CompilingRuntimeException("duplicated class [" + namespace + "." + className + "]");
        }

        classDeclarationMap.computeIfAbsent(namespace, k -> new HashMap<>())
                           .computeIfAbsent(className, k -> new ArrayList<>())
                           .addAll(parametricDefs);
    }

    private Set<String> getClassNames(String namespace) {
        Map<String, List<String>> classes = classDeclarationMap.get(namespace);
        if (classes != null && !classes.isEmpty()) {
            return classes.keySet();
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

    public void semanticCheck() {
        if (log.isDebugEnabled()) {
            log.debug("all imports -> {}", imports);
            log.debug("all classes -> {}", classDeclarationMap);
        }
        preprocessImport();
        sourceCheck();
    }

    private void preprocessImport() {
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
    }

    private void sourceCheck() {
        sources.parallelStream().forEach(source -> {
            fileAnnotationCheck(source);
            structDefinitionCheck(source);
            interfaceDefinitionCheck(source);
            annotationDefinitionCheck(source);
            enumDefinitionCheck(source);
        });
    }

    private void fileAnnotationCheck(Source source) {
        source.getFileAnnotations().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));
    }

    private void structDefinitionCheck(Source source) {
        source.getStructs().parallelStream().forEach(struct -> {
            // struct annotation check
            struct.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

            // parent struct check
            MoonlightParser.ReferenceTypeContext parentTypeCtx = struct.referenceType();
            if (parentTypeCtx != null) {
                parentStructTypeCheck(parentTypeCtx, struct, source);
            }

            if (struct.structField() != null && !struct.structField().isEmpty()) {
                struct.structField().parallelStream().forEach(structFieldDef -> {
                    // struct field annotation check
                    structFieldDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

                    // struct field type check
                    MoonlightParser.FieldTypeContext fieldTypeCtx = structFieldDef.fieldType();
                    if (fieldTypeCtx.referenceType() != null) {
                        structFieldReferenceTypeCheck(fieldTypeCtx.referenceType(), struct, source);
                    } else if (fieldTypeCtx.containerType() != null) {
                        MoonlightParser.ContainerTypeContext containerTypeContext = fieldTypeCtx.containerType();
                        if (containerTypeContext.listType() != null) {
                            partialSpecializationTypeCheck(containerTypeContext.listType().fieldType(), struct, source);
                        } else if (containerTypeContext.setType() != null) {
                            partialSpecializationTypeCheck(containerTypeContext.setType().fieldType(), struct, source);
                        } else if (containerTypeContext.mapType() != null) {
                            containerTypeContext.mapType().fieldType().forEach(f -> partialSpecializationTypeCheck(f, struct, source));
                        }
                    }
                });
            }
        });
    }

    private void interfaceDefinitionCheck(Source source) {
        source.getInterfaces().parallelStream().forEach(interfaceDef -> {
            // interface annotation check
            interfaceDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

            Set<String> signatureSet = new HashSet<>();
            if (interfaceDef.functionDeclaration() != null && !interfaceDef.functionDeclaration().isEmpty()) {
                interfaceDef.functionDeclaration().forEach(fun -> {
                    // function annotation check
                    fun.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

                    String name = fun.Identifier().getText();
                    StringBuilder signatureBuilder = new StringBuilder();
                    signatureBuilder.append(name).append("(");
                    if (fun.functionParameter() != null && !fun.functionParameter().isEmpty()) {
                        fun.functionParameter().forEach(p -> {
                            // parameter annotation check
                            p.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));

                            // function parameter check
                            MoonlightParser.FieldTypeContext fieldTypeContext = p.fieldType();
                            if (fieldTypeContext.referenceType() != null) {
                                MoonlightParser.ReferenceTypeContext refTypeCtx = fieldTypeContext.referenceType();
                                functionReferenceTypeCheck(refTypeCtx, source);

                                String paramClassName = getReferenceTypeClassName(refTypeCtx);
                                String paramNamespace = getReferenceTypeNamespace(paramClassName, refTypeCtx, source);
                                signatureBuilder.append(paramNamespace).append(".").append(paramClassName).append(",");
                            } else if (fieldTypeContext.containerType() != null) {
                                functionContainerTypeCheck(fieldTypeContext.containerType(), source);
                                signatureBuilder.append(getContainerTypeEnum(fieldTypeContext.containerType()).getKeyword()).append(",");
                            } else if (fieldTypeContext.baseType() != null) {
                                signatureBuilder.append(getBaseFieldTypeEnum(fieldTypeContext.baseType()).getKeyword()).append(",");
                            }
                        });
                        signatureBuilder.deleteCharAt(signatureBuilder.length() - 1);
                    }
                    signatureBuilder.append(")");
                    String signature = signatureBuilder.toString();
                    log.debug("the function signature -> {}", signature);
                    if (signatureSet.contains(signature)) {
                        throw new CompilingRuntimeException("duplicated function [" + name + "]", fun.Identifier(), source.getPath());
                    } else {
                        signatureSet.add(signature);
                    }

                    // function return type check
                    if (fun.functionReturnType().fieldType() != null) {
                        MoonlightParser.FieldTypeContext fieldTypeContext = fun.functionReturnType().fieldType();
                        if (fieldTypeContext.referenceType() != null) {
                            MoonlightParser.ReferenceTypeContext refTypeCtx = fun.functionReturnType().fieldType().referenceType();
                            functionReferenceTypeCheck(refTypeCtx, source);
                        } else if (fieldTypeContext.containerType() != null) {
                            functionContainerTypeCheck(fieldTypeContext.containerType(), source);
                        }
                    }
                });
            }
        });
    }

    private void annotationDefinitionCheck(Source source) {
        source.getAnnotations()
              .parallelStream()
              .forEach(a -> a.annotation()
                             .parallelStream()
                             .forEach(annotationCtx -> annotationCheck(annotationCtx, source)));
    }

    private void enumDefinitionCheck(Source source) {
        source.getEnums().parallelStream().forEach(enumDef -> {
            if (enumDef.annotation() != null && !enumDef.annotation().isEmpty()) {
                enumDef.annotation().parallelStream().forEach(annotationCtx -> annotationCheck(annotationCtx, source));
            }

            if (enumDef.enumField() != null && !enumDef.enumField().isEmpty()) {
                enumDef.enumField()
                       .parallelStream()
                       .forEach(f -> f.annotation().parallelStream()
                                      .forEach(annotationCtx -> annotationCheck(annotationCtx, source)));
            }
        });
    }

    private void structFieldReferenceTypeCheck(MoonlightParser.ReferenceTypeContext refTypeCtx, MoonlightParser.StructDeclarationContext struct, Source source) {
        // struct check
        String className = getReferenceTypeClassName(refTypeCtx);
        String namespace = getReferenceTypeNamespace(className, refTypeCtx, source);

        List<String> parametricDefs = getParametricDefs(struct);
        boolean special = containClass(namespace, className);
        boolean generic = parametricDefs.contains(className);
        if (!(special || generic)) {
            throw new CompilingRuntimeException("can not resolve symbol [" + className + "]",
                    refTypeCtx.Identifier(), source.getPath());
        }

        // parametric type check
        int parametricTypeCount = refTypeCtx.parametricTypeExpr() != null ? refTypeCtx.parametricTypeExpr().fieldType().size() : 0;
        if (special && !checkParametricTypeCount(namespace, className, parametricTypeCount)) {
            throw new CompilingRuntimeException("parametric specialized count error", refTypeCtx.Identifier(), source.getPath());
        }
        if (parametricTypeCount > 0) {
            refTypeCtx.parametricTypeExpr().fieldType().forEach(f -> partialSpecializationTypeCheck(f, struct, source));
        }
    }

    private void parentStructTypeCheck(MoonlightParser.ReferenceTypeContext refTypeCtx, MoonlightParser.StructDeclarationContext struct, Source source) {
        // parent struct check
        String parentClassName = getReferenceTypeClassName(refTypeCtx);
        String parentNamespace = getReferenceTypeNamespace(parentClassName, refTypeCtx, source);

        if (parentClassName.equals(struct.Identifier().getText())) {
            throw new CompilingRuntimeException("the struct [" + struct.Identifier().getText() + "] can not extend self",
                    refTypeCtx.Identifier(), source.getPath());
        }

        if (!containClass(parentNamespace, parentClassName)) {
            throw new CompilingRuntimeException("the parent struct [" + parentNamespace + "." + parentClassName + "] is not found",
                    refTypeCtx.Identifier(), source.getPath());
        }

        // parametric type check
        int parametricTypeCount = refTypeCtx.parametricTypeExpr() != null ? refTypeCtx.parametricTypeExpr().fieldType().size() : 0;
        if (!checkParametricTypeCount(parentNamespace, parentClassName, parametricTypeCount)) {
            throw new CompilingRuntimeException("parametric specialized count error", refTypeCtx.Identifier(), source.getPath());
        }
        if (parametricTypeCount > 0) {
            refTypeCtx.parametricTypeExpr().fieldType().forEach(f -> partialSpecializationTypeCheck(f, struct, source));
        }
    }

    private void partialSpecializationTypeCheck(MoonlightParser.FieldTypeContext f, MoonlightParser.StructDeclarationContext struct, Source source) {
        List<String> parametricDefs = getParametricDefs(struct);
        walkParametricTypes(f, (fieldTypeCtx, type) -> {
            if (type == TypeEnum.REFERENCE) {
                MoonlightParser.ReferenceTypeContext referenceTypeContext = fieldTypeCtx.referenceType();
                String className = getReferenceTypeClassName(referenceTypeContext);
                String namespace = getReferenceTypeNamespace(className, referenceTypeContext, source);
                log.debug("parametric type -> {}, {}", namespace, className);
                boolean special = containClass(namespace, className);
                boolean generic = parametricDefs.contains(className);
                if (!(special || generic)) {
                    throw new CompilingRuntimeException("can not resolve symbol [" + className + "]", referenceTypeContext.Identifier(), source.getPath());
                }

                int parametricTypeCount = referenceTypeContext.parametricTypeExpr() != null ? referenceTypeContext.parametricTypeExpr().fieldType().size() : 0;
                if (special && !checkParametricTypeCount(namespace, className, parametricTypeCount)) {
                    throw new CompilingRuntimeException("parametric specialized count error", referenceTypeContext.Identifier(), source.getPath());
                }
            }
        });
    }

    private void specializationTypeCheck(MoonlightParser.FieldTypeContext f, Source source) {
        walkParametricTypes(f, (fieldTypeCtx, type) -> {
            if (type == TypeEnum.REFERENCE) {
                MoonlightParser.ReferenceTypeContext referenceTypeContext = fieldTypeCtx.referenceType();
                String className = getReferenceTypeClassName(referenceTypeContext);
                String namespace = getReferenceTypeNamespace(className, referenceTypeContext, source);
                log.debug("parametric type -> {}, {}", namespace, className);
                if (!containClass(namespace, className)) {
                    throw new CompilingRuntimeException("can not resolve symbol [" + className + "]", referenceTypeContext.Identifier(), source.getPath());
                }

                int parametricTypeCount = referenceTypeContext.parametricTypeExpr() != null ? referenceTypeContext.parametricTypeExpr().fieldType().size() : 0;
                if (!checkParametricTypeCount(namespace, className, parametricTypeCount)) {
                    throw new CompilingRuntimeException("parametric specialized count error", referenceTypeContext.Identifier(), source.getPath());
                }
            }
        });
    }

    private void functionContainerTypeCheck(MoonlightParser.ContainerTypeContext containerTypeContext, Source source) {
        if (containerTypeContext.listType() != null) {
            specializationTypeCheck(containerTypeContext.listType().fieldType(), source);
        } else if (containerTypeContext.setType() != null) {
            specializationTypeCheck(containerTypeContext.setType().fieldType(), source);
        } else if (containerTypeContext.mapType() != null) {
            containerTypeContext.mapType().fieldType().forEach(f -> specializationTypeCheck(f, source));
        }
    }

    private void functionReferenceTypeCheck(MoonlightParser.ReferenceTypeContext refTypeCtx, Source source) {
        String className = getReferenceTypeClassName(refTypeCtx);
        String namespace = getReferenceTypeNamespace(className, refTypeCtx, source);

        if (!containClass(namespace, className)) {
            throw new CompilingRuntimeException("can not resolve symbol [" + className + "]",
                    refTypeCtx.Identifier(), source.getPath());
        }

        int parametricTypeCount = refTypeCtx.parametricTypeExpr() != null ? refTypeCtx.parametricTypeExpr().fieldType().size() : 0;
        if (!checkParametricTypeCount(namespace, className, parametricTypeCount)) {
            throw new CompilingRuntimeException("parametric specialized count error", refTypeCtx.Identifier(), source.getPath());
        }
        if (parametricTypeCount > 0) {
            refTypeCtx.parametricTypeExpr().fieldType().forEach(f -> specializationTypeCheck(f, source));
        }
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

        if (annotationCtx.baseAssignment() != null && !annotationCtx.baseAssignment().isEmpty()) {
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
    }

    private Source findSource(Path path) {
        return sources.parallelStream().filter(source -> source.getPath().equals(path)).findFirst().orElse(null);
    }

}
