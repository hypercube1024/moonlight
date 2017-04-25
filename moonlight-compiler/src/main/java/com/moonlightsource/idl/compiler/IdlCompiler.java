package com.moonlightsource.idl.compiler;

import com.firefly.utils.io.IO;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.exception.LogErrorListener;
import com.moonlightsource.idl.compiler.exception.LogErrorStrategy;
import com.moonlightsource.idl.compiler.listener.ClassDefinitionListener;
import com.moonlightsource.idl.compiler.listener.SyntaxCheckListener;
import com.moonlightsource.idl.compiler.model.ClassDefinitions;
import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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
     * @throws IOException Read source file I/O exception
     */
    public static void compile(Path root, Predicate<Path> filter, Charset charset) throws IOException {
        ClassDefinitions classDefinitions = new ClassDefinitions();
        List<SourceWrap> sourceWraps = walk(root, filter, charset).collect(Collectors.toList());
        sourceWraps.parallelStream().map(ParserWrap::new).forEach(parserWrap -> {
            if (log.isDebugEnabled()) {
                log.debug("moonlight find class thread -> {}", Thread.currentThread().getName());
            }
            CURRENT_PATH.set(parserWrap.sourceWrap.absolutePath);
            ParseTree tree = parserWrap.parser.moonlightFile();
            ParseTreeWalker walker = new ParseTreeWalker();

            Source source = new Source();
            source.setPath(parserWrap.sourceWrap.path);
            source.setRoot(parserWrap.sourceWrap.root);
            source.setAbsolutePath(parserWrap.sourceWrap.absolutePath);
            ClassDefinitionListener listener = new ClassDefinitionListener(classDefinitions, source);
            walker.walk(listener, tree);
        });

         sourceWraps.parallelStream().map(ParserWrap::new).forEach(parserWrap -> {
            if (log.isDebugEnabled()) {
                log.debug("moonlight syntax check thread -> {}", Thread.currentThread().getName());
            }
            CURRENT_PATH.set(parserWrap.sourceWrap.absolutePath);
            ParseTree tree = parserWrap.parser.moonlightFile();
            ParseTreeWalker walker = new ParseTreeWalker();
            SyntaxCheckListener listener = new SyntaxCheckListener(classDefinitions);
            walker.walk(listener, tree);
        });
    }

    private static Stream<SourceWrap> walk(Path root, Predicate<Path> filter, Charset charset) throws IOException {
        return walk(root, filter).map(path -> {
            if (log.isDebugEnabled()) {
                log.debug("moonlight file reading thread -> {}", Thread.currentThread().getName());
            }
            Path absolutePath = Paths.get(root.toString(), path.toString());
            try (InputStream inputStream = Files.newInputStream(absolutePath)) {
                return new SourceWrap(root, path, absolutePath, IO.toString(inputStream, charset));
            } catch (IOException e) {
                throw new CompilingRuntimeException(e);
            }
        });
    }

    private static Stream<Path> walk(Path root, Predicate<Path> filter) throws IOException {
        return Files.walk(root)
                    .filter(path -> !Files.isDirectory(path))
                    .filter(filter)
                    .map(path -> Paths.get(path.toString().substring(root.toString().length())));
    }

    private static class ParserWrap {
        final MoonlightParser parser;
        final CommonTokenStream tokenStream;
        final MoonlightLexer lexer;
        final SourceWrap sourceWrap;

        public ParserWrap(SourceWrap sourceWrap) {
            this.sourceWrap = sourceWrap;
            lexer = new MoonlightLexer(CharStreams.fromString(sourceWrap.source));
            tokenStream = new CommonTokenStream(lexer);
            parser = new MoonlightParser(tokenStream);
            parser.setErrorHandler(new LogErrorStrategy());
            parser.removeErrorListeners();
            parser.addErrorListener(new LogErrorListener());
        }
    }

    private static class SourceWrap {
        final Path root;
        final Path path;
        final Path absolutePath;
        final String source;

        public SourceWrap(Path root, Path path, Path absolutePath, String source) {
            this.root = root;
            this.path = path;
            this.absolutePath = absolutePath;
            this.source = source;
        }
    }

    public static Path getClasspath() {
        try {
            return Paths.get(IdlCompiler.class.getResource("/").toURI());
        } catch (URISyntaxException e) {
            throw new CompilingRuntimeException(e);
        }
    }

}
