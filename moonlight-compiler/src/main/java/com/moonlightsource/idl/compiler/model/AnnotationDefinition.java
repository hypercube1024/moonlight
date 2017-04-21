package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class AnnotationDefinition extends ClassDefinition {

    private final List<AnnotationFieldDefinition> fields;

    public AnnotationDefinition(TypeEnum type, String name, String namespace, List<ClassDefinition> parametricTypes, List<AnnotationValue> annotations, List<AnnotationFieldDefinition> fields) {
        super(type, name, namespace, parametricTypes, annotations);
        this.fields = fields;
    }

    public List<AnnotationFieldDefinition> getFields() {
        return fields;
    }
}
