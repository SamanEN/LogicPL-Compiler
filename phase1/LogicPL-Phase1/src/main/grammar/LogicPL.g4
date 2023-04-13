grammar LogicPL;

//Main structure
logicpl
    : main EOF
    | function logicpl;

main
    : KEYWORD_MAIN L_BRACE multiStatement R_BRACE
    ;

//Statements
multiStatement
    : statement
    | statement multiStatement
    ;

statement
    : varInit END_OF_STATEMENT
    | varDec  END_OF_STATEMENT
    | arrDec END_OF_STATEMENT
    | arrInit END_OF_STATEMENT
    | print END_OF_STATEMENT
    | predicateInvocation END_OF_STATEMENT
    | implication
    | forLoop
    | assignment END_OF_STATEMENT
    | returnStatement END_OF_STATEMENT
    | functionInvocation END_OF_STATEMENT
    ;

assignment
    : VAR_NAME EQ expr
    | arrIndexing EQ expr
    ;

returnStatement
    : KEYWORD_RETURN expr
    ;

//Variable related rules
varInit
    : (INT | FLOAT | BOOLEAN) VAR_NAME EQ expr
    ;

varDec
    : (INT | FLOAT | BOOLEAN) VAR_NAME
    ;

arrDec
    : (INT | FLOAT | BOOLEAN) L_BRACKET ARR_IDX R_BRACKET VAR_NAME
    ;

arrInit
    : (INT | FLOAT | BOOLEAN) L_BRACKET ARR_IDX R_BRACKET VAR_NAME EQ L_BRACKET (arrValue)? R_BRACKET
    ;

arrValue
    : (INT_VAL | FLOAT_VAL | BOOLEAN_VAL) | (INT_VAL | FLOAT_VAL | BOOLEAN_VAL) COMMA arrValue
    ;

print
    : KEYWORD_PRINT L_PAR (VAR_NAME | query) R_PAR
    ;

predicateInvocation
    : PREDICATE_NAME L_PAR VAR_NAME R_PAR
    ;

//Implication
implication
    : L_PAR expr R_PAR '=>' L_PAR implicationExpr R_PAR
    ;

implicationExpr
    : statement ';' (implicationExpr)?
    ;


//Query
query
    : L_BRACKET (queryBoolType | queryListType) R_BRACKET
    ;

queryBoolType
    : '?' predicateInvocation
    ;

queryListType
    : PREDICATE_NAME L_PAR '?' R_PAR
    ;


//Loop
forLoop
    : KEYWORD_FOR L_PAR VAR_NAME ':' VAR_NAME R_PAR L_BRACE R_BRACE
    | KEYWORD_FOR L_PAR VAR_NAME ':' VAR_NAME R_PAR L_BRACE multiStatement R_BRACE
    ;

//Function
function
    : KEYWORD_FUNCTION FUNC_NAME L_PAR functionArgsList R_PAR ':' (INT | FLOAT | BOOLEAN) L_BRACE multiStatement R_BRACE
    | KEYWORD_FUNCTION FUNC_NAME L_PAR R_PAR ':' (INT | FLOAT | BOOLEAN) L_BRACE multiStatement R_BRACE
    ;

functionArgsList
    : varDec
    | varDec COMMA functionArgsList
    ;

functionInvocation
    : FUNC_NAME L_PAR functionInvocationArgsList R_PAR
    | FUNC_NAME L_PAR R_PAR
    ;

functionInvocationArgsList
    : VAR_NAME
    | VAR_NAME COMMA functionInvocationArgsList
    ;

//Variable referencing
arrIndexing
    : VAR_NAME L_BRACKET expr R_BRACKET
    ;

expr
    : expr '||' logicalOrOperand
    | logicalOrOperand
    ;

logicalOrOperand
    : logicalOrOperand '&&' logicalAndOperand
    | logicalAndOperand
    ;

logicalAndOperand
    : logicalAndOperand '==' eqNotEqOperand
    | logicalAndOperand '!=' eqNotEqOperand
    | eqNotEqOperand
    ;

eqNotEqOperand
    : eqNotEqOperand '<' relOperand
    | eqNotEqOperand '>' relOperand
    | eqNotEqOperand '<=' relOperand
    | eqNotEqOperand '>=' relOperand
    | relOperand
    ;

relOperand
    : relOperand '+' addSubOperand
    | relOperand '-' addSubOperand
    | addSubOperand
    ;

addSubOperand
    : addSubOperand '*' multDivModOperand
    | addSubOperand '/' multDivModOperand
    | addSubOperand '%' multDivModOperand
    | multDivModOperand
    ;

multDivModOperand
    : '+' multDivModOperand
    | '-' multDivModOperand
    | '!' multDivModOperand
    | arrayAccessOperand
    ;

arrayAccessOperand
    : VAR_NAME '[' ARR_IDX ']'
    | commonOperand
    ;

commonOperand
    : '(' expr ')'
    | VAR_NAME
    | arrIndexing
    | INT_VAL
    | FLOAT_VAL
    | BOOLEAN_VAL
    | functionInvocation
    ;

//Reserved names
INT
    : 'int'
    ;

FLOAT
    : 'float'
    ;

BOOLEAN
    : 'boolean'
    ;

KEYWORD_TRUE
    : 'true'
    ;

KEYWORD_FALSE
    : 'false'
    ;

KEYWORD_FUNCTION
    : 'function'
    ;

KEYWORD_MAIN
    : 'main'
    ;

KEYWORD_PRINT
    : 'print'
    ;

KEYWORD_FOR
    : 'for'
    ;

KEYWORD_RETURN
    : 'return'
    ;


//Character names
EQ
    : '='
    ;

L_BRACKET
    : '['
    ;

R_BRACKET
    : ']'
    ;

L_BRACE
    : '{'
    ;

R_BRACE
    : '}'
    ;

L_PAR
    : '('
    ;

R_PAR
    : ')'
    ;

COMMA
    : ','
    ;

END_OF_STATEMENT
    : ';'
    ;

//Data type values
INT_VAL
    : '-'?[0-9]+
    ;

FLOAT_VAL
    : [0-9]+ '.' [0-9]+
    ;

BOOLEAN_VAL
    : KEYWORD_TRUE
    | KEYWORD_FALSE
    ;

ARR_IDX
    : [0-9]+
    ;

//Name patterns
FUNC_NAME
    : [a-z] ('_' | [a-zA-Z0-9])*
    ;

VAR_NAME
    : [a-z] ('_' | [a-zA-Z0-9])*
    ;

PREDICATE_NAME
    : [A-Z] ('_' | [a-zA-Z0-9])*
    ;

COMMENT
    : '#' ~[\r\n]* -> skip
    ;

WHITE_SPACE
    : [ \t\r\n] -> skip
    ;