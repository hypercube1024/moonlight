package com.moonlightsource.idl.compiler.listener;

import com.firefly.utils.function.Action1;
import com.moonlightsource.idl.compiler.exception.CompilingRuntimeException;
import com.moonlightsource.idl.compiler.model.AnnotationValue;
import com.moonlightsource.idl.compiler.model.DefinitionReferenceManager;
import com.moonlightsource.idl.compiler.model.SourceFile;
import com.moonlightsource.idl.compiler.parser.MoonlightBaseListener;
import com.moonlightsource.idl.compiler.parser.MoonlightLexer;
import com.moonlightsource.idl.compiler.parser.MoonlightParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

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
            throw new CompilingRuntimeException("the import declaration \"" + importValue + "\" is duplicated.");
        }
        sourceFile.getImports().add(importValue);
    }

    protected boolean importDeclarationCheck(String importValue) {
        return !sourceFile.getImports().contains(importValue);
    }

    @Override
    public void enterAnnotation(MoonlightParser.AnnotationContext ctx) {
        if (log.isDebugEnabled()) {
            log.debug("annotated target class -> {}", ctx.getParent().getClass());
        }
        annotationListeners.get(ctx.getParent().getClass()).call(ctx);
    }

    protected void enterSourceFileAnnotation(MoonlightParser.AnnotationContext ctx) {
        String namespace = ctx.getChild(0).getText();
        log.debug("source file annotation namespace -> {}", namespace);

        AnnotationValue annotationValue = new AnnotationValue();
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
