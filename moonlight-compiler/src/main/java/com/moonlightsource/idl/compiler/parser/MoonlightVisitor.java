package com.moonlightsource.idl.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MoonlightParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MoonlightVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#moonlightFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoonlightFile(MoonlightParser.MoonlightFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(MoonlightParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#namespaceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceValue(MoonlightParser.NamespaceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(MoonlightParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#importValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportValue(MoonlightParser.ImportValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(MoonlightParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(MoonlightParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(MoonlightParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#enumField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumField(MoonlightParser.EnumFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseField(MoonlightParser.BaseFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseAssignment(MoonlightParser.BaseAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseArrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseArrayExpr(MoonlightParser.BaseArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(MoonlightParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#structField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructField(MoonlightParser.StructFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MoonlightParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MoonlightParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(MoonlightParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(MoonlightParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(MoonlightParser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(MoonlightParser.FieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(MoonlightParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#parametricType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametricType(MoonlightParser.ParametricTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#containerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerType(MoonlightParser.ContainerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(MoonlightParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(MoonlightParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(MoonlightParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(MoonlightParser.BaseTypeContext ctx);
}