package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.model.DefinitionReference;
import com.moonlightsource.idl.compiler.model.DefinitionReferenceManager;
import com.moonlightsource.idl.compiler.model.FieldDefinition;
import com.moonlightsource.idl.compiler.model.SourceFile;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.moonlightsource.idl.compiler.utils.ParseTreeUtils.getStringListParametricType;

/**
 * @author Pengtao Qiu
 */
public class AnnotationFieldListener extends BaseFieldListener<FieldDefinition> {

    private final SourceFile sourceFile;
    private final DefinitionReferenceManager referenceManager;

    public AnnotationFieldListener(SourceFile sourceFile, DefinitionReferenceManager referenceManager) {
        this.sourceFile = sourceFile;
        this.referenceManager = referenceManager;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.BoolFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.ByteFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.ShortFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.IntFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.LongFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.CharFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.FloatFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.DoubleFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.StringFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.BoolListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.ByteListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.ShortListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.IntListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.LongListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.CharListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.FloatListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.DoubleListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected FieldDefinition createField(MoonlightParser.StringListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        String fieldName = ctx.Identifier().getText();
        List<Object> values;
        if (ctx.stringListExpr() != null) {
            List<TerminalNode> list = ctx.stringListExpr().StringLiteral();
            if (list != null && !list.isEmpty()) {
                values = list.stream().map(t -> (Object) t.getText().substring(1, t.getText().length() - 1)).collect(Collectors.toList());
            } else {
                values = Collections.emptyList();
            }
        } else {
            values = Collections.emptyList();
        }

        return new FieldDefinition(fieldName, Collections.emptyList(),
                getStringListParametricType(referenceManager),
                declaredAnnotationReference, values, null);
    }
}
