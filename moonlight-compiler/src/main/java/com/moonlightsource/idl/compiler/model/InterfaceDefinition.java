package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pengtao Qiu
 */
public class InterfaceDefinition extends ClassDefinition {

    private final List<FunctionDefinition> functions;
    private final List<DefinitionReference> extendedInterfaceReferences;

    public InterfaceDefinition(TypeEnum type, String name, String namespace, List<AnnotationValue> annotations, List<FunctionDefinition> functions, List<DefinitionReference> extendedInterfaceReferences) {
        super(type, name, namespace, Collections.emptyList(), annotations);
        this.functions = functions;
        this.extendedInterfaceReferences = extendedInterfaceReferences;
    }

    public List<FunctionDefinition> getFunctions() {
        return functions;
    }

    public List<ClassDefinition> getExtendedInterfaces() {
        if (extendedInterfaceReferences.isEmpty()) {
            return Collections.emptyList();
        } else {
            return extendedInterfaceReferences.stream().map(DefinitionReference::getClassDefinition).collect(Collectors.toList());
        }
    }
}
