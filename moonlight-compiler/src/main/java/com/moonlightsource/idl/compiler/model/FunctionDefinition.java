package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class FunctionDefinition {

    private final String name;
    private final DefinitionReference returnTypeReference;
    private final List<AnnotationValue> annotations;
    private final DefinitionReference declaredClassReference;
    private final List<FieldDefinition> parameters;

    public FunctionDefinition(String name,
                              DefinitionReference returnTypeReference,
                              List<AnnotationValue> annotations,
                              DefinitionReference declaredClassReference,
                              List<FieldDefinition> parameters) {
        this.name = name;
        this.returnTypeReference = returnTypeReference;
        this.annotations = annotations;
        this.declaredClassReference = declaredClassReference;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public ClassDefinition getReturnType() {
        return returnTypeReference.getClassDefinition();
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public ClassDefinition getDeclaredClassDefinition() {
        return declaredClassReference.getClassDefinition();
    }

    public List<FieldDefinition> getParameters() {
        return parameters;
    }
}
