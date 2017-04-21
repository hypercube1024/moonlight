package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class EnumDefinition extends ClassDefinition {

    private final List<EnumFieldDefinition> fields;

    public EnumDefinition(TypeEnum type, String name, String namespace, List<ClassDefinition> parametricTypes, List<AnnotationValue> annotations, List<EnumFieldDefinition> fields) {
        super(type, name, namespace, parametricTypes, annotations);
        this.fields = fields;
    }

    public List<EnumFieldDefinition> getFields() {
        return fields;
    }
}
