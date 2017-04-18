grammar MoonlightParser;
import MoonlightLexer;

// IDL
moonlightFile
    : namespaceDeclaration importDeclaration* structDeclaration* interfaceDeclaration*
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
    : IMPORT Identifier ('.' Identifier)* ('.' '*')? ';'
    ;

// struct
structDeclaration
    : STRUCT referenceType (EXTENDS referenceType )? '{' fieldDeclaration* '}'
    ;

// Field
fieldDeclaration
    : FieldReq? fieldType Identifier ';'
    ;


// function
functionDeclaration
    : returnType Identifier '(' (parameter (',' parameter)* )* ')' ';'
    ;

parameter
    : fieldType Identifier
    ;

returnType
    : VOID
    | fieldType
    ;


// interface
interfaceDeclaration
    : INTERFACE interfaceName (EXTENDS interfaceName )? '{' functionDeclaration* '}'
    ;

interfaceName
    : (namespaceValue '.')? Identifier
    ;


// Type
fieldType
    : baseType
    | containerType
    | referenceType
    ;

referenceType
    : (Identifier | parametricType)
    ;

parametricType
    : (namespaceValue '.')? Identifier '<' fieldType (',' fieldType)* '>'
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