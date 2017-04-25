package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.StringUtils;
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
    private Map<String, Map<String, Set<String>>> classDeclarationMap = new HashMap<>();

    public DefinitionReferenceManager() {
        TypeEnum.BASE_TYPE_ENUMS
                .forEach(t -> {
                    classDefinitionMap.put(new DefinitionReference("", t.getKeyword(), this),
                            new ClassDefinition(t, t.getKeyword(), "",
                                    Collections.emptyList(),
                                    Collections.emptySet(),
                                    Collections.emptyList()));

                    putClassDeclaration("", t.getKeyword(), "");
                });

        putClassDeclaration("", TypeEnum.LIST.getKeyword(), "T");
        classDefinitionMap.put(new DefinitionReference("", TypeEnum.LIST.getKeyword(), this),
                new ClassDefinition(TypeEnum.LIST, TypeEnum.LIST.getKeyword(), "",
                        Collections.emptyList(),
                        Collections.singleton("T"),
                        Collections.emptyList()));

        putClassDeclaration("", TypeEnum.SET.getKeyword(), "T");
        classDefinitionMap.put(new DefinitionReference("", TypeEnum.SET.getKeyword(), this),
                new ClassDefinition(TypeEnum.SET, TypeEnum.SET.getKeyword(), "",
                        Collections.emptyList(),
                        Collections.singleton("T"),
                        Collections.emptyList()));

        putClassDeclaration("", TypeEnum.MAP.getKeyword(), "T0");
        putClassDeclaration("", TypeEnum.MAP.getKeyword(), "T1");
        classDefinitionMap.put(new DefinitionReference("", TypeEnum.MAP.getKeyword(), this),
                new ClassDefinition(TypeEnum.MAP, TypeEnum.MAP.getKeyword(), "",
                        Collections.emptyList(),
                        new HashSet<>(Arrays.asList("T0", "T1")),
                        Collections.emptyList()));
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
        classDeclarationMap.computeIfAbsent(namespace, k -> new HashMap<>());
    }

    public synchronized void putClassDeclaration(String namespace, String className, String parametricDef) {
        if (checkParametricDeclaration(namespace, className, parametricDef)) {
            if (StringUtils.hasText(parametricDef)) {
                throw new CompilingRuntimeException("the class [" + namespace + "." + className + "] or parametric declaration [" + parametricDef + "] exists");
            } else {
                throw new CompilingRuntimeException("the class [" + namespace + "." + className + "] exists");
            }
        }

        classDeclarationMap.computeIfAbsent(namespace, k -> new HashMap<>())
                           .computeIfAbsent(className, k -> new HashSet<>())
                           .add(parametricDef);
    }

    public synchronized Set<String> getClassNames(String namespace) {
        Map<String, Set<String>> classNameAndParametricDeclaration = classDeclarationMap.get(namespace);
        if (classNameAndParametricDeclaration != null && !classNameAndParametricDeclaration.isEmpty()) {
            return classNameAndParametricDeclaration.keySet();
        } else {
            return Collections.emptySet();
        }
    }

    public synchronized boolean containNamespace(String namespace) {
        if (log.isDebugEnabled()) {
            log.debug("existed namespaces -> {}", classDeclarationMap.keySet());
        }
        return classDeclarationMap.keySet().contains(namespace);
    }

    public synchronized boolean containClass(String namespace, String className) {
        return getClassNames(namespace).contains(className);
    }

    public synchronized boolean checkParametricDeclaration(String namespace, String className, String parametricType) {
        Map<String, Set<String>> classNameAndParametricDeclaration = classDeclarationMap.get(namespace);
        if (classNameAndParametricDeclaration == null || classNameAndParametricDeclaration.isEmpty()) {
            return false;
        }

        if (!classNameAndParametricDeclaration.containsKey(className)) {
            return false;
        }

        Set<String> parametricTypes = classNameAndParametricDeclaration.get(className);
        if (parametricTypes == null || parametricTypes.isEmpty()) {
            return false;
        }

        if (!parametricTypes.contains(parametricType)) {
            return false;
        }

        return true;
    }

    public synchronized boolean checkParametricTypeCount(String namespace, String className, int count) {
        if (!containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class [" + namespace + "." + className + "] is not found");
        }

        return classDeclarationMap.get(namespace).get(className).size() == count;
    }

}
