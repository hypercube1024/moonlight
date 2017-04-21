package com.moonlightsource.idl.compiler.model;

import java.util.List;
import java.util.Objects;

/**
 * @author Pengtao Qiu
 */
public class FieldDefinition {

    private final String name;
    private final List<AnnotationValue> annotations;
    private final DefinitionReference typeReference;

    public FieldDefinition(String name, List<AnnotationValue> annotations, DefinitionReference typeReference) {
        this.name = name;
        this.annotations = annotations;
        this.typeReference = typeReference;
    }

    public String getName() {
        return name;
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public ClassDefinition getClassDefinition() {
        return typeReference.getClassDefinition();
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
