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
		T__17=18, T__18=19, CHANNEL=20, ID=21, NUMBER=22, WS=23, LINE_COMMENT=24, 
		COMMENT=25;
	public static final int
		RULE_start = 0, RULE_defs = 1, RULE_defpinmap = 2, RULE_defpingroups = 3, 
		RULE_deffunc = 4, RULE_labeled_statement = 5, RULE_stmt = 6, RULE_stmtset = 7, 
		RULE_stmtread = 8, RULE_stmtif = 9, RULE_stmtloop = 10, RULE_stmtgoto = 11, 
		RULE_stmtcall = 12, RULE_stmtinc = 13, RULE_stmtdec = 14, RULE_map = 15, 
		RULE_pingroup = 16, RULE_setexp = 17, RULE_readexp = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "defs", "defpinmap", "defpingroups", "deffunc", "labeled_statement", 
			"stmt", "stmtset", "stmtread", "stmtif", "stmtloop", "stmtgoto", "stmtcall", 
			"stmtinc", "stmtdec", "map", "pingroup", "setexp", "readexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pinmap'", "'{'", "','", "'}'", "'pingroups'", "';'", "'def'", 
			"'()'", "':'", "'set'", "'read'", "'if'", "'loop'", "'goto'", "'inc'", 
			"'('", "')'", "'dec'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "CHANNEL", "ID", "NUMBER", 
			"WS", "LINE_COMMENT", "COMMENT"
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

	public static class StartContext extends ParserRuleContext {
		public List<DefsContext> defs() {
			return getRuleContexts(DefsContext.class);
		}
		public DefsContext defs(int i) {
			return getRuleContext(DefsContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				defs();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6))) != 0) );
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
		public DefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defs; }
	}

	public final DefsContext defs() throws RecognitionException {
		DefsContext _localctx = new DefsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defs);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				defpinmap();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				defpingroups();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				deffunc();
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
			setState(48);
			match(T__0);
			setState(49);
			match(T__1);
			setState(50);
			map();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(51);
				match(T__2);
				setState(52);
				map();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__3);
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
			setState(60);
			match(T__4);
			setState(61);
			match(T__1);
			setState(62);
			pingroup();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(63);
				match(T__5);
				setState(64);
				pingroup();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__3);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public List<Labeled_statementContext> labeled_statement() {
			return getRuleContexts(Labeled_statementContext.class);
		}
		public Labeled_statementContext labeled_statement(int i) {
			return getRuleContext(Labeled_statementContext.class,i);
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
			setState(72);
			match(T__6);
			setState(73);
			match(ID);
			setState(74);
			match(T__7);
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				labeled_statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__3);
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MATParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATParser.ID, i);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labeled_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(ID);
					setState(85);
					match(T__8);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(91);
			stmt();
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
		public StmtdecContext stmtdec() {
			return getRuleContext(StmtdecContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				stmtset();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				stmtread();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				stmtif();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				stmtloop();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				stmtgoto();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				stmtcall();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				stmtinc();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				stmtdec();
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
		enterRule(_localctx, 14, RULE_stmtset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__9);
			setState(104);
			setexp();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(105);
				match(T__2);
				setState(106);
				setexp();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__5);
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
		enterRule(_localctx, 16, RULE_stmtread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__10);
			setState(115);
			readexp();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(116);
				match(T__2);
				setState(117);
				readexp();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__5);
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
		public List<Labeled_statementContext> labeled_statement() {
			return getRuleContexts(Labeled_statementContext.class);
		}
		public Labeled_statementContext labeled_statement(int i) {
			return getRuleContext(Labeled_statementContext.class,i);
		}
		public StmtifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtif; }
	}

	public final StmtifContext stmtif() throws RecognitionException {
		StmtifContext _localctx = new StmtifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmtif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__11);
			setState(126);
			setexp();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(127);
				match(T__2);
				setState(128);
				setexp();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__1);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(135);
				labeled_statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__3);
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
		public List<Labeled_statementContext> labeled_statement() {
			return getRuleContexts(Labeled_statementContext.class);
		}
		public Labeled_statementContext labeled_statement(int i) {
			return getRuleContext(Labeled_statementContext.class,i);
		}
		public StmtloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtloop; }
	}

	public final StmtloopContext stmtloop() throws RecognitionException {
		StmtloopContext _localctx = new StmtloopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmtloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__12);
			setState(144);
			match(NUMBER);
			setState(145);
			match(T__1);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(146);
				labeled_statement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__3);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public StmtgotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtgoto; }
	}

	public final StmtgotoContext stmtgoto() throws RecognitionException {
		StmtgotoContext _localctx = new StmtgotoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmtgoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__13);
			setState(155);
			match(ID);
			setState(156);
			match(T__5);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public StmtcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtcall; }
	}

	public final StmtcallContext stmtcall() throws RecognitionException {
		StmtcallContext _localctx = new StmtcallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(T__7);
			setState(160);
			match(T__5);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
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
		enterRule(_localctx, 26, RULE_stmtinc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__14);
			setState(163);
			match(T__15);
			setState(164);
			match(ID);
			setState(165);
			match(T__2);
			setState(166);
			match(NUMBER);
			setState(167);
			match(T__8);
			setState(168);
			match(NUMBER);
			setState(169);
			match(T__16);
			setState(170);
			match(T__5);
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

	public static class StmtdecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MATParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MATParser.NUMBER, i);
		}
		public StmtdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtdec; }
	}

	public final StmtdecContext stmtdec() throws RecognitionException {
		StmtdecContext _localctx = new StmtdecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmtdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__17);
			setState(173);
			match(T__15);
			setState(174);
			match(ID);
			setState(175);
			match(T__2);
			setState(176);
			match(NUMBER);
			setState(177);
			match(T__8);
			setState(178);
			match(NUMBER);
			setState(179);
			match(T__16);
			setState(180);
			match(T__5);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public TerminalNode CHANNEL() { return getToken(MATParser.CHANNEL, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(T__8);
			setState(184);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
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
		enterRule(_localctx, 32, RULE_pingroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(T__8);
			setState(188);
			match(CHANNEL);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(189);
				match(T__2);
				setState(190);
				match(CHANNEL);
				}
				}
				setState(195);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MATParser.NUMBER, 0); }
		public SetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setexp; }
	}

	public final SetexpContext setexp() throws RecognitionException {
		SetexpContext _localctx = new SetexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_setexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(T__18);
			setState(198);
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
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public ReadexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readexp; }
	}

	public final ReadexpContext readexp() throws RecognitionException {
		ReadexpContext _localctx = new ReadexpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_readexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7"+
		"\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S"+
		"\13\6\3\6\3\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\13\3\13\7\13\u008b\n\13\f"+
		"\13\16\13\u008e\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f"+
		"\u0099\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00c2"+
		"\n\22\f\22\16\22\u00c5\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\2\2\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00cd\2)\3\2\2\2\4"+
		"\60\3\2\2\2\6\62\3\2\2\2\b>\3\2\2\2\nJ\3\2\2\2\fZ\3\2\2\2\16g\3\2\2\2"+
		"\20i\3\2\2\2\22t\3\2\2\2\24\177\3\2\2\2\26\u0091\3\2\2\2\30\u009c\3\2"+
		"\2\2\32\u00a0\3\2\2\2\34\u00a4\3\2\2\2\36\u00ae\3\2\2\2 \u00b8\3\2\2\2"+
		"\"\u00bc\3\2\2\2$\u00c6\3\2\2\2&\u00ca\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\61\5\6\4\2.\61\5\b\5\2/\61\5\n"+
		"\6\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\7\3\2\2\63"+
		"\64\7\4\2\2\649\5 \21\2\65\66\7\5\2\2\668\5 \21\2\67\65\3\2\2\28;\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\6\2\2=\7\3\2\2\2>?"+
		"\7\7\2\2?@\7\4\2\2@E\5\"\22\2AB\7\b\2\2BD\5\"\22\2CA\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\6\2\2I\t\3\2\2\2JK\7\t\2"+
		"\2KL\7\27\2\2LM\7\n\2\2MQ\7\4\2\2NP\5\f\7\2ON\3\2\2\2PS\3\2\2\2QO\3\2"+
		"\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\6\2\2U\13\3\2\2\2VW\7\27\2\2WY"+
		"\7\13\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2"+
		"\2]^\5\16\b\2^\r\3\2\2\2_h\5\20\t\2`h\5\22\n\2ah\5\24\13\2bh\5\26\f\2"+
		"ch\5\30\r\2dh\5\32\16\2eh\5\34\17\2fh\5\36\20\2g_\3\2\2\2g`\3\2\2\2ga"+
		"\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\17\3\2\2\2"+
		"ij\7\f\2\2jo\5$\23\2kl\7\5\2\2ln\5$\23\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\b\2\2s\21\3\2\2\2tu\7\r\2\2uz\5&\24"+
		"\2vw\7\5\2\2wy\5&\24\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|z\3\2\2\2}~\7\b\2\2~\23\3\2\2\2\177\u0080\7\16\2\2\u0080\u0085\5$\23"+
		"\2\u0081\u0082\7\5\2\2\u0082\u0084\5$\23\2\u0083\u0081\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008c\7\4\2\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\6\2\2\u0090\25\3\2\2"+
		"\2\u0091\u0092\7\17\2\2\u0092\u0093\7\30\2\2\u0093\u0097\7\4\2\2\u0094"+
		"\u0096\5\f\7\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\6\2\2\u009b\27\3\2\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7\27"+
		"\2\2\u009e\u009f\7\b\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2"+
		"\7\n\2\2\u00a2\u00a3\7\b\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5"+
		"\u00a6\7\22\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\7"+
		"\30\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\7\23\2\2"+
		"\u00ac\u00ad\7\b\2\2\u00ad\35\3\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0"+
		"\7\22\2\2\u00b0\u00b1\7\27\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\7\30\2"+
		"\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\7\23\2\2\u00b6"+
		"\u00b7\7\b\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\7\13"+
		"\2\2\u00ba\u00bb\7\26\2\2\u00bb!\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be"+
		"\7\13\2\2\u00be\u00c3\7\26\2\2\u00bf\u00c0\7\5\2\2\u00c0\u00c2\7\26\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7"+
		"\u00c8\7\25\2\2\u00c8\u00c9\7\30\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\27\2"+
		"\2\u00cb\'\3\2\2\2\17+\609EQZgoz\u0085\u008c\u0097\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}