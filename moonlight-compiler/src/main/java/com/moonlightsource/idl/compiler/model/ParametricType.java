package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class ParametricType {

    private final DefinitionReference reference;
    private final List<ParametricType> parametricTypes;

    public ParametricType(DefinitionReference reference) {
        this(reference, Collections.emptyList());
    }

    public ParametricType(DefinitionReference reference, List<ParametricType> parametricTypes) {
        this.reference = reference;
        this.parametricTypes = parametricTypes;
    }

    public ClassDefinition getClassDefinition() {
        return reference.getClassDefinition();
    }

    public List<ParametricType> getParametricTypes() {
        return parametricTypes;
    }
}
