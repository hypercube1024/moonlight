package com.moonlightsource.idl.compiler.listener;

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

    public MoonlightSourceListener(MoonlightParser parser, CommonTokenStream tokenStream, MoonlightLexer lexer) {
        this.parser = parser;
        this.tokenStream = tokenStream;
        this.lexer = lexer;
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

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            log.debug("namespace value -> {}", ctx.getChild(i).getText());
        }
    }

    @Override
    public void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx) {
        Token token = ctx.getStart();
        log.debug("import declaration line -> {}, {}", token.getLine(), token.getCharPositionInLine());
    }
}
