package com.moonlightsource.idl.compiler.model;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pengtao Qiu
 */
public class ClassVisitor {

    private final List<Source> sources;

    public ClassVisitor(List<Source> sources) {
        List<Source> unmodifiable = sources.stream().map(Source::toUnmodifiableSource).collect(Collectors.toList());
        this.sources = Collections.unmodifiableList(unmodifiable);
    }

    public Source findSource(Path path) {
        return sources.parallelStream().filter(source -> source.getPath().equals(path)).findFirst().orElse(null);
    }

    public List<Source> getSources() {
        return sources;
    }
}
