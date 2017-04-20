package com.moonlightsource.idl.compiler.model;

/**
 * @author Pengtao Qiu
 */
public class DefinitionReference {

    private final String namespace;
    private final String name;
    private final DefinitionReferenceManager manager;

    public DefinitionReference(String namespace, String name, DefinitionReferenceManager manager) {
        this.namespace = namespace;
        this.name = name;
        this.manager = manager;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    public ClassDefinition getClassDefinition() {
        return manager.getClassDefinition(this);
    }
}
