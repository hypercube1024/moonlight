package com.moonlightsource.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class StructDefinition extends ClassDefinition {

    private ClassDefinition parent;
    private List<StructFieldDefinition> fields;

    public ClassDefinition getParent() {
        return parent;
    }

    public void setParent(ClassDefinition parent) {
        this.parent = parent;
    }

    public List<StructFieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<StructFieldDefinition> fields) {
        this.fields = fields;
    }
}
