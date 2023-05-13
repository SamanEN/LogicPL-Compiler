grammar LogicPL;

@header{
    import ast.node.*;
    import ast.node.expression.*;
    import ast.node.statement.*;
    import ast.node.declaration.*;
    import ast.node.expression.values.*;
    import ast.node.expression.operators.*;
    import ast.type.primitiveType.*;
    import ast.type.*;
}

program returns[Program p]:
    {$p = new Program(); $p.setLine(0);}
    (f = functionDec {$p.addFunc($f.functionDeclaration);})*
    main = mainBlock {$p.setMain($main.main) ;}
    ;

functionDec returns[FuncDeclaration functionDeclaration]:
    {
        ArrayList<ArgDeclaration> args = new ArrayList<>();
        ArrayList<Statement> statements = new ArrayList<>();
    }
    FUNCTION name = identifier
    LPAR (arg1 = functionVarDec {args.add($arg1.argDeclaration);}
    (COMMA arg = functionVarDec {args.add($arg.argDeclaration);})*)?
    RPAR COLON returnType = type
    LBRACE ((stmt = statement {statements.add($stmt.statementRet);})+) RBRACE
    {
        $functionDeclaration = new FuncDeclaration($name.identifierRet, $returnType.typeRet, args, statements);
        $functionDeclaration.setLine($name.identifierRet.getLine());
    }
    ;

functionVarDec returns [ArgDeclaration argDeclaration]:
    t = type arg_iden = identifier
    {
        $argDeclaration = new ArgDeclaration($arg_iden.identifierRet, $t.typeRet);
        $argDeclaration.setLine($arg_iden.identifierRet.getLine());
    }
    ;

mainBlock returns [MainDeclaration main]:
    {ArrayList<Statement> mainStmts = new ArrayList<>();}
    m = MAIN LBRACE (s = statement {mainStmts.add($s.statementRet);})+ RBRACE
    {
        $main = new MainDeclaration(mainStmts);
        $main.setLine($m.getLine());
    }
    ;

statement returns[Statement statementRet]:
    s1 = assignSmt {$statementRet = $s1.assignSmtRet;}
    | ( s2 = predicate {$statementRet = $s2.predicateRet;} SEMICOLON )
    | s3 = implication {$statementRet = $s3.implicationRet;}
    | s4 = returnSmt {$statementRet = $s4.returnSmtRet;}
    | s5 = printSmt {$statementRet = $s5.printSmtRet;}
    | s6 = forLoop {$statementRet = $s6.forLoopRet;}
    | s7 = localVarDeclaration {$statementRet = $s7.localVarDeclarationRet;}
    ;

assignSmt[AssignStmt assignSmtRet]:
    lvalue = variable line = ASSIGN rvalue = expression SEMICOLON
    {
        $assignSmtRet = new AssignStmt($lvalue.variableRet , $rvalue.expressionRet);
        $assignSmtRet.setLine($line.getLine());
    }
    ;

variable returns[Variable variableRet]:
    i1 = identifier
    {
        $variableRet = new Variable($i1.identifierRet);
        $variableRet.setLine($i1.identifierRet.getLine());
    }
    |  i2 = identifier LBRACKET e = expression RBRACKET
    {
        $variableRet = new ArrayAccess($i2.identifierRet.getName(), $e.expressionRet);
        $variableRet.setLine($i2.identifierRet.getLine());
    }
    ;

localVarDeclaration returns[Statement localVarDeclarationRet]:
     v = varDeclaration {$localVarDeclarationRet = $v.varDeclarationRet;}
    | a = arrayDeclaration {$localVarDeclarationRet = $a.arrayDeclarationRet;}
    ;

varDeclaration returns[VarDecStmt varDeclarationRet]:
    t = type i = identifier (ASSIGN e = expression )? SEMICOLON
    {
        $varDeclarationRet = new VarDecStmt($i.identifierRet, $t.typeRet);
        $varDeclarationRet.setLine($i.getLine());
        if($e != null)
            $varDeclarationRet.setInitialExpression($e.expressionRet);
    }
    ;

arrayDeclaration returns[ArrayDecStmt arrayDeclarationRet]:
    t = type LBRACKET INT_NUMBER RBRACKET i = identifier
    (a = arrayInitialValue )? SEMICOLON
    {
        $arrayDeclarationRet = new ArrayDecStmt($i.identifierRet, $t.typeRet, $INT_NUMBER.getText());
        $arrayDeclarationRet.setLine($i.getLine());
        if($a != null)
            $arrayDeclarationRet.setInitialValue($a.arrayList);
    }
    ;

arrayInitialValue:
    ASSIGN arrayList
    ;

arrayList:
    LBRACKET ( value | identifier ) (COMMA ( value | identifier ))* RBRACKET
    ;

printSmt returns[PrintStmt printSmtRet]:
    PRINT LPAR p = printExpr RPAR SEMICOLON
    {
        $printSmtRet = new PrintStmt(p.printExprRet);
        $printSmtRet.setLine($PRINT.getLine());
    }
    ;

printExpr:
    variable
    | query
    ;

query:
      queryType1
     | queryType2
    ;

queryType1:
    LBRACKET QUARYMARK predicateIdentifier LPAR variable RPAR RBRACKET
    ;

queryType2:
    LBRACKET predicateIdentifier LPAR QUARYMARK RPAR RBRACKET
    ;

returnSmt returns[ReturnStmt returnSmtRet]:
    RETURN (v = value {$returnSmtRet = new ReturnStmt($v.valueRet);} | iden = identifier {$returnSmtRet = new ReturnStmt($iden.identifierRet);})? SEMICOLON 
    {
        if($returnSmtRet == null)
            {
                $returnSmtRet = new ReturnStmt(null);
            }
    }
    {$returnSmtRet.setLine($RETURN.getLine());}
    ;

forLoop returns[ForloopStmt forLoopRet]:
    FOR LPAR i1 = identifier COLON i2 = identifier RPAR
    {ArrayList<Statement> statements = new ArrayList<>();}
    LBRACE ((s = statement {statements.add($s.statementRet);})+) RBRACE
    {
        $forLoopRet = new ForloopStmt($i1.identifierRet, $i2.identifierRet, statements);
        $forLoopRet.setLine($FOR.getLine());
    }
    ;

predicate returns[PredicateStmt predicateRet]:
    p = predicateIdentifier LPAR v = variable RPAR
    {
        $predicateRet = new PredicateStmt($p.predicateIdentifierRet , $v.variableRet);
        predicateRet.setLine($p.predicateIdentifierRet.getLine());
    }
    ;

implication returns[ImplicationStmt implicationRet]:
    {ArrayList<Statement> statements = new ArrayList<>();}
    LPAR e = expression RPAR ARROW LPAR ((s = statement{statements.add($s.statementRet);})+) RPAR
    {
        $implicationRet = new ImplicationStmt($e.expressionRet, statements);
        $implicationRet.setLine($e.getLine());
    }
    ;

expression:
    andExpr expression2
    ;

expression2:
    OR andExpr expression2
    |
    ;

andExpr:
    eqExpr andExpr2
    ;

andExpr2:
    AND eqExpr andExpr2
    |
    ;

eqExpr:
    compExpr eqExpr2
    ;

eqExpr2:
    ( EQ | NEQ ) compExpr eqExpr2
    |
    ;

compExpr:
    additive compExpr2
    ;

compExpr2:
    ( LT | LTE | GT | GTE) additive compExpr2
    |
    ;

additive:
    multicative additive2
    ;

additive2:
    ( PLUS | MINUS ) multicative additive2
    |
    ;

multicative:
    unary multicative2
    ;

multicative2:
    ( MULT | MOD | DIV ) unary multicative2
    |
    ;

unary:
    other
    |
     ( PLUS | MINUS | NOT ) other
    ;

other:
    LPAR expression RPAR | variable | value
    | queryType1 | functionCall
    ;

functionCall:
    identifier LPAR (expression (COMMA expression)*)? RPAR
    ;

value:
    numericValue
    | TRUE
    | FALSE
    | MINUS numericValue
    ;

numericValue:
    INT_NUMBER
    | FLOAT_NUMBER
    ;

identifier:
    IDENTIFIER
    ;

predicateIdentifier:
    PREDICATE_IDENTIFIER
    ;

type:
    BOOLEAN
    | INT
    | FLOAT
    ;




FUNCTION : 'function';
BOOLEAN : 'boolean';
INT : 'int';
FLOAT: 'float';
MAIN: 'main';
PRINT: 'print';
RETURN: 'return';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';

LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
ASSIGN: '=';
LBRACKET: '[';
RBRACKET: ']';
QUARYMARK: '?';
ARROW: '=>';
OR: '||';
AND: '&&';
EQ: '==';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NEQ: '!=';
NOT: '!';


WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

IDENTIFIER : [a-z][a-zA-Z0-9_]* ;
PREDICATE_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;
INT_NUMBER : [0-9]+;
FLOAT_NUMBER: ([0-9]*[.])?[0-9]+;