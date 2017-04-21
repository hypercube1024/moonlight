package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class ParameterDefinition extends FieldDefinition {

    public ParameterDefinition(String name, List<AnnotationValue> annotations, DefinitionReference typeReference) {
        super(name, annotations, typeReference);
    }
}
