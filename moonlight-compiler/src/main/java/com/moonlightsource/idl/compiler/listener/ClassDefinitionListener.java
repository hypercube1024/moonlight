package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.model.ClassDefinitions;
import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class ClassDefinitionListener extends MoonlightBaseListener {

    private final ClassDefinitions classDefinitions;
    private final Source source;
    private String namespace;

    public ClassDefinitionListener(ClassDefinitions classDefinitions, Source source) {
        this.classDefinitions = classDefinitions;
        this.source = source;
        classDefinitions.addSource(source);
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        namespace = ctx.namespaceValue().getText();
        classDefinitions.putNamespace(namespace);
        source.setNamespace(namespace);
    }

    @Override
    public void enterStructDeclaration(MoonlightParser.StructDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        List<TerminalNode> list = ctx.parametricTypeDeclaration().Identifier();
        if (list != null && !list.isEmpty()) {
            for (TerminalNode terminalNode : list) {
                classDefinitions.putClassDeclaration(namespace, className, terminalNode.getText());
            }
        } else {
            classDefinitions.putClassDeclaration(namespace, className, "");
        }
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefinitions.putClassDeclaration(namespace, className, "");
    }

    @Override
    public void enterEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefinitions.putClassDeclaration(namespace, className, "");
    }

    @Override
    public void enterInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefinitions.putClassDeclaration(namespace, className, "");
    }
}
