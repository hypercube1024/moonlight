package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class EnumFieldDefinition extends FieldDefinition {

    private final Object value;

    public EnumFieldDefinition(String name, List<AnnotationValue> annotations, DefinitionReference typeReference, Object value) {
        super(name, annotations, typeReference);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
