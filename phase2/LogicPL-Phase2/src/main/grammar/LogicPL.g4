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

functionDec returns [FuncDeclaration functionDeclaration]:
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

statement returns [Statement statementRet]:
    s1 = assignSmt {$statementRet = $s1.assignSmtRet;}
    | ( s2 = predicate {$statementRet = $s2.predicateRet;} SEMICOLON )
    | s3 = implication {$statementRet = $s3.implicationRet;}
    | s4 = returnSmt {$statementRet = $s4.returnSmtRet;}
    | s5 = printSmt {$statementRet = $s5.printSmtRet;}
    | s6 = forLoop {$statementRet = $s6.forLoopRet;}
    | s7 = localVarDeclaration {$statementRet = $s7.localVarDeclarationRet;}
    ;

assignSmt returns [AssignStmt assignSmtRet]:
    lvalue = variable line = ASSIGN rvalue = expression SEMICOLON
    {
        $assignSmtRet = new AssignStmt($lvalue.variableRet , $rvalue.expressionRet);
        $assignSmtRet.setLine($line.getLine());
    }
    ;

variable returns [Variable variableRet]:
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
        $varDeclarationRet.setLine($i.identifierRet.getLine());
        if($e.expressionRet != null)
            $varDeclarationRet.setInitialExpression($e.expressionRet);
    }
    ;

arrayDeclaration returns[ArrayDecStmt arrayDeclarationRet]:
    t = type LBRACKET INT_NUMBER RBRACKET i = identifier
    (a = arrayInitialValue )? SEMICOLON
    {
        $arrayDeclarationRet = new ArrayDecStmt($i.identifierRet, $t.typeRet, $INT_NUMBER.int);
        $arrayDeclarationRet.setLine($i.identifierRet.getLine());
        if($a.arrayInitialValueRet != null)
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
        $implicationRet.setLine($e.expressionRet.getLine());
    }
    ;

expression returns[Expression expressionRet]:
    left = andExpr right = expression2
    {
        if($right.expression2Ret != null)
            {
                $expressionRet = new BinaryExpression($left.andExprRet, $right.expression2Ret.getRight(), $right.expression2Ret.getBinaryOperator());
                $expressionRet.setLine($right.expression2Ret.getLine());
            }
        else
            {
                $expressionRet = $left.andExprRet;
            }
    }
    ;

expression2 returns[BinaryExpression expression2Ret] locals[BinaryExpression temp]:
    OR left = andExpr right = expression2
    {
        if($right.expression2Ret != null)
        {
            $temp = new BinaryExpression($left.andExprRet, $right.expression2Ret.getRight(), $right.expression2Ret.getBinaryOperator());
            $temp.setLine(right.expression2Ret.getLine());
            $expression2Ret = new BinaryExpression(null, $temp, BinaryOperator.or);
        }
        else
        {
            $expression2Ret = new BinaryExpression(null, $left.andExprRet, BinaryOperator.or);
        }
    }
    |
    {$expression2Ret = null;}
    ;

andExpr returns[Expression andExprRet]:
    left = eqExpr right = andExpr2
    {
        if($right.andExpr2Ret != null)
            {
                $andExprRet = new BinaryExpression($left.eqExprRet, $right.andExpr2Ret.getRight(), $right.andExpr2Ret.getBinaryOperator());
                $andExprRet.setLine($right.andExpr2Ret.getLine());
            }
        else
            {
                $andExprRet = $left.eqExprRet;
            }
    }
    ;

andExpr2 returns[Expression andExpr2Ret] locals[BinaryExpression temp]:
    AND left = eqExpr right = andExpr2
    {
        if($right.andExpr2Ret != null)
        {
            $temp = new BinaryExpression($left.eqExprRet, $right.andExpr2Ret.getRight(), $right.andExpr2Ret.getBinaryOperator());
            $temp.setLine(right.andExpr2Ret.getLine());
            $andExpr2Ret = new BinaryExpression(null, $temp, BinaryOperator.or);
        }
        else
        {
            $andExpr2Ret = new BinaryExpression(null, $left.eqExprRet, BinaryOperator.or);
        }   
    }
    |
    {$andExpr2Ret = null;}
    ;

eqExpr returns[Expression eqExprRet]:
    left = compExpr right = eqExpr2
    {
        if(right.eqExpr2Ret != null)
        {
            $eqExprRet = new BinaryExpression($left.compExprRet, $right.eqExpr2Ret.getRight(), $right.eqExpr2Ret.getBinaryOperator());
            $eqExprRet.setLine($right.eqExpr2Ret.getLine());
        }
        else
        {
            $eqExprRet = $left.compExprRet;
        }
    }
    ;

eqExpr2 returns[Expression eqExpr2Ret] locals[BinaryExpression temp, BinaryOperator operator]:
    ( op = EQ {$operator = BinaryOperator.eq;} | op = NEQ {$operator = BinaryOperator.neq;} ) left = compExpr right = eqExpr2
    {
        if($right.eqExpr2Ret != null)
        {
            $temp = new BinaryExpression($left.compExprRet, $right.eqExpr2Ret.getRight(), $right.eqExpr2Ret.getBinaryOperator());
            $temp.setLine(right.eqExpr2Ret.getLine());
            $eqExpr2Ret = new BinaryExpression(null, $temp, $operator);
        }
        else
        {
            $eqExpr2Ret = new BinaryExpression(null, $left.compExprRet, $operator);
        }   
    }   
    |
    {$eqExpr2Ret = null;}
    ;

compExpr returns[Expression compExprRet]:
    left = additive right = compExpr2
    {
        if($right.compExpr2Ret != null)
        {
            $compExprRet = new BinaryExpression($left.additiveRet, $right.compExpr2Ret.getRight(), $right.compExpr2Ret.getBinaryOperator());
            $compExprRet.setLine($right.compExpr2Ret.getLine());
        }
        else
        {
            $compExprRet = $left.additiveRet;
        }
    }
    ;

compExpr2 returns[Expression compExpr2Ret] locals[BinaryExpression temp, BinaryOperator operator]:
    ( op = LT {$operator = BinaryOperator.lt;} | op = LTE {$operator = BinaryOperator.lte;} | op = GT {$operator = BinaryOperator.gt;} | op = GTE {$operator = BinaryOperator.gte;} ) left = additive right = compExpr2
    {
        if($right.compExpr2Ret != null)
        {
            $temp = new BinaryExpression($left.additiveRet, $right.compExpr2Ret.getRight(), $right.compExpr2Ret.getBinaryOperator());
            $temp.setLine(right.compExpr2Ret.getLine());
            BinaryExpression $compExpr2Ret = new BinaryExpression(null, $temp, $operator);
        }
        else
        {
            BinaryExpression $compExpr2Ret = new BinaryExpression(null, $left.additiveRet, $operator);
        }   
    }
    |
    {$compExpr2Ret = null;}
    ;

additive returns[Expression additiveRet]:
    left = multicative right = additive2
    {
        if($right.additive2Ret != null)
        {
            $additiveRet = new BinaryExpression($left.multicativeRet, $right.additive2Ret.getRight(), $right.additive2Ret.getBinaryOperator());
            $additiveRet.setLine($right.additive2Ret.getLine());
        }
        else
        {
            $additiveRet = $left.multicativeRet;
        }
    }
    ;

additive2 returns[Expression additive2Ret] locals[BinaryExpression temp, BinaryOperator operator]:
    ( op = PLUS {$operator = BinaryOperator.add;} | op = MINUS {$operator = BinaryOperator.sub;} ) left = multicative right = additive2
    {
        if($right.additive2Ret != null)
        {
            $temp = new BinaryExpression($left.multicativeRet, $right.additive2Ret.getRight(), $right.additive2Ret.getBinaryOperator());
            $temp.setLine(right.additive2Ret.getLine());
            BinaryExpression $additive2Ret = new BinaryExpression(null, $temp, $operator);
        }
        else
        {
            BinaryExpression $additive2Ret = new BinaryExpression(null, $left.multicativeRet, $operator);
        }   
    }
    |
    {$additive2Ret = null;}
    ;

multicative returns[Expression multicativeRet]:
    left = unary right = multicative2
    {
        if($right.multicative2Ret != null)
        {
            $multicativeRet = new BinaryExpression($left.unaryRet, $right.multicative2Ret.getRight(), $right.multicative2Ret.getBinaryOperator());
            $multicativeRet.setLine($right.multicative2Ret.getLine());
        }
        else
        {
            $multicativeRet = $left.unaryRet;
        }
    }
    ;

multicative2 returns[Expression multicative2Ret] locals[BinaryExpression temp, BinaryOperator operator]:
    ( op = MULT {$operator = BinaryOperator.mult;} | op = DIV {$operator = BinaryOperator.div;} | op = MOD {$operator = BinaryOperator.mod;} ) left = unary right = multicative2
    {
        if($right.multicative2Ret != null)
        {
            $temp = new BinaryExpression($left.unaryRet, $right.multicative2Ret.getRight(), $right.multicative2Ret.getBinaryOperator());
            $temp.setLine(right.multicative2Ret.getLine());
            BinaryExpression $multicative2Ret = new BinaryExpression(null, $temp, $operator);
        }
        else
        {
            BinaryExpression $multicative2Ret = new BinaryExpression(null, $left.unaryRet, $operator);
        }   
    }
    |
    {$multicative2Ret = null;}
    ;

unary returns[Expression unaryRet] locals[UnaryOperator operator]:
    o = other {$unaryRet = $o.otherRet;}
    |
    ( op = PLUS {$operator = UnaryOperator.plus} | op = MINUS {$operator = UnaryOperator.minus} | op = NOT {$operator = UnaryOperator.not} ) o = other
    {
        $unaryRet = new UnaryExpression($operator, $o.otherRet);
        $unaryRet.setLine($operator.getLine());
    }
    ;

other returns[Expression otherRet]:
    LPAR expr = expression RPAR {$otherRet = $expr.expressionRet;}
    | variable {$otherRet = $variable.variableRet;}
    | value {$otherRet = $value.valueRet;}
    | queryType1 {$otherRet = $queryType1.queryType1Ret;}  
    | functionCall {$otherRet = $functionCall.functionCallRet;}
    ;

functionCall returns[FunctionCall functionCallRet]:
    {ArrayList<Expression> arguments = new ArrayList<Expression>();}
    iden = identifier LPAR (expr1 = expression {arguments.add($expr1.expressionRet);} (COMMA expr = expression {arguments.add(expr.expressionRet);})*)? RPAR
    {
        $functionCallRet = new FunctionCall( arguments, $iden.identifierRet);
        $functionCallRet.setLine($iden.identifierRet.getLine());
    }
    ;

value returns[Value valueRet]:
    n1 = numericValue {$valueRet = $n1.numericValueRet;}
    | TRUE {$valueRet = new BooleanValue(true); $valueRet.setLine($TRUE.getLine());}
    | FALSE {$valueRet = new BooleanValue(false); $valueRet.setLine($FALSE.getLine());}
    | MINUS n2 = numericValue {$n2.numericValueRet.negateConstant(); $valueRet = $n2.numericValueRet;}
    ;

numericValue returns[Value numericValueRet]:
    i = INT_NUMBER {$numericValueRet = new IntValue($i.int); $numericValueRet.setLine($i.getLine());} 
    | f = FLOAT_NUMBER {$numericValueRet = new FloatValue(Float.parseFloat($f.text)); $numericValueRet.setLine($f.getLine());}
    ;

identifier returns[Identifier identifierRet]:
    iden = IDENTIFIER {$identifierRet = new Identifier($iden.text); $identifierRet.setLine($iden.getLine());}
    ;

predicateIdentifier returns[Identifier predicateIdentifierRet]:
    piden = PREDICATE_IDENTIFIER {$predicateIdentifierRet = new Identifier($piden.text); $predicateIdentifierRet.setLine($piden.getLine());}
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