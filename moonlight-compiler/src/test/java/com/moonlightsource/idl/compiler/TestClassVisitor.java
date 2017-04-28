package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.ClassVisitor;
import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Collections;
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

    private static List<MoonlightCompiler.SourceWrap> sourceWraps = null;

    static {
        try {
            sourceWraps = walk(Paths.get(MoonlightCompiler.getClasspath().toString(), "testIDL"),
                    MoonlightCompiler.DEFAULT_SUFFIX,
                    StandardCharsets.UTF_8).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws IOException {
        ClassVisitor classVisitor = createClassDefinitions(sourceWraps);
        System.out.println(classVisitor.getSources());

        Source source = classVisitor.findSource(Paths.get("/api/StoreService.mol"));
        Assert.assertThat(source, notNullValue());
        Assert.assertThat(source.getStructs().size(), is(2));

        MoonlightParser.StructDeclarationContext product = source.findStruct("Product");
        Assert.assertThat(product, notNullValue());
        Assert.assertThat(product.structField().size(), is(4));

        Assert.assertThat(source.getImportNamespace("Response"), is("com.moonlightsource.idl.common"));
        Assert.assertThat(source.getImportNamespace("Request"), is("com.moonlightsource.idl.common"));
        Assert.assertThat(source.getImportNamespace("ResponseCode"), is("com.moonlightsource.idl.common"));

        Assert.assertThat(source.containClassNameInImports("test"), is(false));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiableSource() throws IOException {
        ClassVisitor classVisitor = createClassDefinitions(sourceWraps);
        Source source = classVisitor.findSource(Paths.get("/api/StoreService.mol"));
        source.setImports(Collections.emptyMap());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiableSource2() throws IOException {
        ClassVisitor classVisitor = createClassDefinitions(sourceWraps);
        Source source = classVisitor.findSource(Paths.get("/api/StoreService.mol"));
        source.getImports().put("h", Collections.emptySet());
    }
}
