package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.model.ClassDefinitions;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;

/**
 * @author Pengtao Qiu
 */
public class SyntaxCheckListener extends MoonlightBaseListener {

    private final ClassDefinitions classDefinitions;

    public SyntaxCheckListener(ClassDefinitions classDefinitions) {
        this.classDefinitions = classDefinitions;
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
    }

    @Override
    public void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx) {
    }
}
