// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROJECT=1, BREAK=2, CLASS=3, INTERFACE=4, ENUM=5, ELSE=6, CONST=7, IF=8, 
		NEW=9, PRINT=10, READ=11, RETURN=12, VOID=13, FOR=14, EXTENDS=15, CONTINUE=16, 
		IMPLEMENTS=17, IDENT=18, NUMCONST=19, CHARCONST=20, BOOLEANCONST=21, PRINTABLECHAR=22, 
		LETTER=23, DIGIT=24, WS=25, PLUS=26, MINUS=27, MUL=28, DIV=29, MOD=30, 
		EQ=31, NOTEQ=32, GREATER=33, GEQ=34, LESS=35, LEQ=36, LOGICAND=37, LOGICOR=38, 
		ASS=39, INCR=40, DECR=41, SEMICOLON=42, COMMA=43, PERIOD=44, LPAREN=45, 
		RPAREN=46, LSQ=47, RSQ=48, LCUR=49, RCUR=50, COMMENT=51;
	public static final int
		RULE_project = 0, RULE_constdecl = 1, RULE_enumdecl = 2, RULE_vardecl = 3, 
		RULE_classdecl = 4, RULE_interfacedecl = 5, RULE_interfacemethoddecl = 6, 
		RULE_methoddecl = 7, RULE_formpars = 8, RULE_type = 9, RULE_statement = 10, 
		RULE_designatorstatement = 11, RULE_actpars = 12, RULE_condition = 13, 
		RULE_condterm = 14, RULE_condfact = 15, RULE_expr = 16, RULE_term = 17, 
		RULE_factor = 18, RULE_designator = 19, RULE_assignop = 20, RULE_relop = 21, 
		RULE_addop = 22, RULE_mulop = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"project", "constdecl", "enumdecl", "vardecl", "classdecl", "interfacedecl", 
			"interfacemethoddecl", "methoddecl", "formpars", "type", "statement", 
			"designatorstatement", "actpars", "condition", "condterm", "condfact", 
			"expr", "term", "factor", "designator", "assignop", "relop", "addop", 
			"mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'project'", "'break'", "'class'", "'interface'", "'enum'", "'else'", 
			"'const'", "'if'", "'new'", "'print'", "'read'", "'return'", "'void'", 
			"'for'", "'extends'", "'continue'", "'implements'", null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'='", "'++'", 
			"'--'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROJECT", "BREAK", "CLASS", "INTERFACE", "ENUM", "ELSE", "CONST", 
			"IF", "NEW", "PRINT", "READ", "RETURN", "VOID", "FOR", "EXTENDS", "CONTINUE", 
			"IMPLEMENTS", "IDENT", "NUMCONST", "CHARCONST", "BOOLEANCONST", "PRINTABLECHAR", 
			"LETTER", "DIGIT", "WS", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EQ", 
			"NOTEQ", "GREATER", "GEQ", "LESS", "LEQ", "LOGICAND", "LOGICOR", "ASS", 
			"INCR", "DECR", "SEMICOLON", "COMMA", "PERIOD", "LPAREN", "RPAREN", "LSQ", 
			"RSQ", "LCUR", "RCUR", "COMMENT"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(SimpleLangParser.PROJECT, 0); }
		public TerminalNode IDENT() { return getToken(SimpleLangParser.IDENT, 0); }
		public TerminalNode LCUR() { return getToken(SimpleLangParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(SimpleLangParser.RCUR, 0); }
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<ConstdeclContext> constdecl() {
			return getRuleContexts(ConstdeclContext.class);
		}
		public ConstdeclContext constdecl(int i) {
			return getRuleContext(ConstdeclContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<ClassdeclContext> classdecl() {
			return getRuleContexts(ClassdeclContext.class);
		}
		public ClassdeclContext classdecl(int i) {
			return getRuleContext(ClassdeclContext.class,i);
		}
		public List<EnumdeclContext> enumdecl() {
			return getRuleContexts(EnumdeclContext.class);
		}
		public EnumdeclContext enumdecl(int i) {
			return getRuleContext(EnumdeclContext.class,i);
		}
		public List<InterfacedeclContext> interfacedecl() {
			return getRuleContexts(InterfacedeclContext.class);
		}
		public InterfacedeclContext interfacedecl(int i) {
			return getRuleContext(InterfacedeclContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_project);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PROJECT);
			setState(49);
			match(IDENT);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << ENUM) | (1L << CONST) | (1L << IDENT))) != 0)) {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(50);
					constdecl();
					}
					break;
				case IDENT:
					{
					setState(51);
					vardecl();
					}
					break;
				case CLASS:
					{
					setState(52);
					classdecl();
					}
					break;
				case ENUM:
					{
					setState(53);
					enumdecl();
					}
					break;
				case INTERFACE:
					{
					setState(54);
					interfacedecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(LCUR);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(61);
				methoddecl();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(RCUR);
			setState(68);
			match(EOF);
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

	public static class ConstdeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SimpleLangParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(SimpleLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SimpleLangParser.IDENT, i);
		}
		public List<TerminalNode> ASS() { return getTokens(SimpleLangParser.ASS); }
		public TerminalNode ASS(int i) {
			return getToken(SimpleLangParser.ASS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleLangParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMCONST() { return getTokens(SimpleLangParser.NUMCONST); }
		public TerminalNode NUMCONST(int i) {
			return getToken(SimpleLangParser.NUMCONST, i);
		}
		public List<TerminalNode> CHARCONST() { return getTokens(SimpleLangParser.CHARCONST); }
		public TerminalNode CHARCONST(int i) {
			return getToken(SimpleLangParser.CHARCONST, i);
		}
		public List<TerminalNode> BOOLEANCONST() { return getTokens(SimpleLangParser.BOOLEANCONST); }
		public TerminalNode BOOLEANCONST(int i) {
			return getToken(SimpleLangParser.BOOLEANCONST, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConstdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConstdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitConstdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(CONST);
			setState(71);
			type();
			setState(72);
			match(IDENT);
			setState(73);
			match(ASS);
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				match(IDENT);
				setState(77);
				match(ASS);
				setState(78);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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

	public static class EnumdeclContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SimpleLangParser.ENUM, 0); }
		public List<TerminalNode> IDENT() { return getTokens(SimpleLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SimpleLangParser.IDENT, i);
		}
		public TerminalNode LCUR() { return getToken(SimpleLangParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(SimpleLangParser.RCUR, 0); }
		public List<TerminalNode> ASS() { return getTokens(SimpleLangParser.ASS); }
		public TerminalNode ASS(int i) {
			return getToken(SimpleLangParser.ASS, i);
		}
		public List<TerminalNode> NUMCONST() { return getTokens(SimpleLangParser.NUMCONST); }
		public TerminalNode NUMCONST(int i) {
			return getToken(SimpleLangParser.NUMCONST, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public EnumdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterEnumdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitEnumdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitEnumdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumdeclContext enumdecl() throws RecognitionException {
		EnumdeclContext _localctx = new EnumdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enumdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ENUM);
			setState(87);
			match(IDENT);
			setState(88);
			match(LCUR);
			setState(89);
			match(IDENT);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASS) {
				{
				{
				setState(90);
				match(ASS);
				setState(91);
				match(NUMCONST);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				match(IDENT);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASS) {
					{
					{
					setState(99);
					match(ASS);
					setState(100);
					match(NUMCONST);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RCUR);
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

	public static class VardeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(SimpleLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SimpleLangParser.IDENT, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleLangParser.SEMICOLON, 0); }
		public List<TerminalNode> LSQ() { return getTokens(SimpleLangParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(SimpleLangParser.LSQ, i);
		}
		public List<TerminalNode> RSQ() { return getTokens(SimpleLangParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(SimpleLangParser.RSQ, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			match(IDENT);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQ) {
				{
				{
				setState(115);
				match(LSQ);
				setState(116);
				match(RSQ);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				match(IDENT);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQ) {
					{
					{
					setState(124);
					match(LSQ);
					setState(125);
					match(RSQ);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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

	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SimpleLangParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(SimpleLangParser.IDENT, 0); }
		public List<TerminalNode> LCUR() { return getTokens(SimpleLangParser.LCUR); }
		public TerminalNode LCUR(int i) {
			return getToken(SimpleLangParser.LCUR, i);
		}
		public List<TerminalNode> RCUR() { return getTokens(SimpleLangParser.RCUR); }
		public TerminalNode RCUR(int i) {
			return getToken(SimpleLangParser.RCUR, i);
		}
		public TerminalNode EXTENDS() { return getToken(SimpleLangParser.EXTENDS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(SimpleLangParser.IMPLEMENTS, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitClassdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitClassdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CLASS);
			setState(139);
			match(IDENT);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(140);
				match(EXTENDS);
				setState(141);
				type();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(144);
				match(IMPLEMENTS);
				setState(145);
				type();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					type();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(155);
			match(LCUR);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(156);
				vardecl();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(162);
			match(LCUR);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(163);
				methoddecl();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(RCUR);
			}
			setState(171);
			match(RCUR);
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

	public static class InterfacedeclContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(SimpleLangParser.INTERFACE, 0); }
		public TerminalNode IDENT() { return getToken(SimpleLangParser.IDENT, 0); }
		public TerminalNode LCUR() { return getToken(SimpleLangParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(SimpleLangParser.RCUR, 0); }
		public List<InterfacemethoddeclContext> interfacemethoddecl() {
			return getRuleContexts(InterfacemethoddeclContext.class);
		}
		public InterfacemethoddeclContext interfacemethoddecl(int i) {
			return getRuleContext(InterfacemethoddeclContext.class,i);
		}
		public InterfacedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfacedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfacedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfacedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacedeclContext interfacedecl() throws RecognitionException {
		InterfacedeclContext _localctx = new InterfacedeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfacedecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(INTERFACE);
			setState(174);
			match(IDENT);
			setState(175);
			match(LCUR);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(176);
				interfacemethoddecl();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RCUR);
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

	public static class InterfacemethoddeclContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SimpleLangParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpleLangParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLangParser.VOID, 0); }
		public List<FormparsContext> formpars() {
			return getRuleContexts(FormparsContext.class);
		}
		public FormparsContext formpars(int i) {
			return getRuleContext(FormparsContext.class,i);
		}
		public InterfacemethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacemethoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfacemethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfacemethoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfacemethoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacemethoddeclContext interfacemethoddecl() throws RecognitionException {
		InterfacemethoddeclContext _localctx = new InterfacemethoddeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfacemethoddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(184);
				type();
				}
				break;
			case 2:
				{
				setState(185);
				match(VOID);
				}
				break;
			}
			setState(188);
			match(IDENT);
			setState(189);
			match(LPAREN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(190);
				formpars();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RPAREN);
			setState(197);
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

	public static class MethoddeclContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SimpleLangParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode LCUR() { return getToken(SimpleLangParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(SimpleLangParser.RCUR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLangParser.VOID, 0); }
		public List<FormparsContext> formpars() {
			return getRuleContexts(FormparsContext.class);
		}
		public FormparsContext formpars(int i) {
			return getRuleContext(FormparsContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMethoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMethoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methoddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(199);
				type();
				}
				break;
			case 2:
				{
				setState(200);
				match(VOID);
				}
				break;
			}
			setState(203);
			match(IDENT);
			setState(204);
			match(LPAREN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(205);
				formpars();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(RPAREN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(212);
				vardecl();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(LCUR);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << FOR) | (1L << CONTINUE) | (1L << IDENT) | (1L << LCUR))) != 0)) {
				{
				{
				setState(219);
				statement();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(RCUR);
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

	public static class FormparsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(SimpleLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SimpleLangParser.IDENT, i);
		}
		public List<TerminalNode> LSQ() { return getTokens(SimpleLangParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(SimpleLangParser.LSQ, i);
		}
		public List<TerminalNode> RSQ() { return getTokens(SimpleLangParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(SimpleLangParser.RSQ, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public FormparsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formpars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFormpars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFormpars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFormpars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormparsContext formpars() throws RecognitionException {
		FormparsContext _localctx = new FormparsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formpars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			type();
			setState(228);
			match(IDENT);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQ) {
				{
				{
				setState(229);
				match(LSQ);
				setState(230);
				match(RSQ);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				type();
				setState(238);
				match(IDENT);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQ) {
					{
					{
					setState(239);
					match(LSQ);
					setState(240);
					match(RSQ);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(250);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SimpleLangParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENT);
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

	public static class StatementContext extends ParserRuleContext {
		public List<DesignatorstatementContext> designatorstatement() {
			return getRuleContexts(DesignatorstatementContext.class);
		}
		public DesignatorstatementContext designatorstatement(int i) {
			return getRuleContext(DesignatorstatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpleLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpleLangParser.SEMICOLON, i);
		}
		public TerminalNode IF() { return getToken(SimpleLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(SimpleLangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(SimpleLangParser.ELSE, i);
		}
		public TerminalNode FOR() { return getToken(SimpleLangParser.FOR, 0); }
		public TerminalNode BREAK() { return getToken(SimpleLangParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SimpleLangParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(SimpleLangParser.RETURN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode READ() { return getToken(SimpleLangParser.READ, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(SimpleLangParser.PRINT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public List<TerminalNode> NUMCONST() { return getTokens(SimpleLangParser.NUMCONST); }
		public TerminalNode NUMCONST(int i) {
			return getToken(SimpleLangParser.NUMCONST, i);
		}
		public TerminalNode LCUR() { return getToken(SimpleLangParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(SimpleLangParser.RCUR, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				designatorstatement();
				setState(254);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(IF);
				setState(257);
				match(LPAREN);
				setState(258);
				condition();
				setState(259);
				match(RPAREN);
				setState(260);
				statement();
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(261);
						match(ELSE);
						setState(262);
						statement();
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(FOR);
				setState(269);
				match(LPAREN);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(270);
					designatorstatement();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(SEMICOLON);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IDENT) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST) | (1L << MINUS) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(277);
					condition();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(SEMICOLON);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(284);
					designatorstatement();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(RPAREN);
				setState(291);
				statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(BREAK);
				setState(293);
				match(SEMICOLON);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(CONTINUE);
				setState(295);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(RETURN);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IDENT) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST) | (1L << MINUS) | (1L << LPAREN))) != 0)) {
					{
					{
					setState(297);
					expr();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(SEMICOLON);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(READ);
				setState(305);
				match(LPAREN);
				setState(306);
				designator();
				setState(307);
				match(RPAREN);
				setState(308);
				match(SEMICOLON);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(310);
				match(PRINT);
				setState(311);
				match(LPAREN);
				setState(312);
				expr();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					match(NUMCONST);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				match(RPAREN);
				setState(321);
				match(SEMICOLON);
				}
				break;
			case LCUR:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				match(LCUR);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << FOR) | (1L << CONTINUE) | (1L << IDENT) | (1L << LCUR))) != 0)) {
					{
					{
					setState(324);
					statement();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(RCUR);
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

	public static class DesignatorstatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public AssignopContext assignop() {
			return getRuleContext(AssignopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public TerminalNode INCR() { return getToken(SimpleLangParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(SimpleLangParser.DECR, 0); }
		public ActparsContext actpars() {
			return getRuleContext(ActparsContext.class,0);
		}
		public DesignatorstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorstatementContext designatorstatement() throws RecognitionException {
		DesignatorstatementContext _localctx = new DesignatorstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_designatorstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			designator();
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASS:
				{
				setState(334);
				assignop();
				setState(335);
				expr();
				}
				break;
			case LPAREN:
				{
				setState(337);
				match(LPAREN);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IDENT) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST) | (1L << MINUS) | (1L << LPAREN))) != 0)) {
					{
					setState(338);
					actpars();
					}
				}

				setState(341);
				match(RPAREN);
				}
				break;
			case INCR:
				{
				setState(342);
				match(INCR);
				}
				break;
			case DECR:
				{
				setState(343);
				match(DECR);
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

	public static class ActparsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ActparsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actpars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterActpars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitActpars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitActpars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActparsContext actpars() throws RecognitionException {
		ActparsContext _localctx = new ActparsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actpars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			expr();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(347);
				match(COMMA);
				setState(348);
				expr();
				}
				}
				setState(353);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<CondtermContext> condterm() {
			return getRuleContexts(CondtermContext.class);
		}
		public CondtermContext condterm(int i) {
			return getRuleContext(CondtermContext.class,i);
		}
		public List<TerminalNode> LOGICOR() { return getTokens(SimpleLangParser.LOGICOR); }
		public TerminalNode LOGICOR(int i) {
			return getToken(SimpleLangParser.LOGICOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			condterm();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICOR) {
				{
				{
				setState(355);
				match(LOGICOR);
				setState(356);
				condterm();
				}
				}
				setState(361);
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

	public static class CondtermContext extends ParserRuleContext {
		public List<CondfactContext> condfact() {
			return getRuleContexts(CondfactContext.class);
		}
		public CondfactContext condfact(int i) {
			return getRuleContext(CondfactContext.class,i);
		}
		public List<TerminalNode> LOGICAND() { return getTokens(SimpleLangParser.LOGICAND); }
		public TerminalNode LOGICAND(int i) {
			return getToken(SimpleLangParser.LOGICAND, i);
		}
		public CondtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondtermContext condterm() throws RecognitionException {
		CondtermContext _localctx = new CondtermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			condfact();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAND) {
				{
				{
				setState(363);
				match(LOGICAND);
				setState(364);
				condfact();
				}
				}
				setState(369);
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

	public static class CondfactContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondfactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condfact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondfact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondfact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondfact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondfactContext condfact() throws RecognitionException {
		CondfactContext _localctx = new CondfactContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condfact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			expr();
			{
			setState(371);
			relop();
			setState(372);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SimpleLangParser.MINUS, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(374);
				match(MINUS);
				}
			}

			setState(377);
			term();
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					addop();
					setState(379);
					term();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			factor();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(387);
				mulop();
				setState(388);
				factor();
				}
				}
				setState(394);
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

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleLangParser.RPAREN, 0); }
		public ActparsContext actpars() {
			return getRuleContext(ActparsContext.class,0);
		}
		public TerminalNode NUMCONST() { return getToken(SimpleLangParser.NUMCONST, 0); }
		public TerminalNode CHARCONST() { return getToken(SimpleLangParser.CHARCONST, 0); }
		public TerminalNode BOOLEANCONST() { return getToken(SimpleLangParser.BOOLEANCONST, 0); }
		public TerminalNode NEW() { return getToken(SimpleLangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LSQ() { return getTokens(SimpleLangParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(SimpleLangParser.LSQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RSQ() { return getTokens(SimpleLangParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(SimpleLangParser.RSQ, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				designator();
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(396);
					match(LPAREN);
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IDENT) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST) | (1L << MINUS) | (1L << LPAREN))) != 0)) {
						{
						setState(397);
						actpars();
						}
					}

					setState(400);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case NUMCONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(NUMCONST);
				}
				break;
			case CHARCONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(CHARCONST);
				}
				break;
			case BOOLEANCONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(BOOLEANCONST);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				match(NEW);
				setState(407);
				type();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQ) {
					{
					{
					setState(408);
					match(LSQ);
					setState(409);
					expr();
					setState(410);
					match(RSQ);
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				match(LPAREN);
				setState(418);
				expr();
				setState(419);
				match(RPAREN);
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

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(SimpleLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SimpleLangParser.IDENT, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(SimpleLangParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(SimpleLangParser.PERIOD, i);
		}
		public List<TerminalNode> LSQ() { return getTokens(SimpleLangParser.LSQ); }
		public TerminalNode LSQ(int i) {
			return getToken(SimpleLangParser.LSQ, i);
		}
		public List<TerminalNode> RSQ() { return getTokens(SimpleLangParser.RSQ); }
		public TerminalNode RSQ(int i) {
			return getToken(SimpleLangParser.RSQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(IDENT);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD || _la==LSQ) {
				{
				setState(434);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERIOD:
					{
					setState(424);
					match(PERIOD);
					setState(425);
					match(IDENT);
					}
					break;
				case LSQ:
					{
					setState(426);
					match(LSQ);
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IDENT) | (1L << NUMCONST) | (1L << CHARCONST) | (1L << BOOLEANCONST) | (1L << MINUS) | (1L << LPAREN))) != 0)) {
						{
						{
						setState(427);
						expr();
						}
						}
						setState(432);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(433);
					match(RSQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(438);
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

	public static class AssignopContext extends ParserRuleContext {
		public TerminalNode ASS() { return getToken(SimpleLangParser.ASS, 0); }
		public AssignopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignopContext assignop() throws RecognitionException {
		AssignopContext _localctx = new AssignopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(ASS);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SimpleLangParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(SimpleLangParser.NOTEQ, 0); }
		public TerminalNode GREATER() { return getToken(SimpleLangParser.GREATER, 0); }
		public TerminalNode GEQ() { return getToken(SimpleLangParser.GEQ, 0); }
		public TerminalNode LESS() { return getToken(SimpleLangParser.LESS, 0); }
		public TerminalNode LEQ() { return getToken(SimpleLangParser.LEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << GREATER) | (1L << GEQ) | (1L << LESS) | (1L << LEQ))) != 0)) ) {
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SimpleLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLangParser.MINUS, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAddop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SimpleLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimpleLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimpleLangParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\7\2A\n\2"+
		"\f\2\16\2D\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3R\n"+
		"\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13"+
		"\4\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\7\4m\n\4\f\4\16\4p\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\7\5\u0081"+
		"\n\5\f\5\16\5\u0084\13\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6\u0091\n\6\3\6\3\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a"+
		"\13\6\5\6\u009c\n\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\3\6"+
		"\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7"+
		"\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\3\7\3\b\3\b\5\b\u00bd\n\b\3\b\3\b\3"+
		"\b\7\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3\b\3\b\3\b\3\t\3\t\5\t\u00cc\n\t"+
		"\3\t\3\t\3\t\7\t\u00d1\n\t\f\t\16\t\u00d4\13\t\3\t\3\t\7\t\u00d8\n\t\f"+
		"\t\16\t\u00db\13\t\3\t\3\t\7\t\u00df\n\t\f\t\16\t\u00e2\13\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n\u00f4\n\n\f\n\16\n\u00f7\13\n\7\n\u00f9\n\n\f\n\16\n\u00fc\13\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010a\n\f\f\f\16\f\u010d"+
		"\13\f\3\f\3\f\3\f\7\f\u0112\n\f\f\f\16\f\u0115\13\f\3\f\3\f\7\f\u0119"+
		"\n\f\f\f\16\f\u011c\13\f\3\f\3\f\7\f\u0120\n\f\f\f\16\f\u0123\13\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u012d\n\f\f\f\16\f\u0130\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u013e\n\f\f\f\16\f\u0141"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u0148\n\f\f\f\16\f\u014b\13\f\3\f\5\f\u014e"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0156\n\r\3\r\3\r\3\r\5\r\u015b\n\r\3"+
		"\16\3\16\3\16\7\16\u0160\n\16\f\16\16\16\u0163\13\16\3\17\3\17\3\17\7"+
		"\17\u0168\n\17\f\17\16\17\u016b\13\17\3\20\3\20\3\20\7\20\u0170\n\20\f"+
		"\20\16\20\u0173\13\20\3\21\3\21\3\21\3\21\3\22\5\22\u017a\n\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0180\n\22\f\22\16\22\u0183\13\22\3\23\3\23\3\23\3"+
		"\23\7\23\u0189\n\23\f\23\16\23\u018c\13\23\3\24\3\24\3\24\5\24\u0191\n"+
		"\24\3\24\5\24\u0194\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u019f\n\24\f\24\16\24\u01a2\13\24\3\24\3\24\3\24\3\24\5\24\u01a8"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u01af\n\25\f\25\16\25\u01b2\13\25"+
		"\3\25\7\25\u01b5\n\25\f\25\16\25\u01b8\13\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\6\3\2\25\27\3\2!&\3\2\34\35\3\2\36 \2\u01eb\2\62\3\2\2\2\4"+
		"H\3\2\2\2\6X\3\2\2\2\bs\3\2\2\2\n\u008c\3\2\2\2\f\u00af\3\2\2\2\16\u00bc"+
		"\3\2\2\2\20\u00cb\3\2\2\2\22\u00e5\3\2\2\2\24\u00fd\3\2\2\2\26\u014d\3"+
		"\2\2\2\30\u014f\3\2\2\2\32\u015c\3\2\2\2\34\u0164\3\2\2\2\36\u016c\3\2"+
		"\2\2 \u0174\3\2\2\2\"\u0179\3\2\2\2$\u0184\3\2\2\2&\u01a7\3\2\2\2(\u01a9"+
		"\3\2\2\2*\u01b9\3\2\2\2,\u01bb\3\2\2\2.\u01bd\3\2\2\2\60\u01bf\3\2\2\2"+
		"\62\63\7\3\2\2\63;\7\24\2\2\64:\5\4\3\2\65:\5\b\5\2\66:\5\n\6\2\67:\5"+
		"\6\4\28:\5\f\7\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2"+
		"\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>B\7\63\2\2?A\5"+
		"\20\t\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF"+
		"\7\64\2\2FG\7\2\2\3G\3\3\2\2\2HI\7\t\2\2IJ\5\24\13\2JK\7\24\2\2KL\7)\2"+
		"\2LS\t\2\2\2MN\7-\2\2NO\7\24\2\2OP\7)\2\2PR\t\2\2\2QM\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7,\2\2W\5\3\2\2\2XY\7\7\2"+
		"\2YZ\7\24\2\2Z[\7\63\2\2[`\7\24\2\2\\]\7)\2\2]_\7\25\2\2^\\\3\2\2\2_b"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2an\3\2\2\2b`\3\2\2\2cd\7-\2\2di\7\24\2\2e"+
		"f\7)\2\2fh\7\25\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2lc\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2"+
		"qr\7\64\2\2r\7\3\2\2\2st\5\24\13\2ty\7\24\2\2uv\7\61\2\2vx\7\62\2\2wu"+
		"\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0087\3\2\2\2{y\3\2\2\2|}\7-\2"+
		"\2}\u0082\7\24\2\2~\177\7\61\2\2\177\u0081\7\62\2\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085|\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7,\2\2\u008b\t\3\2\2\2\u008c\u008d\7\5\2\2\u008d\u0090\7\24\2\2"+
		"\u008e\u008f\7\21\2\2\u008f\u0091\5\24\13\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u009b\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0098\5"+
		"\24\13\2\u0094\u0095\7-\2\2\u0095\u0097\5\24\13\2\u0096\u0094\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a1\7\63\2\2\u009e\u00a0\5\b\5\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\7\63\2\2\u00a5\u00a7\5"+
		"\20\t\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\64"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\64\2\2\u00ae\13\3\2\2\2\u00af\u00b0"+
		"\7\6\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b5\7\63\2\2\u00b2\u00b4\5\16\b"+
		"\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\64\2\2"+
		"\u00b9\r\3\2\2\2\u00ba\u00bd\5\24\13\2\u00bb\u00bd\7\17\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7\24\2\2\u00bf\u00c3\7/\2\2\u00c0\u00c2\5\22\n\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7\u00c8\7"+
		",\2\2\u00c8\17\3\2\2\2\u00c9\u00cc\5\24\13\2\u00ca\u00cc\7\17\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\7\24\2\2\u00ce\u00d2\7/\2\2\u00cf\u00d1\5\22\n\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9\7\60\2\2\u00d6"+
		"\u00d8\5\b\5\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00e0\7\63\2\2\u00dd\u00df\5\26\f\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7\64\2\2\u00e4\21\3\2\2\2\u00e5\u00e6\5\24"+
		"\13\2\u00e6\u00eb\7\24\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ea\7\62\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00fa\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7-\2\2\u00ef"+
		"\u00f0\5\24\13\2\u00f0\u00f5\7\24\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f4"+
		"\7\62\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00ee"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\23\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\24\2\2\u00fe\25\3\2\2\2"+
		"\u00ff\u0100\5\30\r\2\u0100\u0101\7,\2\2\u0101\u014e\3\2\2\2\u0102\u0103"+
		"\7\n\2\2\u0103\u0104\7/\2\2\u0104\u0105\5\34\17\2\u0105\u0106\7\60\2\2"+
		"\u0106\u010b\5\26\f\2\u0107\u0108\7\b\2\2\u0108\u010a\5\26\f\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u014e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\20\2\2\u010f\u0113\7"+
		"/\2\2\u0110\u0112\5\30\r\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u011a\7,\2\2\u0117\u0119\5\34\17\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u0121\7,\2\2\u011e\u0120\5\30\r\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\60\2\2\u0125"+
		"\u014e\5\26\f\2\u0126\u0127\7\4\2\2\u0127\u014e\7,\2\2\u0128\u0129\7\22"+
		"\2\2\u0129\u014e\7,\2\2\u012a\u012e\7\16\2\2\u012b\u012d\5\"\22\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u014e\7,\2\2\u0132"+
		"\u0133\7\r\2\2\u0133\u0134\7/\2\2\u0134\u0135\5(\25\2\u0135\u0136\7\60"+
		"\2\2\u0136\u0137\7,\2\2\u0137\u014e\3\2\2\2\u0138\u0139\7\f\2\2\u0139"+
		"\u013a\7/\2\2\u013a\u013f\5\"\22\2\u013b\u013c\7-\2\2\u013c\u013e\7\25"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\60"+
		"\2\2\u0143\u0144\7,\2\2\u0144\u014e\3\2\2\2\u0145\u0149\7\63\2\2\u0146"+
		"\u0148\5\26\f\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3"+
		"\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\7\64\2\2\u014d\u00ff\3\2\2\2\u014d\u0102\3\2\2\2\u014d\u010e\3"+
		"\2\2\2\u014d\u0126\3\2\2\2\u014d\u0128\3\2\2\2\u014d\u012a\3\2\2\2\u014d"+
		"\u0132\3\2\2\2\u014d\u0138\3\2\2\2\u014d\u0145\3\2\2\2\u014e\27\3\2\2"+
		"\2\u014f\u015a\5(\25\2\u0150\u0151\5*\26\2\u0151\u0152\5\"\22\2\u0152"+
		"\u015b\3\2\2\2\u0153\u0155\7/\2\2\u0154\u0156\5\32\16\2\u0155\u0154\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015b\7\60\2\2\u0158"+
		"\u015b\7*\2\2\u0159\u015b\7+\2\2\u015a\u0150\3\2\2\2\u015a\u0153\3\2\2"+
		"\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\31\3\2\2\2\u015c\u0161"+
		"\5\"\22\2\u015d\u015e\7-\2\2\u015e\u0160\5\"\22\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\33"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0169\5\36\20\2\u0165\u0166\7(\2\2"+
		"\u0166\u0168\5\36\20\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\35\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u0171\5 \21\2\u016d\u016e\7\'\2\2\u016e\u0170\5 \21\2\u016f\u016d\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\37\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5\"\22\2\u0175\u0176\5,\27"+
		"\2\u0176\u0177\5\"\22\2\u0177!\3\2\2\2\u0178\u017a\7\35\2\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0181\5$\23\2\u017c"+
		"\u017d\5.\30\2\u017d\u017e\5$\23\2\u017e\u0180\3\2\2\2\u017f\u017c\3\2"+
		"\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"#\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u018a\5&\24\2\u0185\u0186\5\60\31"+
		"\2\u0186\u0187\5&\24\2\u0187\u0189\3\2\2\2\u0188\u0185\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b%\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0193\5(\25\2\u018e\u0190\7/\2\2\u018f\u0191\5\32"+
		"\16\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\7\60\2\2\u0193\u018e\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u01a8\3"+
		"\2\2\2\u0195\u01a8\7\25\2\2\u0196\u01a8\7\26\2\2\u0197\u01a8\7\27\2\2"+
		"\u0198\u0199\7\13\2\2\u0199\u01a0\5\24\13\2\u019a\u019b\7\61\2\2\u019b"+
		"\u019c\5\"\22\2\u019c\u019d\7\62\2\2\u019d\u019f\3\2\2\2\u019e\u019a\3"+
		"\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a8\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7/\2\2\u01a4\u01a5\5\""+
		"\22\2\u01a5\u01a6\7\60\2\2\u01a6\u01a8\3\2\2\2\u01a7\u018d\3\2\2\2\u01a7"+
		"\u0195\3\2\2\2\u01a7\u0196\3\2\2\2\u01a7\u0197\3\2\2\2\u01a7\u0198\3\2"+
		"\2\2\u01a7\u01a3\3\2\2\2\u01a8\'\3\2\2\2\u01a9\u01b6\7\24\2\2\u01aa\u01ab"+
		"\7.\2\2\u01ab\u01b5\7\24\2\2\u01ac\u01b0\7\61\2\2\u01ad\u01af\5\"\22\2"+
		"\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7\62\2\2"+
		"\u01b4\u01aa\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7)\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01ba\7)\2\2\u01ba+\3\2\2\2\u01bb\u01bc\t\3\2\2\u01bc-\3\2\2\2\u01bd"+
		"\u01be\t\4\2\2\u01be/\3\2\2\2\u01bf\u01c0\t\5\2\2\u01c0\61\3\2\2\2\62"+
		"9;BS`iny\u0082\u0087\u0090\u0098\u009b\u00a1\u00a8\u00b5\u00bc\u00c3\u00cb"+
		"\u00d2\u00d9\u00e0\u00eb\u00f5\u00fa\u010b\u0113\u011a\u0121\u012e\u013f"+
		"\u0149\u014d\u0155\u015a\u0161\u0169\u0171\u0179\u0181\u018a\u0190\u0193"+
		"\u01a0\u01a7\u01b0\u01b4\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}