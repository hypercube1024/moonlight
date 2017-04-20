package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.listener.MoonlightSourceListener;
import com.moonlightsource.idl.compiler.model.SourceFile;
import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * @author Pengtao Qiu
 */
abstract public class Compiler {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    /**
     * Parallel compiling all files in the root directory
     *
     * @param root    The source file's root path
     * @param suffix  The source file suffix
     * @param charset The source file charset
     * @return All SourceFile objects
     * @throws IOException Read source file I/O exception
     */
    public static List<SourceFile> compileAll(Path root, String suffix, Charset charset) throws IOException {
        List<SourceFile> sourceFiles = new ArrayList<>();
        Files.walk(root)
             .filter(path -> !Files.isDirectory(path))
             .filter(path -> path.getFileName().toString().endsWith(suffix))
             .map(path -> Paths.get(path.toString().substring(root.toString().length())))
             .map(path -> asyncCompile(root, path, charset))
             .collect(Collectors.toList())
             .forEach(future -> getAsyncResult(future, sourceFiles));
        return sourceFiles;
    }

    private static void getAsyncResult(CompletableFuture<SourceFile> future, List<SourceFile> sourceFiles) {
        try {
            sourceFiles.add(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new CompilingRuntimeException(e);
        }
    }

    private static CompletableFuture<SourceFile> asyncCompile(Path root, Path path, Charset charset) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                if (log.isDebugEnabled()) {
                    log.debug("moonlight compiling thread -> {}", Thread.currentThread().getName());
                }
                return compile(root, path, charset);
            } catch (IOException e) {
                throw new CompilingRuntimeException(e);
            }
        });
    }

    /**
     * Compile source file and generate SourceFile object, the default root path is Java classpath.
     *
     * @param path    The source file's relative path
     * @param charset The source file charset
     * @return SourceFile object
     * @throws IOException Read source file I/O exception
     */
    public static SourceFile compile(Path path, Charset charset) throws IOException {
        return compile(getClasspath(), path, charset);
    }

    public static Path getClasspath() {
        try {
            return Paths.get(Compiler.class.getResource("/").toURI());
        } catch (URISyntaxException e) {
            throw new CompilingRuntimeException(e);
        }
    }

    /**
     * Compile source file and generate SourceFile object.
     *
     * @param root    The source file's root path
     * @param path    The source file's relative path
     * @param charset The source file charset
     * @return SourceFile object
     * @throws IOException Read source file I/O exception
     */
    public static SourceFile compile(Path root, Path path, Charset charset) throws IOException {
        SourceFile sourceFile = new SourceFile();
        sourceFile.setPath(path);
        sourceFile.setRoot(root);
        Path p = Paths.get(root.toString(), path.toString());
        CharStream input = CharStreams.fromPath(p, charset);
        compile(input, sourceFile);
        return sourceFile;
    }

    public static void compile(CharStream input, SourceFile sourceFile) {
        MoonlightSourceListener listener = createListener(input, sourceFile);
        ParseTree tree = listener.getParser().moonlightFile();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    public static MoonlightSourceListener createListener(CharStream input, SourceFile sourceFile) {
        MoonlightLexer lexer = createLexer(input);
        CommonTokenStream tokenStream = createTokenStream(lexer);
        MoonlightParser parser = createParser(tokenStream);
        return new MoonlightSourceListener(parser, tokenStream, lexer, sourceFile);
    }

    public static MoonlightLexer createLexer(CharStream input) {
        return new MoonlightLexer(input);
    }

    public static CommonTokenStream createTokenStream(Lexer lexer) {
        return new CommonTokenStream(lexer);
    }

    public static MoonlightParser createParser(TokenStream tokenStream) {
        return new MoonlightParser(tokenStream);
    }
}
