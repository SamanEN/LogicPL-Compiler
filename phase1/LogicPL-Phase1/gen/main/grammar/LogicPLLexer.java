// Generated from D:/Uni/Semester6/PLC/CA/LogicPL-Compiler/phase1/LogicPL-Phase1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"INT", "FLOAT", "BOOLEAN", "KEYWORD_TRUE", "KEYWORD_FALSE", "KEYWORD_FUNCTION", 
			"KEYWORD_MAIN", "KEYWORD_PRINT", "KEYWORD_FOR", "KEYWORD_RETURN", "EQ", 
			"L_BRACKET", "R_BRACKET", "L_BRACE", "R_BRACE", "L_PAR", "R_PAR", "COMMA", 
			"END_OF_STATEMENT", "INT_VAL", "FLOAT_VAL", "BOOLEAN_VAL", "VAR_FUNC_NAME", 
			"PREDICATE_NAME", "COMMENT", "WHITE_SPACE"
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


	public LogicPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogicPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000+\u00fd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0004$\u00d0\b$\u000b$\f"+
		"$\u00d1\u0001%\u0004%\u00d5\b%\u000b%\f%\u00d6\u0001%\u0001%\u0004%\u00db"+
		"\b%\u000b%\f%\u00dc\u0001&\u0001&\u0003&\u00e1\b&\u0001\'\u0001\'\u0005"+
		"\'\u00e5\b\'\n\'\f\'\u00e8\t\'\u0001(\u0001(\u0005(\u00ec\b(\n(\f(\u00ef"+
		"\t(\u0001)\u0001)\u0005)\u00f3\b)\n)\f)\u00f6\t)\u0001)\u0001)\u0001*"+
		"\u0001*\u0001*\u0001*\u0000\u0000+\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+\u0001\u0000\u0006\u0001"+
		"\u000009\u0001\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0002\u0000\n"+
		"\n\r\r\u0003\u0000\t\n\r\r  \u0103\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0001"+
		"W\u0001\u0000\u0000\u0000\u0003Z\u0001\u0000\u0000\u0000\u0005\\\u0001"+
		"\u0000\u0000\u0000\u0007^\u0001\u0000\u0000\u0000\t`\u0001\u0000\u0000"+
		"\u0000\u000bc\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000\u0000\u000f"+
		"i\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000\u0000\u0013n\u0001"+
		"\u0000\u0000\u0000\u0015p\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000"+
		"\u0000\u0019v\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001d"+
		"z\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000!~\u0001\u0000"+
		"\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0084\u0001\u0000\u0000\u0000"+
		"\'\u008a\u0001\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000+\u0097"+
		"\u0001\u0000\u0000\u0000-\u009d\u0001\u0000\u0000\u0000/\u00a6\u0001\u0000"+
		"\u0000\u00001\u00ab\u0001\u0000\u0000\u00003\u00b1\u0001\u0000\u0000\u0000"+
		"5\u00b5\u0001\u0000\u0000\u00007\u00bc\u0001\u0000\u0000\u00009\u00be"+
		"\u0001\u0000\u0000\u0000;\u00c0\u0001\u0000\u0000\u0000=\u00c2\u0001\u0000"+
		"\u0000\u0000?\u00c4\u0001\u0000\u0000\u0000A\u00c6\u0001\u0000\u0000\u0000"+
		"C\u00c8\u0001\u0000\u0000\u0000E\u00ca\u0001\u0000\u0000\u0000G\u00cc"+
		"\u0001\u0000\u0000\u0000I\u00cf\u0001\u0000\u0000\u0000K\u00d4\u0001\u0000"+
		"\u0000\u0000M\u00e0\u0001\u0000\u0000\u0000O\u00e2\u0001\u0000\u0000\u0000"+
		"Q\u00e9\u0001\u0000\u0000\u0000S\u00f0\u0001\u0000\u0000\u0000U\u00f9"+
		"\u0001\u0000\u0000\u0000WX\u0005=\u0000\u0000XY\u0005>\u0000\u0000Y\u0002"+
		"\u0001\u0000\u0000\u0000Z[\u0005?\u0000\u0000[\u0004\u0001\u0000\u0000"+
		"\u0000\\]\u0005:\u0000\u0000]\u0006\u0001\u0000\u0000\u0000^_\u0005-\u0000"+
		"\u0000_\b\u0001\u0000\u0000\u0000`a\u0005|\u0000\u0000ab\u0005|\u0000"+
		"\u0000b\n\u0001\u0000\u0000\u0000cd\u0005&\u0000\u0000de\u0005&\u0000"+
		"\u0000e\f\u0001\u0000\u0000\u0000fg\u0005=\u0000\u0000gh\u0005=\u0000"+
		"\u0000h\u000e\u0001\u0000\u0000\u0000ij\u0005!\u0000\u0000jk\u0005=\u0000"+
		"\u0000k\u0010\u0001\u0000\u0000\u0000lm\u0005<\u0000\u0000m\u0012\u0001"+
		"\u0000\u0000\u0000no\u0005>\u0000\u0000o\u0014\u0001\u0000\u0000\u0000"+
		"pq\u0005<\u0000\u0000qr\u0005=\u0000\u0000r\u0016\u0001\u0000\u0000\u0000"+
		"st\u0005>\u0000\u0000tu\u0005=\u0000\u0000u\u0018\u0001\u0000\u0000\u0000"+
		"vw\u0005+\u0000\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005*\u0000\u0000"+
		"y\u001c\u0001\u0000\u0000\u0000z{\u0005/\u0000\u0000{\u001e\u0001\u0000"+
		"\u0000\u0000|}\u0005%\u0000\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005"+
		"!\u0000\u0000\u007f\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005i\u0000"+
		"\u0000\u0081\u0082\u0005n\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083"+
		"$\u0001\u0000\u0000\u0000\u0084\u0085\u0005f\u0000\u0000\u0085\u0086\u0005"+
		"l\u0000\u0000\u0086\u0087\u0005o\u0000\u0000\u0087\u0088\u0005a\u0000"+
		"\u0000\u0088\u0089\u0005t\u0000\u0000\u0089&\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005b\u0000\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005"+
		"o\u0000\u0000\u008d\u008e\u0005l\u0000\u0000\u008e\u008f\u0005e\u0000"+
		"\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005n\u0000\u0000\u0091"+
		"(\u0001\u0000\u0000\u0000\u0092\u0093\u0005t\u0000\u0000\u0093\u0094\u0005"+
		"r\u0000\u0000\u0094\u0095\u0005u\u0000\u0000\u0095\u0096\u0005e\u0000"+
		"\u0000\u0096*\u0001\u0000\u0000\u0000\u0097\u0098\u0005f\u0000\u0000\u0098"+
		"\u0099\u0005a\u0000\u0000\u0099\u009a\u0005l\u0000\u0000\u009a\u009b\u0005"+
		"s\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c,\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005f\u0000\u0000\u009e\u009f\u0005u\u0000\u0000\u009f"+
		"\u00a0\u0005n\u0000\u0000\u00a0\u00a1\u0005c\u0000\u0000\u00a1\u00a2\u0005"+
		"t\u0000\u0000\u00a2\u00a3\u0005i\u0000\u0000\u00a3\u00a4\u0005o\u0000"+
		"\u0000\u00a4\u00a5\u0005n\u0000\u0000\u00a5.\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005m\u0000\u0000\u00a7\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005"+
		"i\u0000\u0000\u00a9\u00aa\u0005n\u0000\u0000\u00aa0\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005p\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad"+
		"\u00ae\u0005i\u0000\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af\u00b0\u0005"+
		"t\u0000\u0000\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005f\u0000"+
		"\u0000\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b4"+
		"4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005r\u0000\u0000\u00b6\u00b7\u0005"+
		"e\u0000\u0000\u00b7\u00b8\u0005t\u0000\u0000\u00b8\u00b9\u0005u\u0000"+
		"\u0000\u00b9\u00ba\u0005r\u0000\u0000\u00ba\u00bb\u0005n\u0000\u0000\u00bb"+
		"6\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000\u00bd8\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005[\u0000\u0000\u00bf:\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005]\u0000\u0000\u00c1<\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005{\u0000\u0000\u00c3>\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"}\u0000\u0000\u00c5@\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005(\u0000"+
		"\u0000\u00c7B\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005)\u0000\u0000\u00c9"+
		"D\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005,\u0000\u0000\u00cbF\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005;\u0000\u0000\u00cdH\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0007\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2J\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0007\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00da\u0005.\u0000\u0000\u00d9\u00db\u0007\u0000\u0000\u0000\u00da"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"L\u0001\u0000\u0000\u0000\u00de\u00e1\u0003)\u0014\u0000\u00df\u00e1\u0003"+
		"+\u0015\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1N\u0001\u0000\u0000\u0000\u00e2\u00e6\u0007\u0001\u0000"+
		"\u0000\u00e3\u00e5\u0007\u0002\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7P\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ed\u0007\u0003\u0000\u0000"+
		"\u00ea\u00ec\u0007\u0002\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00eeR\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005#\u0000\u0000\u00f1\u00f3"+
		"\b\u0004\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0006)\u0000\u0000\u00f8T\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0007\u0005\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0006*\u0000\u0000\u00fcV\u0001\u0000\u0000\u0000\n"+
		"\u0000\u00d1\u00d6\u00dc\u00e0\u00e4\u00e6\u00eb\u00ed\u00f4\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}