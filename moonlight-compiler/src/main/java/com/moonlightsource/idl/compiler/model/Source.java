package com.moonlightsource.idl.compiler.model;

import com.moonlightsource.idl.compiler.parser.MoonlightParser;

import java.nio.file.Path;
import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class Source {

    private Path root;
    private Path path;
    private Path absolutePath;
    private String namespace;
    private final Map<String, Set<String>> imports = new HashMap<>();
    private final List<MoonlightParser.StructDeclarationContext> structs = new ArrayList<>();
    private final List<MoonlightParser.AnnotationDeclarationContext> annotations = new ArrayList<>();
    private final List<MoonlightParser.EnumDeclarationContext> enums = new ArrayList<>();
    private final List<MoonlightParser.InterfaceDeclarationContext> interfaces = new ArrayList<>();

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

    public List<MoonlightParser.StructDeclarationContext> getStructs() {
        return structs;
    }

    public List<MoonlightParser.AnnotationDeclarationContext> getAnnotations() {
        return annotations;
    }

    public List<MoonlightParser.EnumDeclarationContext> getEnums() {
        return enums;
    }

    public List<MoonlightParser.InterfaceDeclarationContext> getInterfaces() {
        return interfaces;
    }

    public MoonlightParser.StructDeclarationContext findStruct(String name) {
        return structs.parallelStream()
                      .filter(ctx -> ctx.Identifier().getText().equals(name))
                      .findFirst().orElse(null);
    }
}
