// Generated from D:/Uni/Semester6/PLC/CA/LogicPL-Compiler/phase1/LogicPL-Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogicPLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogicPLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#logicpl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicpl(LogicPLParser.LogicplContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LogicPLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#multiStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatement(LogicPLParser.MultiStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LogicPLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LogicPLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(LogicPLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(LogicPLParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(LogicPLParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arrDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrDec(LogicPLParser.ArrDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arrInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrInit(LogicPLParser.ArrInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrValue(LogicPLParser.ArrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LogicPLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#predicateInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateInvocation(LogicPLParser.PredicateInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#implication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(LogicPLParser.ImplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#implicationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationExpr(LogicPLParser.ImplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#queryBoolType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryBoolType(LogicPLParser.QueryBoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#queryListType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryListType(LogicPLParser.QueryListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(LogicPLParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LogicPLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#functionArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsList(LogicPLParser.FunctionArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#functionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvocation(LogicPLParser.FunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#functionInvocationArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvocationArgsList(LogicPLParser.FunctionInvocationArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#negativeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeValue(LogicPLParser.NegativeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arrIndexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrIndexing(LogicPLParser.ArrIndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LogicPLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LogicPLParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#eqNotEqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNotEqExpr(LogicPLParser.EqNotEqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(LogicPLParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#addSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(LogicPLParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#multDivModExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpr(LogicPLParser.MultDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(LogicPLParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#arrayAccessExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(LogicPLParser.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogicPLParser#commonOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonOperand(LogicPLParser.CommonOperandContext ctx);
}