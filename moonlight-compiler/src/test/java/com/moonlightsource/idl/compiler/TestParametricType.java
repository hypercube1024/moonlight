package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.ClassVisitor;
import com.moonlightsource.idl.compiler.model.Source;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static com.moonlightsource.idl.compiler.MoonlightCompiler.createClassDefinitions;
import static com.moonlightsource.idl.compiler.MoonlightCompiler.walk;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

/**
 * @author Pengtao Qiu
 */
public class TestParametricType {

    @Test
    public void test() throws IOException {
        List<MoonlightCompiler.SourceWrap> sourceWraps = walk(
                Paths.get(MoonlightCompiler.getClasspath().toString(), "/testParametricType"),
                MoonlightCompiler.DEFAULT_SUFFIX,
                StandardCharsets.UTF_8).collect(Collectors.toList());

        ClassVisitor classVisitor = createClassDefinitions(sourceWraps);
        Source source = classVisitor.findSource(Paths.get("/foo.mol"));
        Assert.assertThat(source.getStructs().size(), greaterThanOrEqualTo(3));
    }
}
