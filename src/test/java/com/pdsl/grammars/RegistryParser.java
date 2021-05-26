// Generated from RegistryParser.g4 by ANTLR 4.9
package com.pdsl.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegistryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUM=1, MINUS=2, PRODUCT=3, NUMBER=4, WS=5, END_OF_FILE=6, HELLO=7, WORLD=8;
	public static final int
		RULE_mathematical_expression = 0, RULE_helloWorld = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"mathematical_expression", "helloWorld"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'Hello, '", "'world!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUM", "MINUS", "PRODUCT", "NUMBER", "WS", "END_OF_FILE", "HELLO", 
			"WORLD"
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
	public String getGrammarFileName() { return "RegistryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegistryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Mathematical_expressionContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(RegistryParser.SUM, 0); }
		public TerminalNode MINUS() { return getToken(RegistryParser.MINUS, 0); }
		public TerminalNode PRODUCT() { return getToken(RegistryParser.PRODUCT, 0); }
		public Mathematical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryParserListener ) ((RegistryParserListener)listener).enterMathematical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryParserListener ) ((RegistryParserListener)listener).exitMathematical_expression(this);
		}
	}

	public final Mathematical_expressionContext mathematical_expression() throws RecognitionException {
		Mathematical_expressionContext _localctx = new Mathematical_expressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mathematical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << MINUS) | (1L << PRODUCT))) != 0)) ) {
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

	public static class HelloWorldContext extends ParserRuleContext {
		public TerminalNode HELLO() { return getToken(RegistryParser.HELLO, 0); }
		public TerminalNode WORLD() { return getToken(RegistryParser.WORLD, 0); }
		public List<TerminalNode> WS() { return getTokens(RegistryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RegistryParser.WS, i);
		}
		public TerminalNode EOF() { return getToken(RegistryParser.EOF, 0); }
		public HelloWorldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helloWorld; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryParserListener ) ((RegistryParserListener)listener).enterHelloWorld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegistryParserListener ) ((RegistryParserListener)listener).exitHelloWorld(this);
		}
	}

	public final HelloWorldContext helloWorld() throws RecognitionException {
		HelloWorldContext _localctx = new HelloWorldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_helloWorld);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(HELLO);
			setState(7);
			match(WORLD);
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(8);
				match(WS);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(14);
				match(EOF);
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\24\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\7\3\f\n\3\f\3\16\3\17\13\3\3\3\5\3\22\n\3\3\3"+
		"\2\2\4\2\4\2\3\3\2\3\5\2\23\2\6\3\2\2\2\4\b\3\2\2\2\6\7\t\2\2\2\7\3\3"+
		"\2\2\2\b\t\7\t\2\2\t\r\7\n\2\2\n\f\7\7\2\2\13\n\3\2\2\2\f\17\3\2\2\2\r"+
		"\13\3\2\2\2\r\16\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\20\22\7\2\2\3\21\20"+
		"\3\2\2\2\21\22\3\2\2\2\22\5\3\2\2\2\4\r\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}