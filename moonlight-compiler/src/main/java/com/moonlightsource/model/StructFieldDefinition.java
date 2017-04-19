package com.moonlightsource.model;

/**
 * @author Pengtao Qiu
 */
public class StructFieldDefinition extends FieldDefinition {

    private ModifierEnum modifier;
    private StructDefinition declaredStruct;

    public ModifierEnum getModifier() {
        return modifier;
    }

    public void setModifier(ModifierEnum modifier) {
        this.modifier = modifier;
    }

    public StructDefinition getDeclaredStruct() {
        return declaredStruct;
    }

    public void setDeclaredStruct(StructDefinition declaredStruct) {
        this.declaredStruct = declaredStruct;
    }
}
