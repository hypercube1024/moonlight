package com.moonlightsource.idl.compiler.model;

import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class Source {

    private final List<AnnotationValue> annotations = new ArrayList<>();
    private String namespace;
    private final Map<String, Set<String>> imports = new HashMap<>();
    private final List<EnumDefinition> enumDefinitions = new ArrayList<>();
    private final List<AnnotationDefinition> annotationDefinitions = new ArrayList<>();
    private final List<StructDefinition> structDefinitions = new ArrayList<>();
    private final List<InterfaceDefinition> interfaceDefinitions = new ArrayList<>();

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

    public List<EnumDefinition> getEnumDefinitions() {
        return enumDefinitions;
    }

    public List<AnnotationDefinition> getAnnotationDefinitions() {
        return annotationDefinitions;
    }

    public List<StructDefinition> getStructDefinitions() {
        return structDefinitions;
    }

    public List<InterfaceDefinition> getInterfaceDefinitions() {
        return interfaceDefinitions;
    }
}
