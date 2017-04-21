package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class FunctionDefinition {

    private final String name;
    private final DefinitionReference returnTypeReference;
    private final List<AnnotationValue> annotations;
    private final DefinitionReference declaredInterfaceReference;
    private final List<ParameterDefinition> parameters;

    public FunctionDefinition(String name,
                              DefinitionReference returnTypeReference,
                              List<AnnotationValue> annotations,
                              DefinitionReference declaredInterfaceReference,
                              List<ParameterDefinition> parameters) {
        this.name = name;
        this.returnTypeReference = returnTypeReference;
        this.annotations = annotations;
        this.declaredInterfaceReference = declaredInterfaceReference;
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

    public InterfaceDefinition getDeclaredInterface() {
        return (InterfaceDefinition) declaredInterfaceReference.getClassDefinition();
    }

    public List<ParameterDefinition> getParameters() {
        return parameters;
    }
}
