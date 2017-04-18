grammar MoonlightParser;
import MoonlightLexer;

namespaceDeclaration
    : NAMESPACE namespaceValue ';'
    ;

namespaceValue
    : Identifier ('.' Identifier)*
    ;

structDeclaration
    : STRUCT referenceType (EXTENDS referenceType )? '{' (field ';')* '}'
    ;


// Fields

field
    : FieldReq? fieldType Identifier
    ;

// Types

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