package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.SourceFile;
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

    public SourceFile compile(Path path, Charset charset) throws IOException {
        SourceFile sourceFile = new SourceFile();
        sourceFile.setPath(path);
        CharStream input = CharStreams.fromPath(path, charset);
        compile(input, sourceFile);
        return sourceFile;
    }

    public void compile(CharStream input, SourceFile sourceFile) {
        MoonlightSourceListener listener = createListener(input, sourceFile);
        ParseTree tree = listener.getParser().moonlightFile();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    public MoonlightSourceListener createListener(CharStream input, SourceFile sourceFile) {
        MoonlightLexer lexer = createLexer(input);
        CommonTokenStream tokenStream = createTokenStream(lexer);
        MoonlightParser parser = createParser(tokenStream);
        return new MoonlightSourceListener(parser, tokenStream, lexer, sourceFile);
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
