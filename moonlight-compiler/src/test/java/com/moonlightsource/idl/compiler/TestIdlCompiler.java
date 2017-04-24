package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
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
        Path path = Paths.get("/common/Common.mol");
        SourceFile sourceFile = find(path);
        Assert.assertThat(sourceFile.getAnnotationDefinitions().size(), greaterThanOrEqualTo(1));

        Optional<AnnotationDefinition> opt = sourceFile.getAnnotationDefinitions()
                                                       .stream()
                                                       .filter(d -> d.getName().equals("Template"))
                                                       .findFirst();

        Assert.assertThat(opt.isPresent(), is(true));

        if (opt.isPresent()) {
            AnnotationDefinition d = opt.get();
            Assert.assertThat(d.getFields().size(), greaterThanOrEqualTo(1));
            Optional<AnnotationFieldDefinition> nameOpt = d.getFields()
                                                           .stream()
                                                           .filter(field -> field.getName().equals("names"))
                                                           .findFirst();

            Assert.assertThat(nameOpt.isPresent(), is(true));
            if (nameOpt.isPresent()) {
                AnnotationFieldDefinition field = nameOpt.get();
                Assert.assertThat(field.getDeclaredAnnotationDefinition(), is(d));
                ClassDefinition type = field.getClassDefinition();
                Assert.assertThat(type.getName(), is(TypeEnum.LIST.getKeyword()));
                Assert.assertThat(type.getParametricTypes().get(0).getName(), is(TypeEnum.STRING.getKeyword()));

            }
        }
    }


}
