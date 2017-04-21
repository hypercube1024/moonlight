package com.moonlightsource.idl.compiler.exception;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

import com.moonlightsource.idl.compiler.IdlCompiler;

/**
 * @author Pengtao Qiu
 */
public class LogErrorListener extends BaseErrorListener {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        log.error("rule stack: " + stack);
        log.error("file[" + IdlCompiler.CURRENT_PATH.get() + "], line[" + line + ":" + charPositionInLine + "] at " + offendingSymbol + ". " + msg, e);
    }
}
