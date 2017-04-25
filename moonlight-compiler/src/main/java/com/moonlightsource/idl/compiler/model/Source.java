package com.moonlightsource.idl.compiler.model;

import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class Source {

    private final List<AnnotationValue> annotations = new ArrayList<>();
    private String namespace;
    private final Map<String, Set<String>> imports = new HashMap<>();
    private final List<ClassDefinition> enumDefinitions = new ArrayList<>();
    private final List<ClassDefinition> annotationDefinitions = new ArrayList<>();
    private final List<ClassDefinition> structDefinitions = new ArrayList<>();
    private final List<ClassDefinition> interfaceDefinitions = new ArrayList<>();

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Map<String, Set<String>> getImports() {
        return imports;
    }

    public List<ClassDefinition> getEnumDefinitions() {
        return enumDefinitions;
    }

    public List<ClassDefinition> getAnnotationDefinitions() {
        return annotationDefinitions;
    }

    public List<ClassDefinition> getStructDefinitions() {
        return structDefinitions;
    }

    public List<ClassDefinition> getInterfaceDefinitions() {
        return interfaceDefinitions;
    }
}
