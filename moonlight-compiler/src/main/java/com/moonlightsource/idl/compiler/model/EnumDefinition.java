package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class EnumDefinition extends ClassDefinition {

    private List<EnumFieldDefinition> fields;

    public List<EnumFieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<EnumFieldDefinition> fields) {
        this.fields = fields;
    }
}
