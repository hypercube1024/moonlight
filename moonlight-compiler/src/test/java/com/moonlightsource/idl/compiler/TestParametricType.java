package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.Source;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;

/**
 * @author Pengtao Qiu
 */
public class TestParametricType {

    @Test
    public void test() throws IOException {
        Path root = Paths.get(MoonlightCompiler.getClasspath().toString(), "/testParametricType");
        MoonlightCompiler.compile(root, classVisitor -> {
            Source source = classVisitor.findSource(Paths.get("/foo.mol"));
            Assert.assertThat(source.getStructs().size(), greaterThanOrEqualTo(3));
        });
    }
}
