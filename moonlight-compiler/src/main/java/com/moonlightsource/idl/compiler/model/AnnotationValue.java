package com.moonlightsource.idl.compiler.model;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import com.moonlightsource.idl.compiler.utils.ParseTreeUtils;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Pengtao Qiu
 */
public class AnnotationValue {

    private final DefinitionReference annotationDefinitionReference;
    private final Map<String, ParseTree> fieldMap;

    public AnnotationValue(DefinitionReference annotationDefinitionReference, Map<String, ParseTree> fieldMap) {
        this.annotationDefinitionReference = annotationDefinitionReference;
        this.fieldMap = fieldMap;
    }

    public Object getValue(String fieldName) {
        ParseTree parseTree = fieldMap.get(fieldName);
        if (parseTree == null) {
            return null;
        }

        if (!(parseTree instanceof MoonlightParser.LiteralContext)) {
            throw new CompilingRuntimeException("the parse tree is not LiteralContext");
        }

        return ParseTreeUtils.getLiteralValue((MoonlightParser.LiteralContext) parseTree);
    }

    public List<Object> getValues(String fieldName) {
        ParseTree parseTree = fieldMap.get(fieldName);
        if (parseTree == null) {
            return Collections.emptyList();
        }

        if (!(parseTree instanceof MoonlightParser.BaseListExprContext)) {
            throw new CompilingRuntimeException("the parse tree is not BaseListExprContext");
        }

        return ParseTreeUtils.getBaseListValues((MoonlightParser.BaseListExprContext) parseTree);
    }

    public AnnotationDefinition getAnnotationDefinition() {
        return (AnnotationDefinition) annotationDefinitionReference.getClassDefinition();
    }
}
