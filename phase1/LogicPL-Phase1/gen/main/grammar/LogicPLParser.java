// Generated from D:/Uni/Semester6/PLC/CA/LogicPL-Compiler/phase1/LogicPL-Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPLICATION_OPERATOR=1, Q_MARK=2, COLON=3, LOGICAL_OR=4, LOGICAL_AND=5, 
		EQ=6, NOT_EQ=7, GT=8, LT=9, GT_EQ=10, LT_EQ=11, PLUS=12, MINUS=13, STAR=14, 
		DIV=15, MOD=16, LOGICAL_NOT=17, ASSIGN=18, INT=19, FLOAT=20, BOOLEAN=21, 
		KEYWORD_FUNCTION=22, KEYWORD_MAIN=23, KEYWORD_PRINT=24, KEYWORD_FOR=25, 
		KEYWORD_RETURN=26, L_BRACKET=27, R_BRACKET=28, L_BRACE=29, R_BRACE=30, 
		L_PAR=31, R_PAR=32, COMMA=33, END_OF_STATEMENT=34, INT_VAL=35, FLOAT_VAL=36, 
		BOOLEAN_VAL=37, VAR_FUNC_NAME=38, PREDICATE_NAME=39, COMMENT=40, WHITE_SPACE=41;
	public static final int
		RULE_logicpl = 0, RULE_main = 1, RULE_multiStatement = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_returnStatement = 5, RULE_varInit = 6, RULE_varDec = 7, 
		RULE_arrDec = 8, RULE_arrInit = 9, RULE_arrValue = 10, RULE_print = 11, 
		RULE_predicateInvocation = 12, RULE_implication = 13, RULE_implicationExpr = 14, 
		RULE_queryBoolType = 15, RULE_queryListType = 16, RULE_forLoop = 17, RULE_function = 18, 
		RULE_functionArgsList = 19, RULE_functionInvocation = 20, RULE_functionInvocationArgsList = 21, 
		RULE_negativeValue = 22, RULE_arrIndexing = 23, RULE_expr = 24, RULE_orExpr = 25, 
		RULE_orExpr_ = 26, RULE_andExpr = 27, RULE_andExpr_ = 28, RULE_eqNotEqExpr = 29, 
		RULE_eqNotEqExpr_ = 30, RULE_relExpr = 31, RULE_relExpr_ = 32, RULE_addSubExpr = 33, 
		RULE_addSubExpr_ = 34, RULE_multDivModExpr = 35, RULE_multDivModExpr_ = 36, 
		RULE_unaryExpr = 37, RULE_arrayAccessExpr = 38, RULE_commonOperand = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicpl", "main", "multiStatement", "statement", "assignment", "returnStatement", 
			"varInit", "varDec", "arrDec", "arrInit", "arrValue", "print", "predicateInvocation", 
			"implication", "implicationExpr", "queryBoolType", "queryListType", "forLoop", 
			"function", "functionArgsList", "functionInvocation", "functionInvocationArgsList", 
			"negativeValue", "arrIndexing", "expr", "orExpr", "orExpr_", "andExpr", 
			"andExpr_", "eqNotEqExpr", "eqNotEqExpr_", "relExpr", "relExpr_", "addSubExpr", 
			"addSubExpr_", "multDivModExpr", "multDivModExpr_", "unaryExpr", "arrayAccessExpr", 
			"commonOperand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'='", "'int'", 
			"'float'", "'boolean'", "'function'", "'main'", "'print'", "'for'", "'return'", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPLICATION_OPERATOR", "Q_MARK", "COLON", "LOGICAL_OR", "LOGICAL_AND", 
			"EQ", "NOT_EQ", "GT", "LT", "GT_EQ", "LT_EQ", "PLUS", "MINUS", "STAR", 
			"DIV", "MOD", "LOGICAL_NOT", "ASSIGN", "INT", "FLOAT", "BOOLEAN", "KEYWORD_FUNCTION", 
			"KEYWORD_MAIN", "KEYWORD_PRINT", "KEYWORD_FOR", "KEYWORD_RETURN", "L_BRACKET", 
			"R_BRACKET", "L_BRACE", "R_BRACE", "L_PAR", "R_PAR", "COMMA", "END_OF_STATEMENT", 
			"INT_VAL", "FLOAT_VAL", "BOOLEAN_VAL", "VAR_FUNC_NAME", "PREDICATE_NAME", 
			"COMMENT", "WHITE_SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LogicPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicplContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LogicPLParser.EOF, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LogicplContext logicpl() {
			return getRuleContext(LogicplContext.class,0);
		}
		public LogicplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLogicpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLogicpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLogicpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicplContext logicpl() throws RecognitionException {
		LogicplContext _localctx = new LogicplContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logicpl);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_MAIN:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("MainBody");
				setState(81);
				main();
				setState(82);
				match(EOF);
				}
				break;
			case KEYWORD_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				function();
				setState(85);
				logicpl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode KEYWORD_MAIN() { return getToken(LogicPLParser.KEYWORD_MAIN, 0); }
		public TerminalNode L_BRACE() { return getToken(LogicPLParser.L_BRACE, 0); }
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(LogicPLParser.R_BRACE, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(KEYWORD_MAIN);
			setState(90);
			match(L_BRACE);
			setState(91);
			multiStatement();
			setState(92);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public MultiStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMultiStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMultiStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMultiStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStatementContext multiStatement() throws RecognitionException {
		MultiStatementContext _localctx = new MultiStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiStatement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				statement();
				setState(96);
				multiStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarInitContext varInit() {
			return getRuleContext(VarInitContext.class,0);
		}
		public TerminalNode END_OF_STATEMENT() { return getToken(LogicPLParser.END_OF_STATEMENT, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ArrDecContext arrDec() {
			return getRuleContext(ArrDecContext.class,0);
		}
		public ArrInitContext arrInit() {
			return getRuleContext(ArrInitContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public PredicateInvocationContext predicateInvocation() {
			return getRuleContext(PredicateInvocationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("VarDec: ");
				setState(101);
				varInit();
				setState(102);
				match(END_OF_STATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("VarDec: ");
				setState(105);
				varDec();
				setState(106);
				match(END_OF_STATEMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("VarDec: ");
				setState(109);
				arrDec();
				setState(110);
				match(END_OF_STATEMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("VarDec: ");
				setState(113);
				arrInit();
				setState(114);
				match(END_OF_STATEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				System.out.println("Built-in: print");
				setState(117);
				print();
				setState(118);
				match(END_OF_STATEMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				System.out.println("FunctionCall");
				setState(121);
				functionInvocation();
				setState(122);
				match(END_OF_STATEMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				predicateInvocation();
				setState(125);
				match(END_OF_STATEMENT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				returnStatement();
				setState(128);
				match(END_OF_STATEMENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				System.out.println("Implication");
				setState(131);
				implication();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				forLoop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				assignment();
				setState(134);
				match(END_OF_STATEMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrIndexingContext arrIndexing() {
			return getRuleContext(ArrIndexingContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(VAR_FUNC_NAME);
				setState(139);
				match(ASSIGN);
				setState(140);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				arrIndexing();
				setState(142);
				match(ASSIGN);
				setState(143);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_RETURN() { return getToken(LogicPLParser.KEYWORD_RETURN, 0); }
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(LogicPLParser.FLOAT_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(LogicPLParser.BOOLEAN_VAL, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public NegativeValueContext negativeValue() {
			return getRuleContext(NegativeValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(KEYWORD_RETURN);
				System.out.println("Return");
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAL:
					{
					setState(149);
					match(INT_VAL);
					}
					break;
				case FLOAT_VAL:
					{
					setState(150);
					match(FLOAT_VAL);
					}
					break;
				case BOOLEAN_VAL:
					{
					setState(151);
					match(BOOLEAN_VAL);
					}
					break;
				case VAR_FUNC_NAME:
					{
					setState(152);
					match(VAR_FUNC_NAME);
					}
					break;
				case MINUS:
					{
					setState(153);
					negativeValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(KEYWORD_RETURN);
				System.out.println("Return");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarInitContext extends ParserRuleContext {
		public Token VAR_FUNC_NAME;
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public VarInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVarInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			((VarInitContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((VarInitContext)_localctx).VAR_FUNC_NAME.getText());
			setState(163);
			match(ASSIGN);
			setState(164);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDecContext extends ParserRuleContext {
		public Token VAR_FUNC_NAME;
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			((VarDecContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println((((VarDecContext)_localctx).VAR_FUNC_NAME!=null?((VarDecContext)_localctx).VAR_FUNC_NAME.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrDecContext extends ParserRuleContext {
		public Token VAR_FUNC_NAME;
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public ArrDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrDecContext arrDec() throws RecognitionException {
		ArrDecContext _localctx = new ArrDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			match(L_BRACKET);
			setState(172);
			match(INT_VAL);
			setState(173);
			match(R_BRACKET);
			setState(174);
			((ArrDecContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((ArrDecContext)_localctx).VAR_FUNC_NAME.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrInitContext extends ParserRuleContext {
		public Token VAR_FUNC_NAME;
		public List<TerminalNode> L_BRACKET() { return getTokens(LogicPLParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(LogicPLParser.L_BRACKET, i);
		}
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public List<TerminalNode> R_BRACKET() { return getTokens(LogicPLParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(LogicPLParser.R_BRACKET, i);
		}
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ArrValueContext arrValue() {
			return getRuleContext(ArrValueContext.class,0);
		}
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public ArrInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrInitContext arrInit() throws RecognitionException {
		ArrInitContext _localctx = new ArrInitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(L_BRACKET);
			setState(179);
			match(INT_VAL);
			setState(180);
			match(R_BRACKET);
			setState(181);
			((ArrInitContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((ArrInitContext)_localctx).VAR_FUNC_NAME.getText());
			setState(183);
			match(ASSIGN);
			setState(184);
			match(L_BRACKET);
			setState(185);
			arrValue();
			setState(186);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrValueContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(LogicPLParser.FLOAT_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(LogicPLParser.BOOLEAN_VAL, 0); }
		public NegativeValueContext negativeValue() {
			return getRuleContext(NegativeValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LogicPLParser.COMMA, 0); }
		public ArrValueContext arrValue() {
			return getRuleContext(ArrValueContext.class,0);
		}
		public ArrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrValueContext arrValue() throws RecognitionException {
		ArrValueContext _localctx = new ArrValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrValue);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAL:
					{
					setState(188);
					match(INT_VAL);
					}
					break;
				case FLOAT_VAL:
					{
					setState(189);
					match(FLOAT_VAL);
					}
					break;
				case BOOLEAN_VAL:
					{
					setState(190);
					match(BOOLEAN_VAL);
					}
					break;
				case MINUS:
					{
					setState(191);
					negativeValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAL:
					{
					setState(194);
					match(INT_VAL);
					}
					break;
				case FLOAT_VAL:
					{
					setState(195);
					match(FLOAT_VAL);
					}
					break;
				case BOOLEAN_VAL:
					{
					setState(196);
					match(BOOLEAN_VAL);
					}
					break;
				case MINUS:
					{
					setState(197);
					negativeValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				match(COMMA);
				setState(201);
				arrValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PRINT() { return getToken(LogicPLParser.KEYWORD_PRINT, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public QueryListTypeContext queryListType() {
			return getRuleContext(QueryListTypeContext.class,0);
		}
		public QueryBoolTypeContext queryBoolType() {
			return getRuleContext(QueryBoolTypeContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(KEYWORD_PRINT);
				setState(205);
				match(L_PAR);
				setState(206);
				match(VAR_FUNC_NAME);
				setState(207);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(KEYWORD_PRINT);
				setState(209);
				match(L_PAR);
				setState(210);
				queryListType();
				setState(211);
				match(R_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(KEYWORD_PRINT);
				setState(214);
				match(L_PAR);
				setState(215);
				queryBoolType();
				setState(216);
				match(R_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateInvocationContext extends ParserRuleContext {
		public Token PREDICATE_NAME;
		public TerminalNode PREDICATE_NAME() { return getToken(LogicPLParser.PREDICATE_NAME, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public ArrIndexingContext arrIndexing() {
			return getRuleContext(ArrIndexingContext.class,0);
		}
		public PredicateInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicateInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicateInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicateInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateInvocationContext predicateInvocation() throws RecognitionException {
		PredicateInvocationContext _localctx = new PredicateInvocationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predicateInvocation);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((PredicateInvocationContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
				System.out.println("Predicate: " + ((PredicateInvocationContext)_localctx).PREDICATE_NAME.getText());
				setState(222);
				match(L_PAR);
				setState(223);
				match(VAR_FUNC_NAME);
				setState(224);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((PredicateInvocationContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
				System.out.println("Predicate: " + ((PredicateInvocationContext)_localctx).PREDICATE_NAME.getText());
				setState(227);
				match(L_PAR);
				setState(228);
				arrIndexing();
				setState(229);
				match(R_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplicationContext extends ParserRuleContext {
		public List<TerminalNode> L_PAR() { return getTokens(LogicPLParser.L_PAR); }
		public TerminalNode L_PAR(int i) {
			return getToken(LogicPLParser.L_PAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> R_PAR() { return getTokens(LogicPLParser.R_PAR); }
		public TerminalNode R_PAR(int i) {
			return getToken(LogicPLParser.R_PAR, i);
		}
		public TerminalNode IMPLICATION_OPERATOR() { return getToken(LogicPLParser.IMPLICATION_OPERATOR, 0); }
		public ImplicationExprContext implicationExpr() {
			return getRuleContext(ImplicationExprContext.class,0);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitImplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(L_PAR);
			setState(234);
			expr();
			setState(235);
			match(R_PAR);
			setState(236);
			match(IMPLICATION_OPERATOR);
			setState(237);
			match(L_PAR);
			setState(238);
			implicationExpr();
			setState(239);
			match(R_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplicationExprContext extends ParserRuleContext {
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public ImplicationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterImplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitImplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitImplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationExprContext implicationExpr() throws RecognitionException {
		ImplicationExprContext _localctx = new ImplicationExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_implicationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			multiStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryBoolTypeContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public TerminalNode Q_MARK() { return getToken(LogicPLParser.Q_MARK, 0); }
		public PredicateInvocationContext predicateInvocation() {
			return getRuleContext(PredicateInvocationContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public QueryBoolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryBoolType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQueryBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQueryBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQueryBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryBoolTypeContext queryBoolType() throws RecognitionException {
		QueryBoolTypeContext _localctx = new QueryBoolTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_queryBoolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(L_BRACKET);
			setState(244);
			match(Q_MARK);
			setState(245);
			predicateInvocation();
			setState(246);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryListTypeContext extends ParserRuleContext {
		public Token PREDICATE_NAME;
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public TerminalNode PREDICATE_NAME() { return getToken(LogicPLParser.PREDICATE_NAME, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public TerminalNode Q_MARK() { return getToken(LogicPLParser.Q_MARK, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public QueryListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryListType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQueryListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQueryListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQueryListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryListTypeContext queryListType() throws RecognitionException {
		QueryListTypeContext _localctx = new QueryListTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryListType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(L_BRACKET);
			setState(249);
			((QueryListTypeContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
			System.out.println("Predicate: " + ((QueryListTypeContext)_localctx).PREDICATE_NAME.getText());
			setState(251);
			match(L_PAR);
			setState(252);
			match(Q_MARK);
			setState(253);
			match(R_PAR);
			setState(254);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FOR() { return getToken(LogicPLParser.KEYWORD_FOR, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public List<TerminalNode> VAR_FUNC_NAME() { return getTokens(LogicPLParser.VAR_FUNC_NAME); }
		public TerminalNode VAR_FUNC_NAME(int i) {
			return getToken(LogicPLParser.VAR_FUNC_NAME, i);
		}
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public TerminalNode L_BRACE() { return getToken(LogicPLParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(LogicPLParser.R_BRACE, 0); }
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(KEYWORD_FOR);
				System.out.println("Loop: for");
				setState(258);
				match(L_PAR);
				setState(259);
				match(VAR_FUNC_NAME);
				setState(260);
				match(COLON);
				setState(261);
				match(VAR_FUNC_NAME);
				setState(262);
				match(R_PAR);
				setState(263);
				match(L_BRACE);
				setState(264);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(KEYWORD_FOR);
				System.out.println("Loop: for");
				setState(267);
				match(L_PAR);
				setState(268);
				match(VAR_FUNC_NAME);
				setState(269);
				match(COLON);
				setState(270);
				match(VAR_FUNC_NAME);
				setState(271);
				match(R_PAR);
				setState(272);
				match(L_BRACE);
				setState(273);
				multiStatement();
				setState(274);
				match(R_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token VAR_FUNC_NAME;
		public TerminalNode KEYWORD_FUNCTION() { return getToken(LogicPLParser.KEYWORD_FUNCTION, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public FunctionArgsListContext functionArgsList() {
			return getRuleContext(FunctionArgsListContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode L_BRACE() { return getToken(LogicPLParser.L_BRACE, 0); }
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(LogicPLParser.R_BRACE, 0); }
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(KEYWORD_FUNCTION);
				System.out.print("FunctionDec: ");
				setState(280);
				((FunctionContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
				System.out.println((((FunctionContext)_localctx).VAR_FUNC_NAME!=null?((FunctionContext)_localctx).VAR_FUNC_NAME.getText():null));
				setState(282);
				match(L_PAR);
				System.out.print("ArgumentDec: ");
				setState(284);
				functionArgsList();
				setState(285);
				match(R_PAR);
				setState(286);
				match(COLON);
				setState(287);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				match(L_BRACE);
				setState(289);
				multiStatement();
				setState(290);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(KEYWORD_FUNCTION);
				System.out.print("FunctionDec: ");
				setState(294);
				((FunctionContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
				System.out.println((((FunctionContext)_localctx).VAR_FUNC_NAME!=null?((FunctionContext)_localctx).VAR_FUNC_NAME.getText():null));
				setState(296);
				match(L_PAR);
				setState(297);
				match(R_PAR);
				setState(298);
				match(COLON);
				setState(299);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				match(L_BRACE);
				setState(301);
				multiStatement();
				setState(302);
				match(R_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgsListContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LogicPLParser.COMMA, 0); }
		public FunctionArgsListContext functionArgsList() {
			return getRuleContext(FunctionArgsListContext.class,0);
		}
		public FunctionArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsListContext functionArgsList() throws RecognitionException {
		FunctionArgsListContext _localctx = new FunctionArgsListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionArgsList);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				varDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				varDec();
				setState(308);
				match(COMMA);
				System.out.print("ArgumentDec: ");
				setState(310);
				functionArgsList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionInvocationContext extends ParserRuleContext {
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public FunctionInvocationArgsListContext functionInvocationArgsList() {
			return getRuleContext(FunctionInvocationArgsListContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionInvocation);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(VAR_FUNC_NAME);
				setState(315);
				match(L_PAR);
				setState(316);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(VAR_FUNC_NAME);
				setState(318);
				match(L_PAR);
				setState(319);
				functionInvocationArgsList();
				setState(320);
				match(R_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionInvocationArgsListContext extends ParserRuleContext {
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode COMMA() { return getToken(LogicPLParser.COMMA, 0); }
		public FunctionInvocationArgsListContext functionInvocationArgsList() {
			return getRuleContext(FunctionInvocationArgsListContext.class,0);
		}
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(LogicPLParser.FLOAT_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(LogicPLParser.BOOLEAN_VAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionInvocationArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocationArgsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionInvocationArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionInvocationArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionInvocationArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvocationArgsListContext functionInvocationArgsList() throws RecognitionException {
		FunctionInvocationArgsListContext _localctx = new FunctionInvocationArgsListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionInvocationArgsList);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(VAR_FUNC_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(VAR_FUNC_NAME);
				setState(326);
				match(COMMA);
				setState(327);
				functionInvocationArgsList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				match(COMMA);
				setState(331);
				functionInvocationArgsList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(332);
				expr();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(333);
				expr();
				}
				setState(334);
				match(COMMA);
				setState(335);
				functionInvocationArgsList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegativeValueContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(LogicPLParser.FLOAT_VAL, 0); }
		public NegativeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterNegativeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitNegativeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitNegativeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeValueContext negativeValue() throws RecognitionException {
		NegativeValueContext _localctx = new NegativeValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_negativeValue);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(MINUS);
				setState(340);
				match(INT_VAL);
				System.out.println("Operator: -");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(MINUS);
				setState(343);
				match(FLOAT_VAL);
				System.out.println("Operator: +");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrIndexingContext extends ParserRuleContext {
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public ArrIndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrIndexing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrIndexingContext arrIndexing() throws RecognitionException {
		ArrIndexingContext _localctx = new ArrIndexingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrIndexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(VAR_FUNC_NAME);
			setState(348);
			match(L_BRACKET);
			setState(349);
			expr();
			setState(350);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			orExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExpr_Context orExpr_() {
			return getRuleContext(OrExpr_Context.class,0);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_orExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			andExpr();
			setState(355);
			orExpr_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExpr_Context extends ParserRuleContext {
		public TerminalNode LOGICAL_OR() { return getToken(LogicPLParser.LOGICAL_OR, 0); }
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExpr_Context orExpr_() {
			return getRuleContext(OrExpr_Context.class,0);
		}
		public OrExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOrExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOrExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOrExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpr_Context orExpr_() throws RecognitionException {
		OrExpr_Context _localctx = new OrExpr_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_orExpr_);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(LOGICAL_OR);
				setState(358);
				andExpr();
				setState(359);
				orExpr_();
				System.out.println("Operator: ||");
				}
				break;
			case R_BRACKET:
			case R_PAR:
			case COMMA:
			case END_OF_STATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public EqNotEqExprContext eqNotEqExpr() {
			return getRuleContext(EqNotEqExprContext.class,0);
		}
		public AndExpr_Context andExpr_() {
			return getRuleContext(AndExpr_Context.class,0);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_andExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			eqNotEqExpr();
			setState(366);
			andExpr_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpr_Context extends ParserRuleContext {
		public TerminalNode LOGICAL_AND() { return getToken(LogicPLParser.LOGICAL_AND, 0); }
		public EqNotEqExprContext eqNotEqExpr() {
			return getRuleContext(EqNotEqExprContext.class,0);
		}
		public AndExpr_Context andExpr_() {
			return getRuleContext(AndExpr_Context.class,0);
		}
		public AndExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAndExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAndExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAndExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpr_Context andExpr_() throws RecognitionException {
		AndExpr_Context _localctx = new AndExpr_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpr_);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGICAL_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(LOGICAL_AND);
				setState(369);
				eqNotEqExpr();
				setState(370);
				andExpr_();
				System.out.println("Operator: &&");
				}
				break;
			case LOGICAL_OR:
			case R_BRACKET:
			case R_PAR:
			case COMMA:
			case END_OF_STATEMENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqNotEqExprContext extends ParserRuleContext {
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public EqNotEqExpr_Context eqNotEqExpr_() {
			return getRuleContext(EqNotEqExpr_Context.class,0);
		}
		public EqNotEqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqNotEqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqNotEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqNotEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqNotEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqNotEqExprContext eqNotEqExpr() throws RecognitionException {
		EqNotEqExprContext _localctx = new EqNotEqExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eqNotEqExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			relExpr();
			setState(377);
			eqNotEqExpr_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqNotEqExpr_Context extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public EqNotEqExpr_Context eqNotEqExpr_() {
			return getRuleContext(EqNotEqExpr_Context.class,0);
		}
		public TerminalNode NOT_EQ() { return getToken(LogicPLParser.NOT_EQ, 0); }
		public EqNotEqExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqNotEqExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqNotEqExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqNotEqExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqNotEqExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqNotEqExpr_Context eqNotEqExpr_() throws RecognitionException {
		EqNotEqExpr_Context _localctx = new EqNotEqExpr_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_eqNotEqExpr_);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(EQ);
				setState(380);
				relExpr();
				setState(381);
				eqNotEqExpr_();
				System.out.println("Operator: ==");
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(NOT_EQ);
				setState(385);
				relExpr();
				setState(386);
				eqNotEqExpr_();
				System.out.println("Operator: !=");
				}
				break;
			case LOGICAL_OR:
			case LOGICAL_AND:
			case R_BRACKET:
			case R_PAR:
			case COMMA:
			case END_OF_STATEMENT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ParserRuleContext {
		public AddSubExprContext addSubExpr() {
			return getRuleContext(AddSubExprContext.class,0);
		}
		public RelExpr_Context relExpr_() {
			return getRuleContext(RelExpr_Context.class,0);
		}
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			addSubExpr();
			setState(393);
			relExpr_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelExpr_Context extends ParserRuleContext {
		public TerminalNode LT() { return getToken(LogicPLParser.LT, 0); }
		public AddSubExprContext addSubExpr() {
			return getRuleContext(AddSubExprContext.class,0);
		}
		public RelExpr_Context relExpr_() {
			return getRuleContext(RelExpr_Context.class,0);
		}
		public TerminalNode GT() { return getToken(LogicPLParser.GT, 0); }
		public TerminalNode LT_EQ() { return getToken(LogicPLParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(LogicPLParser.GT_EQ, 0); }
		public RelExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpr_Context relExpr_() throws RecognitionException {
		RelExpr_Context _localctx = new RelExpr_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_relExpr_);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(LT);
				setState(396);
				addSubExpr();
				setState(397);
				relExpr_();
				System.out.println("Operator: <");
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(GT);
				setState(401);
				addSubExpr();
				setState(402);
				relExpr_();
				System.out.println("Operator: >");
				}
				break;
			case LT_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(LT_EQ);
				setState(406);
				addSubExpr();
				setState(407);
				relExpr_();
				System.out.println("Operator: <=");
				}
				break;
			case GT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(GT_EQ);
				setState(411);
				addSubExpr();
				setState(412);
				relExpr_();
				System.out.println("Operator: >=");
				}
				break;
			case LOGICAL_OR:
			case LOGICAL_AND:
			case EQ:
			case NOT_EQ:
			case R_BRACKET:
			case R_PAR:
			case COMMA:
			case END_OF_STATEMENT:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ParserRuleContext {
		public MultDivModExprContext multDivModExpr() {
			return getRuleContext(MultDivModExprContext.class,0);
		}
		public AddSubExpr_Context addSubExpr_() {
			return getRuleContext(AddSubExpr_Context.class,0);
		}
		public AddSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExprContext addSubExpr() throws RecognitionException {
		AddSubExprContext _localctx = new AddSubExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_addSubExpr);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				multDivModExpr();
				setState(419);
				addSubExpr_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				multDivModExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpr_Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public MultDivModExprContext multDivModExpr() {
			return getRuleContext(MultDivModExprContext.class,0);
		}
		public AddSubExpr_Context addSubExpr_() {
			return getRuleContext(AddSubExpr_Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public AddSubExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAddSubExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAddSubExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAddSubExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpr_Context addSubExpr_() throws RecognitionException {
		AddSubExpr_Context _localctx = new AddSubExpr_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_addSubExpr_);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(PLUS);
				setState(425);
				multDivModExpr();
				setState(426);
				addSubExpr_();
				System.out.println("Operator: +");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(MINUS);
				setState(430);
				multDivModExpr();
				setState(431);
				addSubExpr_();
				System.out.println("Operator: -");
				}
				break;
			case LOGICAL_OR:
			case LOGICAL_AND:
			case EQ:
			case NOT_EQ:
			case GT:
			case LT:
			case GT_EQ:
			case LT_EQ:
			case R_BRACKET:
			case R_PAR:
			case COMMA:
			case END_OF_STATEMENT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultDivModExpr_Context multDivModExpr_() {
			return getRuleContext(MultDivModExpr_Context.class,0);
		}
		public MultDivModExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivModExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMultDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMultDivModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMultDivModExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivModExprContext multDivModExpr() throws RecognitionException {
		MultDivModExprContext _localctx = new MultDivModExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multDivModExpr);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				unaryExpr();
				setState(438);
				multDivModExpr_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				unaryExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModExpr_Context extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(LogicPLParser.STAR, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultDivModExpr_Context multDivModExpr_() {
			return getRuleContext(MultDivModExpr_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(LogicPLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LogicPLParser.MOD, 0); }
		public MultDivModExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivModExpr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMultDivModExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMultDivModExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMultDivModExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivModExpr_Context multDivModExpr_() throws RecognitionException {
		MultDivModExpr_Context _localctx = new MultDivModExpr_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_multDivModExpr_);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(STAR);
				setState(444);
				unaryExpr();
				setState(445);
				multDivModExpr_();
				System.out.println("Operator: *");
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(DIV);
				setState(449);
				unaryExpr();
				setState(450);
				multDivModExpr_();
				System.out.println("Operator: /");
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(MOD);
				setState(454);
				unaryExpr();
				setState(455);
				multDivModExpr_();
				System.out.println("Operator: %");
				}
				break;
			case LOGICAL_OR:
			case LOGICAL_AND:
			case EQ:
			case NOT_EQ:
			case GT:
			case LT:
			case GT_EQ:
			case LT_EQ:
			case PLUS:
			case MINUS:
			case R_BRACKET:
			case R_PAR:
			case COMMA:
			case END_OF_STATEMENT:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(LogicPLParser.LOGICAL_NOT, 0); }
		public ArrayAccessExprContext arrayAccessExpr() {
			return getRuleContext(ArrayAccessExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unaryExpr);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(PLUS);
				setState(462);
				unaryExpr();
				System.out.println("Operator: +");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(MINUS);
				setState(466);
				unaryExpr();
				System.out.println("Operator: -");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(LOGICAL_NOT);
				setState(470);
				unaryExpr();
				System.out.println("Operator: !");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				arrayAccessExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExprContext extends ParserRuleContext {
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public CommonOperandContext commonOperand() {
			return getRuleContext(CommonOperandContext.class,0);
		}
		public ArrayAccessExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessExprContext arrayAccessExpr() throws RecognitionException {
		ArrayAccessExprContext _localctx = new ArrayAccessExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayAccessExpr);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(VAR_FUNC_NAME);
				setState(477);
				match(L_BRACKET);
				setState(478);
				expr();
				setState(479);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				commonOperand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommonOperandContext extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode INT_VAL() { return getToken(LogicPLParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(LogicPLParser.FLOAT_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(LogicPLParser.BOOLEAN_VAL, 0); }
		public NegativeValueContext negativeValue() {
			return getRuleContext(NegativeValueContext.class,0);
		}
		public QueryBoolTypeContext queryBoolType() {
			return getRuleContext(QueryBoolTypeContext.class,0);
		}
		public PredicateInvocationContext predicateInvocation() {
			return getRuleContext(PredicateInvocationContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public CommonOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterCommonOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitCommonOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitCommonOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonOperandContext commonOperand() throws RecognitionException {
		CommonOperandContext _localctx = new CommonOperandContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_commonOperand);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(L_PAR);
				setState(485);
				expr();
				setState(486);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(VAR_FUNC_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(INT_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(FLOAT_VAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(BOOLEAN_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				negativeValue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				queryBoolType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(494);
				predicateInvocation();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				functionInvocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u01f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000X\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0089\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0092"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u009f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c7\b\n\u0001\n\u0001\n\u0003\n\u00cb\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00db\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e8\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0115\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0131\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0139\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0143\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0152\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u015a\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u016c\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0177\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0187\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01a1\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01a7\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01b4\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01ba\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u01cc\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01db\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u01e3\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01f1\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLN\u0000\u0002\u0001\u0000\u0013\u0015\u0001\u0000#%\u020b\u0000"+
		"W\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004b\u0001"+
		"\u0000\u0000\u0000\u0006\u0088\u0001\u0000\u0000\u0000\b\u0091\u0001\u0000"+
		"\u0000\u0000\n\u009e\u0001\u0000\u0000\u0000\f\u00a0\u0001\u0000\u0000"+
		"\u0000\u000e\u00a6\u0001\u0000\u0000\u0000\u0010\u00aa\u0001\u0000\u0000"+
		"\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000"+
		"\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00e7\u0001\u0000\u0000"+
		"\u0000\u001a\u00e9\u0001\u0000\u0000\u0000\u001c\u00f1\u0001\u0000\u0000"+
		"\u0000\u001e\u00f3\u0001\u0000\u0000\u0000 \u00f8\u0001\u0000\u0000\u0000"+
		"\"\u0114\u0001\u0000\u0000\u0000$\u0130\u0001\u0000\u0000\u0000&\u0138"+
		"\u0001\u0000\u0000\u0000(\u0142\u0001\u0000\u0000\u0000*\u0151\u0001\u0000"+
		"\u0000\u0000,\u0159\u0001\u0000\u0000\u0000.\u015b\u0001\u0000\u0000\u0000"+
		"0\u0160\u0001\u0000\u0000\u00002\u0162\u0001\u0000\u0000\u00004\u016b"+
		"\u0001\u0000\u0000\u00006\u016d\u0001\u0000\u0000\u00008\u0176\u0001\u0000"+
		"\u0000\u0000:\u0178\u0001\u0000\u0000\u0000<\u0186\u0001\u0000\u0000\u0000"+
		">\u0188\u0001\u0000\u0000\u0000@\u01a0\u0001\u0000\u0000\u0000B\u01a6"+
		"\u0001\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000F\u01b9\u0001\u0000"+
		"\u0000\u0000H\u01cb\u0001\u0000\u0000\u0000J\u01da\u0001\u0000\u0000\u0000"+
		"L\u01e2\u0001\u0000\u0000\u0000N\u01f0\u0001\u0000\u0000\u0000PQ\u0006"+
		"\u0000\uffff\uffff\u0000QR\u0003\u0002\u0001\u0000RS\u0005\u0000\u0000"+
		"\u0001SX\u0001\u0000\u0000\u0000TU\u0003$\u0012\u0000UV\u0003\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000X\u0001\u0001\u0000\u0000\u0000YZ\u0005\u0017\u0000\u0000"+
		"Z[\u0005\u001d\u0000\u0000[\\\u0003\u0004\u0002\u0000\\]\u0005\u001e\u0000"+
		"\u0000]\u0003\u0001\u0000\u0000\u0000^c\u0003\u0006\u0003\u0000_`\u0003"+
		"\u0006\u0003\u0000`a\u0003\u0004\u0002\u0000ac\u0001\u0000\u0000\u0000"+
		"b^\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000c\u0005\u0001\u0000"+
		"\u0000\u0000de\u0006\u0003\uffff\uffff\u0000ef\u0003\f\u0006\u0000fg\u0005"+
		"\"\u0000\u0000g\u0089\u0001\u0000\u0000\u0000hi\u0006\u0003\uffff\uffff"+
		"\u0000ij\u0003\u000e\u0007\u0000jk\u0005\"\u0000\u0000k\u0089\u0001\u0000"+
		"\u0000\u0000lm\u0006\u0003\uffff\uffff\u0000mn\u0003\u0010\b\u0000no\u0005"+
		"\"\u0000\u0000o\u0089\u0001\u0000\u0000\u0000pq\u0006\u0003\uffff\uffff"+
		"\u0000qr\u0003\u0012\t\u0000rs\u0005\"\u0000\u0000s\u0089\u0001\u0000"+
		"\u0000\u0000tu\u0006\u0003\uffff\uffff\u0000uv\u0003\u0016\u000b\u0000"+
		"vw\u0005\"\u0000\u0000w\u0089\u0001\u0000\u0000\u0000xy\u0006\u0003\uffff"+
		"\uffff\u0000yz\u0003(\u0014\u0000z{\u0005\"\u0000\u0000{\u0089\u0001\u0000"+
		"\u0000\u0000|}\u0003\u0018\f\u0000}~\u0005\"\u0000\u0000~\u0089\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0003\n\u0005\u0000\u0080\u0081\u0005\""+
		"\u0000\u0000\u0081\u0089\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0003"+
		"\uffff\uffff\u0000\u0083\u0089\u0003\u001a\r\u0000\u0084\u0089\u0003\""+
		"\u0011\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005\"\u0000"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088d\u0001\u0000\u0000\u0000"+
		"\u0088h\u0001\u0000\u0000\u0000\u0088l\u0001\u0000\u0000\u0000\u0088p"+
		"\u0001\u0000\u0000\u0000\u0088t\u0001\u0000\u0000\u0000\u0088x\u0001\u0000"+
		"\u0000\u0000\u0088|\u0001\u0000\u0000\u0000\u0088\u007f\u0001\u0000\u0000"+
		"\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000\u0000"+
		"\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0089\u0007\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005&\u0000\u0000\u008b\u008c\u0005\u0012\u0000\u0000"+
		"\u008c\u0092\u00030\u0018\u0000\u008d\u008e\u0003.\u0017\u0000\u008e\u008f"+
		"\u0005\u0012\u0000\u0000\u008f\u0090\u00030\u0018\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u008a\u0001\u0000\u0000\u0000\u0091\u008d\u0001"+
		"\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u001a"+
		"\u0000\u0000\u0094\u009a\u0006\u0005\uffff\uffff\u0000\u0095\u009b\u0005"+
		"#\u0000\u0000\u0096\u009b\u0005$\u0000\u0000\u0097\u009b\u0005%\u0000"+
		"\u0000\u0098\u009b\u0005&\u0000\u0000\u0099\u009b\u0003,\u0016\u0000\u009a"+
		"\u0095\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009f\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u001a\u0000\u0000\u009d\u009f\u0006\u0005\uffff\uffff\u0000"+
		"\u009e\u0093\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u000b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005&\u0000\u0000\u00a2\u00a3\u0006\u0006\uffff\uffff\u0000"+
		"\u00a3\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a5\u00030\u0018\u0000\u00a5"+
		"\r\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005&\u0000\u0000\u00a8\u00a9\u0006\u0007\uffff\uffff\u0000\u00a9\u000f"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u001b\u0000\u0000\u00ac\u00ad\u0005#\u0000\u0000\u00ad\u00ae\u0005"+
		"\u001c\u0000\u0000\u00ae\u00af\u0005&\u0000\u0000\u00af\u00b0\u0006\b"+
		"\uffff\uffff\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u001b\u0000\u0000\u00b3\u00b4\u0005"+
		"#\u0000\u0000\u00b4\u00b5\u0005\u001c\u0000\u0000\u00b5\u00b6\u0005&\u0000"+
		"\u0000\u00b6\u00b7\u0006\t\uffff\uffff\u0000\u00b7\u00b8\u0005\u0012\u0000"+
		"\u0000\u00b8\u00b9\u0005\u001b\u0000\u0000\u00b9\u00ba\u0003\u0014\n\u0000"+
		"\u00ba\u00bb\u0005\u001c\u0000\u0000\u00bb\u0013\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c1\u0005#\u0000\u0000\u00bd\u00c1\u0005$\u0000\u0000\u00be\u00c1"+
		"\u0005%\u0000\u0000\u00bf\u00c1\u0003,\u0016\u0000\u00c0\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c7\u0005#\u0000\u0000\u00c3\u00c7\u0005$\u0000\u0000"+
		"\u00c4\u00c7\u0005%\u0000\u0000\u00c5\u00c7\u0003,\u0016\u0000\u00c6\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9\u00cb\u0003"+
		"\u0014\n\u0000\u00ca\u00c0\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cb\u0015\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0018"+
		"\u0000\u0000\u00cd\u00ce\u0005\u001f\u0000\u0000\u00ce\u00cf\u0005&\u0000"+
		"\u0000\u00cf\u00db\u0005 \u0000\u0000\u00d0\u00d1\u0005\u0018\u0000\u0000"+
		"\u00d1\u00d2\u0005\u001f\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3"+
		"\u00d4\u0005 \u0000\u0000\u00d4\u00db\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0018\u0000\u0000\u00d6\u00d7\u0005\u001f\u0000\u0000\u00d7\u00d8"+
		"\u0003\u001e\u000f\u0000\u00d8\u00d9\u0005 \u0000\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00cc\u0001\u0000\u0000\u0000\u00da\u00d0\u0001"+
		"\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00db\u0017\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\'\u0000\u0000\u00dd\u00de\u0006\f"+
		"\uffff\uffff\u0000\u00de\u00df\u0005\u001f\u0000\u0000\u00df\u00e0\u0005"+
		"&\u0000\u0000\u00e0\u00e8\u0005 \u0000\u0000\u00e1\u00e2\u0005\'\u0000"+
		"\u0000\u00e2\u00e3\u0006\f\uffff\uffff\u0000\u00e3\u00e4\u0005\u001f\u0000"+
		"\u0000\u00e4\u00e5\u0003.\u0017\u0000\u00e5\u00e6\u0005 \u0000\u0000\u00e6"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e7\u00dc\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e8\u0019\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\u001f\u0000\u0000\u00ea\u00eb\u00030\u0018\u0000\u00eb\u00ec"+
		"\u0005 \u0000\u0000\u00ec\u00ed\u0005\u0001\u0000\u0000\u00ed\u00ee\u0005"+
		"\u001f\u0000\u0000\u00ee\u00ef\u0003\u001c\u000e\u0000\u00ef\u00f0\u0005"+
		" \u0000\u0000\u00f0\u001b\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u0004"+
		"\u0002\u0000\u00f2\u001d\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u001b"+
		"\u0000\u0000\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5\u00f6\u0003\u0018"+
		"\f\u0000\u00f6\u00f7\u0005\u001c\u0000\u0000\u00f7\u001f\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u001b\u0000\u0000\u00f9\u00fa\u0005\'\u0000\u0000"+
		"\u00fa\u00fb\u0006\u0010\uffff\uffff\u0000\u00fb\u00fc\u0005\u001f\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0002\u0000\u0000\u00fd\u00fe\u0005 \u0000\u0000"+
		"\u00fe\u00ff\u0005\u001c\u0000\u0000\u00ff!\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\u0019\u0000\u0000\u0101\u0102\u0006\u0011\uffff\uffff\u0000"+
		"\u0102\u0103\u0005\u001f\u0000\u0000\u0103\u0104\u0005&\u0000\u0000\u0104"+
		"\u0105\u0005\u0003\u0000\u0000\u0105\u0106\u0005&\u0000\u0000\u0106\u0107"+
		"\u0005 \u0000\u0000\u0107\u0108\u0005\u001d\u0000\u0000\u0108\u0115\u0005"+
		"\u001e\u0000\u0000\u0109\u010a\u0005\u0019\u0000\u0000\u010a\u010b\u0006"+
		"\u0011\uffff\uffff\u0000\u010b\u010c\u0005\u001f\u0000\u0000\u010c\u010d"+
		"\u0005&\u0000\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e\u010f\u0005"+
		"&\u0000\u0000\u010f\u0110\u0005 \u0000\u0000\u0110\u0111\u0005\u001d\u0000"+
		"\u0000\u0111\u0112\u0003\u0004\u0002\u0000\u0112\u0113\u0005\u001e\u0000"+
		"\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0100\u0001\u0000\u0000"+
		"\u0000\u0114\u0109\u0001\u0000\u0000\u0000\u0115#\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\u0016\u0000\u0000\u0117\u0118\u0006\u0012\uffff\uffff"+
		"\u0000\u0118\u0119\u0005&\u0000\u0000\u0119\u011a\u0006\u0012\uffff\uffff"+
		"\u0000\u011a\u011b\u0005\u001f\u0000\u0000\u011b\u011c\u0006\u0012\uffff"+
		"\uffff\u0000\u011c\u011d\u0003&\u0013\u0000\u011d\u011e\u0005 \u0000\u0000"+
		"\u011e\u011f\u0005\u0003\u0000\u0000\u011f\u0120\u0007\u0000\u0000\u0000"+
		"\u0120\u0121\u0005\u001d\u0000\u0000\u0121\u0122\u0003\u0004\u0002\u0000"+
		"\u0122\u0123\u0005\u001e\u0000\u0000\u0123\u0131\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u0016\u0000\u0000\u0125\u0126\u0006\u0012\uffff\uffff"+
		"\u0000\u0126\u0127\u0005&\u0000\u0000\u0127\u0128\u0006\u0012\uffff\uffff"+
		"\u0000\u0128\u0129\u0005\u001f\u0000\u0000\u0129\u012a\u0005 \u0000\u0000"+
		"\u012a\u012b\u0005\u0003\u0000\u0000\u012b\u012c\u0007\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u001d\u0000\u0000\u012d\u012e\u0003\u0004\u0002\u0000"+
		"\u012e\u012f\u0005\u001e\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000"+
		"\u0130\u0116\u0001\u0000\u0000\u0000\u0130\u0124\u0001\u0000\u0000\u0000"+
		"\u0131%\u0001\u0000\u0000\u0000\u0132\u0139\u0003\u000e\u0007\u0000\u0133"+
		"\u0134\u0003\u000e\u0007\u0000\u0134\u0135\u0005!\u0000\u0000\u0135\u0136"+
		"\u0006\u0013\uffff\uffff\u0000\u0136\u0137\u0003&\u0013\u0000\u0137\u0139"+
		"\u0001\u0000\u0000\u0000\u0138\u0132\u0001\u0000\u0000\u0000\u0138\u0133"+
		"\u0001\u0000\u0000\u0000\u0139\'\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"&\u0000\u0000\u013b\u013c\u0005\u001f\u0000\u0000\u013c\u0143\u0005 \u0000"+
		"\u0000\u013d\u013e\u0005&\u0000\u0000\u013e\u013f\u0005\u001f\u0000\u0000"+
		"\u013f\u0140\u0003*\u0015\u0000\u0140\u0141\u0005 \u0000\u0000\u0141\u0143"+
		"\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142\u013d"+
		"\u0001\u0000\u0000\u0000\u0143)\u0001\u0000\u0000\u0000\u0144\u0152\u0005"+
		"&\u0000\u0000\u0145\u0146\u0005&\u0000\u0000\u0146\u0147\u0005!\u0000"+
		"\u0000\u0147\u0152\u0003*\u0015\u0000\u0148\u0152\u0007\u0001\u0000\u0000"+
		"\u0149\u014a\u0007\u0001\u0000\u0000\u014a\u014b\u0005!\u0000\u0000\u014b"+
		"\u0152\u0003*\u0015\u0000\u014c\u0152\u00030\u0018\u0000\u014d\u014e\u0003"+
		"0\u0018\u0000\u014e\u014f\u0005!\u0000\u0000\u014f\u0150\u0003*\u0015"+
		"\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u0144\u0001\u0000\u0000"+
		"\u0000\u0151\u0145\u0001\u0000\u0000\u0000\u0151\u0148\u0001\u0000\u0000"+
		"\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0151\u014c\u0001\u0000\u0000"+
		"\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0152+\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005\r\u0000\u0000\u0154\u0155\u0005#\u0000\u0000\u0155"+
		"\u015a\u0006\u0016\uffff\uffff\u0000\u0156\u0157\u0005\r\u0000\u0000\u0157"+
		"\u0158\u0005$\u0000\u0000\u0158\u015a\u0006\u0016\uffff\uffff\u0000\u0159"+
		"\u0153\u0001\u0000\u0000\u0000\u0159\u0156\u0001\u0000\u0000\u0000\u015a"+
		"-\u0001\u0000\u0000\u0000\u015b\u015c\u0005&\u0000\u0000\u015c\u015d\u0005"+
		"\u001b\u0000\u0000\u015d\u015e\u00030\u0018\u0000\u015e\u015f\u0005\u001c"+
		"\u0000\u0000\u015f/\u0001\u0000\u0000\u0000\u0160\u0161\u00032\u0019\u0000"+
		"\u01611\u0001\u0000\u0000\u0000\u0162\u0163\u00036\u001b\u0000\u0163\u0164"+
		"\u00034\u001a\u0000\u01643\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0004"+
		"\u0000\u0000\u0166\u0167\u00036\u001b\u0000\u0167\u0168\u00034\u001a\u0000"+
		"\u0168\u0169\u0006\u001a\uffff\uffff\u0000\u0169\u016c\u0001\u0000\u0000"+
		"\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0165\u0001\u0000\u0000"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c5\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0003:\u001d\u0000\u016e\u016f\u00038\u001c\u0000\u016f7"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0005\u0000\u0000\u0171\u0172"+
		"\u0003:\u001d\u0000\u0172\u0173\u00038\u001c\u0000\u0173\u0174\u0006\u001c"+
		"\uffff\uffff\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0177\u0001"+
		"\u0000\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u01779\u0001\u0000\u0000\u0000\u0178\u0179\u0003>\u001f"+
		"\u0000\u0179\u017a\u0003<\u001e\u0000\u017a;\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005\u0006\u0000\u0000\u017c\u017d\u0003>\u001f\u0000\u017d\u017e"+
		"\u0003<\u001e\u0000\u017e\u017f\u0006\u001e\uffff\uffff\u0000\u017f\u0187"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0007\u0000\u0000\u0181\u0182"+
		"\u0003>\u001f\u0000\u0182\u0183\u0003<\u001e\u0000\u0183\u0184\u0006\u001e"+
		"\uffff\uffff\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0187\u0001"+
		"\u0000\u0000\u0000\u0186\u017b\u0001\u0000\u0000\u0000\u0186\u0180\u0001"+
		"\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187=\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0003B!\u0000\u0189\u018a\u0003@ \u0000\u018a"+
		"?\u0001\u0000\u0000\u0000\u018b\u018c\u0005\t\u0000\u0000\u018c\u018d"+
		"\u0003B!\u0000\u018d\u018e\u0003@ \u0000\u018e\u018f\u0006 \uffff\uffff"+
		"\u0000\u018f\u01a1\u0001\u0000\u0000\u0000\u0190\u0191\u0005\b\u0000\u0000"+
		"\u0191\u0192\u0003B!\u0000\u0192\u0193\u0003@ \u0000\u0193\u0194\u0006"+
		" \uffff\uffff\u0000\u0194\u01a1\u0001\u0000\u0000\u0000\u0195\u0196\u0005"+
		"\u000b\u0000\u0000\u0196\u0197\u0003B!\u0000\u0197\u0198\u0003@ \u0000"+
		"\u0198\u0199\u0006 \uffff\uffff\u0000\u0199\u01a1\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0005\n\u0000\u0000\u019b\u019c\u0003B!\u0000\u019c\u019d"+
		"\u0003@ \u0000\u019d\u019e\u0006 \uffff\uffff\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u018b\u0001"+
		"\u0000\u0000\u0000\u01a0\u0190\u0001\u0000\u0000\u0000\u01a0\u0195\u0001"+
		"\u0000\u0000\u0000\u01a0\u019a\u0001\u0000\u0000\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1A\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003F#"+
		"\u0000\u01a3\u01a4\u0003D\"\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0003F#\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7C\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005"+
		"\f\u0000\u0000\u01a9\u01aa\u0003F#\u0000\u01aa\u01ab\u0003D\"\u0000\u01ab"+
		"\u01ac\u0006\"\uffff\uffff\u0000\u01ac\u01b4\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0005\r\u0000\u0000\u01ae\u01af\u0003F#\u0000\u01af\u01b0\u0003"+
		"D\"\u0000\u01b0\u01b1\u0006\"\uffff\uffff\u0000\u01b1\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01a8\u0001\u0000"+
		"\u0000\u0000\u01b3\u01ad\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4E\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003J%\u0000"+
		"\u01b6\u01b7\u0003H$\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01ba"+
		"\u0003J%\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01baG\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u000e\u0000"+
		"\u0000\u01bc\u01bd\u0003J%\u0000\u01bd\u01be\u0003H$\u0000\u01be\u01bf"+
		"\u0006$\uffff\uffff\u0000\u01bf\u01cc\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0005\u000f\u0000\u0000\u01c1\u01c2\u0003J%\u0000\u01c2\u01c3\u0003H"+
		"$\u0000\u01c3\u01c4\u0006$\uffff\uffff\u0000\u01c4\u01cc\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0005\u0010\u0000\u0000\u01c6\u01c7\u0003J%\u0000\u01c7"+
		"\u01c8\u0003H$\u0000\u01c8\u01c9\u0006$\uffff\uffff\u0000\u01c9\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01bb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c0\u0001\u0000\u0000\u0000\u01cb\u01c5"+
		"\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01ccI\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0005\f\u0000\u0000\u01ce\u01cf\u0003J"+
		"%\u0000\u01cf\u01d0\u0006%\uffff\uffff\u0000\u01d0\u01db\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0005\r\u0000\u0000\u01d2\u01d3\u0003J%\u0000\u01d3"+
		"\u01d4\u0006%\uffff\uffff\u0000\u01d4\u01db\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0005\u0011\u0000\u0000\u01d6\u01d7\u0003J%\u0000\u01d7\u01d8\u0006"+
		"%\uffff\uffff\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9\u01db\u0003"+
		"L&\u0000\u01da\u01cd\u0001\u0000\u0000\u0000\u01da\u01d1\u0001\u0000\u0000"+
		"\u0000\u01da\u01d5\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01dbK\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005&\u0000\u0000\u01dd"+
		"\u01de\u0005\u001b\u0000\u0000\u01de\u01df\u00030\u0018\u0000\u01df\u01e0"+
		"\u0005\u001c\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01e3"+
		"\u0003N\'\u0000\u01e2\u01dc\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3M\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u001f"+
		"\u0000\u0000\u01e5\u01e6\u00030\u0018\u0000\u01e6\u01e7\u0005 \u0000\u0000"+
		"\u01e7\u01f1\u0001\u0000\u0000\u0000\u01e8\u01f1\u0005&\u0000\u0000\u01e9"+
		"\u01f1\u0005#\u0000\u0000\u01ea\u01f1\u0005$\u0000\u0000\u01eb\u01f1\u0005"+
		"%\u0000\u0000\u01ec\u01f1\u0003,\u0016\u0000\u01ed\u01f1\u0003\u001e\u000f"+
		"\u0000\u01ee\u01f1\u0003\u0018\f\u0000\u01ef\u01f1\u0003(\u0014\u0000"+
		"\u01f0\u01e4\u0001\u0000\u0000\u0000\u01f0\u01e8\u0001\u0000\u0000\u0000"+
		"\u01f0\u01e9\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000\u0000\u0000"+
		"\u01f0\u01eb\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1O\u0001\u0000\u0000\u0000\u001c"+
		"Wb\u0088\u0091\u009a\u009e\u00c0\u00c6\u00ca\u00da\u00e7\u0114\u0130\u0138"+
		"\u0142\u0151\u0159\u016b\u0176\u0186\u01a0\u01a6\u01b3\u01b9\u01cb\u01da"+
		"\u01e2\u01f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}