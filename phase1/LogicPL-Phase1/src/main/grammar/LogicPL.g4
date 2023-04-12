grammar LogicPL;

//Grammars
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

predicateInvoke
    : PREDICATE_NAME L_PAR VAR_NAME R_PAR
    ;

implicationInvoke // bejaye implicationExpr shayad expr bashe va bejaye expr shayad booleanExpr bashe
    : L_PAR expr R_PAR '=>' L_PAR implicationExpr R_PAR
    ;

implicationExpr
    : expr ';' (implicationExpr)?
    ;


//QUERY
query
    : L_BRACKET (queryBoolType | queryListType) R_BRACKET
    ;

queryBoolType
    : '?' predicateInvoke
    ;

queryListType
    : PREDICATE_NAME L_PAR '?' R_PAR
    ;


//LOOP
forLoop
    : KEYWORD_FOR L_PAR VAR_NAME ':' VAR_NAME R_PAR L_BRACE line /*ya harchize dige (ghate code) */ R_BRACE
    ;

//FUNCTION
function // nemidonam baraye return bayad chetori check beshe
    : KEYWORD_FUNCTION FUNC_NAME L_PAR (varDec)? R_PAR ':' (INT | FLOAT | BOOLEAN) L_BRACE line R_BRACE
    ;

//Variable Usage
arrIndexing // bejaye intExpr shayad expr bashe
    : VAR_NAME L_BRACKET intExpr R_BRACKET
    ;


//int expr
intExpr // expression that it's result has an int value and not boolean or float
    : INT_VAL
    | VAR_NAME //commonOperand
    | '(' intExpr ')' //commonOperand
    | intExpr '+' intExpr //addSubOperand
    | intExpr '-' intExpr //addSubOperand
    | intExpr '*' intExpr //multDivModOperand
    | intExpr '/' intExpr //multDivModOperand
    | intExpr '%' intExpr //multDivModOperand
    ;


//Operators
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
    relOperand
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
    | INT_VAL
    | FLOAT_VAL
    | BOOLEAN_VAL
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