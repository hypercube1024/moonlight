package com.moonlightsource.idl.compiler.model;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class SourceFile {

    private Path path;
    private String namespace;
    private List<String> imports;
    private List<EnumDefinition> enumDefinitions;
    private List<AnnotationDefinition> annotationDefinitions;
    private List<StructDefinition> structDefinitions;
    private List<InterfaceDefinition> interfaceDefinitions;

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
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
