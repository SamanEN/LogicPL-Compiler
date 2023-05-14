// Generated from D:/Uni/Semester6/PLC/CA/LogicPL-Compiler/phase2/LogicPL-Phase2/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;

    import ast.node.*;
    import ast.node.expression.*;
    import ast.node.statement.*;
    import ast.node.declaration.*;
    import ast.node.expression.values.*;
    import ast.node.expression.operators.*;
    import ast.type.primitiveType.*;
    import ast.type.*;

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
		FUNCTION=1, BOOLEAN=2, INT=3, FLOAT=4, MAIN=5, PRINT=6, RETURN=7, FOR=8, 
		TRUE=9, FALSE=10, LPAR=11, RPAR=12, COLON=13, COMMA=14, LBRACE=15, RBRACE=16, 
		SEMICOLON=17, ASSIGN=18, LBRACKET=19, RBRACKET=20, QUARYMARK=21, ARROW=22, 
		OR=23, AND=24, EQ=25, GT=26, LT=27, GTE=28, LTE=29, PLUS=30, MINUS=31, 
		MULT=32, DIV=33, MOD=34, NEQ=35, NOT=36, WS=37, COMMENT=38, IDENTIFIER=39, 
		PREDICATE_IDENTIFIER=40, INT_NUMBER=41, FLOAT_NUMBER=42;
	public static final int
		RULE_program = 0, RULE_functionDec = 1, RULE_functionVarDec = 2, RULE_mainBlock = 3, 
		RULE_statement = 4, RULE_assignSmt = 5, RULE_variable = 6, RULE_localVarDeclaration = 7, 
		RULE_varDeclaration = 8, RULE_arrayDeclaration = 9, RULE_arrayInitialValue = 10, 
		RULE_arrayList = 11, RULE_printSmt = 12, RULE_printExpr = 13, RULE_query = 14, 
		RULE_queryType1 = 15, RULE_queryType2 = 16, RULE_returnSmt = 17, RULE_forLoop = 18, 
		RULE_predicate = 19, RULE_implication = 20, RULE_expression = 21, RULE_expression2 = 22, 
		RULE_andExpr = 23, RULE_andExpr2 = 24, RULE_eqExpr = 25, RULE_eqExpr2 = 26, 
		RULE_compExpr = 27, RULE_compExpr2 = 28, RULE_additive = 29, RULE_additive2 = 30, 
		RULE_multicative = 31, RULE_multicative2 = 32, RULE_unary = 33, RULE_other = 34, 
		RULE_functionCall = 35, RULE_value = 36, RULE_numericValue = 37, RULE_identifier = 38, 
		RULE_predicateIdentifier = 39, RULE_type = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDec", "functionVarDec", "mainBlock", "statement", 
			"assignSmt", "variable", "localVarDeclaration", "varDeclaration", "arrayDeclaration", 
			"arrayInitialValue", "arrayList", "printSmt", "printExpr", "query", "queryType1", 
			"queryType2", "returnSmt", "forLoop", "predicate", "implication", "expression", 
			"expression2", "andExpr", "andExpr2", "eqExpr", "eqExpr2", "compExpr", 
			"compExpr2", "additive", "additive2", "multicative", "multicative2", 
			"unary", "other", "functionCall", "value", "numericValue", "identifier", 
			"predicateIdentifier", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'boolean'", "'int'", "'float'", "'main'", "'print'", 
			"'return'", "'for'", "'true'", "'false'", "'('", "')'", "':'", "','", 
			"'{'", "'}'", "';'", "'='", "'['", "']'", "'?'", "'=>'", "'||'", "'&&'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BOOLEAN", "INT", "FLOAT", "MAIN", "PRINT", "RETURN", 
			"FOR", "TRUE", "FALSE", "LPAR", "RPAR", "COLON", "COMMA", "LBRACE", "RBRACE", 
			"SEMICOLON", "ASSIGN", "LBRACKET", "RBRACKET", "QUARYMARK", "ARROW", 
			"OR", "AND", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NEQ", "NOT", "WS", "COMMENT", "IDENTIFIER", "PREDICATE_IDENTIFIER", 
			"INT_NUMBER", "FLOAT_NUMBER"
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
	public static class ProgramContext extends ParserRuleContext {
		public Program p;
		public FunctionDecContext f;
		public MainBlockContext main;
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public List<FunctionDecContext> functionDec() {
			return getRuleContexts(FunctionDecContext.class);
		}
		public FunctionDecContext functionDec(int i) {
			return getRuleContext(FunctionDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).p =  new Program(); _localctx.p.setLine(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(83);
				((ProgramContext)_localctx).f = functionDec();
				_localctx.p.addFunc(((ProgramContext)_localctx).f.functionDeclaration);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			((ProgramContext)_localctx).main = mainBlock();
			_localctx.p.setMain(((ProgramContext)_localctx).main.main) ;
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
	public static class FunctionDecContext extends ParserRuleContext {
		public FuncDeclaration functionDeclaration;
		public IdentifierContext name;
		public FunctionVarDecContext arg1;
		public FunctionVarDecContext arg;
		public TypeContext returnType;
		public StatementContext stmt;
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionVarDecContext> functionVarDec() {
			return getRuleContexts(FunctionVarDecContext.class);
		}
		public FunctionVarDecContext functionVarDec(int i) {
			return getRuleContext(FunctionVarDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDecContext functionDec() throws RecognitionException {
		FunctionDecContext _localctx = new FunctionDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ArrayList<ArgDeclaration> args = new ArrayList<>();
			        ArrayList<Statement> statements = new ArrayList<>();
			    
			setState(95);
			match(FUNCTION);
			setState(96);
			((FunctionDecContext)_localctx).name = identifier();
			setState(97);
			match(LPAR);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				setState(98);
				((FunctionDecContext)_localctx).arg1 = functionVarDec();
				args.add(((FunctionDecContext)_localctx).arg1.argDeclaration);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					((FunctionDecContext)_localctx).arg = functionVarDec();
					args.add(((FunctionDecContext)_localctx).arg.argDeclaration);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(111);
			match(RPAR);
			setState(112);
			match(COLON);
			setState(113);
			((FunctionDecContext)_localctx).returnType = type();
			setState(114);
			match(LBRACE);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				((FunctionDecContext)_localctx).stmt = statement();
				statements.add(((FunctionDecContext)_localctx).stmt.statementRet);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			}
			setState(122);
			match(RBRACE);

			        ((FunctionDecContext)_localctx).functionDeclaration =  new FuncDeclaration(((FunctionDecContext)_localctx).name.identifierRet, ((FunctionDecContext)_localctx).returnType.typeRet, args, statements);
			        _localctx.functionDeclaration.setLine(((FunctionDecContext)_localctx).name.identifierRet.getLine());
			    
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
	public static class FunctionVarDecContext extends ParserRuleContext {
		public ArgDeclaration argDeclaration;
		public TypeContext t;
		public IdentifierContext arg_iden;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVarDecContext functionVarDec() throws RecognitionException {
		FunctionVarDecContext _localctx = new FunctionVarDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionVarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((FunctionVarDecContext)_localctx).t = type();
			setState(126);
			((FunctionVarDecContext)_localctx).arg_iden = identifier();

			        ((FunctionVarDecContext)_localctx).argDeclaration =  new ArgDeclaration(((FunctionVarDecContext)_localctx).arg_iden.identifierRet, ((FunctionVarDecContext)_localctx).t.typeRet);
			        _localctx.argDeclaration.setLine(((FunctionVarDecContext)_localctx).arg_iden.identifierRet.getLine());
			    
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
	public static class MainBlockContext extends ParserRuleContext {
		public MainDeclaration main;
		public Token m;
		public StatementContext s;
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TerminalNode MAIN() { return getToken(LogicPLParser.MAIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> mainStmts = new ArrayList<>();
			setState(130);
			((MainBlockContext)_localctx).m = match(MAIN);
			setState(131);
			match(LBRACE);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				((MainBlockContext)_localctx).s = statement();
				mainStmts.add(((MainBlockContext)_localctx).s.statementRet);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			setState(139);
			match(RBRACE);

			        ((MainBlockContext)_localctx).main =  new MainDeclaration(mainStmts);
			        _localctx.main.setLine(((MainBlockContext)_localctx).m.getLine());
			    
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
		public Statement statementRet;
		public AssignSmtContext s1;
		public PredicateContext s2;
		public ImplicationContext s3;
		public ReturnSmtContext s4;
		public PrintSmtContext s5;
		public ForLoopContext s6;
		public LocalVarDeclarationContext s7;
		public AssignSmtContext assignSmt() {
			return getRuleContext(AssignSmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public ReturnSmtContext returnSmt() {
			return getRuleContext(ReturnSmtContext.class,0);
		}
		public PrintSmtContext printSmt() {
			return getRuleContext(PrintSmtContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LocalVarDeclarationContext localVarDeclaration() {
			return getRuleContext(LocalVarDeclarationContext.class,0);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((StatementContext)_localctx).s1 = assignSmt();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s1.assignSmtRet;
				}
				break;
			case PREDICATE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				((StatementContext)_localctx).s2 = predicate();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s2.predicateRet;
				setState(147);
				match(SEMICOLON);
				}
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				((StatementContext)_localctx).s3 = implication();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s3.implicationRet;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				((StatementContext)_localctx).s4 = returnSmt();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s4.returnSmtRet;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				((StatementContext)_localctx).s5 = printSmt();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s5.printSmtRet;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				((StatementContext)_localctx).s6 = forLoop();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s6.forLoopRet;
				}
				break;
			case BOOLEAN:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				((StatementContext)_localctx).s7 = localVarDeclaration();
				((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).s7.localVarDeclarationRet;
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
	public static class AssignSmtContext extends ParserRuleContext {
		public AssignStmt assignSmtRet;
		public VariableContext lvalue;
		public Token line;
		public ExpressionContext rvalue;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAssignSmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAssignSmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAssignSmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignSmtContext assignSmt() throws RecognitionException {
		AssignSmtContext _localctx = new AssignSmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((AssignSmtContext)_localctx).lvalue = variable();
			setState(167);
			((AssignSmtContext)_localctx).line = match(ASSIGN);
			setState(168);
			((AssignSmtContext)_localctx).rvalue = expression();
			setState(169);
			match(SEMICOLON);

			        ((AssignSmtContext)_localctx).assignSmtRet =  new AssignStmt(((AssignSmtContext)_localctx).lvalue.variableRet , ((AssignSmtContext)_localctx).rvalue.expressionRet);
			        _localctx.assignSmtRet.setLine(((AssignSmtContext)_localctx).line.getLine());
			    
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
	public static class VariableContext extends ParserRuleContext {
		public Variable variableRet;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public ExpressionContext e;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((VariableContext)_localctx).i1 = identifier();

				        ((VariableContext)_localctx).variableRet =  ((VariableContext)_localctx).i1.identifierRet;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((VariableContext)_localctx).i2 = identifier();
				setState(176);
				match(LBRACKET);
				setState(177);
				((VariableContext)_localctx).e = expression();
				setState(178);
				match(RBRACKET);

				        ((VariableContext)_localctx).variableRet =  new ArrayAccess(((VariableContext)_localctx).i2.identifierRet.getName(), ((VariableContext)_localctx).e.expressionRet);
				        _localctx.variableRet.setLine(((VariableContext)_localctx).i2.identifierRet.getLine());
				    
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
	public static class LocalVarDeclarationContext extends ParserRuleContext {
		public Statement localVarDeclarationRet;
		public VarDeclarationContext v;
		public ArrayDeclarationContext a;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public LocalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLocalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLocalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLocalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclarationContext localVarDeclaration() throws RecognitionException {
		LocalVarDeclarationContext _localctx = new LocalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVarDeclaration);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((LocalVarDeclarationContext)_localctx).v = varDeclaration();
				((LocalVarDeclarationContext)_localctx).localVarDeclarationRet =  ((LocalVarDeclarationContext)_localctx).v.varDeclarationRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((LocalVarDeclarationContext)_localctx).a = arrayDeclaration();
				((LocalVarDeclarationContext)_localctx).localVarDeclarationRet =  ((LocalVarDeclarationContext)_localctx).a.arrayDeclarationRet;
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDecStmt varDeclarationRet;
		public TypeContext t;
		public IdentifierContext i;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((VarDeclarationContext)_localctx).t = type();
			setState(192);
			((VarDeclarationContext)_localctx).i = identifier();

			        ((VarDeclarationContext)_localctx).varDeclarationRet =  new VarDecStmt(((VarDeclarationContext)_localctx).i.identifierRet, ((VarDeclarationContext)_localctx).t.typeRet);
			        _localctx.varDeclarationRet.setLine(((VarDeclarationContext)_localctx).i.identifierRet.getLine());
			    
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(194);
				match(ASSIGN);
				setState(195);
				((VarDeclarationContext)_localctx).e = expression();
				_localctx.varDeclarationRet.setInitialExpression(((VarDeclarationContext)_localctx).e.expressionRet);
				}
			}

			setState(200);
			match(SEMICOLON);
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDecStmt arrayDeclarationRet;
		public TypeContext t;
		public Token INT_NUMBER;
		public IdentifierContext i;
		public ArrayInitialValueContext a;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode INT_NUMBER() { return getToken(LogicPLParser.INT_NUMBER, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayInitialValueContext arrayInitialValue() {
			return getRuleContext(ArrayInitialValueContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ArrayDeclarationContext)_localctx).t = type();
			setState(203);
			match(LBRACKET);
			setState(204);
			((ArrayDeclarationContext)_localctx).INT_NUMBER = match(INT_NUMBER);
			setState(205);
			match(RBRACKET);
			setState(206);
			((ArrayDeclarationContext)_localctx).i = identifier();

			        ((ArrayDeclarationContext)_localctx).arrayDeclarationRet =  new ArrayDecStmt(((ArrayDeclarationContext)_localctx).i.identifierRet, ((ArrayDeclarationContext)_localctx).t.typeRet, (((ArrayDeclarationContext)_localctx).INT_NUMBER!=null?Integer.valueOf(((ArrayDeclarationContext)_localctx).INT_NUMBER.getText()):0));
			        _localctx.arrayDeclarationRet.setLine(((ArrayDeclarationContext)_localctx).i.identifierRet.getLine());
			    
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(208);
				((ArrayDeclarationContext)_localctx).a = arrayInitialValue();
				_localctx.arrayDeclarationRet.setInitialValues(((ArrayDeclarationContext)_localctx).a.arrayInitialValueRet);
				}
			}

			setState(213);
			match(SEMICOLON);
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
	public static class ArrayInitialValueContext extends ParserRuleContext {
		public ArrayList<Expression> arrayInitialValueRet;
		public ArrayListContext a;
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public ArrayInitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitialValueContext arrayInitialValue() throws RecognitionException {
		ArrayInitialValueContext _localctx = new ArrayInitialValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayInitialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ASSIGN);
			setState(216);
			((ArrayInitialValueContext)_localctx).a = arrayList();
			((ArrayInitialValueContext)_localctx).arrayInitialValueRet =  ((ArrayInitialValueContext)_localctx).a.arrayListRet;
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
	public static class ArrayListContext extends ParserRuleContext {
		public ArrayList<Expression> arrayListRet;
		public ValueContext v1;
		public IdentifierContext i1;
		public ValueContext v2;
		public IdentifierContext i2;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayListContext)_localctx).arrayListRet =  new ArrayList<>();
			setState(220);
			match(LBRACKET);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case MINUS:
			case INT_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(221);
				((ArrayListContext)_localctx).v1 = value();
				_localctx.arrayListRet.add(((ArrayListContext)_localctx).v1.valueRet);
				}
				break;
			case IDENTIFIER:
				{
				setState(224);
				((ArrayListContext)_localctx).i1 = identifier();
				_localctx.arrayListRet.add(((ArrayListContext)_localctx).i1.identifierRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case MINUS:
				case INT_NUMBER:
				case FLOAT_NUMBER:
					{
					setState(230);
					((ArrayListContext)_localctx).v2 = value();
					_localctx.arrayListRet.add(((ArrayListContext)_localctx).v2.valueRet);
					}
					break;
				case IDENTIFIER:
					{
					setState(233);
					((ArrayListContext)_localctx).i2 = identifier();
					_localctx.arrayListRet.add(((ArrayListContext)_localctx).i2.identifierRet);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(RBRACKET);
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
	public static class PrintSmtContext extends ParserRuleContext {
		public PrintStmt printSmtRet;
		public Token PRINT;
		public PrintExprContext p;
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public PrintSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrintSmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrintSmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrintSmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSmtContext printSmt() throws RecognitionException {
		PrintSmtContext _localctx = new PrintSmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((PrintSmtContext)_localctx).PRINT = match(PRINT);
			setState(246);
			match(LPAR);
			setState(247);
			((PrintSmtContext)_localctx).p = printExpr();
			setState(248);
			match(RPAR);
			setState(249);
			match(SEMICOLON);

			        ((PrintSmtContext)_localctx).printSmtRet =  new PrintStmt(((PrintSmtContext)_localctx).p.printExprRet);
			        _localctx.printSmtRet.setLine(((PrintSmtContext)_localctx).PRINT.getLine());
			    
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
	public static class PrintExprContext extends ParserRuleContext {
		public Expression printExprRet;
		public VariableContext v;
		public QueryContext q;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printExpr);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				((PrintExprContext)_localctx).v = variable();
				((PrintExprContext)_localctx).printExprRet =  ((PrintExprContext)_localctx).v.variableRet;
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((PrintExprContext)_localctx).q = query();
				((PrintExprContext)_localctx).printExprRet =  ((PrintExprContext)_localctx).q.queryRet;
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
	public static class QueryContext extends ParserRuleContext {
		public QueryExpression queryRet;
		public QueryType1Context q1;
		public QueryType2Context q2;
		public QueryType1Context queryType1() {
			return getRuleContext(QueryType1Context.class,0);
		}
		public QueryType2Context queryType2() {
			return getRuleContext(QueryType2Context.class,0);
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
		enterRule(_localctx, 28, RULE_query);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((QueryContext)_localctx).q1 = queryType1();
				((QueryContext)_localctx).queryRet =  ((QueryContext)_localctx).q1.queryType1Ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((QueryContext)_localctx).q2 = queryType2();
				((QueryContext)_localctx).queryRet =  ((QueryContext)_localctx).q2.queryType2Ret;
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
	public static class QueryType1Context extends ParserRuleContext {
		public QueryExpression queryType1Ret;
		public Token line;
		public PredicateIdentifierContext p;
		public VariableContext v;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public TerminalNode QUARYMARK() { return getToken(LogicPLParser.QUARYMARK, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QueryType1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryType1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQueryType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQueryType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQueryType1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryType1Context queryType1() throws RecognitionException {
		QueryType1Context _localctx = new QueryType1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_queryType1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LBRACKET);
			setState(269);
			((QueryType1Context)_localctx).line = match(QUARYMARK);
			setState(270);
			((QueryType1Context)_localctx).p = predicateIdentifier();
			setState(271);
			match(LPAR);
			setState(272);
			((QueryType1Context)_localctx).v = variable();
			setState(273);
			match(RPAR);
			setState(274);
			match(RBRACKET);

			        ((QueryType1Context)_localctx).queryType1Ret =  new QueryExpression(((QueryType1Context)_localctx).p.predicateIdentifierRet);
			        _localctx.queryType1Ret.setVar(((QueryType1Context)_localctx).v.variableRet);
			        _localctx.queryType1Ret.setLine(((QueryType1Context)_localctx).line.getLine());
			    
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
	public static class QueryType2Context extends ParserRuleContext {
		public QueryExpression queryType2Ret;
		public PredicateIdentifierContext p;
		public Token line;
		public TerminalNode LBRACKET() { return getToken(LogicPLParser.LBRACKET, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACKET() { return getToken(LogicPLParser.RBRACKET, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public TerminalNode QUARYMARK() { return getToken(LogicPLParser.QUARYMARK, 0); }
		public QueryType2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryType2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQueryType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQueryType2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQueryType2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryType2Context queryType2() throws RecognitionException {
		QueryType2Context _localctx = new QueryType2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryType2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACKET);
			setState(278);
			((QueryType2Context)_localctx).p = predicateIdentifier();
			setState(279);
			match(LPAR);
			setState(280);
			((QueryType2Context)_localctx).line = match(QUARYMARK);
			setState(281);
			match(RPAR);
			setState(282);
			match(RBRACKET);

			        ((QueryType2Context)_localctx).queryType2Ret =  new QueryExpression(((QueryType2Context)_localctx).p.predicateIdentifierRet);
			        _localctx.queryType2Ret.setLine(((QueryType2Context)_localctx).line.getLine());
			    
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
	public static class ReturnSmtContext extends ParserRuleContext {
		public ReturnStmt returnSmtRet;
		public Token RETURN;
		public ValueContext v;
		public IdentifierContext i;
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnSmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterReturnSmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitReturnSmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitReturnSmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnSmtContext returnSmt() throws RecognitionException {
		ReturnSmtContext _localctx = new ReturnSmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnSmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((ReturnSmtContext)_localctx).RETURN = match(RETURN);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case MINUS:
			case INT_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(286);
				((ReturnSmtContext)_localctx).v = value();
				((ReturnSmtContext)_localctx).returnSmtRet =  new ReturnStmt(((ReturnSmtContext)_localctx).v.valueRet);
				}
				break;
			case IDENTIFIER:
				{
				setState(289);
				((ReturnSmtContext)_localctx).i = identifier();
				((ReturnSmtContext)_localctx).returnSmtRet =  new ReturnStmt(((ReturnSmtContext)_localctx).i.identifierRet);
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(294);
			match(SEMICOLON);

			        if(_localctx.returnSmtRet == null)
			        {
			            ((ReturnSmtContext)_localctx).returnSmtRet =  new ReturnStmt(null);
			        }
			    
			_localctx.returnSmtRet.setLine(((ReturnSmtContext)_localctx).RETURN.getLine());
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
		public ForloopStmt forLoopRet;
		public Token FOR;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public StatementContext s;
		public TerminalNode FOR() { return getToken(LogicPLParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((ForLoopContext)_localctx).FOR = match(FOR);
			setState(299);
			match(LPAR);
			setState(300);
			((ForLoopContext)_localctx).i1 = identifier();
			setState(301);
			match(COLON);
			setState(302);
			((ForLoopContext)_localctx).i2 = identifier();
			setState(303);
			match(RPAR);
			ArrayList<Statement> statements = new ArrayList<>();
			setState(305);
			match(LBRACE);
			{
			setState(309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				((ForLoopContext)_localctx).s = statement();
				statements.add(((ForLoopContext)_localctx).s.statementRet);
				}
				}
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			}
			setState(313);
			match(RBRACE);

			        ((ForLoopContext)_localctx).forLoopRet =  new ForloopStmt(((ForLoopContext)_localctx).i1.identifierRet, ((ForLoopContext)_localctx).i2.identifierRet, statements);
			        _localctx.forLoopRet.setLine(((ForLoopContext)_localctx).FOR.getLine());
			    
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
	public static class PredicateContext extends ParserRuleContext {
		public PredicateStmt predicateRet;
		public PredicateIdentifierContext p;
		public VariableContext v;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public PredicateIdentifierContext predicateIdentifier() {
			return getRuleContext(PredicateIdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((PredicateContext)_localctx).p = predicateIdentifier();
			setState(317);
			match(LPAR);
			setState(318);
			((PredicateContext)_localctx).v = variable();
			setState(319);
			match(RPAR);

			        ((PredicateContext)_localctx).predicateRet =  new PredicateStmt(((PredicateContext)_localctx).p.predicateIdentifierRet , ((PredicateContext)_localctx).v.variableRet);
			        _localctx.predicateRet.setLine(((PredicateContext)_localctx).p.predicateIdentifierRet.getLine());
			    
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
		public ImplicationStmt implicationRet;
		public ExpressionContext e;
		public StatementContext s;
		public List<TerminalNode> LPAR() { return getTokens(LogicPLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(LogicPLParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(LogicPLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(LogicPLParser.RPAR, i);
		}
		public TerminalNode ARROW() { return getToken(LogicPLParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 40, RULE_implication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> statements = new ArrayList<>();
			setState(323);
			match(LPAR);
			setState(324);
			((ImplicationContext)_localctx).e = expression();
			setState(325);
			match(RPAR);
			setState(326);
			match(ARROW);
			setState(327);
			match(LPAR);
			{
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				((ImplicationContext)_localctx).s = statement();
				statements.add(((ImplicationContext)_localctx).s.statementRet);
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1649267444188L) != 0) );
			}
			setState(335);
			match(RPAR);

			        ((ImplicationContext)_localctx).implicationRet =  new ImplicationStmt(((ImplicationContext)_localctx).e.expressionRet, statements);
			        _localctx.implicationRet.setLine(((ImplicationContext)_localctx).e.expressionRet.getLine());
			    
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public AndExprContext left;
		public Expression2Context right;
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			((ExpressionContext)_localctx).left = andExpr();
			setState(339);
			((ExpressionContext)_localctx).right = expression2();

			        if(((ExpressionContext)_localctx).right.expression2Ret != null)
			        {
			            ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).left.andExprRet, ((ExpressionContext)_localctx).right.expression2Ret.getRight(), ((ExpressionContext)_localctx).right.expression2Ret.getBinaryOperator());
			            _localctx.expressionRet.setLine(((ExpressionContext)_localctx).right.expression2Ret.getLine());
			        }
			        else
			        {
			            ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).left.andExprRet;
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
	public static class Expression2Context extends ParserRuleContext {
		public BinaryExpression expression2Ret;
		public BinaryExpression temp;
		public AndExprContext left;
		public Expression2Context right;
		public TerminalNode OR() { return getToken(LogicPLParser.OR, 0); }
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression2);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(OR);
				setState(343);
				((Expression2Context)_localctx).left = andExpr();
				setState(344);
				((Expression2Context)_localctx).right = expression2();

				        if(((Expression2Context)_localctx).right.expression2Ret != null)
				        {
				            ((Expression2Context)_localctx).temp =  new BinaryExpression(((Expression2Context)_localctx).left.andExprRet, ((Expression2Context)_localctx).right.expression2Ret.getRight(), ((Expression2Context)_localctx).right.expression2Ret.getBinaryOperator());
				            _localctx.temp.setLine(((Expression2Context)_localctx).right.expression2Ret.getLine());
				            ((Expression2Context)_localctx).expression2Ret =  new BinaryExpression(null, _localctx.temp, BinaryOperator.or);
				        }
				        else
				        {
				            ((Expression2Context)_localctx).expression2Ret =  new BinaryExpression(null, ((Expression2Context)_localctx).left.andExprRet, BinaryOperator.or);
				        }
				    
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				((Expression2Context)_localctx).expression2Ret =  null;
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
		public Expression andExprRet;
		public EqExprContext left;
		public AndExpr2Context right;
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpr2Context andExpr2() {
			return getRuleContext(AndExpr2Context.class,0);
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
		enterRule(_localctx, 46, RULE_andExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((AndExprContext)_localctx).left = eqExpr();
			setState(351);
			((AndExprContext)_localctx).right = andExpr2();

			        if(((AndExprContext)_localctx).right.andExpr2Ret != null)
			        {
			            ((AndExprContext)_localctx).andExprRet =  new BinaryExpression(((AndExprContext)_localctx).left.eqExprRet, ((AndExprContext)_localctx).right.andExpr2Ret.getRight(), ((AndExprContext)_localctx).right.andExpr2Ret.getBinaryOperator());
			            _localctx.andExprRet.setLine(((AndExprContext)_localctx).right.andExpr2Ret.getLine());
			        }
			        else
			        {
			            ((AndExprContext)_localctx).andExprRet =  ((AndExprContext)_localctx).left.eqExprRet;
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
	public static class AndExpr2Context extends ParserRuleContext {
		public BinaryExpression andExpr2Ret;
		public BinaryExpression temp;
		public EqExprContext left;
		public AndExpr2Context right;
		public TerminalNode AND() { return getToken(LogicPLParser.AND, 0); }
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExpr2Context andExpr2() {
			return getRuleContext(AndExpr2Context.class,0);
		}
		public AndExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAndExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAndExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAndExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpr2Context andExpr2() throws RecognitionException {
		AndExpr2Context _localctx = new AndExpr2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_andExpr2);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(AND);
				setState(355);
				((AndExpr2Context)_localctx).left = eqExpr();
				setState(356);
				((AndExpr2Context)_localctx).right = andExpr2();

				        if(((AndExpr2Context)_localctx).right.andExpr2Ret != null)
				        {
				            ((AndExpr2Context)_localctx).temp =  new BinaryExpression(((AndExpr2Context)_localctx).left.eqExprRet, ((AndExpr2Context)_localctx).right.andExpr2Ret.getRight(), ((AndExpr2Context)_localctx).right.andExpr2Ret.getBinaryOperator());
				            _localctx.temp.setLine(((AndExpr2Context)_localctx).right.andExpr2Ret.getLine());
				            ((AndExpr2Context)_localctx).andExpr2Ret =  new BinaryExpression(null, _localctx.temp, BinaryOperator.or);
				        }
				        else
				        {
				            ((AndExpr2Context)_localctx).andExpr2Ret =  new BinaryExpression(null, ((AndExpr2Context)_localctx).left.eqExprRet, BinaryOperator.or);
				        }   
				    
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				((AndExpr2Context)_localctx).andExpr2Ret =  null;
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
	public static class EqExprContext extends ParserRuleContext {
		public Expression eqExprRet;
		public CompExprContext left;
		public EqExpr2Context right;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqExpr2Context eqExpr2() {
			return getRuleContext(EqExpr2Context.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eqExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((EqExprContext)_localctx).left = compExpr();
			setState(363);
			((EqExprContext)_localctx).right = eqExpr2();

			        if(((EqExprContext)_localctx).right.eqExpr2Ret != null)
			        {
			            ((EqExprContext)_localctx).eqExprRet =  new BinaryExpression(((EqExprContext)_localctx).left.compExprRet, ((EqExprContext)_localctx).right.eqExpr2Ret.getRight(), ((EqExprContext)_localctx).right.eqExpr2Ret.getBinaryOperator());
			            _localctx.eqExprRet.setLine(((EqExprContext)_localctx).right.eqExpr2Ret.getLine());
			        }
			        else
			        {
			            ((EqExprContext)_localctx).eqExprRet =  ((EqExprContext)_localctx).left.compExprRet;
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
	public static class EqExpr2Context extends ParserRuleContext {
		public BinaryExpression eqExpr2Ret;
		public BinaryExpression temp;
		public BinaryOperator operator;
		public Token op;
		public CompExprContext left;
		public EqExpr2Context right;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqExpr2Context eqExpr2() {
			return getRuleContext(EqExpr2Context.class,0);
		}
		public TerminalNode EQ() { return getToken(LogicPLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LogicPLParser.NEQ, 0); }
		public EqExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterEqExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitEqExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitEqExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpr2Context eqExpr2() throws RecognitionException {
		EqExpr2Context _localctx = new EqExpr2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_eqExpr2);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case NEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(366);
					((EqExpr2Context)_localctx).op = match(EQ);
					((EqExpr2Context)_localctx).operator =  BinaryOperator.eq;
					}
					break;
				case NEQ:
					{
					setState(368);
					((EqExpr2Context)_localctx).op = match(NEQ);
					((EqExpr2Context)_localctx).operator =  BinaryOperator.neq;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372);
				((EqExpr2Context)_localctx).left = compExpr();
				setState(373);
				((EqExpr2Context)_localctx).right = eqExpr2();

				        if(((EqExpr2Context)_localctx).right.eqExpr2Ret != null)
				        {
				            ((EqExpr2Context)_localctx).temp =  new BinaryExpression(((EqExpr2Context)_localctx).left.compExprRet, ((EqExpr2Context)_localctx).right.eqExpr2Ret.getRight(), ((EqExpr2Context)_localctx).right.eqExpr2Ret.getBinaryOperator());
				            _localctx.temp.setLine(((EqExpr2Context)_localctx).right.eqExpr2Ret.getLine());
				            ((EqExpr2Context)_localctx).eqExpr2Ret =  new BinaryExpression(null, _localctx.temp, _localctx.operator);
				        }
				        else
				        {
				            ((EqExpr2Context)_localctx).eqExpr2Ret =  new BinaryExpression(null, ((EqExpr2Context)_localctx).left.compExprRet, _localctx.operator);
				        }   
				    
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				((EqExpr2Context)_localctx).eqExpr2Ret =  null;
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
	public static class CompExprContext extends ParserRuleContext {
		public Expression compExprRet;
		public AdditiveContext left;
		public CompExpr2Context right;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public CompExpr2Context compExpr2() {
			return getRuleContext(CompExpr2Context.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((CompExprContext)_localctx).left = additive();
			setState(380);
			((CompExprContext)_localctx).right = compExpr2();

			        if(((CompExprContext)_localctx).right.compExpr2Ret != null)
			        {
			            ((CompExprContext)_localctx).compExprRet =  new BinaryExpression(((CompExprContext)_localctx).left.additiveRet, ((CompExprContext)_localctx).right.compExpr2Ret.getRight(), ((CompExprContext)_localctx).right.compExpr2Ret.getBinaryOperator());
			            _localctx.compExprRet.setLine(((CompExprContext)_localctx).right.compExpr2Ret.getLine());
			        }
			        else
			        {
			            ((CompExprContext)_localctx).compExprRet =  ((CompExprContext)_localctx).left.additiveRet;
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
	public static class CompExpr2Context extends ParserRuleContext {
		public BinaryExpression compExpr2Ret;
		public BinaryExpression temp;
		public BinaryOperator operator;
		public Token op;
		public AdditiveContext left;
		public CompExpr2Context right;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public CompExpr2Context compExpr2() {
			return getRuleContext(CompExpr2Context.class,0);
		}
		public TerminalNode LT() { return getToken(LogicPLParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LogicPLParser.LTE, 0); }
		public TerminalNode GT() { return getToken(LogicPLParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LogicPLParser.GTE, 0); }
		public CompExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterCompExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitCompExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitCompExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExpr2Context compExpr2() throws RecognitionException {
		CompExpr2Context _localctx = new CompExpr2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_compExpr2);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case LT:
			case GTE:
			case LTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(383);
					((CompExpr2Context)_localctx).op = match(LT);
					((CompExpr2Context)_localctx).operator =  BinaryOperator.lt;
					}
					break;
				case LTE:
					{
					setState(385);
					((CompExpr2Context)_localctx).op = match(LTE);
					((CompExpr2Context)_localctx).operator =  BinaryOperator.lte;
					}
					break;
				case GT:
					{
					setState(387);
					((CompExpr2Context)_localctx).op = match(GT);
					((CompExpr2Context)_localctx).operator =  BinaryOperator.gt;
					}
					break;
				case GTE:
					{
					setState(389);
					((CompExpr2Context)_localctx).op = match(GTE);
					((CompExpr2Context)_localctx).operator =  BinaryOperator.gte;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(393);
				((CompExpr2Context)_localctx).left = additive();
				setState(394);
				((CompExpr2Context)_localctx).right = compExpr2();

				        if(((CompExpr2Context)_localctx).right.compExpr2Ret != null)
				        {
				            ((CompExpr2Context)_localctx).temp =  new BinaryExpression(((CompExpr2Context)_localctx).left.additiveRet, ((CompExpr2Context)_localctx).right.compExpr2Ret.getRight(), ((CompExpr2Context)_localctx).right.compExpr2Ret.getBinaryOperator());
				            _localctx.temp.setLine(((CompExpr2Context)_localctx).right.compExpr2Ret.getLine());
				            ((CompExpr2Context)_localctx).compExpr2Ret =  new BinaryExpression(null, _localctx.temp, _localctx.operator);
				        }
				        else
				        {
				            ((CompExpr2Context)_localctx).compExpr2Ret =  new BinaryExpression(null, ((CompExpr2Context)_localctx).left.additiveRet, _localctx.operator);
				        }   
				    
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((CompExpr2Context)_localctx).compExpr2Ret =  null;
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
	public static class AdditiveContext extends ParserRuleContext {
		public Expression additiveRet;
		public MulticativeContext left;
		public Additive2Context right;
		public MulticativeContext multicative() {
			return getRuleContext(MulticativeContext.class,0);
		}
		public Additive2Context additive2() {
			return getRuleContext(Additive2Context.class,0);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_additive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			((AdditiveContext)_localctx).left = multicative();
			setState(401);
			((AdditiveContext)_localctx).right = additive2();

			        if(((AdditiveContext)_localctx).right.additive2Ret != null)
			        {
			            ((AdditiveContext)_localctx).additiveRet =  new BinaryExpression(((AdditiveContext)_localctx).left.multicativeRet, ((AdditiveContext)_localctx).right.additive2Ret.getRight(), ((AdditiveContext)_localctx).right.additive2Ret.getBinaryOperator());
			            _localctx.additiveRet.setLine(((AdditiveContext)_localctx).right.additive2Ret.getLine());
			        }
			        else
			        {
			            ((AdditiveContext)_localctx).additiveRet =  ((AdditiveContext)_localctx).left.multicativeRet;
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
	public static class Additive2Context extends ParserRuleContext {
		public BinaryExpression additive2Ret;
		public BinaryExpression temp;
		public BinaryOperator operator;
		public Token op;
		public MulticativeContext left;
		public Additive2Context right;
		public MulticativeContext multicative() {
			return getRuleContext(MulticativeContext.class,0);
		}
		public Additive2Context additive2() {
			return getRuleContext(Additive2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public Additive2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAdditive2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAdditive2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAdditive2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive2Context additive2() throws RecognitionException {
		Additive2Context _localctx = new Additive2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_additive2);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(404);
					((Additive2Context)_localctx).op = match(PLUS);
					((Additive2Context)_localctx).operator =  BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(406);
					((Additive2Context)_localctx).op = match(MINUS);
					((Additive2Context)_localctx).operator =  BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410);
				((Additive2Context)_localctx).left = multicative();
				setState(411);
				((Additive2Context)_localctx).right = additive2();

				        if(((Additive2Context)_localctx).right.additive2Ret != null)
				        {
				            ((Additive2Context)_localctx).temp =  new BinaryExpression(((Additive2Context)_localctx).left.multicativeRet, ((Additive2Context)_localctx).right.additive2Ret.getRight(), ((Additive2Context)_localctx).right.additive2Ret.getBinaryOperator());
				            _localctx.temp.setLine(((Additive2Context)_localctx).right.additive2Ret.getLine());
				            ((Additive2Context)_localctx).additive2Ret =  new BinaryExpression(null, _localctx.temp, _localctx.operator);
				        }
				        else
				        {
				            ((Additive2Context)_localctx).additive2Ret =  new BinaryExpression(null, ((Additive2Context)_localctx).left.multicativeRet, _localctx.operator);
				        }   
				    
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((Additive2Context)_localctx).additive2Ret =  null;
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
	public static class MulticativeContext extends ParserRuleContext {
		public Expression multicativeRet;
		public UnaryContext left;
		public Multicative2Context right;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Multicative2Context multicative2() {
			return getRuleContext(Multicative2Context.class,0);
		}
		public MulticativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMulticative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMulticative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMulticative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulticativeContext multicative() throws RecognitionException {
		MulticativeContext _localctx = new MulticativeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multicative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			((MulticativeContext)_localctx).left = unary();
			setState(418);
			((MulticativeContext)_localctx).right = multicative2();

			        if(((MulticativeContext)_localctx).right.multicative2Ret != null)
			        {
			            ((MulticativeContext)_localctx).multicativeRet =  new BinaryExpression(((MulticativeContext)_localctx).left.unaryRet, ((MulticativeContext)_localctx).right.multicative2Ret.getRight(), ((MulticativeContext)_localctx).right.multicative2Ret.getBinaryOperator());
			            _localctx.multicativeRet.setLine(((MulticativeContext)_localctx).right.multicative2Ret.getLine());
			        }
			        else
			        {
			            ((MulticativeContext)_localctx).multicativeRet =  ((MulticativeContext)_localctx).left.unaryRet;
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
	public static class Multicative2Context extends ParserRuleContext {
		public BinaryExpression multicative2Ret;
		public BinaryExpression temp;
		public BinaryOperator operator;
		public Token op;
		public UnaryContext left;
		public Multicative2Context right;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public Multicative2Context multicative2() {
			return getRuleContext(Multicative2Context.class,0);
		}
		public TerminalNode MULT() { return getToken(LogicPLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LogicPLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LogicPLParser.MOD, 0); }
		public Multicative2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multicative2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMulticative2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMulticative2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMulticative2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multicative2Context multicative2() throws RecognitionException {
		Multicative2Context _localctx = new Multicative2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_multicative2);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(421);
					((Multicative2Context)_localctx).op = match(MULT);
					((Multicative2Context)_localctx).operator =  BinaryOperator.mult;
					}
					break;
				case DIV:
					{
					setState(423);
					((Multicative2Context)_localctx).op = match(DIV);
					((Multicative2Context)_localctx).operator =  BinaryOperator.div;
					}
					break;
				case MOD:
					{
					setState(425);
					((Multicative2Context)_localctx).op = match(MOD);
					((Multicative2Context)_localctx).operator =  BinaryOperator.mod;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(429);
				((Multicative2Context)_localctx).left = unary();
				setState(430);
				((Multicative2Context)_localctx).right = multicative2();

				        if(((Multicative2Context)_localctx).right.multicative2Ret != null)
				        {
				            ((Multicative2Context)_localctx).temp =  new BinaryExpression(((Multicative2Context)_localctx).left.unaryRet, ((Multicative2Context)_localctx).right.multicative2Ret.getRight(), ((Multicative2Context)_localctx).right.multicative2Ret.getBinaryOperator());
				            _localctx.temp.setLine(((Multicative2Context)_localctx).right.multicative2Ret.getLine());
				            ((Multicative2Context)_localctx).multicative2Ret =  new BinaryExpression(null, _localctx.temp, _localctx.operator);
				        }
				        else
				        {
				            ((Multicative2Context)_localctx).multicative2Ret =  new BinaryExpression(null, ((Multicative2Context)_localctx).left.unaryRet, _localctx.operator);
				        }   
				    
				}
				break;
			case RPAR:
			case COMMA:
			case SEMICOLON:
			case RBRACKET:
			case OR:
			case AND:
			case EQ:
			case GT:
			case LT:
			case GTE:
			case LTE:
			case PLUS:
			case MINUS:
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				((Multicative2Context)_localctx).multicative2Ret =  null;
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
	public static class UnaryContext extends ParserRuleContext {
		public Expression unaryRet;
		public UnaryOperator operator;
		public OtherContext o;
		public Token op;
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(LogicPLParser.NOT, 0); }
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unary);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((UnaryContext)_localctx).o = other();
				((UnaryContext)_localctx).unaryRet =  ((UnaryContext)_localctx).o.otherRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(439);
					((UnaryContext)_localctx).op = match(PLUS);
					((UnaryContext)_localctx).operator =  UnaryOperator.plus;
					}
					break;
				case MINUS:
					{
					setState(441);
					((UnaryContext)_localctx).op = match(MINUS);
					((UnaryContext)_localctx).operator =  UnaryOperator.minus;
					}
					break;
				case NOT:
					{
					setState(443);
					((UnaryContext)_localctx).op = match(NOT);
					((UnaryContext)_localctx).operator =  UnaryOperator.not;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(447);
				((UnaryContext)_localctx).o = other();

				        ((UnaryContext)_localctx).unaryRet =  new UnaryExpression(_localctx.operator, ((UnaryContext)_localctx).o.otherRet);
				        _localctx.unaryRet.setLine(((UnaryContext)_localctx).op.getLine());
				    
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
	public static class OtherContext extends ParserRuleContext {
		public Expression otherRet;
		public ExpressionContext expr;
		public VariableContext variable;
		public ValueContext value;
		public QueryType1Context queryType1;
		public FunctionCallContext functionCall;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public QueryType1Context queryType1() {
			return getRuleContext(QueryType1Context.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_other);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(LPAR);
				setState(453);
				((OtherContext)_localctx).expr = expression();
				setState(454);
				match(RPAR);
				((OtherContext)_localctx).otherRet =  ((OtherContext)_localctx).expr.expressionRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				((OtherContext)_localctx).variable = variable();
				((OtherContext)_localctx).otherRet =  ((OtherContext)_localctx).variable.variableRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				((OtherContext)_localctx).value = value();
				((OtherContext)_localctx).otherRet =  ((OtherContext)_localctx).value.valueRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				((OtherContext)_localctx).queryType1 = queryType1();
				((OtherContext)_localctx).otherRet =  ((OtherContext)_localctx).queryType1.queryType1Ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				((OtherContext)_localctx).functionCall = functionCall();
				((OtherContext)_localctx).otherRet =  ((OtherContext)_localctx).functionCall.functionCallRet;
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall functionCallRet;
		public IdentifierContext iden;
		public ExpressionContext expr1;
		public ExpressionContext expr;
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Expression> arguments = new ArrayList<Expression>();
			setState(472);
			((FunctionCallContext)_localctx).iden = identifier();
			setState(473);
			match(LPAR);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7218766810624L) != 0)) {
				{
				setState(474);
				((FunctionCallContext)_localctx).expr1 = expression();
				arguments.add(((FunctionCallContext)_localctx).expr1.expressionRet);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(476);
					match(COMMA);
					setState(477);
					((FunctionCallContext)_localctx).expr = expression();
					arguments.add(((FunctionCallContext)_localctx).expr.expressionRet);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(487);
			match(RPAR);

			        ((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(arguments, ((FunctionCallContext)_localctx).iden.identifierRet);
			        _localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).iden.identifierRet.getLine());
			    
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
	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public NumericValueContext n1;
		public Token TRUE;
		public Token FALSE;
		public NumericValueContext n2;
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(LogicPLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LogicPLParser.FALSE, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				((ValueContext)_localctx).n1 = numericValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).n1.numericValueRet;
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				((ValueContext)_localctx).TRUE = match(TRUE);
				((ValueContext)_localctx).valueRet =  new BooleanValue(true); _localctx.valueRet.setLine(((ValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				((ValueContext)_localctx).FALSE = match(FALSE);
				((ValueContext)_localctx).valueRet =  new BooleanValue(false); _localctx.valueRet.setLine(((ValueContext)_localctx).FALSE.getLine());
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(MINUS);
				setState(498);
				((ValueContext)_localctx).n2 = numericValue();
				((ValueContext)_localctx).n2.numericValueRet.negateConstant(); ((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).n2.numericValueRet;
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
	public static class NumericValueContext extends ParserRuleContext {
		public Value numericValueRet;
		public Token i;
		public Token f;
		public TerminalNode INT_NUMBER() { return getToken(LogicPLParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(LogicPLParser.FLOAT_NUMBER, 0); }
		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitNumericValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numericValue);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				((NumericValueContext)_localctx).i = match(INT_NUMBER);
				((NumericValueContext)_localctx).numericValueRet =  new IntValue((((NumericValueContext)_localctx).i!=null?Integer.valueOf(((NumericValueContext)_localctx).i.getText()):0)); _localctx.numericValueRet.setLine(((NumericValueContext)_localctx).i.getLine());
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				((NumericValueContext)_localctx).f = match(FLOAT_NUMBER);
				((NumericValueContext)_localctx).numericValueRet =  new FloatValue(Float.parseFloat((((NumericValueContext)_localctx).f!=null?((NumericValueContext)_localctx).f.getText():null))); _localctx.numericValueRet.setLine(((NumericValueContext)_localctx).f.getLine());
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
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token iden;
		public TerminalNode IDENTIFIER() { return getToken(LogicPLParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			((IdentifierContext)_localctx).iden = match(IDENTIFIER);
			((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).iden!=null?((IdentifierContext)_localctx).iden.getText():null)); _localctx.identifierRet.setLine(((IdentifierContext)_localctx).iden.getLine());
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
	public static class PredicateIdentifierContext extends ParserRuleContext {
		public Identifier predicateIdentifierRet;
		public Token piden;
		public TerminalNode PREDICATE_IDENTIFIER() { return getToken(LogicPLParser.PREDICATE_IDENTIFIER, 0); }
		public PredicateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicateIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicateIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateIdentifierContext predicateIdentifier() throws RecognitionException {
		PredicateIdentifierContext _localctx = new PredicateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predicateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			((PredicateIdentifierContext)_localctx).piden = match(PREDICATE_IDENTIFIER);
			((PredicateIdentifierContext)_localctx).predicateIdentifierRet =  new Identifier((((PredicateIdentifierContext)_localctx).piden!=null?((PredicateIdentifierContext)_localctx).piden.getText():null)); _localctx.predicateIdentifierRet.setLine(((PredicateIdentifierContext)_localctx).piden.getLine());
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
	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TerminalNode BOOLEAN() { return getToken(LogicPLParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(LogicPLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LogicPLParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(BOOLEAN);
				((TypeContext)_localctx).typeRet =  new BooleanType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(FLOAT);
				((TypeContext)_localctx).typeRet =  new FloatType();
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

	public static final String _serializedATN =
		"\u0004\u0001*\u020c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000W"+
		"\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001i\b\u0001"+
		"\n\u0001\f\u0001l\t\u0001\u0003\u0001n\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"w\b\u0001\u000b\u0001\f\u0001x\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u0088\b\u0003\u000b"+
		"\u0003\f\u0003\u0089\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00be\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c7\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00d4\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00e4\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00ed\b\u000b\u0005\u000b\u00ef\b\u000b\n\u000b\f\u000b\u00f2\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0103"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u010b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0125\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u0136\b\u0012\u000b\u0012\f\u0012\u0137"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u014c\b\u0014\u000b\u0014\f\u0014\u014d\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u015d\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0169\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0173\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u017a"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0188\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u018f\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0199\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01a0\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01ac\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01b3\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01be\b!\u0001!\u0001!\u0001"+
		"!\u0003!\u01c3\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01d6\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0005#\u01e1\b#\n#\f#\u01e4\t#\u0003#\u01e6\b#"+
		"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u01f6\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01fc\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u020a\b(\u0001(\u0000\u0000"+
		")\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0000\u0216\u0000R\u0001"+
		"\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000"+
		"\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u00a4\u0001\u0000\u0000\u0000"+
		"\n\u00a6\u0001\u0000\u0000\u0000\f\u00b5\u0001\u0000\u0000\u0000\u000e"+
		"\u00bd\u0001\u0000\u0000\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012"+
		"\u00ca\u0001\u0000\u0000\u0000\u0014\u00d7\u0001\u0000\u0000\u0000\u0016"+
		"\u00db\u0001\u0000\u0000\u0000\u0018\u00f5\u0001\u0000\u0000\u0000\u001a"+
		"\u0102\u0001\u0000\u0000\u0000\u001c\u010a\u0001\u0000\u0000\u0000\u001e"+
		"\u010c\u0001\u0000\u0000\u0000 \u0115\u0001\u0000\u0000\u0000\"\u011d"+
		"\u0001\u0000\u0000\u0000$\u012a\u0001\u0000\u0000\u0000&\u013c\u0001\u0000"+
		"\u0000\u0000(\u0142\u0001\u0000\u0000\u0000*\u0152\u0001\u0000\u0000\u0000"+
		",\u015c\u0001\u0000\u0000\u0000.\u015e\u0001\u0000\u0000\u00000\u0168"+
		"\u0001\u0000\u0000\u00002\u016a\u0001\u0000\u0000\u00004\u0179\u0001\u0000"+
		"\u0000\u00006\u017b\u0001\u0000\u0000\u00008\u018e\u0001\u0000\u0000\u0000"+
		":\u0190\u0001\u0000\u0000\u0000<\u019f\u0001\u0000\u0000\u0000>\u01a1"+
		"\u0001\u0000\u0000\u0000@\u01b2\u0001\u0000\u0000\u0000B\u01c2\u0001\u0000"+
		"\u0000\u0000D\u01d5\u0001\u0000\u0000\u0000F\u01d7\u0001\u0000\u0000\u0000"+
		"H\u01f5\u0001\u0000\u0000\u0000J\u01fb\u0001\u0000\u0000\u0000L\u01fd"+
		"\u0001\u0000\u0000\u0000N\u0200\u0001\u0000\u0000\u0000P\u0209\u0001\u0000"+
		"\u0000\u0000RX\u0006\u0000\uffff\uffff\u0000ST\u0003\u0002\u0001\u0000"+
		"TU\u0006\u0000\uffff\uffff\u0000UW\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0003\u0006\u0003\u0000\\]\u0006\u0000\uffff\uffff\u0000]\u0001\u0001"+
		"\u0000\u0000\u0000^_\u0006\u0001\uffff\uffff\u0000_`\u0005\u0001\u0000"+
		"\u0000`a\u0003L&\u0000am\u0005\u000b\u0000\u0000bc\u0003\u0004\u0002\u0000"+
		"cj\u0006\u0001\uffff\uffff\u0000de\u0005\u000e\u0000\u0000ef\u0003\u0004"+
		"\u0002\u0000fg\u0006\u0001\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mb\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0005\f\u0000\u0000pq\u0005\r\u0000\u0000qr\u0003"+
		"P(\u0000rv\u0005\u000f\u0000\u0000st\u0003\b\u0004\u0000tu\u0006\u0001"+
		"\uffff\uffff\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0010\u0000\u0000{|\u0006\u0001"+
		"\uffff\uffff\u0000|\u0003\u0001\u0000\u0000\u0000}~\u0003P(\u0000~\u007f"+
		"\u0003L&\u0000\u007f\u0080\u0006\u0002\uffff\uffff\u0000\u0080\u0005\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0006\u0003\uffff\uffff\u0000\u0082\u0083"+
		"\u0005\u0005\u0000\u0000\u0083\u0087\u0005\u000f\u0000\u0000\u0084\u0085"+
		"\u0003\b\u0004\u0000\u0085\u0086\u0006\u0003\uffff\uffff\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u0010\u0000\u0000\u008c\u008d\u0006\u0003\uffff\uffff\u0000\u008d"+
		"\u0007\u0001\u0000\u0000\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090"+
		"\u0006\u0004\uffff\uffff\u0000\u0090\u00a5\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0003&\u0013\u0000\u0092\u0093\u0006\u0004\uffff\uffff\u0000\u0093"+
		"\u0094\u0005\u0011\u0000\u0000\u0094\u00a5\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0003(\u0014\u0000\u0096\u0097\u0006\u0004\uffff\uffff\u0000\u0097"+
		"\u00a5\u0001\u0000\u0000\u0000\u0098\u0099\u0003\"\u0011\u0000\u0099\u009a"+
		"\u0006\u0004\uffff\uffff\u0000\u009a\u00a5\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0003\u0018\f\u0000\u009c\u009d\u0006\u0004\uffff\uffff\u0000\u009d"+
		"\u00a5\u0001\u0000\u0000\u0000\u009e\u009f\u0003$\u0012\u0000\u009f\u00a0"+
		"\u0006\u0004\uffff\uffff\u0000\u00a0\u00a5\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0003\u000e\u0007\u0000\u00a2\u00a3\u0006\u0004\uffff\uffff\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u008e\u0001\u0000\u0000\u0000"+
		"\u00a4\u0091\u0001\u0000\u0000\u0000\u00a4\u0095\u0001\u0000\u0000\u0000"+
		"\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000"+
		"\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\f\u0006\u0000\u00a7"+
		"\u00a8\u0005\u0012\u0000\u0000\u00a8\u00a9\u0003*\u0015\u0000\u00a9\u00aa"+
		"\u0005\u0011\u0000\u0000\u00aa\u00ab\u0006\u0005\uffff\uffff\u0000\u00ab"+
		"\u000b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003L&\u0000\u00ad\u00ae\u0006"+
		"\u0006\uffff\uffff\u0000\u00ae\u00b6\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0003L&\u0000\u00b0\u00b1\u0005\u0013\u0000\u0000\u00b1\u00b2\u0003*"+
		"\u0015\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b4\u0006\u0006"+
		"\uffff\uffff\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b6\r\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0003\u0010\b\u0000\u00b8\u00b9\u0006\u0007\uffff"+
		"\uffff\u0000\u00b9\u00be\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\u0012"+
		"\t\u0000\u00bb\u00bc\u0006\u0007\uffff\uffff\u0000\u00bc\u00be\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003P(\u0000"+
		"\u00c0\u00c1\u0003L&\u0000\u00c1\u00c6\u0006\b\uffff\uffff\u0000\u00c2"+
		"\u00c3\u0005\u0012\u0000\u0000\u00c3\u00c4\u0003*\u0015\u0000\u00c4\u00c5"+
		"\u0006\b\uffff\uffff\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0011\u0000\u0000\u00c9\u0011"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003P(\u0000\u00cb\u00cc\u0005\u0013"+
		"\u0000\u0000\u00cc\u00cd\u0005)\u0000\u0000\u00cd\u00ce\u0005\u0014\u0000"+
		"\u0000\u00ce\u00cf\u0003L&\u0000\u00cf\u00d3\u0006\t\uffff\uffff\u0000"+
		"\u00d0\u00d1\u0003\u0014\n\u0000\u00d1\u00d2\u0006\t\uffff\uffff\u0000"+
		"\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0011\u0000\u0000\u00d6\u0013\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0012\u0000\u0000\u00d8\u00d9\u0003\u0016\u000b\u0000"+
		"\u00d9\u00da\u0006\n\uffff\uffff\u0000\u00da\u0015\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0006\u000b\uffff\uffff\u0000\u00dc\u00e3\u0005\u0013\u0000"+
		"\u0000\u00dd\u00de\u0003H$\u0000\u00de\u00df\u0006\u000b\uffff\uffff\u0000"+
		"\u00df\u00e4\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003L&\u0000\u00e1\u00e2"+
		"\u0006\u000b\uffff\uffff\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4"+
		"\u00f0\u0001\u0000\u0000\u0000\u00e5\u00ec\u0005\u000e\u0000\u0000\u00e6"+
		"\u00e7\u0003H$\u0000\u00e7\u00e8\u0006\u000b\uffff\uffff\u0000\u00e8\u00ed"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003L&\u0000\u00ea\u00eb\u0006\u000b"+
		"\uffff\uffff\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005\u0014\u0000\u0000\u00f4\u0017\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0006\u0000\u0000\u00f6\u00f7\u0005"+
		"\u000b\u0000\u0000\u00f7\u00f8\u0003\u001a\r\u0000\u00f8\u00f9\u0005\f"+
		"\u0000\u0000\u00f9\u00fa\u0005\u0011\u0000\u0000\u00fa\u00fb\u0006\f\uffff"+
		"\uffff\u0000\u00fb\u0019\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003\f\u0006"+
		"\u0000\u00fd\u00fe\u0006\r\uffff\uffff\u0000\u00fe\u0103\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0003\u001c\u000e\u0000\u0100\u0101\u0006\r\uffff\uffff"+
		"\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000\u0000"+
		"\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0103\u001b\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0003\u001e\u000f\u0000\u0105\u0106\u0006\u000e\uffff"+
		"\uffff\u0000\u0106\u010b\u0001\u0000\u0000\u0000\u0107\u0108\u0003 \u0010"+
		"\u0000\u0108\u0109\u0006\u000e\uffff\uffff\u0000\u0109\u010b\u0001\u0000"+
		"\u0000\u0000\u010a\u0104\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000"+
		"\u0000\u0000\u010b\u001d\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0013"+
		"\u0000\u0000\u010d\u010e\u0005\u0015\u0000\u0000\u010e\u010f\u0003N\'"+
		"\u0000\u010f\u0110\u0005\u000b\u0000\u0000\u0110\u0111\u0003\f\u0006\u0000"+
		"\u0111\u0112\u0005\f\u0000\u0000\u0112\u0113\u0005\u0014\u0000\u0000\u0113"+
		"\u0114\u0006\u000f\uffff\uffff\u0000\u0114\u001f\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u0013\u0000\u0000\u0116\u0117\u0003N\'\u0000\u0117"+
		"\u0118\u0005\u000b\u0000\u0000\u0118\u0119\u0005\u0015\u0000\u0000\u0119"+
		"\u011a\u0005\f\u0000\u0000\u011a\u011b\u0005\u0014\u0000\u0000\u011b\u011c"+
		"\u0006\u0010\uffff\uffff\u0000\u011c!\u0001\u0000\u0000\u0000\u011d\u0124"+
		"\u0005\u0007\u0000\u0000\u011e\u011f\u0003H$\u0000\u011f\u0120\u0006\u0011"+
		"\uffff\uffff\u0000\u0120\u0125\u0001\u0000\u0000\u0000\u0121\u0122\u0003"+
		"L&\u0000\u0122\u0123\u0006\u0011\uffff\uffff\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005\u0011\u0000\u0000\u0127\u0128\u0006\u0011"+
		"\uffff\uffff\u0000\u0128\u0129\u0006\u0011\uffff\uffff\u0000\u0129#\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005\b\u0000\u0000\u012b\u012c\u0005\u000b"+
		"\u0000\u0000\u012c\u012d\u0003L&\u0000\u012d\u012e\u0005\r\u0000\u0000"+
		"\u012e\u012f\u0003L&\u0000\u012f\u0130\u0005\f\u0000\u0000\u0130\u0131"+
		"\u0006\u0012\uffff\uffff\u0000\u0131\u0135\u0005\u000f\u0000\u0000\u0132"+
		"\u0133\u0003\b\u0004\u0000\u0133\u0134\u0006\u0012\uffff\uffff\u0000\u0134"+
		"\u0136\u0001\u0000\u0000\u0000\u0135\u0132\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0005\u0010\u0000\u0000\u013a\u013b\u0006\u0012\uffff\uffff\u0000"+
		"\u013b%\u0001\u0000\u0000\u0000\u013c\u013d\u0003N\'\u0000\u013d\u013e"+
		"\u0005\u000b\u0000\u0000\u013e\u013f\u0003\f\u0006\u0000\u013f\u0140\u0005"+
		"\f\u0000\u0000\u0140\u0141\u0006\u0013\uffff\uffff\u0000\u0141\'\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0006\u0014\uffff\uffff\u0000\u0143\u0144"+
		"\u0005\u000b\u0000\u0000\u0144\u0145\u0003*\u0015\u0000\u0145\u0146\u0005"+
		"\f\u0000\u0000\u0146\u0147\u0005\u0016\u0000\u0000\u0147\u014b\u0005\u000b"+
		"\u0000\u0000\u0148\u0149\u0003\b\u0004\u0000\u0149\u014a\u0006\u0014\uffff"+
		"\uffff\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0005\f\u0000\u0000\u0150\u0151\u0006\u0014\uffff"+
		"\uffff\u0000\u0151)\u0001\u0000\u0000\u0000\u0152\u0153\u0003.\u0017\u0000"+
		"\u0153\u0154\u0003,\u0016\u0000\u0154\u0155\u0006\u0015\uffff\uffff\u0000"+
		"\u0155+\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0017\u0000\u0000\u0157"+
		"\u0158\u0003.\u0017\u0000\u0158\u0159\u0003,\u0016\u0000\u0159\u015a\u0006"+
		"\u0016\uffff\uffff\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0006\u0016\uffff\uffff\u0000\u015c\u0156\u0001\u0000\u0000\u0000\u015c"+
		"\u015b\u0001\u0000\u0000\u0000\u015d-\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u00032\u0019\u0000\u015f\u0160\u00030\u0018\u0000\u0160\u0161\u0006\u0017"+
		"\uffff\uffff\u0000\u0161/\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0018"+
		"\u0000\u0000\u0163\u0164\u00032\u0019\u0000\u0164\u0165\u00030\u0018\u0000"+
		"\u0165\u0166\u0006\u0018\uffff\uffff\u0000\u0166\u0169\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0006\u0018\uffff\uffff\u0000\u0168\u0162\u0001\u0000"+
		"\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u01691\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u00036\u001b\u0000\u016b\u016c\u00034\u001a\u0000\u016c"+
		"\u016d\u0006\u0019\uffff\uffff\u0000\u016d3\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0005\u0019\u0000\u0000\u016f\u0173\u0006\u001a\uffff\uffff\u0000"+
		"\u0170\u0171\u0005#\u0000\u0000\u0171\u0173\u0006\u001a\uffff\uffff\u0000"+
		"\u0172\u016e\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u00036\u001b\u0000\u0175"+
		"\u0176\u00034\u001a\u0000\u0176\u0177\u0006\u001a\uffff\uffff\u0000\u0177"+
		"\u017a\u0001\u0000\u0000\u0000\u0178\u017a\u0006\u001a\uffff\uffff\u0000"+
		"\u0179\u0172\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000"+
		"\u017a5\u0001\u0000\u0000\u0000\u017b\u017c\u0003:\u001d\u0000\u017c\u017d"+
		"\u00038\u001c\u0000\u017d\u017e\u0006\u001b\uffff\uffff\u0000\u017e7\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0005\u001b\u0000\u0000\u0180\u0188\u0006"+
		"\u001c\uffff\uffff\u0000\u0181\u0182\u0005\u001d\u0000\u0000\u0182\u0188"+
		"\u0006\u001c\uffff\uffff\u0000\u0183\u0184\u0005\u001a\u0000\u0000\u0184"+
		"\u0188\u0006\u001c\uffff\uffff\u0000\u0185\u0186\u0005\u001c\u0000\u0000"+
		"\u0186\u0188\u0006\u001c\uffff\uffff\u0000\u0187\u017f\u0001\u0000\u0000"+
		"\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0003:\u001d\u0000\u018a\u018b\u00038\u001c\u0000\u018b"+
		"\u018c\u0006\u001c\uffff\uffff\u0000\u018c\u018f\u0001\u0000\u0000\u0000"+
		"\u018d\u018f\u0006\u001c\uffff\uffff\u0000\u018e\u0187\u0001\u0000\u0000"+
		"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f9\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0003>\u001f\u0000\u0191\u0192\u0003<\u001e\u0000\u0192\u0193"+
		"\u0006\u001d\uffff\uffff\u0000\u0193;\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005\u001e\u0000\u0000\u0195\u0199\u0006\u001e\uffff\uffff\u0000\u0196"+
		"\u0197\u0005\u001f\u0000\u0000\u0197\u0199\u0006\u001e\uffff\uffff\u0000"+
		"\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0003>\u001f\u0000\u019b"+
		"\u019c\u0003<\u001e\u0000\u019c\u019d\u0006\u001e\uffff\uffff\u0000\u019d"+
		"\u01a0\u0001\u0000\u0000\u0000\u019e\u01a0\u0006\u001e\uffff\uffff\u0000"+
		"\u019f\u0198\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0=\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003B!\u0000\u01a2\u01a3"+
		"\u0003@ \u0000\u01a3\u01a4\u0006\u001f\uffff\uffff\u0000\u01a4?\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0005 \u0000\u0000\u01a6\u01ac\u0006 \uffff"+
		"\uffff\u0000\u01a7\u01a8\u0005!\u0000\u0000\u01a8\u01ac\u0006 \uffff\uffff"+
		"\u0000\u01a9\u01aa\u0005\"\u0000\u0000\u01aa\u01ac\u0006 \uffff\uffff"+
		"\u0000\u01ab\u01a5\u0001\u0000\u0000\u0000\u01ab\u01a7\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0003B!\u0000\u01ae\u01af\u0003@ \u0000\u01af\u01b0"+
		"\u0006 \uffff\uffff\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01b3"+
		"\u0006 \uffff\uffff\u0000\u01b2\u01ab\u0001\u0000\u0000\u0000\u01b2\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b3A\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003"+
		"D\"\u0000\u01b5\u01b6\u0006!\uffff\uffff\u0000\u01b6\u01c3\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0005\u001e\u0000\u0000\u01b8\u01be\u0006!\uffff"+
		"\uffff\u0000\u01b9\u01ba\u0005\u001f\u0000\u0000\u01ba\u01be\u0006!\uffff"+
		"\uffff\u0000\u01bb\u01bc\u0005$\u0000\u0000\u01bc\u01be\u0006!\uffff\uffff"+
		"\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000\u01bd\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0003D\"\u0000\u01c0\u01c1\u0006!\uffff\uffff\u0000"+
		"\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01c2\u01bd\u0001\u0000\u0000\u0000\u01c3C\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0005\u000b\u0000\u0000\u01c5\u01c6\u0003*\u0015\u0000\u01c6\u01c7"+
		"\u0005\f\u0000\u0000\u01c7\u01c8\u0006\"\uffff\uffff\u0000\u01c8\u01d6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003\f\u0006\u0000\u01ca\u01cb\u0006"+
		"\"\uffff\uffff\u0000\u01cb\u01d6\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003"+
		"H$\u0000\u01cd\u01ce\u0006\"\uffff\uffff\u0000\u01ce\u01d6\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0003\u001e\u000f\u0000\u01d0\u01d1\u0006\"\uffff"+
		"\uffff\u0000\u01d1\u01d6\u0001\u0000\u0000\u0000\u01d2\u01d3\u0003F#\u0000"+
		"\u01d3\u01d4\u0006\"\uffff\uffff\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d5\u01c4\u0001\u0000\u0000\u0000\u01d5\u01c9\u0001\u0000\u0000\u0000"+
		"\u01d5\u01cc\u0001\u0000\u0000\u0000\u01d5\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d6E\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0006#\uffff\uffff\u0000\u01d8\u01d9\u0003L&\u0000\u01d9\u01e5"+
		"\u0005\u000b\u0000\u0000\u01da\u01db\u0003*\u0015\u0000\u01db\u01e2\u0006"+
		"#\uffff\uffff\u0000\u01dc\u01dd\u0005\u000e\u0000\u0000\u01dd\u01de\u0003"+
		"*\u0015\u0000\u01de\u01df\u0006#\uffff\uffff\u0000\u01df\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e5\u01da\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005\f\u0000"+
		"\u0000\u01e8\u01e9\u0006#\uffff\uffff\u0000\u01e9G\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0003J%\u0000\u01eb\u01ec\u0006$\uffff\uffff\u0000\u01ec"+
		"\u01f6\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\t\u0000\u0000\u01ee\u01f6"+
		"\u0006$\uffff\uffff\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0\u01f6"+
		"\u0006$\uffff\uffff\u0000\u01f1\u01f2\u0005\u001f\u0000\u0000\u01f2\u01f3"+
		"\u0003J%\u0000\u01f3\u01f4\u0006$\uffff\uffff\u0000\u01f4\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f5\u01ea\u0001\u0000\u0000\u0000\u01f5\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f5\u01ef\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f6I\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005)\u0000"+
		"\u0000\u01f8\u01fc\u0006%\uffff\uffff\u0000\u01f9\u01fa\u0005*\u0000\u0000"+
		"\u01fa\u01fc\u0006%\uffff\uffff\u0000\u01fb\u01f7\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fcK\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0005\'\u0000\u0000\u01fe\u01ff\u0006&\uffff\uffff\u0000\u01ff"+
		"M\u0001\u0000\u0000\u0000\u0200\u0201\u0005(\u0000\u0000\u0201\u0202\u0006"+
		"\'\uffff\uffff\u0000\u0202O\u0001\u0000\u0000\u0000\u0203\u0204\u0005"+
		"\u0002\u0000\u0000\u0204\u020a\u0006(\uffff\uffff\u0000\u0205\u0206\u0005"+
		"\u0003\u0000\u0000\u0206\u020a\u0006(\uffff\uffff\u0000\u0207\u0208\u0005"+
		"\u0004\u0000\u0000\u0208\u020a\u0006(\uffff\uffff\u0000\u0209\u0203\u0001"+
		"\u0000\u0000\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u0209\u0207\u0001"+
		"\u0000\u0000\u0000\u020aQ\u0001\u0000\u0000\u0000$Xjmx\u0089\u00a4\u00b5"+
		"\u00bd\u00c6\u00d3\u00e3\u00ec\u00f0\u0102\u010a\u0124\u0137\u014d\u015c"+
		"\u0168\u0172\u0179\u0187\u018e\u0198\u019f\u01ab\u01b2\u01bd\u01c2\u01d5"+
		"\u01e2\u01e5\u01f5\u01fb\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}