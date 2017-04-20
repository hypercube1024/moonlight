package com.moonlightsource.idl.compiler.exception;

/**
 * @author Pengtao Qiu
 */
public class CompilingRuntimeException extends RuntimeException {

    public CompilingRuntimeException(Throwable cause) {
        super(cause);
    }

    public CompilingRuntimeException(String message) {
        super(message);
    }

    public CompilingRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
