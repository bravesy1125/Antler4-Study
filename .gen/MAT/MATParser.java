// Generated from c:\Users\windows\Desktop\COMPILER\antlrtest\MAT.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, SETVALUE=19, PINNAME=20, NUMBER=21, WS=22;
	public static final int
		RULE_defpinmap = 0, RULE_defpingroups = 1, RULE_stmt = 2, RULE_stmtset = 3, 
		RULE_stmtread = 4, RULE_stmtif = 5, RULE_stmtloop = 6, RULE_stmtgoto = 7, 
		RULE_stmtcall = 8, RULE_deffunc = 9, RULE_map = 10, RULE_pingroup = 11, 
		RULE_setexp = 12, RULE_readexp = 13, RULE_channel = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"defpinmap", "defpingroups", "stmt", "stmtset", "stmtread", "stmtif", 
			"stmtloop", "stmtgoto", "stmtcall", "deffunc", "map", "pingroup", "setexp", 
			"readexp", "channel"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterDefpinmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitDefpinmap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitDefpinmap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefpinmapContext defpinmap() throws RecognitionException {
		DefpinmapContext _localctx = new DefpinmapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_defpinmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			map();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32);
				match(T__1);
				setState(33);
				map();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterDefpingroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitDefpingroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitDefpingroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefpingroupsContext defpingroups() throws RecognitionException {
		DefpingroupsContext _localctx = new DefpingroupsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defpingroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__3);
			setState(42);
			pingroup();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(43);
				match(T__4);
				setState(44);
				pingroup();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				stmtset();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				stmtread();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				stmtif();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				stmtloop();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				stmtgoto();
				}
				break;
			case PINNAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				stmtcall();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmtset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmtset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmtset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsetContext stmtset() throws RecognitionException {
		StmtsetContext _localctx = new StmtsetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmtset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			setexp();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(62);
				match(T__1);
				setState(63);
				setexp();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmtread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmtread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmtread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtreadContext stmtread() throws RecognitionException {
		StmtreadContext _localctx = new StmtreadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmtread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__6);
			setState(72);
			readexp();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(73);
				match(T__1);
				setState(74);
				readexp();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmtif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmtif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmtif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtifContext stmtif() throws RecognitionException {
		StmtifContext _localctx = new StmtifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmtif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
			setState(83);
			setexp();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(84);
				match(T__1);
				setState(85);
				setexp();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__8);
			setState(92);
			stmt();
			setState(93);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmtloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmtloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmtloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtloopContext stmtloop() throws RecognitionException {
		StmtloopContext _localctx = new StmtloopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmtloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__9);
			setState(96);
			match(NUMBER);
			setState(97);
			match(T__8);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << PINNAME))) != 0)) {
				{
				{
				setState(98);
				stmt();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmtgoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmtgoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmtgoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtgotoContext stmtgoto() throws RecognitionException {
		StmtgotoContext _localctx = new StmtgotoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmtgoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__10);
			setState(107);
			match(PINNAME);
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

	public static class StmtcallContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public StmtcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterStmtcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitStmtcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitStmtcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtcallContext stmtcall() throws RecognitionException {
		StmtcallContext _localctx = new StmtcallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmtcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PINNAME);
			setState(111);
			match(T__11);
			setState(112);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterDeffunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitDeffunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitDeffunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffuncContext deffunc() throws RecognitionException {
		DeffuncContext _localctx = new DeffuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deffunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__12);
			setState(115);
			match(PINNAME);
			setState(116);
			match(T__11);
			setState(117);
			match(T__8);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << PINNAME))) != 0)) {
				{
				{
				setState(118);
				stmt();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode PINNAME() { return getToken(MATParser.PINNAME, 0); }
		public ChannelContext channel() {
			return getRuleContext(ChannelContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(PINNAME);
			setState(127);
			match(T__13);
			setState(128);
			channel();
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
		public List<ChannelContext> channel() {
			return getRuleContexts(ChannelContext.class);
		}
		public ChannelContext channel(int i) {
			return getRuleContext(ChannelContext.class,i);
		}
		public PingroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pingroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterPingroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitPingroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitPingroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PingroupContext pingroup() throws RecognitionException {
		PingroupContext _localctx = new PingroupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pingroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(PINNAME);
			setState(131);
			match(T__13);
			setState(132);
			channel();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(133);
				match(T__1);
				setState(134);
				channel();
				}
				}
				setState(139);
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
		public TerminalNode SETVALUE() { return getToken(MATParser.SETVALUE, 0); }
		public SetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterSetexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitSetexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitSetexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetexpContext setexp() throws RecognitionException {
		SetexpContext _localctx = new SetexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PINNAME);
			setState(141);
			match(T__14);
			setState(142);
			match(SETVALUE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterReadexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitReadexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitReadexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadexpContext readexp() throws RecognitionException {
		ReadexpContext _localctx = new ReadexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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

	public static class ChannelContext extends ParserRuleContext {
		public ChannelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterChannel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitChannel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MATVisitor ) return ((MATVisitor<? extends T>)visitor).visitChannel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelContext channel() throws RecognitionException {
		ChannelContext _localctx = new ChannelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_channel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003A\b\u0003\n\u0003\f\u0003D\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004L\b"+
		"\u0004\n\u0004\f\u0004O\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005W\b\u0005\n\u0005\f\u0005Z\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006d\b\u0006\n\u0006\f\u0006g\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\tx\b\t\n\t\f\t{\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0088\b\u000b\n\u000b\f\u000b\u008b\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u0010\u0012\u0092\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004:\u0001"+
		"\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000"+
		"\u0000\nR\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000ej\u0001"+
		"\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000"+
		"\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0082\u0001\u0000\u0000\u0000"+
		"\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000"+
		"\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000"+
		"\u001f$\u0003\u0014\n\u0000 !\u0005\u0002\u0000\u0000!#\u0003\u0014\n"+
		"\u0000\" \u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\'(\u0005\u0003\u0000\u0000(\u0001\u0001\u0000\u0000"+
		"\u0000)*\u0005\u0004\u0000\u0000*/\u0003\u0016\u000b\u0000+,\u0005\u0005"+
		"\u0000\u0000,.\u0003\u0016\u000b\u0000-+\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0003\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u00004;\u0003\u0006\u0003\u00005;\u0003"+
		"\b\u0004\u00006;\u0003\n\u0005\u00007;\u0003\f\u0006\u00008;\u0003\u000e"+
		"\u0007\u00009;\u0003\u0010\b\u0000:4\u0001\u0000\u0000\u0000:5\u0001\u0000"+
		"\u0000\u0000:6\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000"+
		"\u0000<=\u0005\u0006\u0000\u0000=B\u0003\u0018\f\u0000>?\u0005\u0002\u0000"+
		"\u0000?A\u0003\u0018\f\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u0005\u0000\u0000F\u0007"+
		"\u0001\u0000\u0000\u0000GH\u0005\u0007\u0000\u0000HM\u0003\u001a\r\u0000"+
		"IJ\u0005\u0002\u0000\u0000JL\u0003\u001a\r\u0000KI\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0005"+
		"\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000SX\u0003"+
		"\u0018\f\u0000TU\u0005\u0002\u0000\u0000UW\u0003\u0018\f\u0000VT\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\\\u0005\t\u0000\u0000\\]\u0003\u0004\u0002\u0000]^\u0005\u0003"+
		"\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000`a\u0005"+
		"\u0015\u0000\u0000ae\u0005\t\u0000\u0000bd\u0003\u0004\u0002\u0000cb\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000i\r\u0001\u0000\u0000\u0000jk\u0005\u000b"+
		"\u0000\u0000kl\u0005\u0014\u0000\u0000lm\u0005\u0005\u0000\u0000m\u000f"+
		"\u0001\u0000\u0000\u0000no\u0005\u0014\u0000\u0000op\u0005\f\u0000\u0000"+
		"pq\u0005\u0005\u0000\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0005\r\u0000"+
		"\u0000st\u0005\u0014\u0000\u0000tu\u0005\f\u0000\u0000uy\u0005\t\u0000"+
		"\u0000vx\u0003\u0004\u0002\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0003\u0000\u0000"+
		"}\u0013\u0001\u0000\u0000\u0000~\u007f\u0005\u0014\u0000\u0000\u007f\u0080"+
		"\u0005\u000e\u0000\u0000\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u0015"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0014\u0000\u0000\u0083\u0084"+
		"\u0005\u000e\u0000\u0000\u0084\u0089\u0003\u001c\u000e\u0000\u0085\u0086"+
		"\u0005\u0002\u0000\u0000\u0086\u0088\u0003\u001c\u000e\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0017"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0014\u0000\u0000\u008d\u008e\u0005\u000f\u0000\u0000\u008e\u008f"+
		"\u0005\u0013\u0000\u0000\u008f\u0019\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0014\u0000\u0000\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0007\u0000\u0000\u0000\u0093\u001d\u0001\u0000\u0000\u0000\t$/:BMXe"+
		"y\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}