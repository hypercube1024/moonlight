package com.moonlightsource.idl.compiler.model;

import java.util.List;
import java.util.Objects;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinition {

    private final TypeEnum type;
    private final String name;
    private final String namespace;
    private final List<ClassDefinition> parametricTypes;
    private final List<AnnotationValue> annotations;

    public ClassDefinition(TypeEnum type, String name, String namespace, List<ClassDefinition> parametricTypes, List<AnnotationValue> annotations) {
        this.type = type;
        this.name = name;
        this.namespace = namespace;
        this.parametricTypes = parametricTypes;
        this.annotations = annotations;
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

    public List<ClassDefinition> getParametricTypes() {
        return parametricTypes;
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
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
