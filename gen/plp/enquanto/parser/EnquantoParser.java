// Generated from /home/daniel/Projects/While/src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.7.2
package plp.enquanto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, INT=43, ID=44, Texto=45, Espaco=46;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_instr = 2, RULE_seqInstr = 3, RULE_argsList = 4, 
		RULE_paramsList = 5, RULE_execFuncao = 6, RULE_declFuncao = 7, RULE_seqComando = 8, 
		RULE_comando = 9, RULE_expressao = 10, RULE_bool = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "instr", "seqInstr", "argsList", "paramsList", "execFuncao", 
			"declFuncao", "seqComando", "comando", "expressao", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'='", "':='", "'skip'", "'se'", "'entao'", 
			"'senaose'", "'senao'", "'enquanto'", "'faca'", "'exiba'", "'escreva'", 
			"'para'", "'de'", "'ate'", "'passo'", "'escolha'", "'caso'", "':'", "'outro'", 
			"'{'", "'}'", "'leia'", "'*'", "'+'", "'-'", "'/'", "'^'", "'verdadeiro'", 
			"'falso'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'nao'", "'e'", "'ou'", 
			"'xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "ID", "Texto", "Espaco"
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
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			seqComando();
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

	public static class DeclContext extends ParserRuleContext {
		public DeclFuncaoContext declFuncao() {
			return getRuleContext(DeclFuncaoContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			declFuncao();
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

	public static class InstrContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instr);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				comando();
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

	public static class SeqInstrContext extends ParserRuleContext {
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public SeqInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSeqInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqInstrContext seqInstr() throws RecognitionException {
		SeqInstrContext _localctx = new SeqInstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_seqInstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			instr();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(33);
				match(T__0);
				setState(34);
				instr();
				}
				}
				setState(39);
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

	public static class ArgsListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EnquantoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EnquantoParser.ID, i);
		}
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40);
				match(ID);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(41);
					match(T__1);
					setState(42);
					match(ID);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParamsListContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ParamsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterParamsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitParamsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitParamsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsListContext paramsList() throws RecognitionException {
		ParamsListContext _localctx = new ParamsListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__25) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(50);
				expressao(0);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(51);
					match(T__1);
					setState(52);
					expressao(0);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ExecFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ParamsListContext paramsList() {
			return getRuleContext(ParamsListContext.class,0);
		}
		public ExecFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExecFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExecFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitExecFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecFuncaoContext execFuncao() throws RecognitionException {
		ExecFuncaoContext _localctx = new ExecFuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_execFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(T__2);
			setState(62);
			paramsList();
			setState(63);
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

	public static class DeclFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterDeclFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitDeclFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitDeclFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclFuncaoContext declFuncao() throws RecognitionException {
		DeclFuncaoContext _localctx = new DeclFuncaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(T__2);
			setState(67);
			argsList();
			setState(68);
			match(T__3);
			setState(69);
			match(T__4);
			setState(70);
			expressao(0);
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

	public static class SeqComandoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSeqComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_seqComando);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			comando();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(T__0);
					setState(74);
					comando();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoContext extends ComandoContext {
		public ExecFuncaoContext execFuncao() {
			return getRuleContext(ExecFuncaoContext.class,0);
		}
		public FuncaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuicaoContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeContext extends ComandoContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExibaContext extends ComandoContext {
		public TerminalNode Texto() { return getToken(EnquantoParser.Texto, 0); }
		public ExibaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExiba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExiba(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitExiba(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EscolhaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<SeqComandoContext> seqComando() {
			return getRuleContexts(SeqComandoContext.class);
		}
		public SeqComandoContext seqComando(int i) {
			return getRuleContext(SeqComandoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public EscolhaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnquantoContext extends ComandoContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LacoContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public LacoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLaco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitLaco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitEscreva(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		int _la;
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				setState(81);
				match(T__5);
				setState(82);
				expressao(0);
				}
				break;
			case 2:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ID);
				setState(84);
				match(T__4);
				setState(85);
				expressao(0);
				}
				break;
			case 3:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(T__7);
				setState(88);
				bool(0);
				setState(89);
				match(T__8);
				setState(90);
				comando();
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(91);
						match(T__9);
						setState(92);
						bool(0);
						setState(93);
						match(T__8);
						setState(94);
						comando();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(101);
					match(T__10);
					setState(102);
					comando();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(T__11);
				setState(106);
				bool(0);
				setState(107);
				match(T__12);
				setState(108);
				comando();
				}
				break;
			case 6:
				_localctx = new ExibaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(T__13);
				setState(111);
				match(Texto);
				}
				break;
			case 7:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				match(T__14);
				setState(113);
				expressao(0);
				}
				break;
			case 8:
				_localctx = new LacoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				match(T__15);
				setState(115);
				match(ID);
				setState(116);
				match(T__16);
				setState(117);
				expressao(0);
				setState(118);
				match(T__17);
				setState(119);
				expressao(0);
				setState(120);
				match(T__18);
				setState(121);
				match(INT);
				setState(122);
				match(T__12);
				setState(123);
				comando();
				}
				break;
			case 9:
				_localctx = new EscolhaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				match(T__19);
				setState(126);
				match(ID);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(127);
					match(T__20);
					setState(128);
					expressao(0);
					setState(129);
					match(T__21);
					setState(130);
					seqComando();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__22);
				setState(138);
				match(T__21);
				setState(139);
				seqComando();
				}
				break;
			case 10:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(140);
				match(T__23);
				setState(141);
				seqComando();
				setState(142);
				match(T__24);
				}
				break;
			case 11:
				_localctx = new FuncaoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				execFuncao();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitLeia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitOpBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFuncaoContext extends ExpressaoContext {
		public ExecFuncaoContext execFuncao() {
			return getRuleContext(ExecFuncaoContext.class,0);
		}
		public ExprFuncaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExprFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExprFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitExprFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExpPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__25);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__2);
				setState(152);
				expressao(0);
				setState(153);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new ExprFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				execFuncao();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						match(T__26);
						setState(160);
						expressao(8);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						match(T__27);
						setState(163);
						expressao(7);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						match(T__28);
						setState(166);
						expressao(6);
						}
						break;
					case 4:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(T__29);
						setState(169);
						expressao(5);
						}
						break;
					case 5:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(T__30);
						setState(172);
						expressao(4);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ELogicoContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public ELogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterELogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitELogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitELogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanoContext extends BoolContext {
		public BooleanoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorLogicoContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public XorLogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterXorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitXorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitXorLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaoLogicoContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NaoLogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterNaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitNaoLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitNaoLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpRelContext extends BoolContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitOpRel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolParContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBoolPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitBoolPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OuLogicoContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public OuLogicoContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOuLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOuLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnquantoVisitor ) return ((EnquantoVisitor<? extends T>)visitor).visitOuLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_bool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new BooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(179);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
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
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				expressao(0);
				setState(181);
				match(T__4);
				setState(182);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				expressao(0);
				setState(185);
				match(T__33);
				setState(186);
				expressao(0);
				}
				break;
			case 4:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				expressao(0);
				setState(189);
				match(T__34);
				setState(190);
				expressao(0);
				}
				break;
			case 5:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				expressao(0);
				setState(193);
				match(T__35);
				setState(194);
				expressao(0);
				}
				break;
			case 6:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				expressao(0);
				setState(197);
				match(T__36);
				setState(198);
				expressao(0);
				}
				break;
			case 7:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				expressao(0);
				setState(201);
				match(T__37);
				setState(202);
				expressao(0);
				}
				break;
			case 8:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(T__38);
				setState(205);
				bool(5);
				}
				break;
			case 9:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(T__2);
				setState(207);
				bool(0);
				setState(208);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(212);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(213);
						match(T__39);
						setState(214);
						bool(5);
						}
						break;
					case 2:
						{
						_localctx = new OuLogicoContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(215);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(216);
						match(T__40);
						setState(217);
						bool(4);
						}
						break;
					case 3:
						{
						_localctx = new XorLogicoContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(218);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(219);
						match(T__41);
						setState(220);
						bool(3);
						}
						break;
					}
					} 
				}
				setState(225);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 11:
			return bool_sempred((BoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00e5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\7\5"+
		"&\n\5\f\5\16\5)\13\5\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\5\6\63\n\6"+
		"\3\7\3\7\3\7\7\78\n\7\f\7\16\7;\13\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13c\n\13\f\13\16\13f\13\13\3\13\3\13\5\13j\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0087\n\13\f\13\16"+
		"\13\u008a\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0094\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16\f\u00b3"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d5"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e0\n\r\f\r\16\r\u00e3"+
		"\13\r\3\r\3d\4\26\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\"#\2\u0100"+
		"\2\32\3\2\2\2\4\34\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\62\3\2\2\2\f<\3\2"+
		"\2\2\16>\3\2\2\2\20C\3\2\2\2\22J\3\2\2\2\24\u0093\3\2\2\2\26\u009e\3\2"+
		"\2\2\30\u00d4\3\2\2\2\32\33\5\22\n\2\33\3\3\2\2\2\34\35\5\20\t\2\35\5"+
		"\3\2\2\2\36!\5\4\3\2\37!\5\24\13\2 \36\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2"+
		"\"\'\5\6\4\2#$\7\3\2\2$&\5\6\4\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2"+
		"\2\2(\t\3\2\2\2)\'\3\2\2\2*/\7.\2\2+,\7\4\2\2,.\7.\2\2-+\3\2\2\2.\61\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\62*\3\2\2\2\62"+
		"\63\3\2\2\2\63\13\3\2\2\2\649\5\26\f\2\65\66\7\4\2\2\668\5\26\f\2\67\65"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<\64\3\2\2"+
		"\2<=\3\2\2\2=\r\3\2\2\2>?\7.\2\2?@\7\5\2\2@A\5\f\7\2AB\7\6\2\2B\17\3\2"+
		"\2\2CD\7.\2\2DE\7\5\2\2EF\5\n\6\2FG\7\6\2\2GH\7\7\2\2HI\5\26\f\2I\21\3"+
		"\2\2\2JO\5\24\13\2KL\7\3\2\2LN\5\24\13\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2P\23\3\2\2\2QO\3\2\2\2RS\7.\2\2ST\7\b\2\2T\u0094\5\26\f\2UV"+
		"\7.\2\2VW\7\7\2\2W\u0094\5\26\f\2X\u0094\7\t\2\2YZ\7\n\2\2Z[\5\30\r\2"+
		"[\\\7\13\2\2\\d\5\24\13\2]^\7\f\2\2^_\5\30\r\2_`\7\13\2\2`a\5\24\13\2"+
		"ac\3\2\2\2b]\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2ei\3\2\2\2fd\3\2\2\2"+
		"gh\7\r\2\2hj\5\24\13\2ig\3\2\2\2ij\3\2\2\2j\u0094\3\2\2\2kl\7\16\2\2l"+
		"m\5\30\r\2mn\7\17\2\2no\5\24\13\2o\u0094\3\2\2\2pq\7\20\2\2q\u0094\7/"+
		"\2\2rs\7\21\2\2s\u0094\5\26\f\2tu\7\22\2\2uv\7.\2\2vw\7\23\2\2wx\5\26"+
		"\f\2xy\7\24\2\2yz\5\26\f\2z{\7\25\2\2{|\7-\2\2|}\7\17\2\2}~\5\24\13\2"+
		"~\u0094\3\2\2\2\177\u0080\7\26\2\2\u0080\u0088\7.\2\2\u0081\u0082\7\27"+
		"\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\30\2\2\u0084\u0085\5\22\n\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0081\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\31\2\2\u008c\u008d\7\30\2\2\u008d\u0094\5\22\n\2\u008e\u008f"+
		"\7\32\2\2\u008f\u0090\5\22\n\2\u0090\u0091\7\33\2\2\u0091\u0094\3\2\2"+
		"\2\u0092\u0094\5\16\b\2\u0093R\3\2\2\2\u0093U\3\2\2\2\u0093X\3\2\2\2\u0093"+
		"Y\3\2\2\2\u0093k\3\2\2\2\u0093p\3\2\2\2\u0093r\3\2\2\2\u0093t\3\2\2\2"+
		"\u0093\177\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2\2\2\u0094\25\3"+
		"\2\2\2\u0095\u0096\b\f\1\2\u0096\u009f\7-\2\2\u0097\u009f\7\34\2\2\u0098"+
		"\u009f\7.\2\2\u0099\u009a\7\5\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\6"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009f\5\16\b\2\u009e\u0095\3\2\2\2\u009e"+
		"\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\u00b1\3\2\2\2\u00a0\u00a1\f\t\2\2\u00a1\u00a2\7\35\2\2\u00a2"+
		"\u00b0\5\26\f\n\u00a3\u00a4\f\b\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00b0\5"+
		"\26\f\t\u00a6\u00a7\f\7\2\2\u00a7\u00a8\7\37\2\2\u00a8\u00b0\5\26\f\b"+
		"\u00a9\u00aa\f\6\2\2\u00aa\u00ab\7 \2\2\u00ab\u00b0\5\26\f\7\u00ac\u00ad"+
		"\f\5\2\2\u00ad\u00ae\7!\2\2\u00ae\u00b0\5\26\f\6\u00af\u00a0\3\2\2\2\u00af"+
		"\u00a3\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ac\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\r\1\2\u00b5\u00d5\t\2\2"+
		"\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\5\26\f\2\u00b9"+
		"\u00d5\3\2\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5\26"+
		"\f\2\u00bd\u00d5\3\2\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7%\2\2\u00c0"+
		"\u00c1\5\26\f\2\u00c1\u00d5\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7"+
		"&\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00d5\3\2\2\2\u00c6\u00c7\5\26\f\2\u00c7"+
		"\u00c8\7\'\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00d5\3\2\2\2\u00ca\u00cb\5"+
		"\26\f\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00d5\3\2\2\2\u00ce"+
		"\u00cf\7)\2\2\u00cf\u00d5\5\30\r\7\u00d0\u00d1\7\5\2\2\u00d1\u00d2\5\30"+
		"\r\2\u00d2\u00d3\7\6\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00b4\3\2\2\2\u00d4"+
		"\u00b6\3\2\2\2\u00d4\u00ba\3\2\2\2\u00d4\u00be\3\2\2\2\u00d4\u00c2\3\2"+
		"\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d5\u00e1\3\2\2\2\u00d6\u00d7\f\6\2\2\u00d7\u00d8\7*"+
		"\2\2\u00d8\u00e0\5\30\r\7\u00d9\u00da\f\5\2\2\u00da\u00db\7+\2\2\u00db"+
		"\u00e0\5\30\r\6\u00dc\u00dd\f\4\2\2\u00dd\u00de\7,\2\2\u00de\u00e0\5\30"+
		"\r\5\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\31\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\23 \'/\629<Odi\u0088\u0093\u009e\u00af\u00b1\u00d4"+
		"\u00df\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}