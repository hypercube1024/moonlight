package com.moonlightsource.idl.compiler.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class Source {

    private List<AnnotationValue> annotations;
    private String namespace = "";
    private List<String> imports = new ArrayList<>();
    private List<EnumDefinition> enumDefinitions = new ArrayList<>();
    private List<AnnotationDefinition> annotationDefinitions = new ArrayList<>();
    private List<StructDefinition> structDefinitions = new ArrayList<>();
    private List<InterfaceDefinition> interfaceDefinitions = new ArrayList<>();

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<AnnotationValue> annotations) {
        this.annotations = annotations;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public List<EnumDefinition> getEnumDefinitions() {
        return enumDefinitions;
    }

    public void setEnumDefinitions(List<EnumDefinition> enumDefinitions) {
        this.enumDefinitions = enumDefinitions;
    }

    public List<AnnotationDefinition> getAnnotationDefinitions() {
        return annotationDefinitions;
    }

    public void setAnnotationDefinitions(List<AnnotationDefinition> annotationDefinitions) {
        this.annotationDefinitions = annotationDefinitions;
    }

    public List<StructDefinition> getStructDefinitions() {
        return structDefinitions;
    }

    public void setStructDefinitions(List<StructDefinition> structDefinitions) {
        this.structDefinitions = structDefinitions;
    }

    public List<InterfaceDefinition> getInterfaceDefinitions() {
        return interfaceDefinitions;
    }

    public void setInterfaceDefinitions(List<InterfaceDefinition> interfaceDefinitions) {
        this.interfaceDefinitions = interfaceDefinitions;
    }
}
