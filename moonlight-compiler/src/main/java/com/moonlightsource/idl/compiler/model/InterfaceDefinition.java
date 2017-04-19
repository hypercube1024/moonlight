package com.moonlightsource.idl.compiler.model;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class InterfaceDefinition extends ClassDefinition {

    private List<FunctionDefinition> functions;
    private List<ClassDefinition> extendedInterfaces;

    public List<FunctionDefinition> getFunctions() {
        return functions;
    }

    public void setFunctions(List<FunctionDefinition> functions) {
        this.functions = functions;
    }

    public List<ClassDefinition> getExtendedInterfaces() {
        return extendedInterfaces;
    }

    public void setExtendedInterfaces(List<ClassDefinition> extendedInterfaces) {
        this.extendedInterfaces = extendedInterfaces;
    }
}
