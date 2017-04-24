package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinition {

    private final TypeEnum type;
    private final String name;
    private final String namespace;
    private final List<DefinitionReference> parametricTypes;
    private final List<AnnotationValue> annotations;

    public ClassDefinition(TypeEnum type, String name, String namespace, List<DefinitionReference> parametricTypes, List<AnnotationValue> annotations) {
        this.type = type;
        this.name = name;
        this.namespace = namespace;
        this.parametricTypes = parametricTypes;
        this.annotations = annotations;
    }

    public TypeEnum getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getNamespace() {
        return namespace;
    }

    public List<ClassDefinition> getParametricTypes() {
        if (parametricTypes == null || parametricTypes.isEmpty()) {
            return Collections.emptyList();
        } else {
            return parametricTypes.stream().map(DefinitionReference::getClassDefinition).collect(Collectors.toList());
        }
    }

    public List<AnnotationValue> getAnnotations() {
        return annotations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDefinition that = (ClassDefinition) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(namespace, that.namespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace);
    }

    @Override
    public String toString() {
        return "ClassDefinition{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}
