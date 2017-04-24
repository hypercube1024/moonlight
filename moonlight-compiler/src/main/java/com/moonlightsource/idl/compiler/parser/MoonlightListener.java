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
	 * Enter a parse tree produced by {@link MoonlightParser#parametricTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParametricTypeDeclaration(MoonlightParser.ParametricTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#parametricTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParametricTypeDeclaration(MoonlightParser.ParametricTypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link MoonlightParser#enumField}.
	 * @param ctx the parse tree
	 */
	void enterEnumField(MoonlightParser.EnumFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#enumField}.
	 * @param ctx the parse tree
	 */
	void exitEnumField(MoonlightParser.EnumFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterBoolField(MoonlightParser.BoolFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitBoolField(MoonlightParser.BoolFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code byteField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterByteField(MoonlightParser.ByteFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code byteField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitByteField(MoonlightParser.ByteFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterShortField(MoonlightParser.ShortFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitShortField(MoonlightParser.ShortFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterIntField(MoonlightParser.IntFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitIntField(MoonlightParser.IntFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterLongField(MoonlightParser.LongFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitLongField(MoonlightParser.LongFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterCharField(MoonlightParser.CharFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitCharField(MoonlightParser.CharFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterFloatField(MoonlightParser.FloatFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitFloatField(MoonlightParser.FloatFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterDoubleField(MoonlightParser.DoubleFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitDoubleField(MoonlightParser.DoubleFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterStringField(MoonlightParser.StringFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitStringField(MoonlightParser.StringFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterBoolListField(MoonlightParser.BoolListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitBoolListField(MoonlightParser.BoolListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code byteListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterByteListField(MoonlightParser.ByteListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code byteListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitByteListField(MoonlightParser.ByteListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterShortListField(MoonlightParser.ShortListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitShortListField(MoonlightParser.ShortListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterIntListField(MoonlightParser.IntListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitIntListField(MoonlightParser.IntListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterLongListField(MoonlightParser.LongListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitLongListField(MoonlightParser.LongListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterCharListField(MoonlightParser.CharListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitCharListField(MoonlightParser.CharListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterFloatListField(MoonlightParser.FloatListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitFloatListField(MoonlightParser.FloatListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterDoubleListField(MoonlightParser.DoubleListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitDoubleListField(MoonlightParser.DoubleListFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void enterStringListField(MoonlightParser.StringListFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringListField}
	 * labeled alternative in {@link MoonlightParser#baseField}.
	 * @param ctx the parse tree
	 */
	void exitStringListField(MoonlightParser.StringListFieldContext ctx);
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
	 * Enter a parse tree produced by {@link MoonlightParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MoonlightParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MoonlightParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#baseListExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseListExpr(MoonlightParser.BaseListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#baseListExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseListExpr(MoonlightParser.BaseListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#boolListExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolListExpr(MoonlightParser.BoolListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#boolListExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolListExpr(MoonlightParser.BoolListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#intListExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntListExpr(MoonlightParser.IntListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#intListExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntListExpr(MoonlightParser.IntListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#charListExpr}.
	 * @param ctx the parse tree
	 */
	void enterCharListExpr(MoonlightParser.CharListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#charListExpr}.
	 * @param ctx the parse tree
	 */
	void exitCharListExpr(MoonlightParser.CharListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#floatListExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatListExpr(MoonlightParser.FloatListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#floatListExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatListExpr(MoonlightParser.FloatListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#stringListExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringListExpr(MoonlightParser.StringListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#stringListExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringListExpr(MoonlightParser.StringListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#emptyListExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyListExpr(MoonlightParser.EmptyListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#emptyListExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyListExpr(MoonlightParser.EmptyListExprContext ctx);
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
	 * Enter a parse tree produced by {@link MoonlightParser#parametricTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterParametricTypeExpr(MoonlightParser.ParametricTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#parametricTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitParametricTypeExpr(MoonlightParser.ParametricTypeExprContext ctx);
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
	 * Enter a parse tree produced by the {@code baseTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeList(MoonlightParser.BaseTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeList(MoonlightParser.BaseTypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterContainerTypeList(MoonlightParser.ContainerTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitContainerTypeList(MoonlightParser.ContainerTypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTypeList(MoonlightParser.ReferenceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceTypeList}
	 * labeled alternative in {@link MoonlightParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTypeList(MoonlightParser.ReferenceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#baseList}.
	 * @param ctx the parse tree
	 */
	void enterBaseList(MoonlightParser.BaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#baseList}.
	 * @param ctx the parse tree
	 */
	void exitBaseList(MoonlightParser.BaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#boolList}.
	 * @param ctx the parse tree
	 */
	void enterBoolList(MoonlightParser.BoolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#boolList}.
	 * @param ctx the parse tree
	 */
	void exitBoolList(MoonlightParser.BoolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#byteList}.
	 * @param ctx the parse tree
	 */
	void enterByteList(MoonlightParser.ByteListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#byteList}.
	 * @param ctx the parse tree
	 */
	void exitByteList(MoonlightParser.ByteListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#shortList}.
	 * @param ctx the parse tree
	 */
	void enterShortList(MoonlightParser.ShortListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#shortList}.
	 * @param ctx the parse tree
	 */
	void exitShortList(MoonlightParser.ShortListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#charList}.
	 * @param ctx the parse tree
	 */
	void enterCharList(MoonlightParser.CharListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#charList}.
	 * @param ctx the parse tree
	 */
	void exitCharList(MoonlightParser.CharListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#intList}.
	 * @param ctx the parse tree
	 */
	void enterIntList(MoonlightParser.IntListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#intList}.
	 * @param ctx the parse tree
	 */
	void exitIntList(MoonlightParser.IntListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#longList}.
	 * @param ctx the parse tree
	 */
	void enterLongList(MoonlightParser.LongListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#longList}.
	 * @param ctx the parse tree
	 */
	void exitLongList(MoonlightParser.LongListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#floatList}.
	 * @param ctx the parse tree
	 */
	void enterFloatList(MoonlightParser.FloatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#floatList}.
	 * @param ctx the parse tree
	 */
	void exitFloatList(MoonlightParser.FloatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#doubleList}.
	 * @param ctx the parse tree
	 */
	void enterDoubleList(MoonlightParser.DoubleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#doubleList}.
	 * @param ctx the parse tree
	 */
	void exitDoubleList(MoonlightParser.DoubleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoonlightParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(MoonlightParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoonlightParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(MoonlightParser.StringListContext ctx);
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