package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.ClassVisitor;
import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static com.moonlightsource.idl.compiler.MoonlightCompiler.createClassDefinitions;
import static com.moonlightsource.idl.compiler.MoonlightCompiler.walk;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author Pengtao Qiu
 */
public class TestClassVisitor {

    @Test
    public void test() throws IOException {
        Path root = Paths.get(MoonlightCompiler.getClasspath().toString(), "testIDL_0");
        List<MoonlightCompiler.SourceWrap> sourceWraps = walk(root, MoonlightCompiler.DEFAULT_SUFFIX, StandardCharsets.UTF_8).collect(Collectors.toList());
        ClassVisitor classVisitor = createClassDefinitions(sourceWraps);

        Source source = classVisitor.findSource(Paths.get("/com/moonlightsource/idl/api/StoreService.mol"));
        Assert.assertThat(source, notNullValue());
        Assert.assertThat(source.getStructs().size(), is(2));

        MoonlightParser.StructDeclarationContext product = source.findStruct("Product");
        Assert.assertThat(product, notNullValue());
        System.out.println(product.structField().size());
        Assert.assertThat(product.structField().size(), is(4));
    }
}
