package com.moonlightsource.idl.compiler.utils;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pengtao Qiu
 */
abstract public class ParseTreeUtils {

    public static Object getLiteralValue(MoonlightParser.LiteralContext literalContext) {
        if (literalContext.BooleanLiteral() != null) {
            return getTerminalValue(literalContext.BooleanLiteral());
        } else if (literalContext.CharacterLiteral() != null) {
            return getTerminalValue(literalContext.CharacterLiteral());
        } else if (literalContext.StringLiteral() != null) {
            return getTerminalValue(literalContext.StringLiteral());
        } else if (literalContext.IntegerLiteral() != null) {
            return getTerminalValue(literalContext.IntegerLiteral());
        } else if (literalContext.FloatingPointLiteral() != null) {
            return getTerminalValue(literalContext.FloatingPointLiteral());
        }
        throw new CompilingRuntimeException("the literal is not recognized");
    }

    public static Object getTerminalValue(TerminalNode terminalNode) {
        switch (terminalNode.getSymbol().getType()) {
            case MoonlightParser.BooleanLiteral:
                return Boolean.valueOf(terminalNode.getText());
            case MoonlightParser.CharacterLiteral: {
                String c = terminalNode.getText();
                if (c.length() == 3) {
                    return terminalNode.getText().charAt(1);
                } else {
                    throw new CompilingRuntimeException("the char must be not null");
                }
            }
            case MoonlightParser.StringLiteral: {
                String s = terminalNode.getText();
                if (s.length() > 2) {
                    return s.substring(1, s.length() - 1);
                } else {
                    return "";
                }
            }
            case MoonlightParser.IntegerLiteral:
                return Long.parseLong(terminalNode.getText());
            case MoonlightParser.FloatingPointLiteral:
                return Double.parseDouble(terminalNode.getText());
        }
        throw new CompilingRuntimeException("the literal is not recognized");
    }

    public static List<Object> getBaseListValues(MoonlightParser.BaseListExprContext baseListExprContext) {
        if (baseListExprContext.emptyListExpr() != null) {
            return Collections.emptyList();
        }

        List<TerminalNode> v;
        if (baseListExprContext.boolListExpr() != null) {
            v = baseListExprContext.boolListExpr().BooleanLiteral();

        } else if (baseListExprContext.charListExpr() != null) {
            v = baseListExprContext.charListExpr().CharacterLiteral();
        } else if (baseListExprContext.stringListExpr() != null) {
            v = baseListExprContext.stringListExpr().StringLiteral();
        } else if (baseListExprContext.intListExpr() != null) {
            v = baseListExprContext.intListExpr().IntegerLiteral();
        } else if (baseListExprContext.floatListExpr() != null) {
            v = baseListExprContext.floatListExpr().FloatingPointLiteral();
        } else {
            throw new CompilingRuntimeException("the base list is not recognized");
        }

        if (v == null || v.isEmpty()) {
            return Collections.emptyList();
        } else {
            return v.stream().map(ParseTreeUtils::getTerminalValue).collect(Collectors.toList());
        }
    }

    public static String getErrorLine(Path path, TerminalNode node) {
        return "@file[" + path + "] ,line[" + node.getSymbol().getLine() + ", " + node.getSymbol().getCharPositionInLine() + "]";
    }
}
