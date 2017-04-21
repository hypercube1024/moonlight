package com.moonlightsource.idl.compiler.exception;

import com.moonlightsource.idl.compiler.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.nio.file.Path;

/**
 * @author Pengtao Qiu
 */
public class ClassNotFoundRuntimeException extends CompilingRuntimeException {
    public ClassNotFoundRuntimeException(Throwable cause) {
        super(cause);
    }

    public ClassNotFoundRuntimeException(String message) {
        super(message);
    }

    public ClassNotFoundRuntimeException(String message, TerminalNode node, Path path) {
        super(message + " " + ParseTreeUtils.getErrorLine(path, node));
    }

    public ClassNotFoundRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
