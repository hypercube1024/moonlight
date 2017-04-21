package com.moonlightsource.idl.compiler.exception;

import com.moonlightsource.idl.compiler.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.nio.file.Path;

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

    public CompilingRuntimeException(String message, TerminalNode node, Path path) {
        super(message + " " + ParseTreeUtils.getErrorLine(path, node));
    }

    public CompilingRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
