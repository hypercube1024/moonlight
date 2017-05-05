package com.moonlightsource.idl.compiler;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;

/**
 * @author Pengtao Qiu
 */
abstract public class AbstractCompilingErrorTest {

    public void compile(String path) throws IOException {
        try {
            MoonlightCompiler.compile(Paths.get(MoonlightCompiler.getClasspath().toString(), path), Collections.emptyList());
        } catch (CompilingRuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
