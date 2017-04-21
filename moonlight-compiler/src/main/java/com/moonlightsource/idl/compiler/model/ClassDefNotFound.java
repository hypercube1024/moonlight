package com.moonlightsource.idl.compiler.model;

import com.firefly.utils.function.Func0;
import com.moonlightsource.idl.compiler.exception.ClassNotFoundRuntimeException;

/**
 * @author Pengtao Qiu
 */
public class ClassDefNotFound implements Func0<ClassDefinition> {

    private final ClassNotFoundRuntimeException runtimeException;

    public ClassDefNotFound(ClassNotFoundRuntimeException runtimeException) {
        this.runtimeException = runtimeException;
    }

    @Override
    public ClassDefinition call() {
        throw runtimeException;
    }
}
