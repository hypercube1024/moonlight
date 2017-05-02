package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static com.moonlightsource.idl.compiler.MoonlightCompiler.createClassDefinitions;
import static com.moonlightsource.idl.compiler.MoonlightCompiler.walk;

/**
 * @author Pengtao Qiu
 */
public class TestError {

    @Test(expected = CompilingRuntimeException.class)
    public void importError() throws IOException {
        try {
            List<MoonlightCompiler.SourceWrap> sourceWraps = walk(
                    Paths.get(MoonlightCompiler.getClasspath().toString(), "/testIDLError/importError"),
                    MoonlightCompiler.DEFAULT_SUFFIX,
                    StandardCharsets.UTF_8).collect(Collectors.toList());

            createClassDefinitions(sourceWraps);
        } catch (CompilingRuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Test(expected = CompilingRuntimeException.class)
    public void annotationError() throws IOException {
        try {
            List<MoonlightCompiler.SourceWrap> sourceWraps = walk(
                    Paths.get(MoonlightCompiler.getClasspath().toString(), "/testIDLError/annotationError"),
                    MoonlightCompiler.DEFAULT_SUFFIX,
                    StandardCharsets.UTF_8).collect(Collectors.toList());

            createClassDefinitions(sourceWraps);
        } catch (CompilingRuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Test(expected = CompilingRuntimeException.class)
    public void annotationFieldError() throws IOException {
        try {
            List<MoonlightCompiler.SourceWrap> sourceWraps = walk(
                    Paths.get(MoonlightCompiler.getClasspath().toString(), "/testIDLError/annotationFieldError"),
                    MoonlightCompiler.DEFAULT_SUFFIX,
                    StandardCharsets.UTF_8).collect(Collectors.toList());

            createClassDefinitions(sourceWraps);
        } catch (CompilingRuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
