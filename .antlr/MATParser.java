// Generated from c:\Users\windows\Desktop\COMPILER\antlrtest\MAT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, CHANNEL=19, PINNAME=20, NUMBER=21, WS=22;
	public static final int
		RULE_complete = 0, RULE_defs = 1, RULE_defpinmap = 2, RULE_defpingroups = 3, 
		RULE_deffunc = 4, RULE_stmt = 5, RULE_stmtset = 6, RULE_stmtread = 7, 
		RULE_stmtif = 8, RULE_stmtloop = 9, RULE_stmtgoto = 10, RULE_stmtcall = 11, 
		RULE_stmtinc = 12, RULE_map = 13, RULE_pingroup = 14, RULE_setexp = 15, 
		RULE_readexp = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"complete", "defs", "defpinmap", "defpingroups", "deffunc", "stmt", "stmtset", 
			"stmtread", "stmtif", "stmtloop", "stmtgoto", "stmtcall", "stmtinc", 
			"map", "pingroup", "setexp", "readexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pinmap{'", "','", "'}'", "'pingroups{'", "';'", "'func'", "'()'", 
			"'{'", "'set'", "'read'", "'if'", "'loop'", "'goto'", "'increment'", 
			"'('", "')'", "':'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CHANNEL", "PINNAME", "NUMBER", 
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

	@Override
	public String getGrammarFileName() { return "MAT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MATParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompleteContext extends ParserRuleContext {
		public List<DefsContext> defs() {
			return getRuleContexts(DefsContext.class);
		}
		public DefsContext defs(int i) {
			return getRuleContext(DefsContext.class,i);
		}
		public CompleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complete; }
	}

	public final CompleteContext complete() throws RecognitionException {
		CompleteContext _localctx = new CompleteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_complete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				defs();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << PINNAME))) != 0) );
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

	public static class DefsContext extends ParserRuleContext {
		public DefpinmapContext defpinmap() {
			return getRuleContext(DefpinmapContext.class,0);
		}
		public DefpingroupsContext defpingroups() {
			return getRuleContext(DefpingroupsContext.class,0);
		}
		public DeffuncContext deffunc() {
			return getRuleContext(DeffuncContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public DefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defs; }
	}

	public final DefsContext defs() throws RecognitionException {
		DefsContext _localctx = new DefsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defs);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				defpinmap();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				defpingroups();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				deffunc();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case PINNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				stmt();
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

	public static class DefpinmapContext extends ParserRuleContext {
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public DefpinmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defpinmap; }
	}

	public final DefpinmapContext defpinmap() throws RecognitionException {
		DefpinmapContext _localctx = new DefpinmapContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defpinmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			map();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(47);
				match(T__1);
				setState(48);
				map();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__2);
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

	public static class DefpingroupsContext extends ParserRuleContext {
		public List<PingroupContext> pingroup() {
			return getRuleContexts(PingroupContext.class);
		}
		public PingroupContext pingroup(int i) {
			return getRuleContext(PingroupContext.class,i);
		}
		public DefpingroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defpingroups; }
	}

	public final DefpingroupsContext defpingroups() throws RecognitionException {
		DefpingroupsContext _localctx = new DefpingroupsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defpingroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(57);
			pingroup();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(58);
				match(T__4);
				setState(59);
				pingroup();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__2);
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

	public static class DeffuncContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public DeffuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffunc; }
	}

	public final DeffuncContext deffunc() throws RecognitionException {
		DeffuncContext _localctx = new DeffuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deffunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(PINNAME);
			setState(69);
			match(T__6);
			setState(70);
			match(T__7);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << PINNAME))) != 0)) {
				{
				{
				setState(71);
				stmt();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__2);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtsetContext stmtset() {
			return getRuleContext(StmtsetContext.class,0);
		}
		public StmtreadContext stmtread() {
			return getRuleContext(StmtreadContext.class,0);
		}
		public StmtifContext stmtif() {
			return getRuleContext(StmtifContext.class,0);
		}
		public StmtloopContext stmtloop() {
			return getRuleContext(StmtloopContext.class,0);
		}
		public StmtgotoContext stmtgoto() {
			return getRuleContext(StmtgotoContext.class,0);
		}
		public StmtcallContext stmtcall() {
			return getRuleContext(StmtcallContext.class,0);
		}
		public StmtincContext stmtinc() {
			return getRuleContext(StmtincContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				stmtset();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				stmtread();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				stmtif();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				stmtloop();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				stmtgoto();
				}
				break;
			case PINNAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				stmtcall();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				stmtinc();
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

	public static class StmtsetContext extends ParserRuleContext {
		public List<SetexpContext> setexp() {
			return getRuleContexts(SetexpContext.class);
		}
		public SetexpContext setexp(int i) {
			return getRuleContext(SetexpContext.class,i);
		}
		public StmtsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtset; }
	}

	public final StmtsetContext stmtset() throws RecognitionException {
		StmtsetContext _localctx = new StmtsetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmtset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__8);
			setState(89);
			setexp();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(90);
				match(T__1);
				setState(91);
				setexp();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__4);
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

	public static class StmtreadContext extends ParserRuleContext {
		public List<ReadexpContext> readexp() {
			return getRuleContexts(ReadexpContext.class);
		}
		public ReadexpContext readexp(int i) {
			return getRuleContext(ReadexpContext.class,i);
		}
		public StmtreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtread; }
	}

	public final StmtreadContext stmtread() throws RecognitionException {
		StmtreadContext _localctx = new StmtreadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmtread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__9);
			setState(100);
			readexp();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(101);
				match(T__1);
				setState(102);
				readexp();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__4);
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

	public static class StmtifContext extends ParserRuleContext {
		public List<SetexpContext> setexp() {
			return getRuleContexts(SetexpContext.class);
		}
		public SetexpContext setexp(int i) {
			return getRuleContext(SetexpContext.class,i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtif; }
	}

	public final StmtifContext stmtif() throws RecognitionException {
		StmtifContext _localctx = new StmtifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmtif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__10);
			setState(111);
			setexp();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(112);
				match(T__1);
				setState(113);
				setexp();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(T__7);
			setState(120);
			stmt();
			setState(121);
			match(T__2);
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

	public static class StmtloopContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MATParser.NUMBER, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtloop; }
	}

	public final StmtloopContext stmtloop() throws RecognitionException {
		StmtloopContext _localctx = new StmtloopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmtloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(NUMBER);
			setState(125);
			match(T__7);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << PINNAME))) != 0)) {
				{
				{
				setState(126);
				stmt();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__2);
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

	public static class StmtgotoContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public StmtgotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtgoto; }
	}

	public final StmtgotoContext stmtgoto() throws RecognitionException {
		StmtgotoContext _localctx = new StmtgotoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmtgoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__12);
			setState(135);
			match(PINNAME);
			setState(136);
			match(T__4);
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

	public static class StmtcallContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public StmtcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtcall; }
	}

	public final StmtcallContext stmtcall() throws RecognitionException {
		StmtcallContext _localctx = new StmtcallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmtcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PINNAME);
			setState(139);
			match(T__6);
			setState(140);
			match(T__4);
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

	public static class StmtincContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(MATParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MATParser.NUMBER, i);
		}
		public StmtincContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtinc; }
	}

	public final StmtincContext stmtinc() throws RecognitionException {
		StmtincContext _localctx = new StmtincContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtinc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__13);
			setState(143);
			match(T__14);
			setState(144);
			match(NUMBER);
			setState(145);
			match(T__1);
			setState(146);
			match(NUMBER);
			setState(147);
			match(T__15);
			setState(148);
			match(T__4);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public TerminalNode CHANNEL() { return getToken(MATParser.CHANNEL, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(PINNAME);
			setState(151);
			match(T__16);
			setState(152);
			match(CHANNEL);
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

	public static class PingroupContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public List<TerminalNode> CHANNEL() { return getTokens(MATParser.CHANNEL); }
		public TerminalNode CHANNEL(int i) {
			return getToken(MATParser.CHANNEL, i);
		}
		public PingroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pingroup; }
	}

	public final PingroupContext pingroup() throws RecognitionException {
		PingroupContext _localctx = new PingroupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pingroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PINNAME);
			setState(155);
			match(T__16);
			setState(156);
			match(CHANNEL);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(157);
				match(T__1);
				setState(158);
				match(CHANNEL);
				}
				}
				setState(163);
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

	public static class SetexpContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public TerminalNode NUMBER() { return getToken(MATParser.NUMBER, 0); }
		public SetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setexp; }
	}

	public final SetexpContext setexp() throws RecognitionException {
		SetexpContext _localctx = new SetexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(PINNAME);
			setState(165);
			match(T__17);
			setState(166);
			match(NUMBER);
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

	public static class ReadexpContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public ReadexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readexp; }
	}

	public final ReadexpContext readexp() throws RecognitionException {
		ReadexpContext _localctx = new ReadexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PINNAME);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\7\nu\n\n\f\n\16\nx\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0082"+
		"\n\13\f\13\16\13\u0085\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00a2\n\20\f\20\16\20\u00a5\13\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"\2\2\2\u00ad\2%\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b:\3\2\2\2\nE\3\2\2\2\f"+
		"X\3\2\2\2\16Z\3\2\2\2\20e\3\2\2\2\22p\3\2\2\2\24}\3\2\2\2\26\u0088\3\2"+
		"\2\2\30\u008c\3\2\2\2\32\u0090\3\2\2\2\34\u0098\3\2\2\2\36\u009c\3\2\2"+
		"\2 \u00a6\3\2\2\2\"\u00aa\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(\3\3\2\2\2).\5\6\4\2*.\5\b\5\2+.\5\n\6\2,.\5\f\7\2-"+
		")\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7\3\2\2\60\65\5"+
		"\34\17\2\61\62\7\4\2\2\62\64\5\34\17\2\63\61\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\5\2\29\7\3\2\2"+
		"\2:;\7\6\2\2;@\5\36\20\2<=\7\7\2\2=?\5\36\20\2><\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\5\2\2D\t\3\2\2\2EF\7\b\2\2FG"+
		"\7\26\2\2GH\7\t\2\2HL\7\n\2\2IK\5\f\7\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2"+
		"LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\5\2\2P\13\3\2\2\2QY\5\16\b\2RY\5\20"+
		"\t\2SY\5\22\n\2TY\5\24\13\2UY\5\26\f\2VY\5\30\r\2WY\5\32\16\2XQ\3\2\2"+
		"\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\r\3\2"+
		"\2\2Z[\7\13\2\2[`\5 \21\2\\]\7\4\2\2]_\5 \21\2^\\\3\2\2\2_b\3\2\2\2`^"+
		"\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\7\2\2d\17\3\2\2\2ef\7\f\2\2"+
		"fk\5\"\22\2gh\7\4\2\2hj\5\"\22\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2ln\3\2\2\2mk\3\2\2\2no\7\7\2\2o\21\3\2\2\2pq\7\r\2\2qv\5 \21\2rs\7\4"+
		"\2\2su\5 \21\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2yz\7\n\2\2z{\5\f\7\2{|\7\5\2\2|\23\3\2\2\2}~\7\16\2\2~\177\7\27\2"+
		"\2\177\u0083\7\n\2\2\u0080\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\5\2\2\u0087\25\3\2\2\2\u0088\u0089\7\17\2"+
		"\2\u0089\u008a\7\26\2\2\u008a\u008b\7\7\2\2\u008b\27\3\2\2\2\u008c\u008d"+
		"\7\26\2\2\u008d\u008e\7\t\2\2\u008e\u008f\7\7\2\2\u008f\31\3\2\2\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0092\7\21\2\2\u0092\u0093\7\27\2\2\u0093\u0094"+
		"\7\4\2\2\u0094\u0095\7\27\2\2\u0095\u0096\7\22\2\2\u0096\u0097\7\7\2\2"+
		"\u0097\33\3\2\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7\23\2\2\u009a\u009b"+
		"\7\25\2\2\u009b\35\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009e\7\23\2\2\u009e"+
		"\u00a3\7\25\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a2\7\25\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\37\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\7\24"+
		"\2\2\u00a8\u00a9\7\27\2\2\u00a9!\3\2\2\2\u00aa\u00ab\7\26\2\2\u00ab#\3"+
		"\2\2\2\r\'-\65@LX`kv\u0083\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}