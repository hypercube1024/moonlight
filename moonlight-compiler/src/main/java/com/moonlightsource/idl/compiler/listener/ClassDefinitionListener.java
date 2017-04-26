package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.ClassDefs;
import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinitionListener extends MoonlightBaseListener {

    private final ClassDefs classDefs;
    private final Source source;
    private String namespace;

    public ClassDefinitionListener(ClassDefs classDefs, Source source) {
        this.classDefs = classDefs;
        this.source = source;
        classDefs.addSource(source);
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        namespace = ctx.namespaceValue().getText();
        classDefs.putNamespace(namespace);
        source.setNamespace(namespace);
    }

    @Override
    public void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx) {
        StringBuilder namespace = new StringBuilder();
        String name = null;
        MoonlightParser.ImportValueContext importCtx = ctx.importValue();
        final int childCount = importCtx.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (i < childCount - 2) {
                namespace.append(importCtx.getChild(i).getText());
            } else if (i == childCount - 1) {
                name = importCtx.getChild(i).getText();
            }
        }
        if (name == null) {
            throw new CompilingRuntimeException("import name is null", ctx.IMPORT(), source.getPath());
        }
        classDefs.putImport(source.getPath(), namespace.toString(), name);
    }

    @Override
    public void enterStructDeclaration(MoonlightParser.StructDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        if (ctx.parametricTypeDeclaration() != null) {
            List<TerminalNode> list = ctx.parametricTypeDeclaration().Identifier();
            if (list != null && !list.isEmpty()) {
                for (TerminalNode terminalNode : list) {
                    classDefs.putClassDeclaration(namespace, className, terminalNode.getText());
                }
            } else {
                classDefs.putClassDeclaration(namespace, className, "");
            }
        } else {
            classDefs.putClassDeclaration(namespace, className, "");
        }
        source.getStructs().add(ctx);
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefs.putClassDeclaration(namespace, className, "");
        source.getAnnotations().add(ctx);
    }

    @Override
    public void enterEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefs.putClassDeclaration(namespace, className, "");
        source.getEnums().add(ctx);
    }

    @Override
    public void enterInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefs.putClassDeclaration(namespace, className, "");
        source.getInterfaces().add(ctx);
    }
}
