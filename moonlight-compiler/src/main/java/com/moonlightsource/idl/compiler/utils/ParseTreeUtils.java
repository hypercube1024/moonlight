package com.moonlightsource.idl.compiler.utils;

import com.firefly.utils.StringUtils;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.Source;
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
        return "@file[" + path + "], line[" + node.getSymbol().getLine() + ", " + node.getSymbol().getCharPositionInLine() + "]";
    }

    public static String getBaseFieldName(MoonlightParser.BaseFieldContext baseFieldContext) {
        return baseFieldContext.getChild(1).getText();
    }

    public static boolean matchBaseFieldType(MoonlightParser.BaseFieldContext baseFieldContext, MoonlightParser.BaseAssignmentContext baseAssignmentContext) {
        if (baseAssignmentContext.literal() != null && baseAssignmentContext.literal().NullLiteral() != null) {
            return true;
        }

        if (baseFieldContext instanceof MoonlightParser.BoolFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().BooleanLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.ByteFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().IntegerLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.ShortFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().IntegerLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.IntFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().IntegerLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.LongFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().IntegerLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.CharFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().CharacterLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.FloatFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().FloatingPointLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.DoubleFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().FloatingPointLiteral() != null;
        } else if (baseFieldContext instanceof MoonlightParser.StringFieldContext) {
            return baseAssignmentContext.literal() != null && baseAssignmentContext.literal().StringLiteral() != null;
        } else {
            if (baseAssignmentContext.baseListExpr() == null) {
                return false;
            }

            if (baseAssignmentContext.baseListExpr().emptyListExpr() != null) {
                return true;
            }

            if (baseFieldContext instanceof MoonlightParser.BoolListFieldContext) {
                return baseAssignmentContext.baseListExpr().boolListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.ByteListFieldContext) {
                return baseAssignmentContext.baseListExpr().intListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.ShortListFieldContext) {
                return baseAssignmentContext.baseListExpr().intListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.IntListFieldContext) {
                return baseAssignmentContext.baseListExpr().intListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.LongListFieldContext) {
                return baseAssignmentContext.baseListExpr().intListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.CharListFieldContext) {
                return baseAssignmentContext.baseListExpr().charListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.FloatListFieldContext) {
                return baseAssignmentContext.baseListExpr().floatListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.DoubleListFieldContext) {
                return baseAssignmentContext.baseListExpr().floatListExpr() != null;
            } else if (baseFieldContext instanceof MoonlightParser.StringListFieldContext) {
                return baseAssignmentContext.baseListExpr().stringListExpr() != null;
            }
        }
        return false;
    }

    public static String getAnnotationNamespace(String className, MoonlightParser.AnnotationContext annotationCtx, Source source) {
        String namespace;
        if (annotationCtx.namespaceValue() != null) {
            namespace = annotationCtx.namespaceValue().getText();
        } else {
            namespace = source.getImportNamespace(className);
            if (!StringUtils.hasText(namespace)) {
                namespace = source.getNamespace();
            }
        }
        if (!StringUtils.hasText(namespace)) {
            throw new CompilingRuntimeException("the annotation [" + className + "] is not found",
                    annotationCtx.AnnotationLabel(), source.getPath());
        }
        return namespace;
    }

    public static String getAnnotationClassName(MoonlightParser.AnnotationContext annotationCtx) {
        return annotationCtx.AnnotationLabel().getText().substring(1);
    }

}
