package com.moonlightsource.idl.compiler.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pengtao Qiu
 */
public class SourceFile extends Source {

    private Path path;
    private Path root;

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public Path getRoot() {
        return root;
    }

    public void setRoot(Path root) {
        this.root = root;
    }
}
