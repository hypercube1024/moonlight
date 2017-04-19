package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.SourceFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * @author Pengtao Qiu
 */
public class TestCompiler {

    @Test
    public void test() throws URISyntaxException, IOException {
        Path path = Paths.get(TestCompiler.class.getResource("/com/moonlightsource/idl/test2/TestImport.mol").toURI());
        SourceFile sourceFile = Compiler.INSTANCE.compile(path, StandardCharsets.UTF_8);

        Assert.assertThat(sourceFile.getNamespace(), is("com.moonlightsource.idl.test2"));
        Assert.assertThat(sourceFile.getImports().size(), greaterThanOrEqualTo(2));
    }

}
