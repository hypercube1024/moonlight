package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.function.Func0;
import com.moonlightsource.idl.compiler.exception.ClassNotFoundRuntimeException;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class DefinitionReferenceManager {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    private Map<DefinitionReference, Func0<ClassDefinition>> map = new HashMap<>();
    private Map<String, Set<String>> classDefinitions = new HashMap<>();

    public DefinitionReferenceManager() {
        TypeEnum.BASE_TYPE_ENUMS
                .forEach(t -> map.put(new DefinitionReference("", t.getKeyword(), this),
                        () -> new ClassDefinition(t, t.getKeyword(), "", Collections.emptyList(), Collections.emptyList())));
    }

    public synchronized ClassDefinition getClassDefinition(DefinitionReference ref) {
        return map.get(ref).call();
    }

    public synchronized void put(DefinitionReference ref, Func0<ClassDefinition> func0) {
        Func0<ClassDefinition> func = map.get(ref);
        if (func != null && func.call().equals(func0.call())) {
            throw new CompilingRuntimeException("the class " + func.call() + " exists");
        } else {
            map.put(ref, func0);
        }
    }

    public synchronized void putNamespace(String namespace) {
        classDefinitions.computeIfAbsent(namespace, k -> new HashSet<>());
    }

    public synchronized void putClass(String namespace, String className) {
        classDefinitions.computeIfAbsent(namespace, k -> new HashSet<>()).add(className);
    }

    public synchronized Set<String> getClassNames(String namespace) {
        Set<String> names = classDefinitions.get(namespace);
        if (names != null && !names.isEmpty()) {
            return names;
        } else {
            return Collections.emptySet();
        }
    }

    public synchronized boolean containNamespace(String namespace) {
        if (log.isDebugEnabled()) {
            log.debug("existed namespaces -> {}", classDefinitions.keySet());
        }
        return classDefinitions.keySet().contains(namespace);
    }

    public synchronized boolean containClass(String namespace, String className) {
        return getClassNames(namespace).contains(className);
    }

}
