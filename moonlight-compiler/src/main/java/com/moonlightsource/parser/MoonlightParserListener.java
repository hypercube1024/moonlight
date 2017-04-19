// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/parser/MoonlightParser.g4 by ANTLR 4.7
package com.moonlightsource.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoonlightParserParser}.
 */
public interface MoonlightParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#moonlightFile}.
	 * @param ctx the parse tree
	 */
	void enterMoonlightFile(MoonlightParserParser.MoonlightFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#moonlightFile}.
	 * @param ctx the parse tree
	 */
	void exitMoonlightFile(MoonlightParserParser.MoonlightFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(MoonlightParserParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(MoonlightParserParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#namespaceValue}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceValue(MoonlightParserParser.NamespaceValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#namespaceValue}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceValue(MoonlightParserParser.NamespaceValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(MoonlightParserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(MoonlightParserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDeclaration(MoonlightParserParser.AnnotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDeclaration(MoonlightParserParser.AnnotationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(MoonlightParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(MoonlightParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(MoonlightParserParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(MoonlightParserParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterBaseField(MoonlightParserParser.BaseFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitBaseField(MoonlightParserParser.BaseFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#baseAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBaseAssignment(MoonlightParserParser.BaseAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#baseAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBaseAssignment(MoonlightParserParser.BaseAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#baseArrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseArrayExpr(MoonlightParserParser.BaseArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#baseArrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseArrayExpr(MoonlightParserParser.BaseArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(MoonlightParserParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(MoonlightParserParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(MoonlightParserParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(MoonlightParserParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MoonlightParserParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MoonlightParserParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MoonlightParserParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MoonlightParserParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(MoonlightParserParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(MoonlightParserParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(MoonlightParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(MoonlightParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(MoonlightParserParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(MoonlightParserParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(MoonlightParserParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(MoonlightParserParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(MoonlightParserParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(MoonlightParserParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void enterParametricType(MoonlightParserParser.ParametricTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#parametricType}.
	 * @param ctx the parse tree
	 */
	void exitParametricType(MoonlightParserParser.ParametricTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#containerType}.
	 * @param ctx the parse tree
	 */
	void enterContainerType(MoonlightParserParser.ContainerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#containerType}.
	 * @param ctx the parse tree
	 */
	void exitContainerType(MoonlightParserParser.ContainerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(MoonlightParserParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(MoonlightParserParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(MoonlightParserParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(MoonlightParserParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(MoonlightParserParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(MoonlightParserParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParserParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(MoonlightParserParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParserParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(MoonlightParserParser.BaseTypeContext ctx);
}