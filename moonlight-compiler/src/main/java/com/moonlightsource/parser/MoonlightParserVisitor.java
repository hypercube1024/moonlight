// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/bnf/MoonlightParser.g4 by ANTLR 4.7
package com.moonlightsource.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MoonlightParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MoonlightParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#moonlightFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoonlightFile(MoonlightParserParser.MoonlightFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(MoonlightParserParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#namespaceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceValue(MoonlightParserParser.NamespaceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(MoonlightParserParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(MoonlightParserParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(MoonlightParserParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(MoonlightParserParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseField(MoonlightParserParser.BaseFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#baseAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseAssignment(MoonlightParserParser.BaseAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#baseArrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseArrayExpr(MoonlightParserParser.BaseArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(MoonlightParserParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#structField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructField(MoonlightParserParser.StructFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MoonlightParserParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MoonlightParserParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(MoonlightParserParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(MoonlightParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(MoonlightParserParser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(MoonlightParserParser.FieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(MoonlightParserParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#parametricType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametricType(MoonlightParserParser.ParametricTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#containerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerType(MoonlightParserParser.ContainerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(MoonlightParserParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(MoonlightParserParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(MoonlightParserParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParserParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(MoonlightParserParser.BaseTypeContext ctx);
}