package com.moonlightsource.idl.compiler.generator;

import com.moonlightsource.idl.compiler.model.ClassVisitor;

/**
 * @author Pengtao Qiu
 */
public interface Generator {
    void generate(ClassVisitor classVisitor);
}
