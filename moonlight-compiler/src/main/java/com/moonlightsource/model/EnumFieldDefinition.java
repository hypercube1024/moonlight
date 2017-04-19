package com.moonlightsource.model;

/**
 * @author Pengtao Qiu
 */
public class EnumFieldDefinition extends FieldDefinition {

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
