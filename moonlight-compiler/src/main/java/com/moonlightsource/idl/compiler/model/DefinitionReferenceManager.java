package com.moonlightsource.idl.compiler.model;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class DefinitionReferenceManager {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    private Map<DefinitionReference, ClassDefinition> classDefinitionMap = new HashMap<>();
    private Map<String, Set<String>> classNames = new HashMap<>();

    public DefinitionReferenceManager() {
        TypeEnum.BASE_TYPE_ENUMS
                .forEach(t -> classDefinitionMap.put(new DefinitionReference("", t.getKeyword(), this),
                        new ClassDefinition(t, t.getKeyword(), "", Collections.emptyList(), Collections.emptyList())));
    }

    public synchronized ClassDefinition getClassDefinition(DefinitionReference ref) {
        return classDefinitionMap.get(ref);
    }

    public synchronized void put(DefinitionReference ref, ClassDefinition classDefinition) {
        ClassDefinition def = classDefinitionMap.get(ref);
        if (def != null && def.equals(classDefinition)) {
            throw new CompilingRuntimeException("the class " + def + " exists");
        } else {
            classDefinitionMap.put(ref, classDefinition);
        }
    }

    public synchronized void putNamespace(String namespace) {
        classNames.computeIfAbsent(namespace, k -> new HashSet<>());
    }

    public synchronized void putClassName(String namespace, String className) {
        classNames.computeIfAbsent(namespace, k -> new HashSet<>()).add(className);
    }

    public synchronized Set<String> getClassNames(String namespace) {
        Set<String> names = classNames.get(namespace);
        if (names != null && !names.isEmpty()) {
            return names;
        } else {
            return Collections.emptySet();
        }
    }

    public synchronized boolean containNamespace(String namespace) {
        if (log.isDebugEnabled()) {
            log.debug("existed namespaces -> {}", classNames.keySet());
        }
        return classNames.keySet().contains(namespace);
    }

    public synchronized boolean containClass(String namespace, String className) {
        return getClassNames(namespace).contains(className);
    }

}
