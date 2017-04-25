package com.moonlightsource.idl.compiler.model;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Pengtao Qiu
 */
public class Source {

    private Path root;
    private Path path;
    private Path absolutePath;
    private String namespace;
    private final Map<String, Set<String>> imports = new HashMap<>();

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Map<String, Set<String>> getImports() {
        return imports;
    }

    public String findNamespaceByClassName(String className) {
        return imports.entrySet().stream()
                      .filter(e -> e.getValue().contains(className))
                      .map(Map.Entry::getKey)
                      .findAny()
                      .orElse(null);
    }

    public Path getRoot() {
        return root;
    }

    public void setRoot(Path root) {
        this.root = root;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Path getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(Path absolutePath) {
        this.absolutePath = absolutePath;
    }
}
