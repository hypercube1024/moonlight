package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class StructDefinition extends ClassDefinition {

    private final DefinitionReference parentReference;
    private final List<StructFieldDefinition> fields;

    public StructDefinition(TypeEnum type, String name, String namespace, List<DefinitionReference> parametricTypes, List<AnnotationValue> annotations, DefinitionReference parentReference, List<StructFieldDefinition> fields) {
        super(type, name, namespace, parametricTypes, annotations);
        this.parentReference = parentReference;
        this.fields = fields;
    }

    public StructDefinition getParent() {
        return (StructDefinition) parentReference.getClassDefinition();
    }

    public List<StructFieldDefinition> getFields() {
        return fields;
    }
}
