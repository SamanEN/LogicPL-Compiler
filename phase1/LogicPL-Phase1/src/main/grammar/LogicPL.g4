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
    | {System.out.println("FunctionCall");} functionInvocation END_OF_STATEMENT
    | predicateInvocation END_OF_STATEMENT
    | returnStatement END_OF_STATEMENT
    | {System.out.println("Implication");} implication
    | forLoop
    | assignment END_OF_STATEMENT
    ;

assignment
    : VAR_FUNC_NAME ASSIGN expr
    | arrIndexing ASSIGN expr
    ;

returnStatement
    : KEYWORD_RETURN {System.out.println("Return");} (INT_VAL|FLOAT_VAL|BOOLEAN_VAL|VAR_FUNC_NAME|negativeValue)
    | KEYWORD_RETURN {System.out.println("Return");}
    ;

//Variable related rules
varInit
    : (INT | FLOAT | BOOLEAN) VAR_FUNC_NAME{System.out.println($VAR_FUNC_NAME.getText());}
        ASSIGN expr
    ;

varDec
    : (INT | FLOAT | BOOLEAN) VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.text);}
    ;

arrDec
    : (INT | FLOAT | BOOLEAN) L_BRACKET INT_VAL R_BRACKET VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.getText());}
    ;

arrInit
    : (INT | FLOAT | BOOLEAN) L_BRACKET INT_VAL R_BRACKET VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.getText());}
        ASSIGN L_BRACKET arrValue R_BRACKET
    ;

arrValue
    : (INT_VAL|FLOAT_VAL|BOOLEAN_VAL|negativeValue)
    | (INT_VAL|FLOAT_VAL|BOOLEAN_VAL|negativeValue) COMMA arrValue
    ;

print
    : KEYWORD_PRINT L_PAR VAR_FUNC_NAME R_PAR
    | KEYWORD_PRINT L_PAR queryListType R_PAR
    | KEYWORD_PRINT L_PAR queryBoolType R_PAR
    | KEYWORD_PRINT L_PAR arrIndexing R_PAR
    ;

predicateInvocation
    : PREDICATE_NAME {System.out.println("Predicate: " + $PREDICATE_NAME.getText());} L_PAR VAR_FUNC_NAME R_PAR
    | PREDICATE_NAME {System.out.println("Predicate: " + $PREDICATE_NAME.getText());} L_PAR arrIndexing R_PAR
    ;

//Implication
implication
    : L_PAR expr R_PAR IMPLICATION_OPERATOR L_PAR implicationExpr R_PAR
    ;

implicationExpr
    : multiStatement
    ;

//Query
queryBoolType
    : L_BRACKET Q_MARK predicateInvocation R_BRACKET
    ;

queryListType
    : L_BRACKET PREDICATE_NAME {System.out.println("Predicate: " + $PREDICATE_NAME.getText());} L_PAR Q_MARK R_PAR R_BRACKET
    ;


//Loop
forLoop
    : KEYWORD_FOR {System.out.println("Loop: for");} L_PAR VAR_FUNC_NAME COLON VAR_FUNC_NAME
        R_PAR L_BRACE R_BRACE
    | KEYWORD_FOR {System.out.println("Loop: for");} L_PAR VAR_FUNC_NAME COLON VAR_FUNC_NAME R_PAR
        L_BRACE multiStatement R_BRACE
    ;

//Function
function
    : KEYWORD_FUNCTION {System.out.print("FunctionDec: ");} VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.text);}
        L_PAR {System.out.print("ArgumentDec: ");} functionArgsList R_PAR COLON (INT | FLOAT | BOOLEAN)
        L_BRACE multiStatement R_BRACE
    | KEYWORD_FUNCTION {System.out.print("FunctionDec: ");} VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.text);}
        L_PAR R_PAR COLON (INT | FLOAT | BOOLEAN)
        L_BRACE multiStatement R_BRACE
    ;

functionArgsList
    : varDec
    | varDec COMMA {System.out.print("ArgumentDec: ");} functionArgsList
    ;

functionInvocation
    : VAR_FUNC_NAME L_PAR R_PAR
    | VAR_FUNC_NAME L_PAR functionInvocationArgsList R_PAR
    ;

functionInvocationArgsList
    : VAR_FUNC_NAME
    | VAR_FUNC_NAME COMMA functionInvocationArgsList
    | (INT_VAL|FLOAT_VAL|BOOLEAN_VAL)
    | (INT_VAL|FLOAT_VAL|BOOLEAN_VAL) COMMA functionInvocationArgsList
    | (expr)
    | (expr) COMMA functionInvocationArgsList
    ;

//Variable referencing
negativeValue
    : MINUS INT_VAL {System.out.println("Operator: -");}
    | MINUS FLOAT_VAL {System.out.println("Operator: +");}
    ;

arrIndexing
    : VAR_FUNC_NAME L_BRACKET expr R_BRACKET
    ;

expr
    : orExpr
    ;

orExpr
    : andExpr orExpr_
    ;

orExpr_
    : LOGICAL_OR andExpr orExpr_ {System.out.println("Operator: ||");}
    |
    ;

andExpr
    : eqNotEqExpr andExpr_
    ;

andExpr_
    : LOGICAL_AND eqNotEqExpr andExpr_ {System.out.println("Operator: &&");}
    |
    ;

eqNotEqExpr
    : relExpr eqNotEqExpr_
    ;

eqNotEqExpr_
    : EQ relExpr eqNotEqExpr_ {System.out.println("Operator: ==");}
    | NOT_EQ relExpr eqNotEqExpr_ {System.out.println("Operator: !=");}
    |
    ;

relExpr
    : addSubExpr relExpr_
    ;

relExpr_
    : LT addSubExpr relExpr_ {System.out.println("Operator: <");}
    | GT addSubExpr relExpr_{System.out.println("Operator: >");}
    | LT_EQ addSubExpr relExpr_{System.out.println("Operator: <=");}
    | GT_EQ addSubExpr relExpr_{System.out.println("Operator: >=");}
    |
    ;

addSubExpr
    : multDivModExpr addSubExpr_
    | multDivModExpr
    ;

addSubExpr_
    : PLUS multDivModExpr addSubExpr_ {System.out.println("Operator: +");}
    | MINUS multDivModExpr addSubExpr_ {System.out.println("Operator: -");}
    |
    ;

multDivModExpr
    : unaryExpr multDivModExpr_
    | unaryExpr
    ;

multDivModExpr_
    : STAR unaryExpr multDivModExpr_ {System.out.println("Operator: *");}
    | DIV unaryExpr multDivModExpr_ {System.out.println("Operator: /");}
    | MOD unaryExpr multDivModExpr_ {System.out.println("Operator: %");}
    |
    ;

unaryExpr
    : PLUS unaryExpr {System.out.println("Operator: +");}
    | MINUS unaryExpr {System.out.println("Operator: -");}
    | LOGICAL_NOT unaryExpr {System.out.println("Operator: !");}
    | arrayAccessExpr
    ;

arrayAccessExpr
    : VAR_FUNC_NAME L_BRACKET expr R_BRACKET
    | commonOperand
    ;

commonOperand
    : L_PAR expr R_PAR
    | VAR_FUNC_NAME
    | INT_VAL
    | FLOAT_VAL
    | BOOLEAN_VAL
    | negativeValue
    | queryBoolType
    | functionInvocation
    ;

//Operators
IMPLICATION_OPERATOR
    : '=>'
    ;

Q_MARK
    : '?'
    ;

COLON
    : ':'
    ;

LOGICAL_OR
    : '||'
    ;

LOGICAL_AND
    : '&&'
    ;

EQ
    : '=='
    ;

NOT_EQ
    : '!='
    ;

GT
    : '>'
    ;

LT
    : '<'
    ;

GT_EQ
    : '>='
    ;

LT_EQ
    : '<='
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

STAR
    : '*'
    ;

DIV
    : '/'
    ;

MOD
    : '%'
    ;

LOGICAL_NOT
    : '!'
    ;

ASSIGN
    : '='
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
    : 'true'
    | 'false'
    ;


//Name patterns
VAR_FUNC_NAME
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