package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Pengtao Qiu
 */
public class FieldDefinition {

    private final String name;
    private final List<AnnotationValue> annotations;
    private final ParametricType parametricType;
    private final DefinitionReference declaredClassReference;
    private final Object defaultValue;
    private final ModifierEnum modifier;

    public FieldDefinition(String name, List<AnnotationValue> annotations,
                           ParametricType parametricType,
                           DefinitionReference declaredClassReference,
                           Object defaultValue,
                           ModifierEnum modifier) {
        this.name = name;
        this.annotations = annotations;
        this.parametricType = parametricType;
        this.declaredClassReference = declaredClassReference;
        this.defaultValue = defaultValue;
        this.modifier = modifier;
    }

    public String getName() {
        return name;
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public ClassDefinition getClassDefinition() {
        return parametricType.getClassDefinition();
    }

    public boolean isTemplateField() {
        return parametricType == null;
    }

    public ParametricType getParametricType() {
        return parametricType;
    }

    public ClassDefinition getDeclaredClassDefinition() {
        return declaredClassReference.getClassDefinition();
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public List<Object> getDefaultValues() {
        if (defaultValue != null && defaultValue instanceof List) {
            return (List<Object>) defaultValue;
        } else {
            return Collections.emptyList();
        }
    }

    public ModifierEnum getModifier() {
        return modifier;
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
