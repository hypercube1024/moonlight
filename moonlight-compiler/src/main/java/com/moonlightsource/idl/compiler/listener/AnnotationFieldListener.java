package com.moonlightsource.idl.compiler.listener;

import com.firefly.utils.function.Func1;
import com.moonlightsource.idl.compiler.model.*;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pengtao Qiu
 */
public class AnnotationFieldListener extends BaseFieldListener<AnnotationFieldDefinition> {

    private final SourceFile sourceFile;
    private final DefinitionReferenceManager referenceManager;

    public AnnotationFieldListener(SourceFile sourceFile, DefinitionReferenceManager referenceManager) {
        this.sourceFile = sourceFile;
        this.referenceManager = referenceManager;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.BoolFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.ByteFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.ShortFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.IntFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.LongFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.CharFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.FloatFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.DoubleFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.StringFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.BoolListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.ByteListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.ShortListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.IntListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.LongListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.CharListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.FloatListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.DoubleListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        return null;
    }

    @Override
    protected AnnotationFieldDefinition createField(MoonlightParser.StringListFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        String namespace = sourceFile.getNamespace();
        String fieldName = ctx.Identifier().getText();
        String className = ctx.stringList().getText();
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

        DefinitionReference reference = new DefinitionReference(namespace, className + fieldName, referenceManager);
        List<DefinitionReference> parametricTypeRefs = Collections.singletonList(new DefinitionReference("", TypeEnum.STRING.getKeyword(), referenceManager));
        ClassDefinition classDefinition = new ClassDefinition(TypeEnum.LIST, TypeEnum.LIST.getKeyword(), namespace, parametricTypeRefs, Collections.emptyList());
        referenceManager.put(reference, classDefinition);
        return new AnnotationFieldDefinition(fieldName, reference, values, declaredAnnotationReference);
    }
}
