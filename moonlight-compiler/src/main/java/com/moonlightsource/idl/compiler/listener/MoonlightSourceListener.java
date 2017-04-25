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
    private final AnnotationFieldListener annotationFieldListener;

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

        annotationFieldListener = new AnnotationFieldListener(sourceFile, referenceManager);
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
        int count = ctx.importValue().getChildCount();
        if (count <= 2) {
            throw new CompilingRuntimeException("the import format error -> " + ctx.importValue().getText());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count - 2; i++) {
            sb.append(ctx.importValue().getChild(i));
        }
        String namespace = sb.toString();
        if (!referenceManager.containNamespace(namespace)) {
            throw new CompilingRuntimeException("the namespace " + namespace + " is not found.", ctx.IMPORT(), sourceFile.getPath());
        }

        Set<String> classNameSet = referenceManager.getClassNames(namespace);
        String className = ctx.importValue().getChild(count - 1).getText();
        if ("*".equals(className)) {
            sourceFile.getImports().computeIfAbsent(namespace, k -> new HashSet<>()).addAll(classNameSet);
        } else {
            if (!classNameSet.contains(className)) {
                throw new CompilingRuntimeException("the class " + className + " is not found.", ctx.IMPORT(), sourceFile.getPath());
            }
            sourceFile.getImports().computeIfAbsent(namespace, k -> new HashSet<>()).add(className);
        }
    }

    @Override
    public void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx) {
        String namespace = sourceFile.getNamespace();
        String name = ctx.Identifier().getText();
        checkAnnotationName(name, ctx.Identifier());

        List<FieldDefinition> fields = new ArrayList<>();
        ClassDefinition annotationDefinition = new ClassDefinition(TypeEnum.ANNOTATION,
                name, namespace,
                getAnnotationDeclarationAnnotations(ctx),
                Collections.emptySet(),
                fields);
        sourceFile.getAnnotationDefinitions().add(annotationDefinition);

        DefinitionReference reference = new DefinitionReference(namespace, name, referenceManager);
        referenceManager.put(reference, annotationDefinition);

        if (ctx.baseField() != null && !ctx.baseField().isEmpty()) {
            for (MoonlightParser.BaseFieldContext baseFieldContext : ctx.baseField()) {
                if (log.isDebugEnabled()) {
                    log.debug("base field type -> {}", baseFieldContext.getClass());
                }
                fields.add(annotationFieldListener.createBaseField(baseFieldContext, reference));
            }
        }
    }

    private void checkAnnotationName(String name, TerminalNode node) {
        for (ClassDefinition definition : sourceFile.getAnnotationDefinitions()) {
            if (definition.getName().equals(name)) {
                throw new CompilingRuntimeException("the annotation " + name + " exists.", node, sourceFile.getPath());
            }
        }
    }

    private List<AnnotationValue> getAnnotationDeclarationAnnotations(MoonlightParser.AnnotationDeclarationContext ctx) {
        List<AnnotationValue> ret = annotationDeclarationAnnotations.get(ctx);
        if (ret == null) {
            ret = new ArrayList<>();
            annotationDeclarationAnnotations.put(ctx, ret);
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
        String name = ctx.AnnotationLabel().getText().substring(1);
        log.debug("source file annotation, namespace -> {}, name -> {}", namespace, name);

        if (!referenceManager.containClass(namespace, name)) {
            throw new CompilingRuntimeException("the annotation " + namespace + "." + name + " is not found", ctx.AnnotationLabel(), sourceFile.getPath());
        }

        DefinitionReference annotationDefRef = new DefinitionReference(namespace, name, referenceManager);
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
                    throw new CompilingRuntimeException("the annotation " + name + " is not recognized.", ctx.AnnotationLabel(), sourceFile.getPath());
                }
            }
        }
    }

    private void checkDuplicatedAnnotationValue(Map<String, ParseTree> fieldMap, TerminalNode node) {
        if (fieldMap.get(node.getText()) != null) {
            throw new CompilingRuntimeException("the field " + node.getText() + " exists.", node, sourceFile.getPath());
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
