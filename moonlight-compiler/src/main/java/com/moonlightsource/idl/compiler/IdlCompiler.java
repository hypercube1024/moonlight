package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.exception.LogErrorListener;
import com.moonlightsource.idl.compiler.exception.LogErrorStrategy;
import com.moonlightsource.idl.compiler.listener.ClassDefinitionListener;
import com.moonlightsource.idl.compiler.listener.MoonlightSourceListener;
import com.moonlightsource.idl.compiler.model.DefinitionReferenceManager;
import com.moonlightsource.idl.compiler.model.SourceFile;
import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Pengtao Qiu
 */
abstract public class IdlCompiler {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    public static final ThreadLocal<Path> CURRENT_PATH = new ThreadLocal<>();

    public static final Predicate<Path> DEFAULT_SUFFIX = path -> path.getFileName().toString().endsWith(".mol");

    /**
     * Parallel compiling all files in the root directory
     *
     * @param root    The source file's root path
     * @param filter  The source file filter
     * @param charset The source file charset
     * @return All SourceFile objects
     * @throws IOException Read source file I/O exception
     */
    public static List<SourceFile> compileAll(Path root, Predicate<Path> filter, Charset charset) throws IOException {
        DefinitionReferenceManager referenceManager = new DefinitionReferenceManager();
        walk(root, filter).map(path -> findClassDef(root, path, charset, referenceManager))
                          .collect(Collectors.toList())
                          .forEach(IdlCompiler::waitAsyncResult);

        List<SourceFile> sourceFiles = new ArrayList<>();
        walk(root, filter).map(path -> asyncCompile(root, path, charset, referenceManager))
                          .collect(Collectors.toList())
                          .forEach(future -> getAsyncResult(future, sourceFiles));
        return sourceFiles;
    }

    private static Stream<Path> walk(Path root, Predicate<Path> filter) throws IOException {
        return Files.walk(root)
                    .filter(path -> !Files.isDirectory(path))
                    .filter(filter)
                    .map(path -> Paths.get(path.toString().substring(root.toString().length())));
    }

    private static void getAsyncResult(CompletableFuture<SourceFile> future, List<SourceFile> sourceFiles) {
        try {
            sourceFiles.add(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new CompilingRuntimeException(e);
        }
    }

    private static void waitAsyncResult(CompletableFuture<Integer> future) {
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new CompilingRuntimeException(e);
        }
    }

    private static CompletableFuture<SourceFile> asyncCompile(Path root, Path path, Charset charset, DefinitionReferenceManager referenceManager) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                if (log.isDebugEnabled()) {
                    log.debug("moonlight compiling thread -> {}", Thread.currentThread().getName());
                }
                return compile(root, path, charset, referenceManager);
            } catch (IOException e) {
                throw new CompilingRuntimeException(e);
            }
        });
    }

    private static CompletableFuture<Integer> findClassDef(Path root, Path path, Charset charset,
                                                           DefinitionReferenceManager referenceManager) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                if (log.isDebugEnabled()) {
                    log.debug("moonlight find class thread -> {}", Thread.currentThread().getName());
                }
                findAllClassDefinition(root, path, charset, referenceManager);
            } catch (IOException e) {
                throw new CompilingRuntimeException(e);
            }
            return 0;
        });
    }


    private static void findAllClassDefinition(Path root, Path path, Charset charset,
                                               DefinitionReferenceManager referenceManager) throws IOException {
        Parser parser = createParser(root, path, charset);
        ClassDefinitionListener listener = new ClassDefinitionListener(referenceManager);
        ParseTree tree = parser.parser.moonlightFile();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    /**
     * Compile source file and generate SourceFile object.
     *
     * @param root             The source file's root path
     * @param path             The source file's relative path
     * @param charset          The source file charset
     * @param referenceManager The reference manager stores all class definitions
     * @return SourceFile object
     * @throws IOException Read source file I/O exception
     */
    private static SourceFile compile(Path root, Path path, Charset charset, DefinitionReferenceManager referenceManager) throws IOException {
        SourceFile sourceFile = new SourceFile();
        sourceFile.setPath(path);
        sourceFile.setRoot(root);
        Parser parser = createParser(root, path, charset);
        MoonlightSourceListener listener = new MoonlightSourceListener(parser.parser, parser.tokenStream, parser.lexer, sourceFile, referenceManager);
        ParseTree tree = listener.getParser().moonlightFile();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        return sourceFile;
    }

    private static Parser createParser(Path root, Path path, Charset charset) throws IOException {
        Parser ret = new Parser();
        ret.path = Paths.get(root.toString(), path.toString());
        CURRENT_PATH.set(ret.path);
        CharStream input = CharStreams.fromPath(ret.path, charset);
        ret.lexer = new MoonlightLexer(input);
        ret.tokenStream = new CommonTokenStream(ret.lexer);
        ret.parser = new MoonlightParser(ret.tokenStream);
        ret.parser.setErrorHandler(new LogErrorStrategy());
        ret.parser.removeErrorListeners();
        ret.parser.addErrorListener(new LogErrorListener());
        return ret;
    }

    public static class Parser {
        MoonlightParser parser;
        CommonTokenStream tokenStream;
        MoonlightLexer lexer;
        Path path;
    }

    public static Path getClasspath() {
        try {
            return Paths.get(IdlCompiler.class.getResource("/").toURI());
        } catch (URISyntaxException e) {
            throw new CompilingRuntimeException(e);
        }
    }


}
