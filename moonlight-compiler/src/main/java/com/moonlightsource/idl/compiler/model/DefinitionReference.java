package com.moonlightsource.idl.compiler.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefinitionReference that = (DefinitionReference) o;
        return Objects.equals(namespace, that.namespace) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, name);
    }

    @Override
    public String toString() {
        return namespace + "." + name;
    }
}
