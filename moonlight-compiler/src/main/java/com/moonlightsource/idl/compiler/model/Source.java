package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.classproxy.JavassistClassProxyFactory;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;

import java.nio.file.Path;
import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class Source {

    protected Path root;
    protected Path path;
    protected Path absolutePath;
    protected String namespace;
    protected List<MoonlightParser.AnnotationContext> fileAnnotations = new ArrayList<>();
    protected Map<String, Set<String>> imports = new HashMap<>();
    protected List<MoonlightParser.StructDeclarationContext> structs = new ArrayList<>();
    protected List<MoonlightParser.AnnotationDeclarationContext> annotations = new ArrayList<>();
    protected List<MoonlightParser.EnumDeclarationContext> enums = new ArrayList<>();
    protected List<MoonlightParser.InterfaceDeclarationContext> interfaces = new ArrayList<>();

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

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<MoonlightParser.AnnotationContext> getFileAnnotations() {
        return fileAnnotations;
    }

    public void setFileAnnotations(List<MoonlightParser.AnnotationContext> fileAnnotations) {
        this.fileAnnotations = fileAnnotations;
    }

    public Map<String, Set<String>> getImports() {
        return imports;
    }

    public void setImports(Map<String, Set<String>> imports) {
        this.imports = imports;
    }

    public List<MoonlightParser.StructDeclarationContext> getStructs() {
        return structs;
    }

    public void setStructs(List<MoonlightParser.StructDeclarationContext> structs) {
        this.structs = structs;
    }

    public List<MoonlightParser.AnnotationDeclarationContext> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<MoonlightParser.AnnotationDeclarationContext> annotations) {
        this.annotations = annotations;
    }

    public List<MoonlightParser.EnumDeclarationContext> getEnums() {
        return enums;
    }

    public void setEnums(List<MoonlightParser.EnumDeclarationContext> enums) {
        this.enums = enums;
    }

    public List<MoonlightParser.InterfaceDeclarationContext> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<MoonlightParser.InterfaceDeclarationContext> interfaces) {
        this.interfaces = interfaces;
    }

    public void putImport(String namespace, String name) {
        imports.computeIfAbsent(namespace, k -> new HashSet<>()).add(name);
    }


    public MoonlightParser.StructDeclarationContext findStruct(String name) {
        return structs.parallelStream()
                      .filter(ctx -> ctx.Identifier().getText().equals(name))
                      .findFirst().orElse(null);
    }

    public String getImportNamespace(String className) {
        return imports.entrySet().parallelStream()
                      .filter(e -> e.getValue().contains(className))
                      .map(Map.Entry::getKey)
                      .findAny()
                      .orElse(null);
    }

    public boolean containClassNameInImports(String className) {
        return getImportNamespace(className) != null;
    }

    public MoonlightParser.AnnotationDeclarationContext findAnnotation(String name) {
        return annotations.parallelStream()
                          .filter(ctx -> ctx.Identifier().getText().equals(name))
                          .findFirst().orElse(null);
    }

    Source toUnmodifiableSource() {
        try {
            Source unmodifiableSource = JavassistClassProxyFactory.INSTANCE.createProxy(new Source(),
                    ((handler, originalInstance, args) -> {
                        throw new UnsupportedOperationException();
                    }),
                    method -> method.getName().startsWith("set") || method.getName().startsWith("put"));

            unmodifiableSource.root = root;
            unmodifiableSource.path = path;
            unmodifiableSource.absolutePath = absolutePath;
            unmodifiableSource.namespace = namespace;
            unmodifiableSource.fileAnnotations = Collections.unmodifiableList(fileAnnotations);
            unmodifiableSource.imports = Collections.unmodifiableMap(imports);
            unmodifiableSource.structs = Collections.unmodifiableList(structs);
            unmodifiableSource.annotations = Collections.unmodifiableList(annotations);
            unmodifiableSource.enums = Collections.unmodifiableList(enums);
            unmodifiableSource.interfaces = Collections.unmodifiableList(interfaces);
            return unmodifiableSource;
        } catch (Throwable t) {
            throw new CompilingRuntimeException("create unmodifiable Source exception", t);
        }
    }

    @Override
    public String toString() {
        return "Source{" +
                "root=" + root +
                ", path=" + path +
                ", absolutePath=" + absolutePath +
                ", namespace='" + namespace + '\'' +
                ", imports=" + imports +
                ", structs=" + structs +
                ", annotations=" + annotations +
                ", enums=" + enums +
                ", interfaces=" + interfaces +
                '}';
    }
}
