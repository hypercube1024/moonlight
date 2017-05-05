package com.moonlightsource.idl.compiler.listener;

import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.ClassDefs;
import com.moonlightsource.idl.compiler.model.Source;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

import static com.moonlightsource.idl.compiler.utils.ParseTreeUtils.getBaseFieldName;

/**
 * @author Pengtao Qiu
 */
public class SemanticCheckListener extends MoonlightBaseListener {

    private final ClassDefs classDefs;
    private final Source source;
    private String namespace;

    public SemanticCheckListener(ClassDefs classDefs, Source source) {
        this.classDefs = classDefs;
        this.source = source;
        classDefs.addSource(source);
    }

    @Override
    public void enterMoonlightFile(MoonlightParser.MoonlightFileContext ctx) {
        source.getFileAnnotations().addAll(ctx.annotation());
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        namespace = ctx.namespaceValue().getText();
        classDefs.putNamespace(namespace);
        source.setNamespace(namespace);
    }

    @Override
    public void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx) {
        StringBuilder namespace = new StringBuilder();
        String name = null;
        MoonlightParser.ImportValueContext importCtx = ctx.importValue();
        final int childCount = importCtx.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (i < childCount - 2) {
                namespace.append(importCtx.getChild(i).getText());
            } else if (i == childCount - 1) {
                name = importCtx.getChild(i).getText();
            }
        }
        if (name == null) {
            throw new CompilingRuntimeException("import name is null", ctx.IMPORT(), source.getPath());
        }
        classDefs.putImport(source.getPath(), namespace.toString(), name);
    }

    @Override
    public void enterStructDeclaration(MoonlightParser.StructDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        // struct field name check
        if (ctx.structField() != null && !ctx.structField().isEmpty()) {
            Set<String> fieldNames = new HashSet<>();
            ctx.structField().forEach(field -> {
                String name = field.Identifier().getText();
                if (fieldNames.contains(name)) {
                    throw new CompilingRuntimeException("duplicated field name [" + name + "]", field.Identifier(), source.getPath());
                } else {
                    fieldNames.add(name);
                }
            });
        }

        if (ctx.parametricTypeDeclaration() != null) {
            List<TerminalNode> list = ctx.parametricTypeDeclaration().Identifier();
            if (list != null && !list.isEmpty()) {
                List<String> parametricDefs = new ArrayList<>();
                for (TerminalNode terminalNode : list) {
                    String p = terminalNode.getText();
                    if (parametricDefs.contains(p)) {
                        throw new CompilingRuntimeException("duplicated parametric definition [" + p + "]", terminalNode, source.getPath());
                    }
                    parametricDefs.add(p);
                }
                classDefs.putClassDeclaration(namespace, className, parametricDefs);
            } else {
                classDefs.putClassDeclaration(namespace, className, Collections.emptyList());
            }
        } else {
            classDefs.putClassDeclaration(namespace, className, Collections.emptyList());
        }
        source.getStructs().add(ctx);
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        // annotation field name check
        baseFieldNameCheck(ctx.baseField());
        classDefs.putClassDeclaration(namespace, className, Collections.emptyList());
        source.getAnnotations().add(ctx);
    }

    @Override
    public void enterEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        // enum field name check
        baseFieldNameCheck(ctx.enumField().stream().map(MoonlightParser.EnumFieldContext::baseField).collect(Collectors.toList()));
        classDefs.putClassDeclaration(namespace, className, Collections.emptyList());
        source.getEnums().add(ctx);
    }

    private void baseFieldNameCheck(List<MoonlightParser.BaseFieldContext> fields) {
        if (fields != null && !fields.isEmpty()) {
            Set<String> fieldNames = new HashSet<>();
            fields.forEach(field -> _nameCheck(fieldNames, field));
        }
    }

    private void _nameCheck(Set<String> fieldNames, MoonlightParser.BaseFieldContext field) {
        String name = getBaseFieldName(field);
        if (fieldNames.contains(name)) {
            throw new CompilingRuntimeException("duplicated field name [" + name + "]", (TerminalNode) field.getChild(1), source.getPath());
        } else {
            fieldNames.add(name);
        }
    }

    @Override
    public void enterInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx) {
        String className = ctx.Identifier().getText();
        classDefs.putClassDeclaration(namespace, className, Collections.emptyList());
        source.getInterfaces().add(ctx);
    }
}
