// Generated from c:\Users\windows\Desktop\COMPILER\antlrtest\MAT.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, SETVALUE=19, PINNAME=20, NUMBER=21, WS=22;
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
			"T__17", "SETVALUE", "PINNAME", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pinmap{'", "','", "'}'", "'pingroups{'", "';'", "'set'", "'read'", 
			"'if'", "'{'", "'loop'", "'goto'", "'()'", "'func'", "':'", "'='", "'DIO0'", 
			"'DIO1'", "'DIO2'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "SETVALUE", "PINNAME", "NUMBER", 
			"WS"
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


	public MATLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MAT.g4"; }

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
		"\u0004\u0000\u0016\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013}\b\u0013\u000b\u0013"+
		"\f\u0013~\u0001\u0013\u0005\u0013\u0082\b\u0013\n\u0013\f\u0013\u0085"+
		"\t\u0013\u0001\u0014\u0004\u0014\u0088\b\u0014\u000b\u0014\f\u0014\u0089"+
		"\u0001\u0015\u0004\u0015\u008d\b\u0015\u000b\u0015\f\u0015\u008e\u0001"+
		"\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0004\u0002\u0000AZaz\u0004"+
		"\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0095\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000"+
		"\u00057\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\tD\u0001"+
		"\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000"+
		"\u0000\u000fO\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013"+
		"T\u0001\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017^\u0001"+
		"\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bf\u0001\u0000\u0000"+
		"\u0000\u001dh\u0001\u0000\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!"+
		"o\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000"+
		"\u0000\'|\u0001\u0000\u0000\u0000)\u0087\u0001\u0000\u0000\u0000+\u008c"+
		"\u0001\u0000\u0000\u0000-.\u0005p\u0000\u0000./\u0005i\u0000\u0000/0\u0005"+
		"n\u0000\u000001\u0005m\u0000\u000012\u0005a\u0000\u000023\u0005p\u0000"+
		"\u000034\u0005{\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005,\u0000"+
		"\u00006\u0004\u0001\u0000\u0000\u000078\u0005}\u0000\u00008\u0006\u0001"+
		"\u0000\u0000\u00009:\u0005p\u0000\u0000:;\u0005i\u0000\u0000;<\u0005n"+
		"\u0000\u0000<=\u0005g\u0000\u0000=>\u0005r\u0000\u0000>?\u0005o\u0000"+
		"\u0000?@\u0005u\u0000\u0000@A\u0005p\u0000\u0000AB\u0005s\u0000\u0000"+
		"BC\u0005{\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005;\u0000\u0000"+
		"E\n\u0001\u0000\u0000\u0000FG\u0005s\u0000\u0000GH\u0005e\u0000\u0000"+
		"HI\u0005t\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005r\u0000\u0000"+
		"KL\u0005e\u0000\u0000LM\u0005a\u0000\u0000MN\u0005d\u0000\u0000N\u000e"+
		"\u0001\u0000\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005f\u0000\u0000Q\u0010"+
		"\u0001\u0000\u0000\u0000RS\u0005{\u0000\u0000S\u0012\u0001\u0000\u0000"+
		"\u0000TU\u0005l\u0000\u0000UV\u0005o\u0000\u0000VW\u0005o\u0000\u0000"+
		"WX\u0005p\u0000\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0005g\u0000\u0000"+
		"Z[\u0005o\u0000\u0000[\\\u0005t\u0000\u0000\\]\u0005o\u0000\u0000]\u0016"+
		"\u0001\u0000\u0000\u0000^_\u0005(\u0000\u0000_`\u0005)\u0000\u0000`\u0018"+
		"\u0001\u0000\u0000\u0000ab\u0005f\u0000\u0000bc\u0005u\u0000\u0000cd\u0005"+
		"n\u0000\u0000de\u0005c\u0000\u0000e\u001a\u0001\u0000\u0000\u0000fg\u0005"+
		":\u0000\u0000g\u001c\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000i\u001e"+
		"\u0001\u0000\u0000\u0000jk\u0005D\u0000\u0000kl\u0005I\u0000\u0000lm\u0005"+
		"O\u0000\u0000mn\u00050\u0000\u0000n \u0001\u0000\u0000\u0000op\u0005D"+
		"\u0000\u0000pq\u0005I\u0000\u0000qr\u0005O\u0000\u0000rs\u00051\u0000"+
		"\u0000s\"\u0001\u0000\u0000\u0000tu\u0005D\u0000\u0000uv\u0005I\u0000"+
		"\u0000vw\u0005O\u0000\u0000wx\u00052\u0000\u0000x$\u0001\u0000\u0000\u0000"+
		"yz\u000201\u0000z&\u0001\u0000\u0000\u0000{}\u0007\u0000\u0000\u0000|"+
		"{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0083\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0007\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0088\u0007\u0002\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"*\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0003\u0000\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0015\u0000\u0000\u0091,\u0001"+
		"\u0000\u0000\u0000\u0005\u0000~\u0083\u0089\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}