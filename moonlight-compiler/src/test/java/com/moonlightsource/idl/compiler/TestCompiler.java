package com.moonlightsource.idl.compiler;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Pengtao Qiu
 */
public class TestCompiler {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path = Paths.get(TestCompiler.class.getResource("/com/moonlightsource/idl/test2/TestImport.mol").toURI());
        Compiler.INSTANCE.compile(path, StandardCharsets.UTF_8);
    }
}
