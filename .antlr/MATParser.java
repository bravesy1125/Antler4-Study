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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, CHANNEL=24, 
		ID=25, NUMBER=26, FLOATNUMBER=27, WS=28, LINE_COMMENT=29, COMMENT=30;
	public static final int
		RULE_start = 0, RULE_defs = 1, RULE_defpinmaps = 2, RULE_defpingroups = 3, 
		RULE_deftimeset = 4, RULE_defvoltagelevels = 5, RULE_deffunc = 6, RULE_labeled_statement = 7, 
		RULE_stmt = 8, RULE_stmttimeset = 9, RULE_stmtset = 10, RULE_stmtread = 11, 
		RULE_stmtinc = 12, RULE_stmtdec = 13, RULE_stmtgoto = 14, RULE_stmtcall = 15, 
		RULE_stmtrepeat = 16, RULE_stmtloop = 17, RULE_stmtif = 18, RULE_stmtelse = 19, 
		RULE_stmtwhile = 20, RULE_map = 21, RULE_pingroup = 22, RULE_timeset = 23, 
		RULE_voltagelevel = 24, RULE_setexp = 25, RULE_readexp = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "defs", "defpinmaps", "defpingroups", "deftimeset", "defvoltagelevels", 
			"deffunc", "labeled_statement", "stmt", "stmttimeset", "stmtset", "stmtread", 
			"stmtinc", "stmtdec", "stmtgoto", "stmtcall", "stmtrepeat", "stmtloop", 
			"stmtif", "stmtelse", "stmtwhile", "map", "pingroup", "timeset", "voltagelevel", 
			"setexp", "readexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pinmaps'", "'{'", "','", "'}'", "'pingroups'", "';'", "'timeset'", 
			"'voltagelevels'", "'def'", "'()'", "':'", "'set'", "'read'", "'inc'", 
			"'dec'", "'goto'", "'repeat'", "'loop'", "'if'", "'else'", "'while'", 
			"'s'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CHANNEL", "ID", "NUMBER", "FLOATNUMBER", "WS", "LINE_COMMENT", "COMMENT"
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				defs();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) );
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
		public DefpinmapsContext defpinmaps() {
			return getRuleContext(DefpinmapsContext.class,0);
		}
		public DefpingroupsContext defpingroups() {
			return getRuleContext(DefpingroupsContext.class,0);
		}
		public DeffuncContext deffunc() {
			return getRuleContext(DeffuncContext.class,0);
		}
		public DeftimesetContext deftimeset() {
			return getRuleContext(DeftimesetContext.class,0);
		}
		public DefvoltagelevelsContext defvoltagelevels() {
			return getRuleContext(DefvoltagelevelsContext.class,0);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				defpinmaps();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				defpingroups();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				deffunc();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				deftimeset();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				defvoltagelevels();
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

	public static class DefpinmapsContext extends ParserRuleContext {
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public DefpinmapsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defpinmaps; }
	}

	public final DefpinmapsContext defpinmaps() throws RecognitionException {
		DefpinmapsContext _localctx = new DefpinmapsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defpinmaps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(T__1);
			setState(68);
			map();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(69);
				match(T__2);
				setState(70);
				map();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
			setState(78);
			match(T__4);
			setState(79);
			match(T__1);
			setState(80);
			pingroup();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(81);
				match(T__5);
				setState(82);
				pingroup();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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

	public static class DeftimesetContext extends ParserRuleContext {
		public List<TimesetContext> timeset() {
			return getRuleContexts(TimesetContext.class);
		}
		public TimesetContext timeset(int i) {
			return getRuleContext(TimesetContext.class,i);
		}
		public DeftimesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deftimeset; }
	}

	public final DeftimesetContext deftimeset() throws RecognitionException {
		DeftimesetContext _localctx = new DeftimesetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deftimeset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			match(T__1);
			setState(92);
			timeset();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(93);
				match(T__5);
				setState(94);
				timeset();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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

	public static class DefvoltagelevelsContext extends ParserRuleContext {
		public List<VoltagelevelContext> voltagelevel() {
			return getRuleContexts(VoltagelevelContext.class);
		}
		public VoltagelevelContext voltagelevel(int i) {
			return getRuleContext(VoltagelevelContext.class,i);
		}
		public DefvoltagelevelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvoltagelevels; }
	}

	public final DefvoltagelevelsContext defvoltagelevels() throws RecognitionException {
		DefvoltagelevelsContext _localctx = new DefvoltagelevelsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defvoltagelevels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__7);
			setState(103);
			match(T__1);
			setState(104);
			voltagelevel();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(105);
				match(T__5);
				setState(106);
				voltagelevel();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		enterRule(_localctx, 12, RULE_deffunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(115);
			match(ID);
			setState(116);
			match(T__9);
			setState(117);
			match(T__1);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				labeled_statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
		enterRule(_localctx, 14, RULE_labeled_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(ID);
					setState(127);
					match(T__10);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(133);
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
		public StmtrepeatContext stmtrepeat() {
			return getRuleContext(StmtrepeatContext.class,0);
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
		public StmttimesetContext stmttimeset() {
			return getRuleContext(StmttimesetContext.class,0);
		}
		public StmtwhileContext stmtwhile() {
			return getRuleContext(StmtwhileContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				stmtset();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				stmtread();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				stmtif();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				stmtrepeat();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				stmtloop();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				stmtgoto();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				stmtcall();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				stmtinc();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				stmtdec();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				stmttimeset();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				stmtwhile();
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

	public static class StmttimesetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public StmttimesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmttimeset; }
	}

	public final StmttimesetContext stmttimeset() throws RecognitionException {
		StmttimesetContext _localctx = new StmttimesetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmttimeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__6);
			setState(149);
			match(ID);
			setState(150);
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
		enterRule(_localctx, 20, RULE_stmtset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__11);
			setState(153);
			setexp();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(154);
				match(T__2);
				setState(155);
				setexp();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		enterRule(_localctx, 22, RULE_stmtread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__12);
			setState(164);
			readexp();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(165);
				match(T__2);
				setState(166);
				readexp();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
		enterRule(_localctx, 24, RULE_stmtinc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__13);
			setState(175);
			match(ID);
			setState(176);
			match(T__2);
			setState(177);
			match(NUMBER);
			setState(178);
			match(T__10);
			setState(179);
			match(NUMBER);
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
		enterRule(_localctx, 26, RULE_stmtdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__14);
			setState(183);
			match(ID);
			setState(184);
			match(T__2);
			setState(185);
			match(NUMBER);
			setState(186);
			match(T__10);
			setState(187);
			match(NUMBER);
			setState(188);
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

	public static class StmtgotoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public StmtgotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtgoto; }
	}

	public final StmtgotoContext stmtgoto() throws RecognitionException {
		StmtgotoContext _localctx = new StmtgotoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmtgoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__15);
			setState(191);
			match(ID);
			setState(192);
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
		enterRule(_localctx, 30, RULE_stmtcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(T__9);
			setState(196);
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

	public static class StmtrepeatContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MATParser.NUMBER, 0); }
		public StmtsetContext stmtset() {
			return getRuleContext(StmtsetContext.class,0);
		}
		public StmtreadContext stmtread() {
			return getRuleContext(StmtreadContext.class,0);
		}
		public StmtrepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtrepeat; }
	}

	public final StmtrepeatContext stmtrepeat() throws RecognitionException {
		StmtrepeatContext _localctx = new StmtrepeatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmtrepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__16);
			setState(199);
			match(NUMBER);
			setState(200);
			match(T__10);
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(201);
				stmtset();
				}
				break;
			case T__12:
				{
				setState(202);
				stmtread();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 34, RULE_stmtloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__17);
			setState(206);
			match(NUMBER);
			setState(207);
			match(T__1);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(208);
				labeled_statement();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
		public StmtelseContext stmtelse() {
			return getRuleContext(StmtelseContext.class,0);
		}
		public StmtifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtif; }
	}

	public final StmtifContext stmtif() throws RecognitionException {
		StmtifContext _localctx = new StmtifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmtif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__18);
			setState(217);
			setexp();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(218);
				match(T__2);
				setState(219);
				setexp();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(T__1);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(226);
				labeled_statement();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__3);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(233);
				stmtelse();
				}
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

	public static class StmtelseContext extends ParserRuleContext {
		public List<Labeled_statementContext> labeled_statement() {
			return getRuleContexts(Labeled_statementContext.class);
		}
		public Labeled_statementContext labeled_statement(int i) {
			return getRuleContext(Labeled_statementContext.class,i);
		}
		public StmtelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtelse; }
	}

	public final StmtelseContext stmtelse() throws RecognitionException {
		StmtelseContext _localctx = new StmtelseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmtelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__19);
			setState(237);
			match(T__1);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(238);
				labeled_statement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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

	public static class StmtwhileContext extends ParserRuleContext {
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
		public StmtwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtwhile; }
	}

	public final StmtwhileContext stmtwhile() throws RecognitionException {
		StmtwhileContext _localctx = new StmtwhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmtwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__20);
			setState(247);
			setexp();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(248);
				match(T__2);
				setState(249);
				setexp();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(T__1);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << ID))) != 0)) {
				{
				{
				setState(256);
				labeled_statement();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
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
		enterRule(_localctx, 42, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			setState(265);
			match(T__10);
			setState(266);
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
		enterRule(_localctx, 44, RULE_pingroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ID);
			setState(269);
			match(T__10);
			setState(270);
			match(CHANNEL);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(271);
				match(T__2);
				setState(272);
				match(CHANNEL);
				}
				}
				setState(277);
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

	public static class TimesetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATParser.ID, 0); }
		public TerminalNode FLOATNUMBER() { return getToken(MATParser.FLOATNUMBER, 0); }
		public TimesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeset; }
	}

	public final TimesetContext timeset() throws RecognitionException {
		TimesetContext _localctx = new TimesetContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_timeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			setState(279);
			match(T__10);
			setState(280);
			match(FLOATNUMBER);
			setState(281);
			match(T__21);
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

	public static class VoltagelevelContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATParser.ID, i);
		}
		public List<TerminalNode> FLOATNUMBER() { return getTokens(MATParser.FLOATNUMBER); }
		public TerminalNode FLOATNUMBER(int i) {
			return getToken(MATParser.FLOATNUMBER, i);
		}
		public VoltagelevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voltagelevel; }
	}

	public final VoltagelevelContext voltagelevel() throws RecognitionException {
		VoltagelevelContext _localctx = new VoltagelevelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_voltagelevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ID);
			setState(284);
			match(T__10);
			setState(285);
			match(ID);
			setState(286);
			match(T__22);
			setState(287);
			match(FLOATNUMBER);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(288);
				match(T__2);
				setState(289);
				match(ID);
				setState(290);
				match(T__22);
				setState(291);
				match(FLOATNUMBER);
				}
				}
				setState(296);
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
		enterRule(_localctx, 50, RULE_setexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ID);
			setState(298);
			match(T__22);
			setState(299);
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
		enterRule(_localctx, 52, RULE_readexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\3\3\3"+
		"\3\3\5\3C\n\3\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7"+
		"\6b\n\6\f\6\16\6e\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\t"+
		"\3\t\7\t\u0083\n\t\f\t\16\t\u0086\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00aa\n"+
		"\r\f\r\16\r\u00ad\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ce\n\22\3\23\3\23\3\23\3\23"+
		"\7\23\u00d4\n\23\f\23\16\23\u00d7\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24\u00df\n\24\f\24\16\24\u00e2\13\24\3\24\3\24\7\24\u00e6\n\24\f\24"+
		"\16\24\u00e9\13\24\3\24\3\24\5\24\u00ed\n\24\3\25\3\25\3\25\7\25\u00f2"+
		"\n\25\f\25\16\25\u00f5\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00fd"+
		"\n\26\f\26\16\26\u0100\13\26\3\26\3\26\7\26\u0104\n\26\f\26\16\26\u0107"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0114"+
		"\n\30\f\30\16\30\u0117\13\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\7\32\u0127\n\32\f\32\16\32\u012a\13\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\2\2\u0137\29\3\2\2\2\4B\3\2\2\2\6D\3"+
		"\2\2\2\bP\3\2\2\2\n\\\3\2\2\2\fh\3\2\2\2\16t\3\2\2\2\20\u0084\3\2\2\2"+
		"\22\u0094\3\2\2\2\24\u0096\3\2\2\2\26\u009a\3\2\2\2\30\u00a5\3\2\2\2\32"+
		"\u00b0\3\2\2\2\34\u00b8\3\2\2\2\36\u00c0\3\2\2\2 \u00c4\3\2\2\2\"\u00c8"+
		"\3\2\2\2$\u00cf\3\2\2\2&\u00da\3\2\2\2(\u00ee\3\2\2\2*\u00f8\3\2\2\2,"+
		"\u010a\3\2\2\2.\u010e\3\2\2\2\60\u0118\3\2\2\2\62\u011d\3\2\2\2\64\u012b"+
		"\3\2\2\2\66\u012f\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<\3\3\2\2\2=C\5\6\4\2>C\5\b\5\2?C\5\16\b\2@C\5\n\6\2AC\5\f\7\2B"+
		"=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\5\3\2\2\2DE\7\3\2\2"+
		"EF\7\4\2\2FK\5,\27\2GH\7\5\2\2HJ\5,\27\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\6\2\2O\7\3\2\2\2PQ\7\7\2\2QR\7\4\2"+
		"\2RW\5.\30\2ST\7\b\2\2TV\5.\30\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XZ\3\2\2\2YW\3\2\2\2Z[\7\6\2\2[\t\3\2\2\2\\]\7\t\2\2]^\7\4\2\2^c\5\60"+
		"\31\2_`\7\b\2\2`b\5\60\31\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df"+
		"\3\2\2\2ec\3\2\2\2fg\7\6\2\2g\13\3\2\2\2hi\7\n\2\2ij\7\4\2\2jo\5\62\32"+
		"\2kl\7\b\2\2ln\5\62\32\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2"+
		"\2\2qo\3\2\2\2rs\7\6\2\2s\r\3\2\2\2tu\7\13\2\2uv\7\33\2\2vw\7\f\2\2w{"+
		"\7\4\2\2xz\5\20\t\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2"+
		"}{\3\2\2\2~\177\7\6\2\2\177\17\3\2\2\2\u0080\u0081\7\33\2\2\u0081\u0083"+
		"\7\r\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\22"+
		"\n\2\u0088\21\3\2\2\2\u0089\u0095\5\26\f\2\u008a\u0095\5\30\r\2\u008b"+
		"\u0095\5&\24\2\u008c\u0095\5\"\22\2\u008d\u0095\5$\23\2\u008e\u0095\5"+
		"\36\20\2\u008f\u0095\5 \21\2\u0090\u0095\5\32\16\2\u0091\u0095\5\34\17"+
		"\2\u0092\u0095\5\24\13\2\u0093\u0095\5*\26\2\u0094\u0089\3\2\2\2\u0094"+
		"\u008a\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2"+
		"\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0097\7\t\2\2\u0097\u0098\7\33\2\2\u0098\u0099\7\b\2\2\u0099"+
		"\25\3\2\2\2\u009a\u009b\7\16\2\2\u009b\u00a0\5\64\33\2\u009c\u009d\7\5"+
		"\2\2\u009d\u009f\5\64\33\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\b\2\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00ab"+
		"\5\66\34\2\u00a7\u00a8\7\5\2\2\u00a8\u00aa\5\66\34\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\b\2\2\u00af\31\3\2\2\2\u00b0"+
		"\u00b1\7\20\2\2\u00b1\u00b2\7\33\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\7"+
		"\34\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00b7\7\b\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb\7\5"+
		"\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\7\34\2\2\u00be"+
		"\u00bf\7\b\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\7\33"+
		"\2\2\u00c2\u00c3\7\b\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00c6"+
		"\7\f\2\2\u00c6\u00c7\7\b\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7\23\2\2\u00c9"+
		"\u00ca\7\34\2\2\u00ca\u00cd\7\r\2\2\u00cb\u00ce\5\26\f\2\u00cc\u00ce\5"+
		"\30\r\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce#\3\2\2\2\u00cf\u00d0"+
		"\7\24\2\2\u00d0\u00d1\7\34\2\2\u00d1\u00d5\7\4\2\2\u00d2\u00d4\5\20\t"+
		"\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\6\2\2\u00d9"+
		"%\3\2\2\2\u00da\u00db\7\25\2\2\u00db\u00e0\5\64\33\2\u00dc\u00dd\7\5\2"+
		"\2\u00dd\u00df\5\64\33\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e7\7\4\2\2\u00e4\u00e6\5\20\t\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7\6\2\2\u00eb\u00ed\5(\25\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\'\3\2\2\2\u00ee\u00ef\7\26\2"+
		"\2\u00ef\u00f3\7\4\2\2\u00f0\u00f2\5\20\t\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\6\2\2\u00f7)\3\2\2\2\u00f8\u00f9"+
		"\7\27\2\2\u00f9\u00fe\5\64\33\2\u00fa\u00fb\7\5\2\2\u00fb\u00fd\5\64\33"+
		"\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0105\7\4\2\2\u0102"+
		"\u0104\5\20\t\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\6\2\2\u0109+\3\2\2\2\u010a\u010b\7\33\2\2\u010b\u010c\7\r\2\2"+
		"\u010c\u010d\7\32\2\2\u010d-\3\2\2\2\u010e\u010f\7\33\2\2\u010f\u0110"+
		"\7\r\2\2\u0110\u0115\7\32\2\2\u0111\u0112\7\5\2\2\u0112\u0114\7\32\2\2"+
		"\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116/\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\33\2\2\u0119"+
		"\u011a\7\r\2\2\u011a\u011b\7\35\2\2\u011b\u011c\7\30\2\2\u011c\61\3\2"+
		"\2\2\u011d\u011e\7\33\2\2\u011e\u011f\7\r\2\2\u011f\u0120\7\33\2\2\u0120"+
		"\u0121\7\31\2\2\u0121\u0128\7\35\2\2\u0122\u0123\7\5\2\2\u0123\u0124\7"+
		"\33\2\2\u0124\u0125\7\31\2\2\u0125\u0127\7\35\2\2\u0126\u0122\3\2\2\2"+
		"\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\63"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\33\2\2\u012c\u012d\7\31\2\2"+
		"\u012d\u012e\7\34\2\2\u012e\65\3\2\2\2\u012f\u0130\7\33\2\2\u0130\67\3"+
		"\2\2\2\27;BKWco{\u0084\u0094\u00a0\u00ab\u00cd\u00d5\u00e0\u00e7\u00ec"+
		"\u00f3\u00fe\u0105\u0115\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}