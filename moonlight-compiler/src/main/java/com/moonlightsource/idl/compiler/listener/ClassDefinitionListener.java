package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.model.DefinitionReferenceManager;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinitionListener extends MoonlightBaseListener {

    private final DefinitionReferenceManager referenceManager;
    private String namespace;

    public ClassDefinitionListener(DefinitionReferenceManager referenceManager) {
        this.referenceManager = referenceManager;
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        namespace = ctx.namespaceValue().getText();
        referenceManager.putNamespace(namespace);
    }

    @Override
    public void enterStructDeclaration(MoonlightParser.StructDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        List<TerminalNode> list = ctx.parametricTypeDeclaration().Identifier();
        if (list != null && !list.isEmpty()) {
            for (TerminalNode terminalNode : list) {
                referenceManager.putClassDeclaration(namespace, className, terminalNode.getText());
            }
        } else {
            referenceManager.putClassDeclaration(namespace, className, "");
        }
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        referenceManager.putClassDeclaration(namespace, className, "");
    }

    @Override
    public void enterEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        referenceManager.putClassDeclaration(namespace, className, "");
    }

    @Override
    public void enterInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        referenceManager.putClassDeclaration(namespace, className, "");
    }
}
