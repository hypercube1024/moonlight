package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.SourceFile;
import org.junit.Assert;
import org.junit.Before;
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

    private static List<SourceFile> sourceFiles;

    static {
        try {
            sourceFiles = Compiler.compileAll(Compiler.getClasspath(), ".mol", StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SourceFile find(Path path) {
        return sourceFiles.stream()
                          .filter(source -> source.getPath().equals(path))
                          .findFirst()
                          .orElse(null);
    }

    @Test
    public void testImport() throws IOException {
        Path path = Paths.get("/com/moonlightsource/idl/test2/TestImport.mol");
        SourceFile sourceFile = Compiler.compile(path, StandardCharsets.UTF_8);

        Assert.assertThat(sourceFile.getNamespace(), is("com.moonlightsource.idl.test2"));
        Assert.assertThat(sourceFile.getImports().size(), greaterThanOrEqualTo(2));
    }

    @Test
    public void testCompileAll() throws IOException {
        Assert.assertThat(sourceFiles.size(), greaterThanOrEqualTo(2));

        Path path = Paths.get("/com/moonlightsource/idl/test2/TestImport.mol");
        SourceFile sourceFile = find(path);
        Assert.assertThat(sourceFile.getNamespace(), is("com.moonlightsource.idl.test2"));
        Assert.assertThat(sourceFile.getImports().size(), greaterThanOrEqualTo(2));
    }

    @Test
    public void testAnnotation() {
        Path path = Paths.get("/com/moonlightsource/idl/test2/TestAnnotation.mol");
    }


}
