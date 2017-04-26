package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.StringUtils;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class ClassDefs {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    private Map<String, Map<String, Set<String>>> classDeclarationMap = new HashMap<>();
    private List<Source> sources = new ArrayList<>();
    private Map<Path, Map<String, Set<String>>> imports = new HashMap<>();

    public ClassDefs() {
        TypeEnum.BASE_TYPE_ENUMS
                .forEach(t -> putClassDeclaration("", t.getKeyword(), ""));

        putClassDeclaration("", TypeEnum.LIST.getKeyword(), "T");
        putClassDeclaration("", TypeEnum.SET.getKeyword(), "T");
        putClassDeclaration("", TypeEnum.MAP.getKeyword(), "T0");
        putClassDeclaration("", TypeEnum.MAP.getKeyword(), "T1");
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

    private Set<String> getClassNames(String namespace) {
        Map<String, Set<String>> classNameAndParametricDeclaration = classDeclarationMap.get(namespace);
        if (classNameAndParametricDeclaration != null && !classNameAndParametricDeclaration.isEmpty()) {
            return classNameAndParametricDeclaration.keySet();
        } else {
            return Collections.emptySet();
        }
    }

    private boolean containNamespace(String namespace) {
        if (log.isDebugEnabled()) {
            log.debug("existed namespaces -> {}", classDeclarationMap.keySet());
        }
        return classDeclarationMap.keySet().contains(namespace);
    }

    private boolean containClass(String namespace, String className) {
        return getClassNames(namespace).contains(className);
    }

    private boolean checkParametricDeclaration(String namespace, String className, String parametricType) {
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

    private synchronized boolean checkParametricTypeCount(String namespace, String className, int count) {
        if (!containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class [" + namespace + "." + className + "] is not found");
        }

        return classDeclarationMap.get(namespace).get(className).size() == count;
    }

    public synchronized void addSource(Source source) {
        sources.add(source);
    }

    public List<Source> getSources() {
        return sources;
    }

    public synchronized void putImport(Path path, String namespace, String name) {
        imports.computeIfAbsent(path, k -> new HashMap<>())
               .computeIfAbsent(namespace, k -> new HashSet<>())
               .add(name);
    }

    public void checkSyntax() {
        // import semantic check
        if (log.isDebugEnabled()) {
            log.debug("all imports -> {}", imports);
        }
        imports.forEach((path, m) -> {
            Source source = findSource(path);
            if (source != null) {
                m.forEach((namespace, names) -> names.forEach(name -> {
                    if (name.equals("*")) {
                        if (!containNamespace(namespace)) {
                            throw new CompilingRuntimeException("the namespace [" + namespace + "] is not found");
                        }
                        getClassNames(namespace).forEach(n -> source.putImport(namespace, n));
                    } else {
                        if (!containClass(namespace, name)) {
                            throw new CompilingRuntimeException("the class [" + namespace + "." + name + "] is not found");
                        }
                        source.putImport(namespace, name);
                    }
                }));
            } else {
                throw new CompilingRuntimeException("the source " + path + " is not found");
            }
        });

        // class check
        sources.forEach(source -> {
            source.getStructs().forEach(struct -> {

            });

            source.getAnnotations().forEach(annotation -> {

            });
        });

        // TODO
    }

    private Source findSource(Path path) {
        return sources.parallelStream().filter(source -> source.getPath().equals(path)).findFirst().orElse(null);
    }

}
