package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author Pengtao Qiu
 */
public class TestClassVisitor {

    private static final Path root = Paths.get(MoonlightCompiler.getClasspath().toString(), "testIDL");

    @Test
    public void test() throws IOException {
        MoonlightCompiler.compile(root, classVisitor -> {
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
        });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiableSource() throws IOException {
        MoonlightCompiler.compile(root, classVisitor -> {
            Source source = classVisitor.findSource(Paths.get("/api/StoreService.mol"));
            source.setImports(Collections.emptyMap());
        });

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiableSource2() throws IOException {
        MoonlightCompiler.compile(root, classVisitor -> {
            Source source = classVisitor.findSource(Paths.get("/api/StoreService.mol"));
            source.getImports().put("h", Collections.emptySet());
        });
    }
}
