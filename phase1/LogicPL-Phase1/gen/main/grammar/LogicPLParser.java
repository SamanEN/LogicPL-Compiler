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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INT=17, 
		FLOAT=18, BOOLEAN=19, KEYWORD_FUNCTION=20, KEYWORD_MAIN=21, KEYWORD_PRINT=22, 
		KEYWORD_FOR=23, KEYWORD_RETURN=24, EQ=25, L_BRACKET=26, R_BRACKET=27, 
		L_BRACE=28, R_BRACE=29, L_PAR=30, R_PAR=31, COMMA=32, END_OF_STATEMENT=33, 
		INT_VAL=34, FLOAT_VAL=35, BOOLEAN_VAL=36, VAR_FUNC_NAME=37, PREDICATE_NAME=38, 
		COMMENT=39, WHITE_SPACE=40;
	public static final int
		RULE_logicpl = 0, RULE_main = 1, RULE_multiStatement = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_returnStatement = 5, RULE_varInit = 6, RULE_varDec = 7, 
		RULE_arrDec = 8, RULE_arrInit = 9, RULE_arrValue = 10, RULE_print = 11, 
		RULE_predicateInvocation = 12, RULE_implication = 13, RULE_implicationExpr = 14, 
		RULE_queryBoolType = 15, RULE_queryListType = 16, RULE_forLoop = 17, RULE_function = 18, 
		RULE_functionArgsList = 19, RULE_functionInvocation = 20, RULE_functionInvocationArgsList = 21, 
		RULE_negativeValue = 22, RULE_arrIndexing = 23, RULE_expr = 24, RULE_andExpr = 25, 
		RULE_eqNotEqExpr = 26, RULE_relExpr = 27, RULE_addSubExpr = 28, RULE_multDivModExpr = 29, 
		RULE_unaryExpr = 30, RULE_arrayAccessExpr = 31, RULE_commonOperand = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicpl", "main", "multiStatement", "statement", "assignment", "returnStatement", 
			"varInit", "varDec", "arrDec", "arrInit", "arrValue", "print", "predicateInvocation", 
			"implication", "implicationExpr", "queryBoolType", "queryListType", "forLoop", 
			"function", "functionArgsList", "functionInvocation", "functionInvocationArgsList", 
			"negativeValue", "arrIndexing", "expr", "andExpr", "eqNotEqExpr", "relExpr", 
			"addSubExpr", "multDivModExpr", "unaryExpr", "arrayAccessExpr", "commonOperand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "'?'", "':'", "'-'", "'&&'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'*'", "'/'", "'%'", "'!'", "'int'", "'float'", 
			"'boolean'", "'function'", "'main'", "'print'", "'for'", "'return'", 
			"'='", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "FLOAT", "BOOLEAN", "KEYWORD_FUNCTION", 
			"KEYWORD_MAIN", "KEYWORD_PRINT", "KEYWORD_FOR", "KEYWORD_RETURN", "EQ", 
			"L_BRACKET", "R_BRACKET", "L_BRACE", "R_BRACE", "L_PAR", "R_PAR", "COMMA", 
			"END_OF_STATEMENT", "INT_VAL", "FLOAT_VAL", "BOOLEAN_VAL", "VAR_FUNC_NAME", 
			"PREDICATE_NAME", "COMMENT", "WHITE_SPACE"
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_MAIN:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("MainBody");
				setState(67);
				main();
				setState(68);
				match(EOF);
				}
				break;
			case KEYWORD_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				function();
				setState(71);
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
			setState(75);
			match(KEYWORD_MAIN);
			setState(76);
			match(L_BRACE);
			setState(77);
			multiStatement();
			setState(78);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				statement();
				setState(82);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("VarDec: ");
				setState(87);
				varInit();
				setState(88);
				match(END_OF_STATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("VarDec: ");
				setState(91);
				varDec();
				setState(92);
				match(END_OF_STATEMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("VarDec: ");
				setState(95);
				arrDec();
				setState(96);
				match(END_OF_STATEMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("VarDec: ");
				setState(99);
				arrInit();
				setState(100);
				match(END_OF_STATEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				System.out.println("Built-in: print");
				setState(103);
				print();
				setState(104);
				match(END_OF_STATEMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				System.out.println("FunctionCall");
				setState(107);
				functionInvocation();
				setState(108);
				match(END_OF_STATEMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				predicateInvocation();
				setState(111);
				match(END_OF_STATEMENT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				returnStatement();
				setState(114);
				match(END_OF_STATEMENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				System.out.println("Implication");
				setState(117);
				implication();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(118);
				forLoop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(119);
				assignment();
				setState(120);
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
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(VAR_FUNC_NAME);
				setState(125);
				match(EQ);
				setState(126);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				arrIndexing();
				setState(128);
				match(EQ);
				setState(129);
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
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(KEYWORD_RETURN);
				System.out.println("Return");
				setState(135);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
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
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
			((VarInitContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((VarInitContext)_localctx).VAR_FUNC_NAME.getText());
			setState(143);
			match(EQ);
			setState(144);
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
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
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
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			match(L_BRACKET);
			setState(152);
			match(INT_VAL);
			setState(153);
			match(R_BRACKET);
			setState(154);
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
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
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
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			match(L_BRACKET);
			setState(159);
			match(INT_VAL);
			setState(160);
			match(R_BRACKET);
			setState(161);
			((ArrInitContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((ArrInitContext)_localctx).VAR_FUNC_NAME.getText());
			setState(163);
			match(EQ);
			setState(164);
			match(L_BRACKET);
			setState(165);
			arrValue();
			setState(166);
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
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(168);
					match(INT_VAL);
					}
					break;
				case 2:
					{
					setState(169);
					match(FLOAT_VAL);
					}
					break;
				case 3:
					{
					setState(170);
					match(BOOLEAN_VAL);
					}
					break;
				case 4:
					{
					setState(171);
					match(VAR_FUNC_NAME);
					}
					break;
				case 5:
					{
					setState(172);
					negativeValue();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(175);
					match(INT_VAL);
					}
					break;
				case 2:
					{
					setState(176);
					match(FLOAT_VAL);
					}
					break;
				case 3:
					{
					setState(177);
					match(BOOLEAN_VAL);
					}
					break;
				case 4:
					{
					setState(178);
					match(VAR_FUNC_NAME);
					}
					break;
				case 5:
					{
					setState(179);
					negativeValue();
					}
					break;
				}
				setState(182);
				match(COMMA);
				setState(183);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(KEYWORD_PRINT);
				setState(187);
				match(L_PAR);
				setState(188);
				match(VAR_FUNC_NAME);
				setState(189);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(KEYWORD_PRINT);
				setState(191);
				match(L_PAR);
				setState(192);
				queryListType();
				setState(193);
				match(R_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(KEYWORD_PRINT);
				setState(196);
				match(L_PAR);
				setState(197);
				queryBoolType();
				setState(198);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((PredicateInvocationContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
				System.out.println("Predicate: " + ((PredicateInvocationContext)_localctx).PREDICATE_NAME.getText());
				setState(204);
				match(L_PAR);
				setState(205);
				match(VAR_FUNC_NAME);
				setState(206);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				((PredicateInvocationContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
				System.out.println("Predicate: " + ((PredicateInvocationContext)_localctx).PREDICATE_NAME.getText());
				setState(209);
				match(L_PAR);
				setState(210);
				arrIndexing();
				setState(211);
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
			setState(215);
			match(L_PAR);
			setState(216);
			expr();
			setState(217);
			match(R_PAR);
			setState(218);
			match(T__0);
			setState(219);
			match(L_PAR);
			setState(220);
			implicationExpr();
			setState(221);
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
			setState(223);
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
			setState(225);
			match(L_BRACKET);
			setState(226);
			match(T__1);
			setState(227);
			predicateInvocation();
			setState(228);
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
			setState(230);
			match(L_BRACKET);
			setState(231);
			((QueryListTypeContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
			System.out.println("Predicate: " + ((QueryListTypeContext)_localctx).PREDICATE_NAME.getText());
			setState(233);
			match(L_PAR);
			setState(234);
			match(T__1);
			setState(235);
			match(R_PAR);
			setState(236);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(KEYWORD_FOR);
				System.out.println("Loop: for");
				setState(240);
				match(L_PAR);
				setState(241);
				match(VAR_FUNC_NAME);
				setState(242);
				match(T__2);
				setState(243);
				match(VAR_FUNC_NAME);
				setState(244);
				match(R_PAR);
				setState(245);
				match(L_BRACE);
				setState(246);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(KEYWORD_FOR);
				System.out.println("Loop: for");
				setState(249);
				match(L_PAR);
				setState(250);
				match(VAR_FUNC_NAME);
				setState(251);
				match(T__2);
				setState(252);
				match(VAR_FUNC_NAME);
				setState(253);
				match(R_PAR);
				setState(254);
				match(L_BRACE);
				setState(255);
				multiStatement();
				setState(256);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(KEYWORD_FUNCTION);
				System.out.print("FunctionDec: ");
				setState(262);
				((FunctionContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
				System.out.println((((FunctionContext)_localctx).VAR_FUNC_NAME!=null?((FunctionContext)_localctx).VAR_FUNC_NAME.getText():null));
				setState(264);
				match(L_PAR);
				System.out.print("ArgumentDec: ");
				setState(266);
				functionArgsList();
				setState(267);
				match(R_PAR);
				setState(268);
				match(T__2);
				setState(269);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				match(L_BRACE);
				setState(271);
				multiStatement();
				setState(272);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(KEYWORD_FUNCTION);
				System.out.println("FunctionDec: ");
				setState(276);
				((FunctionContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
				System.out.print(((FunctionContext)_localctx).VAR_FUNC_NAME.getText());
				setState(278);
				match(L_PAR);
				setState(279);
				match(R_PAR);
				setState(280);
				match(T__2);
				setState(281);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				match(L_BRACE);
				setState(283);
				multiStatement();
				setState(284);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				varDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				varDec();
				setState(290);
				match(COMMA);
				System.out.print("ArgumentDec: ");
				setState(292);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(VAR_FUNC_NAME);
				setState(297);
				match(L_PAR);
				setState(298);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(VAR_FUNC_NAME);
				setState(300);
				match(L_PAR);
				setState(301);
				functionInvocationArgsList();
				setState(302);
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
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(VAR_FUNC_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(VAR_FUNC_NAME);
				setState(308);
				match(COMMA);
				setState(309);
				functionInvocationArgsList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
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
				setState(311);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				match(COMMA);
				setState(313);
				functionInvocationArgsList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(314);
				expr();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(315);
				expr();
				}
				setState(316);
				match(COMMA);
				setState(317);
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
		public NegativeValueContext negativeValue() {
			return getRuleContext(NegativeValueContext.class,0);
		}
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
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(T__3);
				setState(322);
				negativeValue();
				}
				break;
			case INT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(INT_VAL);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(FLOAT_VAL);
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
			setState(327);
			match(VAR_FUNC_NAME);
			setState(328);
			match(L_BRACKET);
			setState(329);
			expr();
			setState(330);
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
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			andExpr();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(333);
				match(T__4);
				setState(334);
				andExpr();
				System.out.println("Operator: ||");
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<EqNotEqExprContext> eqNotEqExpr() {
			return getRuleContexts(EqNotEqExprContext.class);
		}
		public EqNotEqExprContext eqNotEqExpr(int i) {
			return getRuleContext(EqNotEqExprContext.class,i);
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
		enterRule(_localctx, 50, RULE_andExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			eqNotEqExpr();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					match(T__4);
					setState(344);
					eqNotEqExpr();
					System.out.println("Operator: &&");
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
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
		public List<RelExprContext> relExpr() {
			return getRuleContexts(RelExprContext.class);
		}
		public RelExprContext relExpr(int i) {
			return getRuleContext(RelExprContext.class,i);
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
		enterRule(_localctx, 52, RULE_eqNotEqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			relExpr();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(353);
					match(T__5);
					setState(354);
					relExpr();
					System.out.println("Operator: ==");
					}
					break;
				case T__6:
					{
					setState(357);
					match(T__6);
					setState(358);
					relExpr();
					System.out.println("Operator: !=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<AddSubExprContext> addSubExpr() {
			return getRuleContexts(AddSubExprContext.class);
		}
		public AddSubExprContext addSubExpr(int i) {
			return getRuleContext(AddSubExprContext.class,i);
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
		enterRule(_localctx, 54, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			addSubExpr();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) {
				{
				setState(383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(367);
					match(T__7);
					setState(368);
					addSubExpr();
					System.out.println("Operator: <");
					}
					break;
				case T__8:
					{
					setState(371);
					match(T__8);
					setState(372);
					addSubExpr();
					System.out.println("Operator: >");
					}
					break;
				case T__9:
					{
					setState(375);
					match(T__9);
					setState(376);
					addSubExpr();
					System.out.println("Operator: <=");
					}
					break;
				case T__10:
					{
					setState(379);
					match(T__10);
					setState(380);
					addSubExpr();
					System.out.println("Operator: >=");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<MultDivModExprContext> multDivModExpr() {
			return getRuleContexts(MultDivModExprContext.class);
		}
		public MultDivModExprContext multDivModExpr(int i) {
			return getRuleContext(MultDivModExprContext.class,i);
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
		enterRule(_localctx, 56, RULE_addSubExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			multDivModExpr();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__11) {
				{
				setState(397);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(389);
					match(T__11);
					setState(390);
					multDivModExpr();
					System.out.println("Operator: +");
					}
					break;
				case T__3:
					{
					setState(393);
					match(T__3);
					setState(394);
					multDivModExpr();
					System.out.println("Operator: -");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
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
		enterRule(_localctx, 58, RULE_multDivModExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			unaryExpr();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(403);
					match(T__12);
					setState(404);
					unaryExpr();
					System.out.println("Operator: *");
					}
					break;
				case T__13:
					{
					setState(407);
					match(T__13);
					setState(408);
					unaryExpr();
					System.out.println("Operator: /");
					}
					break;
				case T__14:
					{
					setState(411);
					match(T__14);
					setState(412);
					unaryExpr();
					System.out.println("Operator: %");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_unaryExpr);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(T__11);
				setState(421);
				unaryExpr();
				System.out.println("Operator: +");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__3);
				setState(425);
				unaryExpr();
				System.out.println("Operator: -");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(T__15);
				setState(429);
				unaryExpr();
				System.out.println("Operator: !");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
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
		enterRule(_localctx, 62, RULE_arrayAccessExpr);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(VAR_FUNC_NAME);
				setState(436);
				match(L_BRACKET);
				setState(437);
				expr();
				setState(438);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
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
		enterRule(_localctx, 64, RULE_commonOperand);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(L_PAR);
				setState(444);
				expr();
				setState(445);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(VAR_FUNC_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(INT_VAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(FLOAT_VAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				match(BOOLEAN_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				negativeValue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				queryBoolType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				predicateInvocation();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
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
		"\u0004\u0001(\u01ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000J\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"{\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008b\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00ae\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b5"+
		"\b\n\u0001\n\u0001\n\u0003\n\u00b9\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00c9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d6\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0103\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u011f\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0127\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0131\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0140\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0146\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0152\b\u0018\n"+
		"\u0018\f\u0018\u0155\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u015c\b\u0019\n\u0019\f\u0019\u015f\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016a\b\u001a\n\u001a"+
		"\f\u001a\u016d\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0180\b\u001b\n\u001b\f\u001b\u0183\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u018e\b\u001c\n\u001c\f\u001c"+
		"\u0191\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u01a0\b\u001d\n\u001d\f\u001d\u01a3"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01b2\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ba\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01c8\b \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@\u0000\u0003\u0001\u0000\"%\u0001\u0000\u0011\u0013\u0001\u0000"+
		"\"$\u01e6\u0000I\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000"+
		"\u0004T\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000\u0000\b\u0083"+
		"\u0001\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u008c\u0001"+
		"\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0096\u0001"+
		"\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00b8\u0001"+
		"\u0000\u0000\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u00d5\u0001"+
		"\u0000\u0000\u0000\u001a\u00d7\u0001\u0000\u0000\u0000\u001c\u00df\u0001"+
		"\u0000\u0000\u0000\u001e\u00e1\u0001\u0000\u0000\u0000 \u00e6\u0001\u0000"+
		"\u0000\u0000\"\u0102\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000"+
		"\u0000&\u0126\u0001\u0000\u0000\u0000(\u0130\u0001\u0000\u0000\u0000*"+
		"\u013f\u0001\u0000\u0000\u0000,\u0145\u0001\u0000\u0000\u0000.\u0147\u0001"+
		"\u0000\u0000\u00000\u014c\u0001\u0000\u0000\u00002\u0156\u0001\u0000\u0000"+
		"\u00004\u0160\u0001\u0000\u0000\u00006\u016e\u0001\u0000\u0000\u00008"+
		"\u0184\u0001\u0000\u0000\u0000:\u0192\u0001\u0000\u0000\u0000<\u01b1\u0001"+
		"\u0000\u0000\u0000>\u01b9\u0001\u0000\u0000\u0000@\u01c7\u0001\u0000\u0000"+
		"\u0000BC\u0006\u0000\uffff\uffff\u0000CD\u0003\u0002\u0001\u0000DE\u0005"+
		"\u0000\u0000\u0001EJ\u0001\u0000\u0000\u0000FG\u0003$\u0012\u0000GH\u0003"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000"+
		"IF\u0001\u0000\u0000\u0000J\u0001\u0001\u0000\u0000\u0000KL\u0005\u0015"+
		"\u0000\u0000LM\u0005\u001c\u0000\u0000MN\u0003\u0004\u0002\u0000NO\u0005"+
		"\u001d\u0000\u0000O\u0003\u0001\u0000\u0000\u0000PU\u0003\u0006\u0003"+
		"\u0000QR\u0003\u0006\u0003\u0000RS\u0003\u0004\u0002\u0000SU\u0001\u0000"+
		"\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000U\u0005"+
		"\u0001\u0000\u0000\u0000VW\u0006\u0003\uffff\uffff\u0000WX\u0003\f\u0006"+
		"\u0000XY\u0005!\u0000\u0000Y{\u0001\u0000\u0000\u0000Z[\u0006\u0003\uffff"+
		"\uffff\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005!\u0000\u0000]{\u0001"+
		"\u0000\u0000\u0000^_\u0006\u0003\uffff\uffff\u0000_`\u0003\u0010\b\u0000"+
		"`a\u0005!\u0000\u0000a{\u0001\u0000\u0000\u0000bc\u0006\u0003\uffff\uffff"+
		"\u0000cd\u0003\u0012\t\u0000de\u0005!\u0000\u0000e{\u0001\u0000\u0000"+
		"\u0000fg\u0006\u0003\uffff\uffff\u0000gh\u0003\u0016\u000b\u0000hi\u0005"+
		"!\u0000\u0000i{\u0001\u0000\u0000\u0000jk\u0006\u0003\uffff\uffff\u0000"+
		"kl\u0003(\u0014\u0000lm\u0005!\u0000\u0000m{\u0001\u0000\u0000\u0000n"+
		"o\u0003\u0018\f\u0000op\u0005!\u0000\u0000p{\u0001\u0000\u0000\u0000q"+
		"r\u0003\n\u0005\u0000rs\u0005!\u0000\u0000s{\u0001\u0000\u0000\u0000t"+
		"u\u0006\u0003\uffff\uffff\u0000u{\u0003\u001a\r\u0000v{\u0003\"\u0011"+
		"\u0000wx\u0003\b\u0004\u0000xy\u0005!\u0000\u0000y{\u0001\u0000\u0000"+
		"\u0000zV\u0001\u0000\u0000\u0000zZ\u0001\u0000\u0000\u0000z^\u0001\u0000"+
		"\u0000\u0000zb\u0001\u0000\u0000\u0000zf\u0001\u0000\u0000\u0000zj\u0001"+
		"\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zq\u0001\u0000\u0000\u0000"+
		"zt\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000"+
		"\u0000{\u0007\u0001\u0000\u0000\u0000|}\u0005%\u0000\u0000}~\u0005\u0019"+
		"\u0000\u0000~\u0084\u00030\u0018\u0000\u007f\u0080\u0003.\u0017\u0000"+
		"\u0080\u0081\u0005\u0019\u0000\u0000\u0081\u0082\u00030\u0018\u0000\u0082"+
		"\u0084\u0001\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u007f"+
		"\u0001\u0000\u0000\u0000\u0084\t\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u0018\u0000\u0000\u0086\u0087\u0006\u0005\uffff\uffff\u0000\u0087\u008b"+
		"\u0007\u0000\u0000\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008b"+
		"\u0006\u0005\uffff\uffff\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0007\u0001\u0000\u0000\u008d\u008e\u0005%\u0000\u0000\u008e\u008f"+
		"\u0006\u0006\uffff\uffff\u0000\u008f\u0090\u0005\u0019\u0000\u0000\u0090"+
		"\u0091\u00030\u0018\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0007\u0001\u0000\u0000\u0093\u0094\u0005%\u0000\u0000\u0094\u0095\u0006"+
		"\u0007\uffff\uffff\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0007\u0001\u0000\u0000\u0097\u0098\u0005\u001a\u0000\u0000\u0098\u0099"+
		"\u0005\"\u0000\u0000\u0099\u009a\u0005\u001b\u0000\u0000\u009a\u009b\u0005"+
		"%\u0000\u0000\u009b\u009c\u0006\b\uffff\uffff\u0000\u009c\u0011\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0007\u0001\u0000\u0000\u009e\u009f\u0005"+
		"\u001a\u0000\u0000\u009f\u00a0\u0005\"\u0000\u0000\u00a0\u00a1\u0005\u001b"+
		"\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2\u00a3\u0006\t\uffff"+
		"\uffff\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00a5\u0005\u001a"+
		"\u0000\u0000\u00a5\u00a6\u0003\u0014\n\u0000\u00a6\u00a7\u0005\u001b\u0000"+
		"\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00ae\u0005\"\u0000\u0000"+
		"\u00a9\u00ae\u0005#\u0000\u0000\u00aa\u00ae\u0005$\u0000\u0000\u00ab\u00ae"+
		"\u0005%\u0000\u0000\u00ac\u00ae\u0003,\u0016\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b9\u0001\u0000\u0000\u0000\u00af\u00b5\u0005\"\u0000"+
		"\u0000\u00b0\u00b5\u0005#\u0000\u0000\u00b1\u00b5\u0005$\u0000\u0000\u00b2"+
		"\u00b5\u0005%\u0000\u0000\u00b3\u00b5\u0003,\u0016\u0000\u00b4\u00af\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		" \u0000\u0000\u00b7\u00b9\u0003\u0014\n\u0000\u00b8\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9\u0015\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0016\u0000\u0000\u00bb\u00bc\u0005\u001e"+
		"\u0000\u0000\u00bc\u00bd\u0005%\u0000\u0000\u00bd\u00c9\u0005\u001f\u0000"+
		"\u0000\u00be\u00bf\u0005\u0016\u0000\u0000\u00bf\u00c0\u0005\u001e\u0000"+
		"\u0000\u00c0\u00c1\u0003 \u0010\u0000\u00c1\u00c2\u0005\u001f\u0000\u0000"+
		"\u00c2\u00c9\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0016\u0000\u0000"+
		"\u00c4\u00c5\u0005\u001e\u0000\u0000\u00c5\u00c6\u0003\u001e\u000f\u0000"+
		"\u00c6\u00c7\u0005\u001f\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ba\u0001\u0000\u0000\u0000\u00c8\u00be\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005&\u0000\u0000\u00cb\u00cc\u0006\f\uffff\uffff\u0000"+
		"\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd\u00ce\u0005%\u0000\u0000\u00ce"+
		"\u00d6\u0005\u001f\u0000\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0\u00d1"+
		"\u0006\f\uffff\uffff\u0000\u00d1\u00d2\u0005\u001e\u0000\u0000\u00d2\u00d3"+
		"\u0003.\u0017\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\u001e\u0000\u0000\u00d8\u00d9\u00030\u0018\u0000\u00d9\u00da\u0005\u001f"+
		"\u0000\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0005\u001e"+
		"\u0000\u0000\u00dc\u00dd\u0003\u001c\u000e\u0000\u00dd\u00de\u0005\u001f"+
		"\u0000\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00df\u00e0\u0003\u0004"+
		"\u0002\u0000\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u001a"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0002\u0000\u0000\u00e3\u00e4\u0003\u0018"+
		"\f\u0000\u00e4\u00e5\u0005\u001b\u0000\u0000\u00e5\u001f\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u001a\u0000\u0000\u00e7\u00e8\u0005&\u0000\u0000"+
		"\u00e8\u00e9\u0006\u0010\uffff\uffff\u0000\u00e9\u00ea\u0005\u001e\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0002\u0000\u0000\u00eb\u00ec\u0005\u001f\u0000"+
		"\u0000\u00ec\u00ed\u0005\u001b\u0000\u0000\u00ed!\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0005\u0017\u0000\u0000\u00ef\u00f0\u0006\u0011\uffff\uffff"+
		"\u0000\u00f0\u00f1\u0005\u001e\u0000\u0000\u00f1\u00f2\u0005%\u0000\u0000"+
		"\u00f2\u00f3\u0005\u0003\u0000\u0000\u00f3\u00f4\u0005%\u0000\u0000\u00f4"+
		"\u00f5\u0005\u001f\u0000\u0000\u00f5\u00f6\u0005\u001c\u0000\u0000\u00f6"+
		"\u0103\u0005\u001d\u0000\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000\u00f8"+
		"\u00f9\u0006\u0011\uffff\uffff\u0000\u00f9\u00fa\u0005\u001e\u0000\u0000"+
		"\u00fa\u00fb\u0005%\u0000\u0000\u00fb\u00fc\u0005\u0003\u0000\u0000\u00fc"+
		"\u00fd\u0005%\u0000\u0000\u00fd\u00fe\u0005\u001f\u0000\u0000\u00fe\u00ff"+
		"\u0005\u001c\u0000\u0000\u00ff\u0100\u0003\u0004\u0002\u0000\u0100\u0101"+
		"\u0005\u001d\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00ee"+
		"\u0001\u0000\u0000\u0000\u0102\u00f7\u0001\u0000\u0000\u0000\u0103#\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005\u0014\u0000\u0000\u0105\u0106\u0006"+
		"\u0012\uffff\uffff\u0000\u0106\u0107\u0005%\u0000\u0000\u0107\u0108\u0006"+
		"\u0012\uffff\uffff\u0000\u0108\u0109\u0005\u001e\u0000\u0000\u0109\u010a"+
		"\u0006\u0012\uffff\uffff\u0000\u010a\u010b\u0003&\u0013\u0000\u010b\u010c"+
		"\u0005\u001f\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000\u010d\u010e"+
		"\u0007\u0001\u0000\u0000\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0110"+
		"\u0003\u0004\u0002\u0000\u0110\u0111\u0005\u001d\u0000\u0000\u0111\u011f"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0014\u0000\u0000\u0113\u0114"+
		"\u0006\u0012\uffff\uffff\u0000\u0114\u0115\u0005%\u0000\u0000\u0115\u0116"+
		"\u0006\u0012\uffff\uffff\u0000\u0116\u0117\u0005\u001e\u0000\u0000\u0117"+
		"\u0118\u0005\u001f\u0000\u0000\u0118\u0119\u0005\u0003\u0000\u0000\u0119"+
		"\u011a\u0007\u0001\u0000\u0000\u011a\u011b\u0005\u001c\u0000\u0000\u011b"+
		"\u011c\u0003\u0004\u0002\u0000\u011c\u011d\u0005\u001d\u0000\u0000\u011d"+
		"\u011f\u0001\u0000\u0000\u0000\u011e\u0104\u0001\u0000\u0000\u0000\u011e"+
		"\u0112\u0001\u0000\u0000\u0000\u011f%\u0001\u0000\u0000\u0000\u0120\u0127"+
		"\u0003\u000e\u0007\u0000\u0121\u0122\u0003\u000e\u0007\u0000\u0122\u0123"+
		"\u0005 \u0000\u0000\u0123\u0124\u0006\u0013\uffff\uffff\u0000\u0124\u0125"+
		"\u0003&\u0013\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0120\u0001"+
		"\u0000\u0000\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0127\'\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005%\u0000\u0000\u0129\u012a\u0005\u001e\u0000"+
		"\u0000\u012a\u0131\u0005\u001f\u0000\u0000\u012b\u012c\u0005%\u0000\u0000"+
		"\u012c\u012d\u0005\u001e\u0000\u0000\u012d\u012e\u0003*\u0015\u0000\u012e"+
		"\u012f\u0005\u001f\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130"+
		"\u0128\u0001\u0000\u0000\u0000\u0130\u012b\u0001\u0000\u0000\u0000\u0131"+
		")\u0001\u0000\u0000\u0000\u0132\u0140\u0005%\u0000\u0000\u0133\u0134\u0005"+
		"%\u0000\u0000\u0134\u0135\u0005 \u0000\u0000\u0135\u0140\u0003*\u0015"+
		"\u0000\u0136\u0140\u0007\u0002\u0000\u0000\u0137\u0138\u0007\u0002\u0000"+
		"\u0000\u0138\u0139\u0005 \u0000\u0000\u0139\u0140\u0003*\u0015\u0000\u013a"+
		"\u0140\u00030\u0018\u0000\u013b\u013c\u00030\u0018\u0000\u013c\u013d\u0005"+
		" \u0000\u0000\u013d\u013e\u0003*\u0015\u0000\u013e\u0140\u0001\u0000\u0000"+
		"\u0000\u013f\u0132\u0001\u0000\u0000\u0000\u013f\u0133\u0001\u0000\u0000"+
		"\u0000\u013f\u0136\u0001\u0000\u0000\u0000\u013f\u0137\u0001\u0000\u0000"+
		"\u0000\u013f\u013a\u0001\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000"+
		"\u0000\u0140+\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0004\u0000\u0000"+
		"\u0142\u0146\u0003,\u0016\u0000\u0143\u0146\u0005\"\u0000\u0000\u0144"+
		"\u0146\u0005#\u0000\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146-\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0005%\u0000\u0000\u0148\u0149\u0005\u001a"+
		"\u0000\u0000\u0149\u014a\u00030\u0018\u0000\u014a\u014b\u0005\u001b\u0000"+
		"\u0000\u014b/\u0001\u0000\u0000\u0000\u014c\u0153\u00032\u0019\u0000\u014d"+
		"\u014e\u0005\u0005\u0000\u0000\u014e\u014f\u00032\u0019\u0000\u014f\u0150"+
		"\u0006\u0018\uffff\uffff\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151"+
		"\u014d\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154"+
		"1\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015d"+
		"\u00034\u001a\u0000\u0157\u0158\u0005\u0005\u0000\u0000\u0158\u0159\u0003"+
		"4\u001a\u0000\u0159\u015a\u0006\u0019\uffff\uffff\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015c\u015f\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e3\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u016b\u00036\u001b\u0000\u0161\u0162\u0005\u0006\u0000"+
		"\u0000\u0162\u0163\u00036\u001b\u0000\u0163\u0164\u0006\u001a\uffff\uffff"+
		"\u0000\u0164\u016a\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0007\u0000"+
		"\u0000\u0166\u0167\u00036\u001b\u0000\u0167\u0168\u0006\u001a\uffff\uffff"+
		"\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0161\u0001\u0000\u0000"+
		"\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c5\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016e\u0181\u00038\u001c\u0000\u016f\u0170\u0005\b\u0000\u0000\u0170"+
		"\u0171\u00038\u001c\u0000\u0171\u0172\u0006\u001b\uffff\uffff\u0000\u0172"+
		"\u0180\u0001\u0000\u0000\u0000\u0173\u0174\u0005\t\u0000\u0000\u0174\u0175"+
		"\u00038\u001c\u0000\u0175\u0176\u0006\u001b\uffff\uffff\u0000\u0176\u0180"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005\n\u0000\u0000\u0178\u0179\u0003"+
		"8\u001c\u0000\u0179\u017a\u0006\u001b\uffff\uffff\u0000\u017a\u0180\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0005\u000b\u0000\u0000\u017c\u017d\u0003"+
		"8\u001c\u0000\u017d\u017e\u0006\u001b\uffff\uffff\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u016f\u0001\u0000\u0000\u0000\u017f\u0173\u0001"+
		"\u0000\u0000\u0000\u017f\u0177\u0001\u0000\u0000\u0000\u017f\u017b\u0001"+
		"\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u01827\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u018f\u0003:\u001d"+
		"\u0000\u0185\u0186\u0005\f\u0000\u0000\u0186\u0187\u0003:\u001d\u0000"+
		"\u0187\u0188\u0006\u001c\uffff\uffff\u0000\u0188\u018e\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0005\u0004\u0000\u0000\u018a\u018b\u0003:\u001d\u0000"+
		"\u018b\u018c\u0006\u001c\uffff\uffff\u0000\u018c\u018e\u0001\u0000\u0000"+
		"\u0000\u018d\u0185\u0001\u0000\u0000\u0000\u018d\u0189\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u01909\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u01a1\u0003<\u001e\u0000\u0193"+
		"\u0194\u0005\r\u0000\u0000\u0194\u0195\u0003<\u001e\u0000\u0195\u0196"+
		"\u0006\u001d\uffff\uffff\u0000\u0196\u01a0\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005\u000e\u0000\u0000\u0198\u0199\u0003<\u001e\u0000\u0199\u019a"+
		"\u0006\u001d\uffff\uffff\u0000\u019a\u01a0\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0005\u000f\u0000\u0000\u019c\u019d\u0003<\u001e\u0000\u019d\u019e"+
		"\u0006\u001d\uffff\uffff\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f"+
		"\u0193\u0001\u0000\u0000\u0000\u019f\u0197\u0001\u0000\u0000\u0000\u019f"+
		"\u019b\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2"+
		";\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0005\f\u0000\u0000\u01a5\u01a6\u0003<\u001e\u0000\u01a6\u01a7\u0006"+
		"\u001e\uffff\uffff\u0000\u01a7\u01b2\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0005\u0004\u0000\u0000\u01a9\u01aa\u0003<\u001e\u0000\u01aa\u01ab\u0006"+
		"\u001e\uffff\uffff\u0000\u01ab\u01b2\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0005\u0010\u0000\u0000\u01ad\u01ae\u0003<\u001e\u0000\u01ae\u01af\u0006"+
		"\u001e\uffff\uffff\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01b2"+
		"\u0003>\u001f\u0000\u01b1\u01a4\u0001\u0000\u0000\u0000\u01b1\u01a8\u0001"+
		"\u0000\u0000\u0000\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2=\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005%\u0000"+
		"\u0000\u01b4\u01b5\u0005\u001a\u0000\u0000\u01b5\u01b6\u00030\u0018\u0000"+
		"\u01b6\u01b7\u0005\u001b\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b8\u01ba\u0003@ \u0000\u01b9\u01b3\u0001\u0000\u0000\u0000\u01b9\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ba?\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005"+
		"\u001e\u0000\u0000\u01bc\u01bd\u00030\u0018\u0000\u01bd\u01be\u0005\u001f"+
		"\u0000\u0000\u01be\u01c8\u0001\u0000\u0000\u0000\u01bf\u01c8\u0005%\u0000"+
		"\u0000\u01c0\u01c8\u0005\"\u0000\u0000\u01c1\u01c8\u0005#\u0000\u0000"+
		"\u01c2\u01c8\u0005$\u0000\u0000\u01c3\u01c8\u0003,\u0016\u0000\u01c4\u01c8"+
		"\u0003\u001e\u000f\u0000\u01c5\u01c8\u0003\u0018\f\u0000\u01c6\u01c8\u0003"+
		"(\u0014\u0000\u01c7\u01bb\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c0\u0001\u0000\u0000\u0000\u01c7\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c2\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8A\u0001\u0000\u0000"+
		"\u0000\u001dITz\u0083\u008a\u00ad\u00b4\u00b8\u00c8\u00d5\u0102\u011e"+
		"\u0126\u0130\u013f\u0145\u0153\u015d\u0169\u016b\u017f\u0181\u018d\u018f"+
		"\u019f\u01a1\u01b1\u01b9\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}