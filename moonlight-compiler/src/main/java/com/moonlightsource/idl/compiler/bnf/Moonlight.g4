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
    : annotation* STRUCT Identifier parametricTypeDeclaration? (EXTENDS referenceType )? '{' structField* '}'
    ;

structField
    : annotation* FieldReq? fieldType Identifier ';'
    ;

parametricTypeDeclaration
    : '<' Identifier (',' Identifier)* '>'
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
    : annotation* INTERFACE Identifier (EXTENDS interfaceName )? '{' functionDeclaration* '}'
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
    : 'list' '<' fieldType '>'
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

// base field definition
baseField
    : BOOLEAN Identifier ('=' BooleanLiteral)? ';'                                 #boolField
    | BYTE Identifier ('=' IntegerLiteral)? ';'                                    #byteField
    | SHORT Identifier ('=' IntegerLiteral)? ';'                                   #shortField
    | INT Identifier ('=' IntegerLiteral)? ';'                                     #intField
    | LONG Identifier ('=' IntegerLiteral)? ';'                                    #longField
    | CHAR Identifier ('=' CharacterLiteral)? ';'                                  #charField
    | FLOAT Identifier ('=' FloatingPointLiteral)? ';'                             #floatField
    | DOUBLE Identifier ('=' FloatingPointLiteral)? ';'                            #doubleField
    | STRING Identifier ('=' StringLiteral)? ';'                                   #stringField
    | 'list' '<' BOOLEAN '>' Identifier ('=' (boolListExpr | emptyListExpr))? ';'  #boolListField
    | 'list' '<' BYTE '>' Identifier ('=' (intListExpr | emptyListExpr))? ';'      #byteListField
    | 'list' '<' SHORT '>' Identifier ('=' (intListExpr | emptyListExpr))? ';'     #shortListField
    | 'list' '<' INT '>' Identifier ('=' (intListExpr | emptyListExpr))? ';'       #intListField
    | 'list' '<' LONG '>' Identifier ('=' (intListExpr | emptyListExpr))? ';'      #longListField
    | 'list' '<' CHAR '>' Identifier ('=' (charListExpr | emptyListExpr))? ';'     #charListField
    | 'list' '<' FLOAT '>' Identifier ('=' (floatListExpr | emptyListExpr))? ';'   #floatListField
    | 'list' '<' DOUBLE '>' Identifier ('=' (floatListExpr | emptyListExpr))? ';'  #doubleListField
    | 'list' '<' STRING '>' Identifier ('=' (stringListExpr| emptyListExpr))? ';'  #stringListField
    ;