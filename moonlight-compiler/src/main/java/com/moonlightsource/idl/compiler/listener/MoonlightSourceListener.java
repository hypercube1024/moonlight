package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.model.SourceFile;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pengtao Qiu
 */
public class MoonlightSourceListener extends MoonlightBaseListener {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    private final MoonlightParser parser;
    private final CommonTokenStream tokenStream;
    private final MoonlightLexer lexer;
    private final SourceFile sourceFile;

    public MoonlightSourceListener(MoonlightParser parser, CommonTokenStream tokenStream, MoonlightLexer lexer, SourceFile sourceFile) {
        this.parser = parser;
        this.tokenStream = tokenStream;
        this.lexer = lexer;
        this.sourceFile = sourceFile;
    }

    public MoonlightParser getParser() {
        return parser;
    }

    public CommonTokenStream getTokenStream() {
        return tokenStream;
    }

    public MoonlightLexer getLexer() {
        return lexer;
    }

    public SourceFile getSourceFile() {
        return sourceFile;
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        sourceFile.setNamespace(ctx.namespaceValue().getText());
        log.debug("namespace -> {}", sourceFile.getNamespace());
    }

    @Override
    public void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx) {
        String importValue = ctx.importValue().getText();
        log.debug("import -> {}", importValue);
        sourceFile.getImports().add(importValue);
    }
}
