// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/idl/compiler/bnf/Moonlight.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code boolField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolField(MoonlightParser.BoolFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byteField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteField(MoonlightParser.ByteFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortField(MoonlightParser.ShortFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntField(MoonlightParser.IntFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongField(MoonlightParser.LongFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharField(MoonlightParser.CharFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatField(MoonlightParser.FloatFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleField(MoonlightParser.DoubleFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringField(MoonlightParser.StringFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolListField(MoonlightParser.BoolListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byteListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteListField(MoonlightParser.ByteListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortListField(MoonlightParser.ShortListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntListField(MoonlightParser.IntListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongListField(MoonlightParser.LongListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharListField(MoonlightParser.CharListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatListField(MoonlightParser.FloatListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleListField(MoonlightParser.DoubleListFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringListField(MoonlightParser.StringListFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseAssignment(MoonlightParser.BaseAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MoonlightParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseListExpr(MoonlightParser.BaseListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#boolListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolListExpr(MoonlightParser.BoolListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#intListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntListExpr(MoonlightParser.IntListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#charListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharListExpr(MoonlightParser.CharListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#floatListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatListExpr(MoonlightParser.FloatListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#stringListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringListExpr(MoonlightParser.StringListExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#emptyListExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyListExpr(MoonlightParser.EmptyListExprContext ctx);
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
	 * Visit a parse tree produced by {@link MoonlightParser#parametricTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametricTypeExpr(MoonlightParser.ParametricTypeExprContext ctx);
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
	 * Visit a parse tree produced by the {@code baseTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeList(MoonlightParser.BaseTypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerTypeList(MoonlightParser.ContainerTypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceTypeList(MoonlightParser.ReferenceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseList(MoonlightParser.BaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#boolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolList(MoonlightParser.BoolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#byteList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteList(MoonlightParser.ByteListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#shortList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortList(MoonlightParser.ShortListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#charList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharList(MoonlightParser.CharListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#intList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntList(MoonlightParser.IntListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#longList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongList(MoonlightParser.LongListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#floatList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatList(MoonlightParser.FloatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#doubleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleList(MoonlightParser.DoubleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(MoonlightParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoonlightParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(MoonlightParser.BaseTypeContext ctx);
}