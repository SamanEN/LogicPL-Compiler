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
            $arrayDeclarationRet.setInitialValue($a.arrayInitialValueRet);
    }
    ;

arrayInitialValue returns[ArrayList<Expression> arrayInitialValueRet]:
    ASSIGN a = arrayList {$arrayInitialValueRet = $a.arrayListRet;}
    ;

arrayList returns[ArrayList<Expression> arrayListRet]:
    {ArrayList<Expression> arrayListRet = new ArrayList<>();}
    LBRACKET ( v1 = value{arrayListRet.add($v1.valueRet)} | i1 = identifier{arrayListRet.add($i1.identifierRet)} ) (COMMA ( v2 = value{arrayListRet.add($v2.valueRet)} | i2 = identifier{arrayListRet.add($i2.identifierRet)} ))* RBRACKET
    ;

printSmt returns[PrintStmt printSmtRet]:
    PRINT LPAR p = printExpr RPAR SEMICOLON
    {
        $printSmtRet = new PrintStmt(p.printExprRet);
        $printSmtRet.setLine($PRINT.getLine());
    }
    ;

printExpr returns[Expression printExprRet]:
    v = variable {$printExprRet = $v.variableRet}
    | q = query {$printExprRet = $q.queryRet;}
    ;

query returns[QueryExpression queryRet]:
      q1 = queryType1 {$queryRet = $q1.queryType1Ret;}
     | q2 = queryType2 {$queryRet = $q2.queryType2Ret;}
    ;

queryType1 returns[QueryExpression queryType1Ret]:
    LBRACKET line = QUARYMARK p = predicateIdentifier LPAR v = variable RPAR RBRACKET
    {
        $queryType1Ret = new QueryExpression($p.predicateIdentifierRet);
        $queryType1Ret.setVar($v.variableRet);
        $queryType1Ret.setLine($line.getLine());
    }
    ;

queryType2 returns[QueryExpression queryType2Ret]:
    LBRACKET p = predicateIdentifier LPAR line = QUARYMARK RPAR RBRACKET
    {
        $queryType2Ret = new QueryExpression($p.predicateIdentifierRet);
        $queryType2Ret.setLine($line.getLine());
    }
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

expression returns[Expression expressionRet]:
    a = andExpr e = expression2
    {
        if($e.expression2Ret != null)
            {
                $expressionRet = new BinaryExpression($a.andExprRet, $e.expression2Ret);
                $expressionRet.setLine($a.getLine());
            }
        else
            {
                $expressionRet = $a.andExprRet;
            }
    }

    ;

expression2 returns[Expression expression2Ret]:
    OR a = andExpr e = expression2
    {
        if($e.expression2Ret != null)
            {
                $expression2Ret = new BinaryExpression($a.andExprRet, $e.expression2Ret);
                $expression2Ret.setLine($a.getLine());
            }
        else
            {
                $expression2Ret = $a.andExprRet;
            }
    }
    |
    {$expression2Ret = null;}
    ;

andExpr returns[Expression andExprRet]:
    e = eqExpr a = andExpr2
    {
        if($a.andExpr2Ret != null)
            {
                $andExprRet = new BinaryExpression($e.eqExprRet, $a.andExpr2Ret);
                $andExprRet.setLine($e.getLine());
            }
        else
            {
                $andExprRet = $e.eqExprRet;
            }
    }
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

type returns [Type typeRet]:
    BOOLEAN {$typeRet = new BooleanType();}
    | INT {$typeRet = new IntType();}
    | FLOAT {$typeRet = new FloatType();}
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