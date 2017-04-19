package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class FunctionDefinition {

    private ClassDefinition returnType;
    private List<AnnotationValue> annotations;
    private InterfaceDefinition declaredInterface;
    private List<ParameterDefinition> parameters;

    public ClassDefinition getReturnType() {
        return returnType;
    }

    public void setReturnType(ClassDefinition returnType) {
        this.returnType = returnType;
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<AnnotationValue> annotations) {
        this.annotations = annotations;
    }

    public InterfaceDefinition getDeclaredInterface() {
        return declaredInterface;
    }

    public void setDeclaredInterface(InterfaceDefinition declaredInterface) {
        this.declaredInterface = declaredInterface;
    }

    public List<ParameterDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterDefinition> parameters) {
        this.parameters = parameters;
    }
}
