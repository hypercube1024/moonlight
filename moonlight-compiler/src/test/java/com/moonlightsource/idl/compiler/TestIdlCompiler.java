package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.SourceFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * @author Pengtao Qiu
 */
public class TestIdlCompiler {

    private static List<SourceFile> sourceFiles;

    static {
        try {
            sourceFiles = IdlCompiler.compileAll(
                    Paths.get(IdlCompiler.getClasspath().toString(), "/com/moonlightsource/idl"),
                    IdlCompiler.DEFAULT_SUFFIX,
                    StandardCharsets.UTF_8);
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
    public void testCompileAll() throws IOException {
        Assert.assertThat(sourceFiles.size(), greaterThanOrEqualTo(2));

        Path path = Paths.get("/test2/TestImport.mol");
        SourceFile sourceFile = find(path);
        Assert.assertThat(sourceFile.getNamespace(), is("com.moonlightsource.idl.test2"));
        Assert.assertThat(sourceFile.getImports().size(), greaterThanOrEqualTo(2));
        System.out.println(sourceFile.getImports());
    }

    @Test
    public void testAnnotation() {
        Path path = Paths.get("/test2/TestAnnotation.mol");
    }


}
