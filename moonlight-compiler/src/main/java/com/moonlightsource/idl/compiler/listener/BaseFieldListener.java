package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.DefinitionReference;
import com.moonlightsource.idl.compiler.model.FieldDefinition;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;

/**
 * @author Pengtao Qiu
 */
abstract public class BaseFieldListener<T extends FieldDefinition> {

    public T createBaseField(MoonlightParser.BaseFieldContext ctx, DefinitionReference declaredAnnotationReference) {
        if (ctx instanceof MoonlightParser.BoolFieldContext) {
            return this.createField((MoonlightParser.BoolFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.ByteFieldContext) {
            return this.createField((MoonlightParser.ByteFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.ShortFieldContext) {
            return this.createField((MoonlightParser.ShortFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.IntFieldContext) {
            return this.createField((MoonlightParser.IntFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.LongFieldContext) {
            return this.createField((MoonlightParser.LongFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.CharFieldContext) {
            return this.createField((MoonlightParser.CharFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.FloatFieldContext) {
            return this.createField((MoonlightParser.FloatFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.DoubleFieldContext) {
            return this.createField((MoonlightParser.DoubleFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.StringFieldContext) {
            return this.createField((MoonlightParser.StringFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.BoolListFieldContext) {
            return this.createField((MoonlightParser.BoolListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.ByteListFieldContext) {
            return this.createField((MoonlightParser.ByteListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.ShortListFieldContext) {
            return this.createField((MoonlightParser.ShortListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.IntListFieldContext) {
            return this.createField((MoonlightParser.IntListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.LongListFieldContext) {
            return this.createField((MoonlightParser.LongListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.CharListFieldContext) {
            return this.createField((MoonlightParser.CharListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.FloatListFieldContext) {
            return this.createField((MoonlightParser.FloatListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.DoubleListFieldContext) {
            return this.createField((MoonlightParser.DoubleListFieldContext) ctx, declaredAnnotationReference);
        } else if (ctx instanceof MoonlightParser.StringListFieldContext) {
            return this.createField((MoonlightParser.StringListFieldContext) ctx, declaredAnnotationReference);
        }
        throw new CompilingRuntimeException("the field type is not support");
    }

    abstract protected T createField(MoonlightParser.BoolFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.ByteFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.ShortFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.IntFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.LongFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.CharFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.FloatFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.DoubleFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.StringFieldContext ctx, DefinitionReference declaredAnnotationReference);

    abstract protected T createField(MoonlightParser.BoolListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.ByteListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.ShortListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.IntListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.LongListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.CharListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.FloatListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.DoubleListFieldContext ctx, DefinitionReference declaredAnnotationReference);
    abstract protected T createField(MoonlightParser.StringListFieldContext ctx, DefinitionReference declaredAnnotationReference);
}
