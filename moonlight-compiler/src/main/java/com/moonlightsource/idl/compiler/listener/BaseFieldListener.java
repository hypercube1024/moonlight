package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.FieldDefinition;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;

/**
 * @author Pengtao Qiu
 */
abstract public class BaseFieldListener<T extends FieldDefinition> {

    public T createBaseField(MoonlightParser.BaseFieldContext ctx) {
        if (ctx instanceof MoonlightParser.BoolFieldContext) {
            return this.createField((MoonlightParser.BoolFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.ByteFieldContext) {
            return this.createField((MoonlightParser.ByteFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.ShortFieldContext) {
            return this.createField((MoonlightParser.ShortFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.IntFieldContext) {
            return this.createField((MoonlightParser.IntFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.LongFieldContext) {
            return this.createField((MoonlightParser.LongFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.CharFieldContext) {
            return this.createField((MoonlightParser.CharFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.FloatFieldContext) {
            return this.createField((MoonlightParser.FloatFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.DoubleFieldContext) {
            return this.createField((MoonlightParser.DoubleFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.StringFieldContext) {
            return this.createField((MoonlightParser.StringFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.BoolListFieldContext) {
            return this.createField((MoonlightParser.BoolListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.ByteListFieldContext) {
            return this.createField((MoonlightParser.ByteListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.ShortListFieldContext) {
            return this.createField((MoonlightParser.ShortListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.IntListFieldContext) {
            return this.createField((MoonlightParser.IntListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.LongListFieldContext) {
            return this.createField((MoonlightParser.LongListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.CharListFieldContext) {
            return this.createField((MoonlightParser.CharListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.FloatListFieldContext) {
            return this.createField((MoonlightParser.FloatListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.DoubleListFieldContext) {
            return this.createField((MoonlightParser.DoubleListFieldContext) ctx);
        } else if (ctx instanceof MoonlightParser.StringListFieldContext) {
            return this.createField((MoonlightParser.StringListFieldContext) ctx);
        }
        throw new CompilingRuntimeException("the field type is not support");
    }

    abstract protected T createField(MoonlightParser.BoolFieldContext ctx);
    abstract protected T createField(MoonlightParser.ByteFieldContext ctx);
    abstract protected T createField(MoonlightParser.ShortFieldContext ctx);
    abstract protected T createField(MoonlightParser.IntFieldContext ctx);
    abstract protected T createField(MoonlightParser.LongFieldContext ctx);
    abstract protected T createField(MoonlightParser.CharFieldContext ctx);
    abstract protected T createField(MoonlightParser.FloatFieldContext ctx);
    abstract protected T createField(MoonlightParser.DoubleFieldContext ctx);
    abstract protected T createField(MoonlightParser.StringFieldContext ctx);

    abstract protected T createField(MoonlightParser.BoolListFieldContext ctx);
    abstract protected T createField(MoonlightParser.ByteListFieldContext ctx);
    abstract protected T createField(MoonlightParser.ShortListFieldContext ctx);
    abstract protected T createField(MoonlightParser.IntListFieldContext ctx);
    abstract protected T createField(MoonlightParser.LongListFieldContext ctx);
    abstract protected T createField(MoonlightParser.CharListFieldContext ctx);
    abstract protected T createField(MoonlightParser.FloatListFieldContext ctx);
    abstract protected T createField(MoonlightParser.DoubleListFieldContext ctx);
    abstract protected T createField(MoonlightParser.StringListFieldContext ctx);
}
