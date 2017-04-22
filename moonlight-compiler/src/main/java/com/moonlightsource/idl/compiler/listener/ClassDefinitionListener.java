package com.moonlightsource.idl.compiler.listener;

import com.firefly.utils.StringUtils;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.DefinitionReferenceManager;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinitionListener extends MoonlightBaseListener {

    private final DefinitionReferenceManager referenceManager;
    private final Path root;
    private final Path path;

    private String namespace;

    public ClassDefinitionListener(DefinitionReferenceManager referenceManager, Path root, Path path) {
        this.referenceManager = referenceManager;
        this.root = root;
        this.path = path;
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        namespace = ctx.namespaceValue().getText();
        if (!StringUtils.hasText(namespace)) {
            throw new CompilingRuntimeException("the namespace is null in file -> " + Paths.get(root.toString(), path.toString()));
        }

        referenceManager.putNamespace(namespace);
    }

    @Override
    public void enterStructDeclaration(MoonlightParser.StructDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        if (referenceManager.containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class " + namespace + "." + className + " exists", ctx.Identifier(), path);
        }
        referenceManager.putClassName(namespace, className);
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        if (referenceManager.containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class " + namespace + "." + className + " exists", ctx.Identifier(), path);
        }
        referenceManager.putClassName(namespace, className);
    }

    @Override
    public void enterEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        if (referenceManager.containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class " + namespace + "." + className + " exists", ctx.Identifier(), path);
        }
        referenceManager.putClassName(namespace, className);
    }

    @Override
    public void enterInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        if (referenceManager.containClass(namespace, className)) {
            throw new CompilingRuntimeException("the class " + namespace + "." + className + " exists", ctx.Identifier(), path);
        }
        referenceManager.putClassName(namespace, className);
    }
}
