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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		INT=18, FLOAT=19, BOOLEAN=20, KEYWORD_TRUE=21, KEYWORD_FALSE=22, KEYWORD_FUNCTION=23, 
		KEYWORD_MAIN=24, KEYWORD_PRINT=25, KEYWORD_FOR=26, KEYWORD_RETURN=27, 
		EQ=28, L_BRACKET=29, R_BRACKET=30, L_BRACE=31, R_BRACE=32, L_PAR=33, R_PAR=34, 
		COMMA=35, END_OF_STATEMENT=36, INT_VAL=37, FLOAT_VAL=38, BOOLEAN_VAL=39, 
		VAR_FUNC_NAME=40, PREDICATE_NAME=41, COMMENT=42, WHITE_SPACE=43;
	public static final int
		RULE_logicpl = 0, RULE_main = 1, RULE_multiStatement = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_returnStatement = 5, RULE_varInit = 6, RULE_varDec = 7, 
		RULE_arrDec = 8, RULE_arrInit = 9, RULE_arrValue = 10, RULE_print = 11, 
		RULE_predicateInvocation = 12, RULE_implication = 13, RULE_implicationExpr = 14, 
		RULE_query = 15, RULE_queryBoolType = 16, RULE_queryListType = 17, RULE_forLoop = 18, 
		RULE_function = 19, RULE_functionArgsList = 20, RULE_functionInvocation = 21, 
		RULE_functionInvocationArgsList = 22, RULE_negativeValue = 23, RULE_arrIndexing = 24, 
		RULE_expr = 25, RULE_logicalOrOperand = 26, RULE_logicalAndOperand = 27, 
		RULE_eqNotEqOperand = 28, RULE_relOperand = 29, RULE_addSubOperand = 30, 
		RULE_multDivModOperand = 31, RULE_arrayAccessOperand = 32, RULE_commonOperand = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicpl", "main", "multiStatement", "statement", "assignment", "returnStatement", 
			"varInit", "varDec", "arrDec", "arrInit", "arrValue", "print", "predicateInvocation", 
			"implication", "implicationExpr", "query", "queryBoolType", "queryListType", 
			"forLoop", "function", "functionArgsList", "functionInvocation", "functionInvocationArgsList", 
			"negativeValue", "arrIndexing", "expr", "logicalOrOperand", "logicalAndOperand", 
			"eqNotEqOperand", "relOperand", "addSubOperand", "multDivModOperand", 
			"arrayAccessOperand", "commonOperand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "'?'", "':'", "'-'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'+'", "'*'", "'/'", "'%'", "'!'", "'int'", "'float'", 
			"'boolean'", "'true'", "'false'", "'function'", "'main'", "'print'", 
			"'for'", "'return'", "'='", "'['", "']'", "'{'", "'}'", "'('", "')'", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INT", "FLOAT", "BOOLEAN", "KEYWORD_TRUE", 
			"KEYWORD_FALSE", "KEYWORD_FUNCTION", "KEYWORD_MAIN", "KEYWORD_PRINT", 
			"KEYWORD_FOR", "KEYWORD_RETURN", "EQ", "L_BRACKET", "R_BRACKET", "L_BRACE", 
			"R_BRACE", "L_PAR", "R_PAR", "COMMA", "END_OF_STATEMENT", "INT_VAL", 
			"FLOAT_VAL", "BOOLEAN_VAL", "VAR_FUNC_NAME", "PREDICATE_NAME", "COMMENT", 
			"WHITE_SPACE"
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_MAIN:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("MainBody");
				setState(69);
				main();
				setState(70);
				match(EOF);
				}
				break;
			case KEYWORD_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				function();
				setState(73);
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
			setState(77);
			match(KEYWORD_MAIN);
			setState(78);
			match(L_BRACE);
			setState(79);
			multiStatement();
			setState(80);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				statement();
				setState(84);
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
		public PredicateInvocationContext predicateInvocation() {
			return getRuleContext(PredicateInvocationContext.class,0);
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.print("VarDec: ");
				setState(89);
				varInit();
				setState(90);
				match(END_OF_STATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				System.out.print("VarDec: ");
				setState(93);
				varDec();
				setState(94);
				match(END_OF_STATEMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.print("VarDec: ");
				setState(97);
				arrDec();
				setState(98);
				match(END_OF_STATEMENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				System.out.print("VarDec: ");
				setState(101);
				arrInit();
				setState(102);
				match(END_OF_STATEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				System.out.println("Built-in: print");
				setState(105);
				print();
				setState(106);
				match(END_OF_STATEMENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				predicateInvocation();
				setState(109);
				match(END_OF_STATEMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				System.out.println("Implication");
				setState(112);
				implication();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				forLoop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				assignment();
				setState(115);
				match(END_OF_STATEMENT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				returnStatement();
				setState(118);
				match(END_OF_STATEMENT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				System.out.println("FunctionCall");
				setState(121);
				functionInvocation();
				setState(122);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(VAR_FUNC_NAME);
				setState(127);
				match(EQ);
				setState(128);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				arrIndexing();
				setState(130);
				match(EQ);
				setState(131);
				expr(0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(KEYWORD_RETURN);
			System.out.println("Return");
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			((VarInitContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((VarInitContext)_localctx).VAR_FUNC_NAME.getText());
			setState(142);
			match(EQ);
			setState(143);
			expr(0);
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
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(146);
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
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(L_BRACKET);
			setState(151);
			match(INT_VAL);
			setState(152);
			match(R_BRACKET);
			setState(153);
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
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			match(L_BRACKET);
			setState(158);
			match(INT_VAL);
			setState(159);
			match(R_BRACKET);
			setState(160);
			((ArrInitContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
			System.out.println(((ArrInitContext)_localctx).VAR_FUNC_NAME.getText());
			setState(162);
			match(EQ);
			setState(163);
			match(L_BRACKET);
			setState(164);
			arrValue();
			setState(165);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(167);
					match(INT_VAL);
					}
					break;
				case 2:
					{
					setState(168);
					match(FLOAT_VAL);
					}
					break;
				case 3:
					{
					setState(169);
					match(BOOLEAN_VAL);
					}
					break;
				case 4:
					{
					setState(170);
					match(VAR_FUNC_NAME);
					}
					break;
				case 5:
					{
					setState(171);
					negativeValue();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(174);
					match(INT_VAL);
					}
					break;
				case 2:
					{
					setState(175);
					match(FLOAT_VAL);
					}
					break;
				case 3:
					{
					setState(176);
					match(BOOLEAN_VAL);
					}
					break;
				case 4:
					{
					setState(177);
					match(VAR_FUNC_NAME);
					}
					break;
				case 5:
					{
					setState(178);
					negativeValue();
					}
					break;
				}
				setState(181);
				match(COMMA);
				setState(182);
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
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(KEYWORD_PRINT);
			setState(186);
			match(L_PAR);
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_FUNC_NAME:
				{
				setState(187);
				match(VAR_FUNC_NAME);
				}
				break;
			case L_BRACKET:
				{
				setState(188);
				query();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
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
	public static class PredicateInvocationContext extends ParserRuleContext {
		public Token PREDICATE_NAME;
		public TerminalNode PREDICATE_NAME() { return getToken(LogicPLParser.PREDICATE_NAME, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((PredicateInvocationContext)_localctx).PREDICATE_NAME = match(PREDICATE_NAME);
			System.out.println("Predicate: " + ((PredicateInvocationContext)_localctx).PREDICATE_NAME.getText());
			setState(195);
			match(L_PAR);
			setState(196);
			match(VAR_FUNC_NAME);
			setState(197);
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
			setState(199);
			match(L_PAR);
			setState(200);
			expr(0);
			setState(201);
			match(R_PAR);
			setState(202);
			match(T__0);
			setState(203);
			match(L_PAR);
			setState(204);
			implicationExpr();
			setState(205);
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
			setState(207);
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
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public QueryBoolTypeContext queryBoolType() {
			return getRuleContext(QueryBoolTypeContext.class,0);
		}
		public QueryListTypeContext queryListType() {
			return getRuleContext(QueryListTypeContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(L_BRACKET);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(210);
				queryBoolType();
				}
				break;
			case PREDICATE_NAME:
				{
				setState(211);
				queryListType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(214);
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
	public static class QueryBoolTypeContext extends ParserRuleContext {
		public PredicateInvocationContext predicateInvocation() {
			return getRuleContext(PredicateInvocationContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_queryBoolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__1);
			setState(217);
			predicateInvocation();
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
		public TerminalNode PREDICATE_NAME() { return getToken(LogicPLParser.PREDICATE_NAME, 0); }
		public TerminalNode L_PAR() { return getToken(LogicPLParser.L_PAR, 0); }
		public TerminalNode R_PAR() { return getToken(LogicPLParser.R_PAR, 0); }
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
		enterRule(_localctx, 34, RULE_queryListType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(PREDICATE_NAME);
			setState(220);
			match(L_PAR);
			setState(221);
			match(T__1);
			setState(222);
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
		enterRule(_localctx, 36, RULE_forLoop);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(KEYWORD_FOR);
				System.out.println("Loop: for");
				setState(226);
				match(L_PAR);
				setState(227);
				match(VAR_FUNC_NAME);
				setState(228);
				match(T__2);
				setState(229);
				match(VAR_FUNC_NAME);
				setState(230);
				match(R_PAR);
				setState(231);
				match(L_BRACE);
				setState(232);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(KEYWORD_FOR);
				System.out.println("Loop: for");
				setState(235);
				match(L_PAR);
				setState(236);
				match(VAR_FUNC_NAME);
				setState(237);
				match(T__2);
				setState(238);
				match(VAR_FUNC_NAME);
				setState(239);
				match(R_PAR);
				setState(240);
				match(L_BRACE);
				setState(241);
				multiStatement();
				setState(242);
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
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(KEYWORD_FUNCTION);
				System.out.print("FunctionDec: ");
				setState(248);
				((FunctionContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
				System.out.println((((FunctionContext)_localctx).VAR_FUNC_NAME!=null?((FunctionContext)_localctx).VAR_FUNC_NAME.getText():null));
				setState(250);
				match(L_PAR);
				System.out.print("ArgumentDec: ");
				setState(252);
				functionArgsList();
				setState(253);
				match(R_PAR);
				setState(254);
				match(T__2);
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				match(L_BRACE);
				setState(257);
				multiStatement();
				setState(258);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(KEYWORD_FUNCTION);
				System.out.println("FunctionDec: ");
				setState(262);
				((FunctionContext)_localctx).VAR_FUNC_NAME = match(VAR_FUNC_NAME);
				System.out.print(((FunctionContext)_localctx).VAR_FUNC_NAME.getText());
				setState(264);
				match(L_PAR);
				setState(265);
				match(R_PAR);
				setState(266);
				match(T__2);
				setState(267);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				match(L_BRACE);
				setState(269);
				multiStatement();
				setState(270);
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
		enterRule(_localctx, 40, RULE_functionArgsList);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				varDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				varDec();
				setState(276);
				match(COMMA);
				System.out.print("ArgumentDec: ");
				setState(278);
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
		enterRule(_localctx, 42, RULE_functionInvocation);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(VAR_FUNC_NAME);
				setState(283);
				match(L_PAR);
				setState(284);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(VAR_FUNC_NAME);
				setState(286);
				match(L_PAR);
				setState(287);
				functionInvocationArgsList();
				setState(288);
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
		enterRule(_localctx, 44, RULE_functionInvocationArgsList);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(VAR_FUNC_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(VAR_FUNC_NAME);
				setState(294);
				match(COMMA);
				setState(295);
				functionInvocationArgsList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
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
				setState(297);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				match(COMMA);
				setState(299);
				functionInvocationArgsList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(300);
				expr(0);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(301);
				expr(0);
				}
				setState(302);
				match(COMMA);
				setState(303);
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
		enterRule(_localctx, 46, RULE_negativeValue);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__3);
				setState(308);
				negativeValue();
				}
				break;
			case INT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(INT_VAL);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
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
		enterRule(_localctx, 48, RULE_arrIndexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(VAR_FUNC_NAME);
			setState(314);
			match(L_BRACKET);
			setState(315);
			expr(0);
			setState(316);
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
		public LogicalOrOperandContext logicalOrOperand() {
			return getRuleContext(LogicalOrOperandContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			logicalOrOperand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(321);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(322);
					match(T__4);
					setState(323);
					logicalOrOperand(0);
					System.out.println("Operator: ||");
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrOperandContext extends ParserRuleContext {
		public LogicalAndOperandContext logicalAndOperand() {
			return getRuleContext(LogicalAndOperandContext.class,0);
		}
		public LogicalOrOperandContext logicalOrOperand() {
			return getRuleContext(LogicalOrOperandContext.class,0);
		}
		public LogicalOrOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLogicalOrOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLogicalOrOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLogicalOrOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrOperandContext logicalOrOperand() throws RecognitionException {
		return logicalOrOperand(0);
	}

	private LogicalOrOperandContext logicalOrOperand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrOperandContext _localctx = new LogicalOrOperandContext(_ctx, _parentState);
		LogicalOrOperandContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_logicalOrOperand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332);
			logicalAndOperand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrOperandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrOperand);
					setState(334);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(335);
					match(T__5);
					setState(336);
					logicalAndOperand(0);
					System.out.println("Operator: &&");
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndOperandContext extends ParserRuleContext {
		public EqNotEqOperandContext eqNotEqOperand() {
			return getRuleContext(EqNotEqOperandContext.class,0);
		}
		public LogicalAndOperandContext logicalAndOperand() {
			return getRuleContext(LogicalAndOperandContext.class,0);
		}
		public LogicalAndOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLogicalAndOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLogicalAndOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLogicalAndOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndOperandContext logicalAndOperand() throws RecognitionException {
		return logicalAndOperand(0);
	}

	private LogicalAndOperandContext logicalAndOperand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndOperandContext _localctx = new LogicalAndOperandContext(_ctx, _parentState);
		LogicalAndOperandContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_logicalAndOperand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345);
			eqNotEqOperand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalAndOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalAndOperand);
						setState(347);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(348);
						match(T__6);
						setState(349);
						eqNotEqOperand(0);
						System.out.println("Operator: ==");
						}
						break;
					case 2:
						{
						_localctx = new LogicalAndOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalAndOperand);
						setState(352);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(353);
						match(T__7);
						setState(354);
						eqNotEqOperand(0);
						System.out.println("Operator: !=");
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqNotEqOperandContext extends ParserRuleContext {
		public RelOperandContext relOperand() {
			return getRuleContext(RelOperandContext.class,0);
		}
		public EqNotEqOperandContext eqNotEqOperand() {
			return getRuleContext(EqNotEqOperandContext.class,0);
		}
		public EqNotEqOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqNotEqOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqNotEqOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqNotEqOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqNotEqOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqNotEqOperandContext eqNotEqOperand() throws RecognitionException {
		return eqNotEqOperand(0);
	}

	private EqNotEqOperandContext eqNotEqOperand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqNotEqOperandContext _localctx = new EqNotEqOperandContext(_ctx, _parentState);
		EqNotEqOperandContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_eqNotEqOperand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(363);
			relOperand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new EqNotEqOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqNotEqOperand);
						setState(365);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(366);
						match(T__8);
						setState(367);
						relOperand(0);
						System.out.println("Operator: <");
						}
						break;
					case 2:
						{
						_localctx = new EqNotEqOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqNotEqOperand);
						setState(370);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(371);
						match(T__9);
						setState(372);
						relOperand(0);
						System.out.println("Operator: >");
						}
						break;
					case 3:
						{
						_localctx = new EqNotEqOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqNotEqOperand);
						setState(375);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(376);
						match(T__10);
						setState(377);
						relOperand(0);
						System.out.println("Operator: <=");
						}
						break;
					case 4:
						{
						_localctx = new EqNotEqOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqNotEqOperand);
						setState(380);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(381);
						match(T__11);
						setState(382);
						relOperand(0);
						System.out.println("Operator: >=");
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelOperandContext extends ParserRuleContext {
		public AddSubOperandContext addSubOperand() {
			return getRuleContext(AddSubOperandContext.class,0);
		}
		public RelOperandContext relOperand() {
			return getRuleContext(RelOperandContext.class,0);
		}
		public RelOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRelOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRelOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRelOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperandContext relOperand() throws RecognitionException {
		return relOperand(0);
	}

	private RelOperandContext relOperand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelOperandContext _localctx = new RelOperandContext(_ctx, _parentState);
		RelOperandContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_relOperand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(391);
			addSubOperand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new RelOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relOperand);
						setState(393);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(394);
						match(T__12);
						setState(395);
						addSubOperand(0);
						System.out.println("Operator: +");
						}
						break;
					case 2:
						{
						_localctx = new RelOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relOperand);
						setState(398);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(399);
						match(T__3);
						setState(400);
						addSubOperand(0);
						System.out.println("Operator: -");
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubOperandContext extends ParserRuleContext {
		public MultDivModOperandContext multDivModOperand() {
			return getRuleContext(MultDivModOperandContext.class,0);
		}
		public AddSubOperandContext addSubOperand() {
			return getRuleContext(AddSubOperandContext.class,0);
		}
		public AddSubOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAddSubOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAddSubOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAddSubOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOperandContext addSubOperand() throws RecognitionException {
		return addSubOperand(0);
	}

	private AddSubOperandContext addSubOperand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubOperandContext _localctx = new AddSubOperandContext(_ctx, _parentState);
		AddSubOperandContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_addSubOperand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			multDivModOperand();
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubOperand);
						setState(411);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(412);
						match(T__13);
						setState(413);
						multDivModOperand();
						System.out.println("Operator: *");
						}
						break;
					case 2:
						{
						_localctx = new AddSubOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubOperand);
						setState(416);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(417);
						match(T__14);
						setState(418);
						multDivModOperand();
						System.out.println("Operator: /");
						}
						break;
					case 3:
						{
						_localctx = new AddSubOperandContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubOperand);
						setState(421);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(422);
						match(T__15);
						setState(423);
						multDivModOperand();
						System.out.println("Operator: %");
						}
						break;
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultDivModOperandContext extends ParserRuleContext {
		public MultDivModOperandContext multDivModOperand() {
			return getRuleContext(MultDivModOperandContext.class,0);
		}
		public ArrayAccessOperandContext arrayAccessOperand() {
			return getRuleContext(ArrayAccessOperandContext.class,0);
		}
		public MultDivModOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivModOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMultDivModOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMultDivModOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMultDivModOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivModOperandContext multDivModOperand() throws RecognitionException {
		MultDivModOperandContext _localctx = new MultDivModOperandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multDivModOperand);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__12);
				setState(432);
				multDivModOperand();
				System.out.println("Operator: +");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(T__3);
				setState(436);
				multDivModOperand();
				System.out.println("Operator: -");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(T__16);
				setState(440);
				multDivModOperand();
				System.out.println("Operator: !");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				arrayAccessOperand();
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
	public static class ArrayAccessOperandContext extends ParserRuleContext {
		public TerminalNode VAR_FUNC_NAME() { return getToken(LogicPLParser.VAR_FUNC_NAME, 0); }
		public TerminalNode L_BRACKET() { return getToken(LogicPLParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(LogicPLParser.R_BRACKET, 0); }
		public CommonOperandContext commonOperand() {
			return getRuleContext(CommonOperandContext.class,0);
		}
		public ArrayAccessOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayAccessOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayAccessOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayAccessOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessOperandContext arrayAccessOperand() throws RecognitionException {
		ArrayAccessOperandContext _localctx = new ArrayAccessOperandContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayAccessOperand);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(VAR_FUNC_NAME);
				setState(447);
				match(L_BRACKET);
				setState(448);
				expr(0);
				setState(449);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
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
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public NegativeValueContext negativeValue() {
			return getRuleContext(NegativeValueContext.class,0);
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
		enterRule(_localctx, 66, RULE_commonOperand);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(L_PAR);
				setState(455);
				expr(0);
				setState(456);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(VAR_FUNC_NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(459);
				match(INT_VAL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(460);
				match(FLOAT_VAL);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				match(BOOLEAN_VAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				functionInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				negativeValue();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 26:
			return logicalOrOperand_sempred((LogicalOrOperandContext)_localctx, predIndex);
		case 27:
			return logicalAndOperand_sempred((LogicalAndOperandContext)_localctx, predIndex);
		case 28:
			return eqNotEqOperand_sempred((EqNotEqOperandContext)_localctx, predIndex);
		case 29:
			return relOperand_sempred((RelOperandContext)_localctx, predIndex);
		case 30:
			return addSubOperand_sempred((AddSubOperandContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalOrOperand_sempred(LogicalOrOperandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalAndOperand_sempred(LogicalAndOperandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean eqNotEqOperand_sempred(EqNotEqOperandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relOperand_sempred(RelOperandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addSubOperand_sempred(AddSubOperandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u01d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000L\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003}\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ad"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b4\b\n\u0001\n"+
		"\u0001\n\u0003\n\u00b8\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00be\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00d5\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f5\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0111\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0119\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0123\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0132\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0138\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0147\b\u0019\n\u0019\f\u0019\u014a\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0154\b\u001a\n\u001a\f\u001a\u0157\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0166\b\u001b\n\u001b\f\u001b\u0169\t\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0182\b\u001c"+
		"\n\u001c\f\u001c\u0185\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0194\b\u001d\n"+
		"\u001d\f\u001d\u0197\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01ab\b\u001e\n\u001e\f\u001e"+
		"\u01ae\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01bd\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01c5\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01d1\b!\u0001!\u0000\u0006"+
		"2468:<\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0003\u0001\u0000%(\u0001"+
		"\u0000\u0012\u0014\u0001\u0000%\'\u01ea\u0000K\u0001\u0000\u0000\u0000"+
		"\u0002M\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006|"+
		"\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0087\u0001"+
		"\u0000\u0000\u0000\f\u008b\u0001\u0000\u0000\u0000\u000e\u0091\u0001\u0000"+
		"\u0000\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u009c\u0001\u0000"+
		"\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00b9\u0001\u0000"+
		"\u0000\u0000\u0018\u00c1\u0001\u0000\u0000\u0000\u001a\u00c7\u0001\u0000"+
		"\u0000\u0000\u001c\u00cf\u0001\u0000\u0000\u0000\u001e\u00d1\u0001\u0000"+
		"\u0000\u0000 \u00d8\u0001\u0000\u0000\u0000\"\u00db\u0001\u0000\u0000"+
		"\u0000$\u00f4\u0001\u0000\u0000\u0000&\u0110\u0001\u0000\u0000\u0000("+
		"\u0118\u0001\u0000\u0000\u0000*\u0122\u0001\u0000\u0000\u0000,\u0131\u0001"+
		"\u0000\u0000\u0000.\u0137\u0001\u0000\u0000\u00000\u0139\u0001\u0000\u0000"+
		"\u00002\u013e\u0001\u0000\u0000\u00004\u014b\u0001\u0000\u0000\u00006"+
		"\u0158\u0001\u0000\u0000\u00008\u016a\u0001\u0000\u0000\u0000:\u0186\u0001"+
		"\u0000\u0000\u0000<\u0198\u0001\u0000\u0000\u0000>\u01bc\u0001\u0000\u0000"+
		"\u0000@\u01c4\u0001\u0000\u0000\u0000B\u01d0\u0001\u0000\u0000\u0000D"+
		"E\u0006\u0000\uffff\uffff\u0000EF\u0003\u0002\u0001\u0000FG\u0005\u0000"+
		"\u0000\u0001GL\u0001\u0000\u0000\u0000HI\u0003&\u0013\u0000IJ\u0003\u0000"+
		"\u0000\u0000JL\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000L\u0001\u0001\u0000\u0000\u0000MN\u0005\u0018\u0000"+
		"\u0000NO\u0005\u001f\u0000\u0000OP\u0003\u0004\u0002\u0000PQ\u0005 \u0000"+
		"\u0000Q\u0003\u0001\u0000\u0000\u0000RW\u0003\u0006\u0003\u0000ST\u0003"+
		"\u0006\u0003\u0000TU\u0003\u0004\u0002\u0000UW\u0001\u0000\u0000\u0000"+
		"VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000W\u0005\u0001\u0000"+
		"\u0000\u0000XY\u0006\u0003\uffff\uffff\u0000YZ\u0003\f\u0006\u0000Z[\u0005"+
		"$\u0000\u0000[}\u0001\u0000\u0000\u0000\\]\u0006\u0003\uffff\uffff\u0000"+
		"]^\u0003\u000e\u0007\u0000^_\u0005$\u0000\u0000_}\u0001\u0000\u0000\u0000"+
		"`a\u0006\u0003\uffff\uffff\u0000ab\u0003\u0010\b\u0000bc\u0005$\u0000"+
		"\u0000c}\u0001\u0000\u0000\u0000de\u0006\u0003\uffff\uffff\u0000ef\u0003"+
		"\u0012\t\u0000fg\u0005$\u0000\u0000g}\u0001\u0000\u0000\u0000hi\u0006"+
		"\u0003\uffff\uffff\u0000ij\u0003\u0016\u000b\u0000jk\u0005$\u0000\u0000"+
		"k}\u0001\u0000\u0000\u0000lm\u0003\u0018\f\u0000mn\u0005$\u0000\u0000"+
		"n}\u0001\u0000\u0000\u0000op\u0006\u0003\uffff\uffff\u0000p}\u0003\u001a"+
		"\r\u0000q}\u0003$\u0012\u0000rs\u0003\b\u0004\u0000st\u0005$\u0000\u0000"+
		"t}\u0001\u0000\u0000\u0000uv\u0003\n\u0005\u0000vw\u0005$\u0000\u0000"+
		"w}\u0001\u0000\u0000\u0000xy\u0006\u0003\uffff\uffff\u0000yz\u0003*\u0015"+
		"\u0000z{\u0005$\u0000\u0000{}\u0001\u0000\u0000\u0000|X\u0001\u0000\u0000"+
		"\u0000|\\\u0001\u0000\u0000\u0000|`\u0001\u0000\u0000\u0000|d\u0001\u0000"+
		"\u0000\u0000|h\u0001\u0000\u0000\u0000|l\u0001\u0000\u0000\u0000|o\u0001"+
		"\u0000\u0000\u0000|q\u0001\u0000\u0000\u0000|r\u0001\u0000\u0000\u0000"+
		"|u\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000}\u0007\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005(\u0000\u0000\u007f\u0080\u0005\u001c\u0000\u0000"+
		"\u0080\u0086\u00032\u0019\u0000\u0081\u0082\u00030\u0018\u0000\u0082\u0083"+
		"\u0005\u001c\u0000\u0000\u0083\u0084\u00032\u0019\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000"+
		"\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001b\u0000"+
		"\u0000\u0088\u0089\u0006\u0005\uffff\uffff\u0000\u0089\u008a\u0007\u0000"+
		"\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0001"+
		"\u0000\u0000\u008c\u008d\u0005(\u0000\u0000\u008d\u008e\u0006\u0006\uffff"+
		"\uffff\u0000\u008e\u008f\u0005\u001c\u0000\u0000\u008f\u0090\u00032\u0019"+
		"\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000"+
		"\u0092\u0093\u0005(\u0000\u0000\u0093\u0094\u0006\u0007\uffff\uffff\u0000"+
		"\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0001\u0000\u0000"+
		"\u0096\u0097\u0005\u001d\u0000\u0000\u0097\u0098\u0005%\u0000\u0000\u0098"+
		"\u0099\u0005\u001e\u0000\u0000\u0099\u009a\u0005(\u0000\u0000\u009a\u009b"+
		"\u0006\b\uffff\uffff\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0007\u0001\u0000\u0000\u009d\u009e\u0005\u001d\u0000\u0000\u009e\u009f"+
		"\u0005%\u0000\u0000\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u00a1\u0005"+
		"(\u0000\u0000\u00a1\u00a2\u0006\t\uffff\uffff\u0000\u00a2\u00a3\u0005"+
		"\u001c\u0000\u0000\u00a3\u00a4\u0005\u001d\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0014\n\u0000\u00a5\u00a6\u0005\u001e\u0000\u0000\u00a6\u0013\u0001\u0000"+
		"\u0000\u0000\u00a7\u00ad\u0005%\u0000\u0000\u00a8\u00ad\u0005&\u0000\u0000"+
		"\u00a9\u00ad\u0005\'\u0000\u0000\u00aa\u00ad\u0005(\u0000\u0000\u00ab"+
		"\u00ad\u0003.\u0017\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b4\u0005%\u0000\u0000\u00af\u00b4\u0005"+
		"&\u0000\u0000\u00b0\u00b4\u0005\'\u0000\u0000\u00b1\u00b4\u0005(\u0000"+
		"\u0000\u00b2\u00b4\u0003.\u0017\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005#\u0000\u0000\u00b6"+
		"\u00b8\u0003\u0014\n\u0000\u00b7\u00ac\u0001\u0000\u0000\u0000\u00b7\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b8\u0015\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0019\u0000\u0000\u00ba\u00bd\u0005!\u0000\u0000\u00bb\u00be\u0005"+
		"(\u0000\u0000\u00bc\u00be\u0003\u001e\u000f\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\"\u0000\u0000\u00c0\u0017\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005)\u0000\u0000\u00c2\u00c3\u0006\f\uffff\uffff"+
		"\u0000\u00c3\u00c4\u0005!\u0000\u0000\u00c4\u00c5\u0005(\u0000\u0000\u00c5"+
		"\u00c6\u0005\"\u0000\u0000\u00c6\u0019\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005!\u0000\u0000\u00c8\u00c9\u00032\u0019\u0000\u00c9\u00ca\u0005\""+
		"\u0000\u0000\u00ca\u00cb\u0005\u0001\u0000\u0000\u00cb\u00cc\u0005!\u0000"+
		"\u0000\u00cc\u00cd\u0003\u001c\u000e\u0000\u00cd\u00ce\u0005\"\u0000\u0000"+
		"\u00ce\u001b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u0004\u0002\u0000"+
		"\u00d0\u001d\u0001\u0000\u0000\u0000\u00d1\u00d4\u0005\u001d\u0000\u0000"+
		"\u00d2\u00d5\u0003 \u0010\u0000\u00d3\u00d5\u0003\"\u0011\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001e\u0000\u0000\u00d7"+
		"\u001f\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0002\u0000\u0000\u00d9"+
		"\u00da\u0003\u0018\f\u0000\u00da!\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005)\u0000\u0000\u00dc\u00dd\u0005!\u0000\u0000\u00dd\u00de\u0005\u0002"+
		"\u0000\u0000\u00de\u00df\u0005\"\u0000\u0000\u00df#\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\u001a\u0000\u0000\u00e1\u00e2\u0006\u0012\uffff"+
		"\uffff\u0000\u00e2\u00e3\u0005!\u0000\u0000\u00e3\u00e4\u0005(\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0003\u0000\u0000\u00e5\u00e6\u0005(\u0000\u0000\u00e6"+
		"\u00e7\u0005\"\u0000\u0000\u00e7\u00e8\u0005\u001f\u0000\u0000\u00e8\u00f5"+
		"\u0005 \u0000\u0000\u00e9\u00ea\u0005\u001a\u0000\u0000\u00ea\u00eb\u0006"+
		"\u0012\uffff\uffff\u0000\u00eb\u00ec\u0005!\u0000\u0000\u00ec\u00ed\u0005"+
		"(\u0000\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef\u0005(\u0000"+
		"\u0000\u00ef\u00f0\u0005\"\u0000\u0000\u00f0\u00f1\u0005\u001f\u0000\u0000"+
		"\u00f1\u00f2\u0003\u0004\u0002\u0000\u00f2\u00f3\u0005 \u0000\u0000\u00f3"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f4\u00e0\u0001\u0000\u0000\u0000\u00f4"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f5%\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0017\u0000\u0000\u00f7\u00f8\u0006\u0013\uffff\uffff\u0000\u00f8"+
		"\u00f9\u0005(\u0000\u0000\u00f9\u00fa\u0006\u0013\uffff\uffff\u0000\u00fa"+
		"\u00fb\u0005!\u0000\u0000\u00fb\u00fc\u0006\u0013\uffff\uffff\u0000\u00fc"+
		"\u00fd\u0003(\u0014\u0000\u00fd\u00fe\u0005\"\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0003\u0000\u0000\u00ff\u0100\u0007\u0001\u0000\u0000\u0100\u0101"+
		"\u0005\u001f\u0000\u0000\u0101\u0102\u0003\u0004\u0002\u0000\u0102\u0103"+
		"\u0005 \u0000\u0000\u0103\u0111\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0017\u0000\u0000\u0105\u0106\u0006\u0013\uffff\uffff\u0000\u0106\u0107"+
		"\u0005(\u0000\u0000\u0107\u0108\u0006\u0013\uffff\uffff\u0000\u0108\u0109"+
		"\u0005!\u0000\u0000\u0109\u010a\u0005\"\u0000\u0000\u010a\u010b\u0005"+
		"\u0003\u0000\u0000\u010b\u010c\u0007\u0001\u0000\u0000\u010c\u010d\u0005"+
		"\u001f\u0000\u0000\u010d\u010e\u0003\u0004\u0002\u0000\u010e\u010f\u0005"+
		" \u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u00f6\u0001\u0000"+
		"\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0111\'\u0001\u0000\u0000"+
		"\u0000\u0112\u0119\u0003\u000e\u0007\u0000\u0113\u0114\u0003\u000e\u0007"+
		"\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0116\u0006\u0014\uffff\uffff"+
		"\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\u0119\u0001\u0000\u0000\u0000"+
		"\u0118\u0112\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000"+
		"\u0119)\u0001\u0000\u0000\u0000\u011a\u011b\u0005(\u0000\u0000\u011b\u011c"+
		"\u0005!\u0000\u0000\u011c\u0123\u0005\"\u0000\u0000\u011d\u011e\u0005"+
		"(\u0000\u0000\u011e\u011f\u0005!\u0000\u0000\u011f\u0120\u0003,\u0016"+
		"\u0000\u0120\u0121\u0005\"\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000"+
		"\u0122\u011a\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000"+
		"\u0123+\u0001\u0000\u0000\u0000\u0124\u0132\u0005(\u0000\u0000\u0125\u0126"+
		"\u0005(\u0000\u0000\u0126\u0127\u0005#\u0000\u0000\u0127\u0132\u0003,"+
		"\u0016\u0000\u0128\u0132\u0007\u0002\u0000\u0000\u0129\u012a\u0007\u0002"+
		"\u0000\u0000\u012a\u012b\u0005#\u0000\u0000\u012b\u0132\u0003,\u0016\u0000"+
		"\u012c\u0132\u00032\u0019\u0000\u012d\u012e\u00032\u0019\u0000\u012e\u012f"+
		"\u0005#\u0000\u0000\u012f\u0130\u0003,\u0016\u0000\u0130\u0132\u0001\u0000"+
		"\u0000\u0000\u0131\u0124\u0001\u0000\u0000\u0000\u0131\u0125\u0001\u0000"+
		"\u0000\u0000\u0131\u0128\u0001\u0000\u0000\u0000\u0131\u0129\u0001\u0000"+
		"\u0000\u0000\u0131\u012c\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000"+
		"\u0000\u0000\u0132-\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0004\u0000"+
		"\u0000\u0134\u0138\u0003.\u0017\u0000\u0135\u0138\u0005%\u0000\u0000\u0136"+
		"\u0138\u0005&\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138/\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0005(\u0000\u0000\u013a\u013b\u0005\u001d"+
		"\u0000\u0000\u013b\u013c\u00032\u0019\u0000\u013c\u013d\u0005\u001e\u0000"+
		"\u0000\u013d1\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u0019\uffff\uffff"+
		"\u0000\u013f\u0140\u00034\u001a\u0000\u0140\u0148\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\n\u0002\u0000\u0000\u0142\u0143\u0005\u0005\u0000\u0000\u0143"+
		"\u0144\u00034\u001a\u0000\u0144\u0145\u0006\u0019\uffff\uffff\u0000\u0145"+
		"\u0147\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u01493\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0006\u001a\uffff\uffff\u0000\u014c"+
		"\u014d\u00036\u001b\u0000\u014d\u0155\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\n\u0002\u0000\u0000\u014f\u0150\u0005\u0006\u0000\u0000\u0150\u0151\u0003"+
		"6\u001b\u0000\u0151\u0152\u0006\u001a\uffff\uffff\u0000\u0152\u0154\u0001"+
		"\u0000\u0000\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0154\u0157\u0001"+
		"\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001"+
		"\u0000\u0000\u0000\u01565\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0006\u001b\uffff\uffff\u0000\u0159\u015a\u0003"+
		"8\u001c\u0000\u015a\u0167\u0001\u0000\u0000\u0000\u015b\u015c\n\u0003"+
		"\u0000\u0000\u015c\u015d\u0005\u0007\u0000\u0000\u015d\u015e\u00038\u001c"+
		"\u0000\u015e\u015f\u0006\u001b\uffff\uffff\u0000\u015f\u0166\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\n\u0002\u0000\u0000\u0161\u0162\u0005\b\u0000"+
		"\u0000\u0162\u0163\u00038\u001c\u0000\u0163\u0164\u0006\u001b\uffff\uffff"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u015b\u0001\u0000\u0000"+
		"\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u01687\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0006\u001c\uffff\uffff\u0000\u016b\u016c\u0003:\u001d\u0000"+
		"\u016c\u0183\u0001\u0000\u0000\u0000\u016d\u016e\n\u0005\u0000\u0000\u016e"+
		"\u016f\u0005\t\u0000\u0000\u016f\u0170\u0003:\u001d\u0000\u0170\u0171"+
		"\u0006\u001c\uffff\uffff\u0000\u0171\u0182\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\n\u0004\u0000\u0000\u0173\u0174\u0005\n\u0000\u0000\u0174\u0175"+
		"\u0003:\u001d\u0000\u0175\u0176\u0006\u001c\uffff\uffff\u0000\u0176\u0182"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\n\u0003\u0000\u0000\u0178\u0179\u0005"+
		"\u000b\u0000\u0000\u0179\u017a\u0003:\u001d\u0000\u017a\u017b\u0006\u001c"+
		"\uffff\uffff\u0000\u017b\u0182\u0001\u0000\u0000\u0000\u017c\u017d\n\u0002"+
		"\u0000\u0000\u017d\u017e\u0005\f\u0000\u0000\u017e\u017f\u0003:\u001d"+
		"\u0000\u017f\u0180\u0006\u001c\uffff\uffff\u0000\u0180\u0182\u0001\u0000"+
		"\u0000\u0000\u0181\u016d\u0001\u0000\u0000\u0000\u0181\u0172\u0001\u0000"+
		"\u0000\u0000\u0181\u0177\u0001\u0000\u0000\u0000\u0181\u017c\u0001\u0000"+
		"\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u01849\u0001\u0000\u0000"+
		"\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0006\u001d\uffff"+
		"\uffff\u0000\u0187\u0188\u0003<\u001e\u0000\u0188\u0195\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\n\u0003\u0000\u0000\u018a\u018b\u0005\r\u0000\u0000"+
		"\u018b\u018c\u0003<\u001e\u0000\u018c\u018d\u0006\u001d\uffff\uffff\u0000"+
		"\u018d\u0194\u0001\u0000\u0000\u0000\u018e\u018f\n\u0002\u0000\u0000\u018f"+
		"\u0190\u0005\u0004\u0000\u0000\u0190\u0191\u0003<\u001e\u0000\u0191\u0192"+
		"\u0006\u001d\uffff\uffff\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193"+
		"\u0189\u0001\u0000\u0000\u0000\u0193\u018e\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196;\u0001\u0000\u0000\u0000\u0197\u0195"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0006\u001e\uffff\uffff\u0000\u0199"+
		"\u019a\u0003>\u001f\u0000\u019a\u01ac\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\n\u0004\u0000\u0000\u019c\u019d\u0005\u000e\u0000\u0000\u019d\u019e\u0003"+
		">\u001f\u0000\u019e\u019f\u0006\u001e\uffff\uffff\u0000\u019f\u01ab\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\n\u0003\u0000\u0000\u01a1\u01a2\u0005\u000f"+
		"\u0000\u0000\u01a2\u01a3\u0003>\u001f\u0000\u01a3\u01a4\u0006\u001e\uffff"+
		"\uffff\u0000\u01a4\u01ab\u0001\u0000\u0000\u0000\u01a5\u01a6\n\u0002\u0000"+
		"\u0000\u01a6\u01a7\u0005\u0010\u0000\u0000\u01a7\u01a8\u0003>\u001f\u0000"+
		"\u01a8\u01a9\u0006\u001e\uffff\uffff\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u019b\u0001\u0000\u0000\u0000\u01aa\u01a0\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad=\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0005\r\u0000\u0000\u01b0\u01b1\u0003>\u001f\u0000\u01b1"+
		"\u01b2\u0006\u001f\uffff\uffff\u0000\u01b2\u01bd\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0005\u0004\u0000\u0000\u01b4\u01b5\u0003>\u001f\u0000\u01b5"+
		"\u01b6\u0006\u001f\uffff\uffff\u0000\u01b6\u01bd\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0005\u0011\u0000\u0000\u01b8\u01b9\u0003>\u001f\u0000\u01b9"+
		"\u01ba\u0006\u001f\uffff\uffff\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bd\u0003@ \u0000\u01bc\u01af\u0001\u0000\u0000\u0000\u01bc\u01b3"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd?\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"(\u0000\u0000\u01bf\u01c0\u0005\u001d\u0000\u0000\u01c0\u01c1\u00032\u0019"+
		"\u0000\u01c1\u01c2\u0005\u001e\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0003B!\u0000\u01c4\u01be\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5A\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0005!\u0000\u0000\u01c7\u01c8\u00032\u0019\u0000\u01c8\u01c9\u0005\""+
		"\u0000\u0000\u01c9\u01d1\u0001\u0000\u0000\u0000\u01ca\u01d1\u0005(\u0000"+
		"\u0000\u01cb\u01d1\u0005%\u0000\u0000\u01cc\u01d1\u0005&\u0000\u0000\u01cd"+
		"\u01d1\u0005\'\u0000\u0000\u01ce\u01d1\u0003*\u0015\u0000\u01cf\u01d1"+
		"\u0003.\u0017\u0000\u01d0\u01c6\u0001\u0000\u0000\u0000\u01d0\u01ca\u0001"+
		"\u0000\u0000\u0000\u01d0\u01cb\u0001\u0000\u0000\u0000\u01d0\u01cc\u0001"+
		"\u0000\u0000\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1C\u0001\u0000"+
		"\u0000\u0000\u001cKV|\u0085\u00ac\u00b3\u00b7\u00bd\u00d4\u00f4\u0110"+
		"\u0118\u0122\u0131\u0137\u0148\u0155\u0165\u0167\u0181\u0183\u0193\u0195"+
		"\u01aa\u01ac\u01bc\u01c4\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}