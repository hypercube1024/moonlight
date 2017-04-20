package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.SourceFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * @author Pengtao Qiu
 */
public class TestCompiler {

    @Test
    public void test() throws IOException {
        Path path = Paths.get("/com/moonlightsource/idl/test2/TestImport.mol");
        SourceFile sourceFile = Compiler.INSTANCE.compile(path, StandardCharsets.UTF_8);

        Assert.assertThat(sourceFile.getNamespace(), is("com.moonlightsource.idl.test2"));
        Assert.assertThat(sourceFile.getImports().size(), greaterThanOrEqualTo(2));
    }

    @Test
    public void test2() throws IOException {
        List<SourceFile> sourceFiles = Compiler.INSTANCE.compileAll(Compiler.INSTANCE.getClasspath(), ".mol", StandardCharsets.UTF_8);
        Assert.assertThat(sourceFiles.size(), greaterThanOrEqualTo(2));

        Path path = Paths.get("/com/moonlightsource/idl/test2/TestImport.mol");
        Optional<SourceFile> opt = sourceFiles.stream()
                                              .filter(source -> source.getPath().equals(path))
                                              .findFirst();
        Assert.assertThat(opt.isPresent(), is(true));
        if (opt.isPresent()) {
            SourceFile sourceFile = opt.get();
            Assert.assertThat(sourceFile.getNamespace(), is("com.moonlightsource.idl.test2"));
            Assert.assertThat(sourceFile.getImports().size(), greaterThanOrEqualTo(2));
        }
    }

}
