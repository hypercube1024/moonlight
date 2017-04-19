package com.moonlightsource.model;

import java.util.List;
import java.util.Objects;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinition {

    private TypeEnum type;
    private String name;
    private String namespace;
    private List<ClassDefinition> parametricTypes;
    private List<AnnotationValue> annotations;

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<ClassDefinition> getParametricTypes() {
        return parametricTypes;
    }

    public void setParametricTypes(List<ClassDefinition> parametricTypes) {
        this.parametricTypes = parametricTypes;
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<AnnotationValue> annotations) {
        this.annotations = annotations;
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
}
