package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.listener.MoonlightSourceListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;

/**
 * @author Pengtao Qiu
 */
public enum Compiler {
    INSTANCE;

    public void compile(Path path, Charset charset) throws IOException {
        CharStream input = CharStreams.fromPath(path, charset);
        compile(input);
    }

    public void compile(CharStream input) {
        MoonlightSourceListener listener = createListener(input);
        ParseTree tree = listener.getParser().moonlightFile();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    public MoonlightSourceListener createListener(CharStream input) {
        MoonlightLexer lexer = createLexer(input);
        CommonTokenStream tokenStream = createTokenStream(lexer);
        MoonlightParser parser = createParser(tokenStream);
        return new MoonlightSourceListener(parser, tokenStream, lexer);
    }

    public MoonlightLexer createLexer(CharStream input) {
        return new MoonlightLexer(input);
    }

    public CommonTokenStream createTokenStream(Lexer lexer) {
        return new CommonTokenStream(lexer);
    }

    public MoonlightParser createParser(TokenStream tokenStream) {
        return new MoonlightParser(tokenStream);
    }
}
