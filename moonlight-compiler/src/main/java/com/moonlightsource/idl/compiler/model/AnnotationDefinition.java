package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class AnnotationDefinition extends ClassDefinition {

    private List<AnnotationFieldDefinition> fields;

    public List<AnnotationFieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<AnnotationFieldDefinition> fields) {
        this.fields = fields;
    }
}
