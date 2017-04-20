package com.moonlightsource.idl.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoonlightParser}.
 */
public interface MoonlightListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#moonlightFile}.
	 * @param ctx the parse tree
	 */
	void enterMoonlightFile(MoonlightParser.MoonlightFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#moonlightFile}.
	 * @param ctx the parse tree
	 */
	void exitMoonlightFile(MoonlightParser.MoonlightFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#namespaceValue}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceValue(MoonlightParser.NamespaceValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#namespaceValue}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceValue(MoonlightParser.NamespaceValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(MoonlightParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(MoonlightParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#importValue}.
	 * @param ctx the parse tree
	 */
	void enterImportValue(MoonlightParser.ImportValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#importValue}.
	 * @param ctx the parse tree
	 */
	void exitImportValue(MoonlightParser.ImportValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(MoonlightParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(MoonlightParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterBaseField(MoonlightParser.BaseFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitBaseField(MoonlightParser.BaseFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#baseAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBaseAssignment(MoonlightParser.BaseAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#baseAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBaseAssignment(MoonlightParser.BaseAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#baseArrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseArrayExpr(MoonlightParser.BaseArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#baseArrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseArrayExpr(MoonlightParser.BaseArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(MoonlightParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(MoonlightParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(MoonlightParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(MoonlightParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MoonlightParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MoonlightParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MoonlightParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MoonlightParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(MoonlightParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(MoonlightParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(MoonlightParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(MoonlightParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(MoonlightParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(MoonlightParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(MoonlightParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(MoonlightParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void enterParametricType(MoonlightParser.ParametricTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void exitParametricType(MoonlightParser.ParametricTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#containerType}.
	 * @param ctx the parse tree
	 */
	void enterContainerType(MoonlightParser.ContainerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#containerType}.
	 * @param ctx the parse tree
	 */
	void exitContainerType(MoonlightParser.ContainerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(MoonlightParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(MoonlightParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(MoonlightParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(MoonlightParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(MoonlightParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(MoonlightParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(MoonlightParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(MoonlightParser.BaseTypeContext ctx);
}