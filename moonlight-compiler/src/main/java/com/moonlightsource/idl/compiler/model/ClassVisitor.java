package com.moonlightsource.idl.compiler.model;

import java.nio.file.Path;
import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class ClassVisitor {

    private final List<Source> sources;

    public ClassVisitor(List<Source> sources) {
        this.sources = sources;
    }

    public Source findSource(Path path) {
        return sources.parallelStream().filter(source -> source.getPath().equals(path)).findFirst().orElse(null);
    }
}
