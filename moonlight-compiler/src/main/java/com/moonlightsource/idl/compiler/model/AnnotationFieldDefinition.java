package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class AnnotationFieldDefinition extends FieldDefinition {

    private final List<Object> values;
    private final DefinitionReference declaredAnnotationReference;

    public AnnotationFieldDefinition(String name, DefinitionReference typeReference, List<Object> values, DefinitionReference declaredAnnotationReference) {
        super(name, Collections.emptyList(), typeReference);
        this.values = values;
        this.declaredAnnotationReference = declaredAnnotationReference;
    }

    public List<Object> getValues() {
        return values;
    }

    public Object getValue() {
        if (values == null || values.isEmpty()) {
            return null;
        } else {
            return values.get(0);
        }
    }

    public AnnotationDefinition getDeclaredAnnotationDefinition() {
        return (AnnotationDefinition) declaredAnnotationReference.getClassDefinition();
    }
}
