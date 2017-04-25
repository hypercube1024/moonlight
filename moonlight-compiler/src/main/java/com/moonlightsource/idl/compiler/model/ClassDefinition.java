package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinition {

    private final TypeEnum type;
    private final String name;
    private final String namespace;
    private final List<AnnotationValue> annotations;
    private final Set<String> parametricDefinitions;
    private final List<FieldDefinition> fieldDefinitions;
    private final List<ParametricType> parentClasses;
    private final List<FunctionDefinition> functions;

    public ClassDefinition(TypeEnum type, String name, String namespace,
                           List<AnnotationValue> annotations,
                           Set<String> parametricDefinitions,
                           List<FieldDefinition> fieldDefinitions) {
        this(type, name, namespace, annotations, parametricDefinitions, fieldDefinitions, Collections.emptyList(), Collections.emptyList());
    }

    public ClassDefinition(TypeEnum type, String name, String namespace,
                           List<AnnotationValue> annotations,
                           Set<String> parametricDefinitions,
                           List<FieldDefinition> fieldDefinitions,
                           List<ParametricType> parentClasses,
                           List<FunctionDefinition> functions) {
        this.type = type;
        this.name = name;
        this.namespace = namespace;
        this.annotations = annotations;
        this.parametricDefinitions = parametricDefinitions;
        this.fieldDefinitions = fieldDefinitions;
        this.parentClasses = parentClasses;
        this.functions = functions;
    }

    public TypeEnum getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getNamespace() {
        return namespace;
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public Set<String> getParametricDefinitions() {
        return parametricDefinitions;
    }

    public List<FieldDefinition> getFieldDefinitions() {
        return fieldDefinitions;
    }

    public List<ParametricType> getParentClasses() {
        return parentClasses;
    }

    public List<FunctionDefinition> getFunctions() {
        return functions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDefinition that = (ClassDefinition) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(namespace, that.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace);
    }

    @Override
    public String toString() {
        return "ClassDefinition{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}
