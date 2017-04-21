package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.function.Func0;
import com.moonlightsource.idl.compiler.exception.ClassNotFoundRuntimeException;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Pengtao Qiu
 */
public class DefinitionReferenceManager {

    private Map<DefinitionReference, Func0<ClassDefinition>> map = new HashMap<>();

    public DefinitionReferenceManager() {
        TypeEnum.BASE_TYPE_ENUMS
                .forEach(t -> map.put(new DefinitionReference("", t.getKeyword(), this),
                        () -> new ClassDefinition(t, t.getKeyword(), "", Collections.emptyList(), Collections.emptyList())));
    }

    public synchronized ClassDefinition getClassDefinition(DefinitionReference ref) {
        return map.get(ref).call();
    }

    public synchronized void put(DefinitionReference ref, Func0<ClassDefinition> func0) {
        if (func0 instanceof ClassDefNotFound) {
            throw new IllegalArgumentException("the func0 must not be ClassDefNotFound");
        }

        if (func0 instanceof ReferenceCheck) {
            throw new IllegalArgumentException("the func0 must not be ReferenceCheck");
        }

        Func0<ClassDefinition> func = map.get(ref);
        if (func.call().equals(func0.call())) {
            throw new CompilingRuntimeException("the class " + func.call() + " exists");
        } else {
            map.put(ref, func0);
        }
    }

    public synchronized void putPlaceholder(DefinitionReference ref, TerminalNode node) {
        map.computeIfAbsent(ref, k -> new ClassDefNotFound(new ClassNotFoundRuntimeException("the class " + ref + " not found.", node)));
    }

    public synchronized void putReferenceCheck(DefinitionReference ref) {
        map.computeIfAbsent(ref, k -> new ReferenceCheck());
    }

    public synchronized boolean isReferenceCheck(DefinitionReference ref) {
        Func0<ClassDefinition> func = map.get(ref);
        return func != null && func instanceof ReferenceCheck;
    }
}
