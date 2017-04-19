grammar Moonlight;
import MoonlightCommonLexer;

// IDL
moonlightFile
    : namespaceDeclaration importDeclaration* (enumDeclaration | annotationDeclaration | structDeclaration | interfaceDeclaration)*
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

// annotation
annotationDeclaration
    : annotation* ANNOTATION Identifier '{' baseField* '}'
    ;

annotation
    : (namespaceValue '.')* Label ( ('(' ')') | ('(' baseAssignment (',' baseAssignment)* ')') )?
    ;

// enum
enumDeclaration
    : annotation* ENUM Identifier '{' (annotation* baseField)* '}'
    ;


// base field
baseField
    : baseType ARRAY? ( Identifier | baseAssignment) ';';

baseAssignment
    : Identifier '=' (Literal | baseArrayExpr)
    ;

baseArrayExpr
    : ARRAY | '['  ']' | ('['Literal (',' Literal) ']')
    ;

// struct
structDeclaration
    : annotation* STRUCT referenceType (EXTENDS referenceType )? '{' structField* '}'
    ;

structField
    : annotation* FieldReq? fieldType Identifier ';'
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
    : (namespaceValue '.')? Identifier parametricType?
    ;

parametricType
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