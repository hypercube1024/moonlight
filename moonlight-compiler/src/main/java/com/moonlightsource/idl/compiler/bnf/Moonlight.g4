grammar Moonlight;
import MoonlightCommonLexer;

// IDL
moonlightFile
    : annotation* namespaceDeclaration importDeclaration* (enumDeclaration | annotationDeclaration | structDeclaration | interfaceDeclaration)*
    ;

// namespace
namespaceDeclaration
    : NAMESPACE namespaceValue ';'
    ;

namespaceValue
    : Identifier ('.' Identifier)*
    ;

// import
importDeclaration
    : IMPORT importValue ';'
    ;

importValue
    : Identifier ('.' Identifier)* ('.' '*')?
    ;

// struct
structDeclaration
    : annotation* STRUCT referenceType (EXTENDS referenceType )? '{' structField* '}'
    ;

structField
    : annotation* FieldReq? fieldType Identifier ';'
    ;

// annotation
annotationDeclaration
    : annotation* ANNOTATION Identifier '{' baseField* '}'
    ;

annotation
    : (namespaceValue '.')? AnnotationLabel ( ('(' ')') | ('(' baseAssignment (',' baseAssignment)* ')') )?
    ;

// enum
enumDeclaration
    : annotation* ENUM Identifier '{' enumField* '}'
    ;

enumField
    : annotation* baseField
    ;


// base field definition
baseField
    : BOOLEAN Identifier ('=' BooleanLiteral)? ';'
    | BYTE Identifier ('=' IntegerLiteral)? ';'
    | SHORT Identifier ('=' IntegerLiteral)? ';'
    | INT Identifier ('=' IntegerLiteral)? ';'
    | LONG Identifier ('=' IntegerLiteral)? ';'
    | CHAR Identifier ('=' CharacterLiteral)? ';'
    | FLOAT Identifier ('=' FloatingPointLiteral)? ';'
    | DOUBLE Identifier ('=' FloatingPointLiteral)? ';'
    | STRING Identifier ('=' StringLiteral)? ';'
    | boolList Identifier ('=' (boolListExpr | emptyListExpr))? ';'
    | byteList Identifier ('=' (intListExpr | emptyListExpr))? ';'
    | shortList Identifier ('=' (intListExpr | emptyListExpr))? ';'
    | intList Identifier ('=' (intListExpr | emptyListExpr))? ';'
    | longList Identifier ('=' (intListExpr | emptyListExpr))? ';'
    | charList Identifier ('=' (charListExpr | emptyListExpr))? ';'
    | floatList Identifier ('=' (floatListExpr | emptyListExpr))? ';'
    | doubleList Identifier ('=' (floatListExpr | emptyListExpr))? ';'
    | stringList Identifier ('=' (stringListExpr| emptyListExpr))? ';'
    ;

baseAssignment
    : Identifier '=' (literal | baseListExpr)
    ;

literal
    : BooleanLiteral
    | IntegerLiteral
    | CharacterLiteral
    | FloatingPointLiteral
    | StringLiteral
    | NullLiteral
    ;

baseListExpr
    : emptyListExpr
    | boolListExpr
    | intListExpr
    | charListExpr
    | floatListExpr
    | stringListExpr
    ;

boolListExpr
    : '[' BooleanLiteral (',' BooleanLiteral)* ']'
    ;

intListExpr
    : '[' IntegerLiteral (',' IntegerLiteral)* ']'
    ;

charListExpr
    : '[' CharacterLiteral (',' CharacterLiteral)* ']'
    ;

floatListExpr
    : '[' FloatingPointLiteral (',' FloatingPointLiteral)* ']'
    ;

stringListExpr
    : '[' StringLiteral (',' StringLiteral)* ']'
    ;

emptyListExpr
    : EMPTY_LIST
    | '['  ']'
    ;


// function
functionDeclaration
    : annotation* functionReturnType Identifier '(' (functionParameter (',' functionParameter)* )* ')' ';'
    ;

functionParameter
    : annotation* fieldType Identifier
    ;

functionReturnType
    : VOID
    | fieldType
    ;


// interface
interfaceDeclaration
    : annotation* INTERFACE interfaceName (EXTENDS interfaceName )? '{' functionDeclaration* '}'
    ;

interfaceName
    : (namespaceValue '.')? Identifier
    ;

// TypeEnum
fieldType
    : baseType
    | containerType
    | referenceType
    ;

referenceType
    : (namespaceValue '.')? Identifier parametricTypeExpr?
    ;

parametricTypeExpr
    : '<' fieldType (',' fieldType)* '>'
    ;

containerType
    : mapType
    | setType
    | listType
    ;

mapType
    : 'map' '<' fieldType ',' fieldType '>'
    ;

setType
    : 'set' '<' fieldType '>'
    ;

listType
    : baseList                      #baseTypeList
    | 'list' '<' containerType '>'  #containerTypeList
    | 'list' '<' referenceType '>'  #referenceTypeList
    ;

baseList
    : boolList
    | byteList
    | shortList
    | charList
    | intList
    | longList
    | floatList
    | doubleList
    | stringList
    ;

boolList
    : 'list' '<' BOOLEAN '>'
    ;

byteList
    : 'list' '<' BYTE '>'
    ;

shortList
    : 'list' '<' SHORT '>'
    ;

charList
    : 'list' '<' CHAR '>'
    ;

intList
    : 'list' '<' INT '>'
    ;

longList
    : 'list' '<' LONG '>'
    ;

floatList
    : 'list' '<' FLOAT '>'
    ;

doubleList
    : 'list' '<' DOUBLE '>'
    ;

stringList
    : 'list' '<' STRING '>'
    ;

baseType
    : BOOLEAN
    | BYTE
    | SHORT
    | CHAR
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    | STRING
    ;