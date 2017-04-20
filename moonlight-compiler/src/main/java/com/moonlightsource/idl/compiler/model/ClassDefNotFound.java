package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.function.Func0;

/**
 * @author Pengtao Qiu
 */
public class ClassDefNotFound implements Func0<ClassDefinition> {

    private final RuntimeException runtimeException;

    public ClassDefNotFound(RuntimeException runtimeException) {
        this.runtimeException = runtimeException;
    }

    @Override
    public ClassDefinition call() {
        throw runtimeException;
    }
}
