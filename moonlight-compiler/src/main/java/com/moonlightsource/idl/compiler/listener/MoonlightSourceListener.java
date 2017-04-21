package com.moonlightsource.idl.compiler.listener;

import com.firefly.utils.function.Action1;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.*;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author Pengtao Qiu
 */
public class MoonlightSourceListener extends MoonlightBaseListener {

    private static final Logger log = LoggerFactory.getLogger("moonlight-system");

    private final DefinitionReferenceManager referenceManager;
    private final MoonlightParser parser;
    private final CommonTokenStream tokenStream;
    private final MoonlightLexer lexer;
    private final SourceFile sourceFile;
    private final Map<Class<? extends ParserRuleContext>, Action1<MoonlightParser.AnnotationContext>> annotationListeners = new HashMap<>();
    private final ParseTreeProperty<List<AnnotationValue>> annotationDeclarationAnnotations = new ParseTreeProperty<>();

    public MoonlightSourceListener(MoonlightParser parser, CommonTokenStream tokenStream, MoonlightLexer lexer,
                                   SourceFile sourceFile, DefinitionReferenceManager referenceManager) {
        this.parser = parser;
        this.tokenStream = tokenStream;
        this.lexer = lexer;
        this.sourceFile = sourceFile;
        this.referenceManager = referenceManager;

        annotationListeners.put(MoonlightParser.MoonlightFileContext.class, this::enterSourceFileAnnotation);
        annotationListeners.put(MoonlightParser.AnnotationDeclarationContext.class, this::enterAnnotationDeclarationAnnotation);
        annotationListeners.put(MoonlightParser.EnumDeclarationContext.class, this::enterEnumDeclarationAnnotation);
        annotationListeners.put(MoonlightParser.EnumFieldContext.class, this::enterEnumFieldAnnotation);
        annotationListeners.put(MoonlightParser.StructDeclarationContext.class, this::enterStructDeclarationAnnotation);
        annotationListeners.put(MoonlightParser.StructFieldContext.class, this::enterStructFieldAnnotation);
        annotationListeners.put(MoonlightParser.FunctionDeclarationContext.class, this::enterFunctionDeclarationAnnotation);
        annotationListeners.put(MoonlightParser.FunctionParameterContext.class, this::enterFunctionParameterAnnotation);
        annotationListeners.put(MoonlightParser.InterfaceDeclarationContext.class, this::enterInterfaceDeclarationAnnotation);

    }

    public MoonlightParser getParser() {
        return parser;
    }

    public CommonTokenStream getTokenStream() {
        return tokenStream;
    }

    public MoonlightLexer getLexer() {
        return lexer;
    }

    public SourceFile getSourceFile() {
        return sourceFile;
    }

    @Override
    public void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx) {
        sourceFile.setNamespace(ctx.namespaceValue().getText());
        log.debug("namespace -> {}", sourceFile.getNamespace());
    }

    @Override
    public void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx) {
        String importValue = ctx.importValue().getText();
        log.debug("import -> {}", importValue);
        if (!importDeclarationCheck(importValue)) {
            throw new CompilingRuntimeException("the import declaration \"" + importValue + "\" is duplicated. ", ctx.IMPORT());
        }
        sourceFile.getImports().add(importValue);
    }

    protected boolean importDeclarationCheck(String importValue) {
        return !sourceFile.getImports().contains(importValue);
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String namespace = sourceFile.getNamespace();
        String name = ctx.Identifier().getText();
        checkAnnotationName(name, ctx.Identifier());
        List<AnnotationFieldDefinition> fields = new ArrayList<>();
        AnnotationDefinition annotationDefinition = new AnnotationDefinition(TypeEnum.ANNOTATION, name, namespace,
                getAnnotationDeclarationAnnotations(ctx), fields);
        sourceFile.getAnnotationDefinitions().add(annotationDefinition);
        if (ctx.baseField() != null && !ctx.baseField().isEmpty()) {
            for (MoonlightParser.BaseFieldContext baseFieldContext : ctx.baseField()) {
                // TODO create annotation fields
            }
        }
    }

    private void checkAnnotationName(String name, TerminalNode node) {
        for(AnnotationDefinition definition : sourceFile.getAnnotationDefinitions()) {
            if (definition.getName().equals(name)) {
                throw new CompilingRuntimeException("the annotation " + name + " exists.", node);
            }
        }
    }

    private List<AnnotationValue> getAnnotationDeclarationAnnotations(MoonlightParser.AnnotationDeclarationContext ctx) {
        List<AnnotationValue> ret = annotationDeclarationAnnotations.get(ctx);
        if (ret == null) {
            ret = new ArrayList<>();
        }
        return ret;
    }

    @Override
    public void enterAnnotation(MoonlightParser.AnnotationContext ctx) {
        if (log.isDebugEnabled()) {
            log.debug("annotated target class -> {}", ctx.getParent().getClass());
        }
        annotationListeners.get(ctx.getParent().getClass()).call(ctx);
    }

    protected void enterSourceFileAnnotation(MoonlightParser.AnnotationContext ctx) {
        String namespace = ctx.namespaceValue().getText();
        String name = ctx.AnnotationLabel().getText();
        log.debug("source file annotation, namespace -> {}, name -> {}", namespace, name);

        DefinitionReference annotationDefRef = new DefinitionReference(namespace, name, referenceManager);
        referenceManager.putPlaceholder(annotationDefRef, ctx.AnnotationLabel());
        Map<String, ParseTree> fieldMap = new HashMap<>();
        AnnotationValue annotationValue = new AnnotationValue(annotationDefRef, fieldMap);
        sourceFile.getAnnotations().add(annotationValue);

        List<MoonlightParser.BaseAssignmentContext> baseAssignmentContexts = ctx.baseAssignment();
        if (baseAssignmentContexts != null && !baseAssignmentContexts.isEmpty()) {
            for (MoonlightParser.BaseAssignmentContext baseAssignmentContext : baseAssignmentContexts) {
                checkDuplicatedAnnotationValue(fieldMap, baseAssignmentContext.Identifier());

                String fieldName = baseAssignmentContext.Identifier().getText();
                if (baseAssignmentContext.literal() != null) {
                    fieldMap.put(fieldName, baseAssignmentContext.literal());
                } else if (baseAssignmentContext.baseListExpr() != null) {
                    fieldMap.put(fieldName, baseAssignmentContext.baseListExpr());
                } else {
                    throw new CompilingRuntimeException("the annotation " + name + " is not recognized.", ctx.AnnotationLabel());
                }
            }
        }
    }

    private void checkDuplicatedAnnotationValue(Map<String, ParseTree> fieldMap, TerminalNode node) {
        if (fieldMap.get(node.getText()) != null) {
            throw new CompilingRuntimeException("the field " + node.getText() + " exists.", node);
        }
    }


    protected void enterAnnotationDeclarationAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterEnumDeclarationAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterEnumFieldAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterStructDeclarationAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterStructFieldAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterFunctionDeclarationAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterFunctionParameterAnnotation(MoonlightParser.AnnotationContext ctx) {

    }

    protected void enterInterfaceDeclarationAnnotation(MoonlightParser.AnnotationContext ctx) {

    }
}
