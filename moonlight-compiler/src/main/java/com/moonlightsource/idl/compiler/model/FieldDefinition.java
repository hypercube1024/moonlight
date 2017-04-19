package com.moonlightsource.idl.compiler.model;

import java.util.List;
import java.util.Objects;

/**
 * @author Pengtao Qiu
 */
public class FieldDefinition {

    private String name;
    private ClassDefinition classDefinition;
    private List<AnnotationValue> annotations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassDefinition getClassDefinition() {
        return classDefinition;
    }

    public void setClassDefinition(ClassDefinition classDefinition) {
        this.classDefinition = classDefinition;
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
        FieldDefinition that = (FieldDefinition) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
