package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class StructFieldDefinition extends FieldDefinition {

    private final ModifierEnum modifier;
    private final DefinitionReference declaredStructReference;

    public StructFieldDefinition(String name, List<AnnotationValue> annotations, DefinitionReference typeReference, ModifierEnum modifier, DefinitionReference declaredStructReference) {
        super(name, annotations, typeReference);
        this.modifier = modifier;
        this.declaredStructReference = declaredStructReference;
    }

    public ModifierEnum getModifier() {
        return modifier;
    }

    public ClassDefinition getDeclaredStruct() {
        return declaredStructReference.getClassDefinition();
    }
}
