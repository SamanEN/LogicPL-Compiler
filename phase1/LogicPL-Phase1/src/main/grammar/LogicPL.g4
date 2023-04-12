grammar LogicPL;

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