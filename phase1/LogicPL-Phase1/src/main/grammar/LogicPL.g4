grammar LogicPL;

//Main structure
logicpl
    : {System.out.println("MainBody");} main EOF
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
    : {System.out.print("VarDec: ");} varInit END_OF_STATEMENT
    | {System.out.print("VarDec: ");} varDec END_OF_STATEMENT
    | {System.out.print("VarDec: ");} arrDec END_OF_STATEMENT
    | {System.out.print("VarDec: ");} arrInit END_OF_STATEMENT
    | {System.out.println("Built-in: print");} print END_OF_STATEMENT
    | predicateInvocation END_OF_STATEMENT
    | {System.out.println("Implication");} implication
    | forLoop
    | assignment END_OF_STATEMENT
    | returnStatement END_OF_STATEMENT
    | {System.out.println("FunctionCall");} functionInvocation END_OF_STATEMENT
    ;

assignment
    : VAR_FUNC_NAME EQ expr
    | arrIndexing EQ expr
    ;

returnStatement
    : KEYWORD_RETURN{System.out.println("Return");} expr
    ;

//Variable related rules
varInit
    : (INT | FLOAT | BOOLEAN) VAR_FUNC_NAME{System.out.println($VAR_FUNC_NAME.getText());} EQ expr
    ;

varDec
    : (INT | FLOAT | BOOLEAN) VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.text);}
    ;

arrDec
    : (INT | FLOAT | BOOLEAN) L_BRACKET INT_VAL R_BRACKET VAR_FUNC_NAME{System.out.println($VAR_FUNC_NAME.getText());}
    ;

arrInit
    : (INT | FLOAT | BOOLEAN) L_BRACKET INT_VAL R_BRACKET VAR_FUNC_NAME{System.out.println($VAR_FUNC_NAME.getText());} EQ L_BRACKET (arrValue)? R_BRACKET
    ;

arrValue
    : ((('-')* INT_VAL) | (('-')*FLOAT_VAL) | BOOLEAN_VAL) | ((('-')* INT_VAL) | (('-')*FLOAT_VAL) | BOOLEAN_VAL) COMMA arrValue
    ;

print
    : KEYWORD_PRINT L_PAR (VAR_FUNC_NAME | query) R_PAR
    ;

predicateInvocation
    : PREDICATE_NAME{System.out.println("Predicate: " + $PREDICATE_NAME.getText());} L_PAR VAR_FUNC_NAME R_PAR
    ;

//Implication
implication
    : L_PAR expr R_PAR '=>' L_PAR implicationExpr R_PAR
    ;

implicationExpr
    : statement (implicationExpr)?
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
    : KEYWORD_FOR{System.out.println("Loop: for");} L_PAR VAR_FUNC_NAME ':' VAR_FUNC_NAME R_PAR L_BRACE R_BRACE
    | KEYWORD_FOR{System.out.println("Loop: for");} L_PAR VAR_FUNC_NAME ':' VAR_FUNC_NAME R_PAR L_BRACE multiStatement R_BRACE
    ;

//Function
function
    : KEYWORD_FUNCTION{System.out.print("FunctionDec: ");} VAR_FUNC_NAME{System.out.println($VAR_FUNC_NAME.text);} L_PAR {System.out.print("ArgumentDec: ");}functionArgsList R_PAR ':' (INT | FLOAT | BOOLEAN) L_BRACE multiStatement R_BRACE
    | KEYWORD_FUNCTION{System.out.println("FunctionDec: ");} VAR_FUNC_NAME{System.out.print($VAR_FUNC_NAME.getText());} L_PAR R_PAR ':' (INT | FLOAT | BOOLEAN) L_BRACE multiStatement R_BRACE
    ;

functionArgsList
    : varDec
    | varDec COMMA {System.out.print("ArgumentDec: ");}functionArgsList
    ;

functionInvocation
    : VAR_FUNC_NAME L_PAR R_PAR
    | VAR_FUNC_NAME L_PAR functionInvocationArgsList R_PAR
    ;

functionInvocationArgsList
    : VAR_FUNC_NAME
    | VAR_FUNC_NAME COMMA functionInvocationArgsList
    | ( (('-' | '+')* INT_VAL) | (('-' | '+')* FLOAT_VAL) | BOOLEAN_VAL )
    | ( (('-' | '+')* INT_VAL) | (('-' | '+')* FLOAT_VAL) | BOOLEAN_VAL ) COMMA functionInvocationArgsList
    | (expr)
    | (expr) COMMA functionInvocationArgsList
    ;

//Variable referencing
arrIndexing
    : VAR_FUNC_NAME L_BRACKET expr R_BRACKET
    ;

expr
    : expr '||' logicalOrOperand {System.out.println("Operator: ||");}
    | logicalOrOperand
    ;

logicalOrOperand
    : logicalOrOperand '&&' logicalAndOperand {System.out.println("Operator: &&");}
    | logicalAndOperand
    ;

logicalAndOperand
    : logicalAndOperand '==' eqNotEqOperand {System.out.println("Operator: ==");}
    | logicalAndOperand '!=' eqNotEqOperand {System.out.println("Operator: !=");}
    | eqNotEqOperand
    ;

eqNotEqOperand
    : eqNotEqOperand '<' relOperand {System.out.println("Operator: <");}
    | eqNotEqOperand '>' relOperand {System.out.println("Operator: >");}
    | eqNotEqOperand '<=' relOperand {System.out.println("Operator: <=");}
    | eqNotEqOperand '>=' relOperand {System.out.println("Operator: >=");}
    | relOperand
    ;

relOperand
    : relOperand '+' addSubOperand {System.out.println("Operator: +");}
    | relOperand '-' addSubOperand {System.out.println("Operator: -");}
    | addSubOperand
    ;

addSubOperand
    : addSubOperand '*' multDivModOperand {System.out.println("Operator: *");}
    | addSubOperand '/' multDivModOperand {System.out.println("Operator: /");}
    | addSubOperand '%' multDivModOperand {System.out.println("Operator: %");}
    | multDivModOperand
    ;

multDivModOperand
    : '+' multDivModOperand {System.out.println("Operator: +");}
    | '-' multDivModOperand {System.out.println("Operator: -");}
    | '!' multDivModOperand {System.out.println("Operator: !");}
    | arrayAccessOperand
    ;

arrayAccessOperand
    : VAR_FUNC_NAME '[' INT_VAL ']'
    | commonOperand
    ;

commonOperand
    : '(' expr ')'
    | VAR_FUNC_NAME
    | arrIndexing
    | (('-')* INT_VAL)
    | (('-')*FLOAT_VAL)
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
    : [0-9]+
    ;

FLOAT_VAL
    : [0-9]+ '.' [0-9]+
    ;

BOOLEAN_VAL
    : KEYWORD_TRUE
    | KEYWORD_FALSE
    ;


//Name patterns
VAR_FUNC_NAME
    : [a-z] ('_' | [a-zA-Z0-9])*
    ;

//VAR_FUNC_NAME
//    : [a-z]+ ('_' | [a-zA-Z0-9])*
//    ;

PREDICATE_NAME
    : [A-Z] ('_' | [a-zA-Z0-9])*
    ;

COMMENT
    : '#' ~[\r\n]* -> skip
    ;

WHITE_SPACE
    : [ \t\r\n] -> skip
    ;