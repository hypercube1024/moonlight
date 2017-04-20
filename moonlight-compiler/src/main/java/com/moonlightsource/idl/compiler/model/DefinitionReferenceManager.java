package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.function.Func0;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Pengtao Qiu
 */
public class DefinitionReferenceManager {

    private Map<DefinitionReference, Func0<ClassDefinition>> map = new HashMap<>();

    public synchronized ClassDefinition getClassDefinition(DefinitionReference ref, Function<DefinitionReference, Func0<ClassDefinition>> mappingFunction) {
        return map.<ClassDefinition>computeIfAbsent(ref, mappingFunction).call();
    }

    public synchronized ClassDefinition getClassDefinition(DefinitionReference ref) {
        return map.get(ref).call();
    }

    public synchronized void put(DefinitionReference ref, Func0<ClassDefinition> func0) {
        if (func0 instanceof ClassDefNotFound) {
            throw new IllegalArgumentException("the func0 must not be ClassDefNotFound");
        }

        Func0<ClassDefinition> func = map.get(ref);
        if (func.call().equals(func0.call())) {
            throw new CompilingRuntimeException("the class " + func.call() + " exists");
        } else {
            map.put(ref, func0);
        }
    }
}
