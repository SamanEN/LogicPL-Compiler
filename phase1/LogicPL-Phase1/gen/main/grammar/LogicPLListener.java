// Generated from D:/Uni/Semester6/PLC/CA/LogicPL-Compiler/phase1/LogicPL-Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicPLParser}.
 */
public interface LogicPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#logicpl}.
	 * @param ctx the parse tree
	 */
	void enterLogicpl(LogicPLParser.LogicplContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#logicpl}.
	 * @param ctx the parse tree
	 */
	void exitLogicpl(LogicPLParser.LogicplContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LogicPLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LogicPLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatement(LogicPLParser.MultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatement(LogicPLParser.MultiStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LogicPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LogicPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LogicPLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LogicPLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LogicPLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LogicPLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(LogicPLParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(LogicPLParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(LogicPLParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(LogicPLParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arrDec}.
	 * @param ctx the parse tree
	 */
	void enterArrDec(LogicPLParser.ArrDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arrDec}.
	 * @param ctx the parse tree
	 */
	void exitArrDec(LogicPLParser.ArrDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arrInit}.
	 * @param ctx the parse tree
	 */
	void enterArrInit(LogicPLParser.ArrInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arrInit}.
	 * @param ctx the parse tree
	 */
	void exitArrInit(LogicPLParser.ArrInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arrValue}.
	 * @param ctx the parse tree
	 */
	void enterArrValue(LogicPLParser.ArrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arrValue}.
	 * @param ctx the parse tree
	 */
	void exitArrValue(LogicPLParser.ArrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#predicateInvocation}.
	 * @param ctx the parse tree
	 */
	void enterPredicateInvocation(LogicPLParser.PredicateInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#predicateInvocation}.
	 * @param ctx the parse tree
	 */
	void exitPredicateInvocation(LogicPLParser.PredicateInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(LogicPLParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(LogicPLParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#implicationExpr}.
	 * @param ctx the parse tree
	 */
	void enterImplicationExpr(LogicPLParser.ImplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#implicationExpr}.
	 * @param ctx the parse tree
	 */
	void exitImplicationExpr(LogicPLParser.ImplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#queryBoolType}.
	 * @param ctx the parse tree
	 */
	void enterQueryBoolType(LogicPLParser.QueryBoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#queryBoolType}.
	 * @param ctx the parse tree
	 */
	void exitQueryBoolType(LogicPLParser.QueryBoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#queryListType}.
	 * @param ctx the parse tree
	 */
	void enterQueryListType(LogicPLParser.QueryListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#queryListType}.
	 * @param ctx the parse tree
	 */
	void exitQueryListType(LogicPLParser.QueryListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(LogicPLParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(LogicPLParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LogicPLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LogicPLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsList(LogicPLParser.FunctionArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsList(LogicPLParser.FunctionArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(LogicPLParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(LogicPLParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#functionInvocationArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocationArgsList(LogicPLParser.FunctionInvocationArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#functionInvocationArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocationArgsList(LogicPLParser.FunctionInvocationArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#negativeValue}.
	 * @param ctx the parse tree
	 */
	void enterNegativeValue(LogicPLParser.NegativeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#negativeValue}.
	 * @param ctx the parse tree
	 */
	void exitNegativeValue(LogicPLParser.NegativeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arrIndexing}.
	 * @param ctx the parse tree
	 */
	void enterArrIndexing(LogicPLParser.ArrIndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arrIndexing}.
	 * @param ctx the parse tree
	 */
	void exitArrIndexing(LogicPLParser.ArrIndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LogicPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LogicPLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LogicPLParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LogicPLParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#orExpr_}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr_(LogicPLParser.OrExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#orExpr_}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr_(LogicPLParser.OrExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LogicPLParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LogicPLParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#andExpr_}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr_(LogicPLParser.AndExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#andExpr_}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr_(LogicPLParser.AndExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#eqNotEqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqNotEqExpr(LogicPLParser.EqNotEqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#eqNotEqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqNotEqExpr(LogicPLParser.EqNotEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#eqNotEqExpr_}.
	 * @param ctx the parse tree
	 */
	void enterEqNotEqExpr_(LogicPLParser.EqNotEqExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#eqNotEqExpr_}.
	 * @param ctx the parse tree
	 */
	void exitEqNotEqExpr_(LogicPLParser.EqNotEqExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(LogicPLParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(LogicPLParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#relExpr_}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr_(LogicPLParser.RelExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#relExpr_}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr_(LogicPLParser.RelExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(LogicPLParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(LogicPLParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#addSubExpr_}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr_(LogicPLParser.AddSubExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#addSubExpr_}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr_(LogicPLParser.AddSubExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#multDivModExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr(LogicPLParser.MultDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#multDivModExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr(LogicPLParser.MultDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#multDivModExpr_}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr_(LogicPLParser.MultDivModExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#multDivModExpr_}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr_(LogicPLParser.MultDivModExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(LogicPLParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(LogicPLParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#arrayAccessExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(LogicPLParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#arrayAccessExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(LogicPLParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicPLParser#commonOperand}.
	 * @param ctx the parse tree
	 */
	void enterCommonOperand(LogicPLParser.CommonOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicPLParser#commonOperand}.
	 * @param ctx the parse tree
	 */
	void exitCommonOperand(LogicPLParser.CommonOperandContext ctx);
}