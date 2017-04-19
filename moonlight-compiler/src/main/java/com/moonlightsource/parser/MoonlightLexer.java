// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/bnf/MoonlightLexer.g4 by ANTLR 4.7
package com.moonlightsource.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoonlightLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BYTE=2, SHORT=3, CHAR=4, INT=5, LONG=6, FLOAT=7, DOUBLE=8, 
		STRING=9, VOID=10, ENUM=11, EXTENDS=12, IMPORT=13, INTERFACE=14, NAMESPACE=15, 
		STRUCT=16, ANNOTATION=17, ARRAY=18, Label=19, Literal=20, FieldReq=21, 
		IntegerLiteral=22, FloatingPointLiteral=23, BooleanLiteral=24, CharacterLiteral=25, 
		StringLiteral=26, NullLiteral=27, LPAREN=28, RPAREN=29, LBRACE=30, RBRACE=31, 
		LBRACK=32, RBRACK=33, SEMI=34, COMMA=35, DOT=36, Identifier=37, WS=38, 
		COMMENT=39, LINE_COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "BYTE", "SHORT", "CHAR", "INT", "LONG", "FLOAT", "DOUBLE", 
		"STRING", "VOID", "ENUM", "EXTENDS", "IMPORT", "INTERFACE", "NAMESPACE", 
		"STRUCT", "ANNOTATION", "ARRAY", "Label", "Literal", "FieldReq", "IntegerLiteral", 
		"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", 
		"IntegerTypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
		"DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "HexNumeral", 
		"HexDigits", "HexDigit", "HexDigitsAndUnderscores", "HexDigitOrUnderscore", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "Identifier", "Letter", "LetterOrDigit", "WS", 
		"COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'short'", "'char'", "'int'", "'long'", "'float'", 
		"'double'", "'string'", "'void'", "'enum'", "'extends'", "'import'", "'interface'", 
		"'namespace'", "'struct'", "'annotation'", null, null, null, null, null, 
		null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BYTE", "SHORT", "CHAR", "INT", "LONG", "FLOAT", "DOUBLE", 
		"STRING", "VOID", "ENUM", "EXTENDS", "IMPORT", "INTERFACE", "NAMESPACE", 
		"STRUCT", "ANNOTATION", "ARRAY", "Label", "Literal", "FieldReq", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
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


	public MoonlightLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MoonlightLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0264\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0128\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013a\n\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0140\n\27\3\30\3\30\5\30\u0144\n\30\3\31\3\31\5\31\u0148\n\31\3"+
		"\32\3\32\5\32\u014c\n\32\3\33\3\33\5\33\u0150\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\5\35\u0157\n\35\3\35\3\35\3\35\5\35\u015c\n\35\5\35\u015e\n\35\3"+
		"\36\3\36\5\36\u0162\n\36\3\36\5\36\u0165\n\36\3\37\3\37\5\37\u0169\n\37"+
		"\3 \3 \3!\6!\u016e\n!\r!\16!\u016f\3\"\3\"\5\"\u0174\n\"\3#\6#\u0177\n"+
		"#\r#\16#\u0178\3$\3$\3$\3$\3%\3%\5%\u0181\n%\3%\5%\u0184\n%\3&\3&\3\'"+
		"\6\'\u0189\n\'\r\'\16\'\u018a\3(\3(\5(\u018f\n(\3)\3)\5)\u0193\n)\3)\3"+
		")\3*\3*\5*\u0199\n*\3*\5*\u019c\n*\3+\3+\3,\6,\u01a1\n,\r,\16,\u01a2\3"+
		"-\3-\5-\u01a7\n-\3.\3.\3.\3.\3/\3/\5/\u01af\n/\3/\5/\u01b2\n/\3\60\3\60"+
		"\3\61\6\61\u01b7\n\61\r\61\16\61\u01b8\3\62\3\62\5\62\u01bd\n\62\3\63"+
		"\3\63\5\63\u01c1\n\63\3\64\3\64\3\64\5\64\u01c6\n\64\3\64\5\64\u01c9\n"+
		"\64\3\64\5\64\u01cc\n\64\3\64\3\64\3\64\5\64\u01d1\n\64\3\64\5\64\u01d4"+
		"\n\64\3\64\3\64\3\64\5\64\u01d9\n\64\3\64\3\64\3\64\5\64\u01de\n\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\67\5\67\u01e6\n\67\3\67\3\67\38\38\39\39\3:"+
		"\3:\3:\5:\u01f1\n:\3;\3;\5;\u01f5\n;\3;\3;\3;\5;\u01fa\n;\3;\3;\5;\u01fe"+
		"\n;\3<\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u020e\n>\3?\3?\3?\3?"+
		"\3@\3@\3A\3A\5A\u0218\nA\3A\3A\3B\6B\u021d\nB\rB\16B\u021e\3C\3C\3D\3"+
		"D\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3"+
		"N\7N\u023c\nN\fN\16N\u023f\13N\3O\3O\3P\3P\3Q\6Q\u0246\nQ\rQ\16Q\u0247"+
		"\3Q\3Q\3R\3R\3R\3R\7R\u0250\nR\fR\16R\u0253\13R\3R\3R\3R\3R\3R\3S\3S\3"+
		"S\3S\7S\u025e\nS\fS\16S\u0261\13S\3S\3S\3\u0251\2T\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M"+
		"\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\31g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2"+
		"{\32}\33\177\2\u0081\34\u0083\2\u0085\2\u0087\35\u0089\36\u008b\37\u008d"+
		" \u008f!\u0091\"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d\2\u009f\2\u00a1"+
		"(\u00a3)\u00a5*\3\2\23\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2"+
		"DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0272\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2e\3\2\2\2"+
		"\2{\3\2\2\2\2}\3\2\2\2\2\u0081\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2"+
		"\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00af"+
		"\3\2\2\2\7\u00b4\3\2\2\2\t\u00ba\3\2\2\2\13\u00bf\3\2\2\2\r\u00c3\3\2"+
		"\2\2\17\u00c8\3\2\2\2\21\u00ce\3\2\2\2\23\u00d5\3\2\2\2\25\u00dc\3\2\2"+
		"\2\27\u00e1\3\2\2\2\31\u00e6\3\2\2\2\33\u00ee\3\2\2\2\35\u00f5\3\2\2\2"+
		"\37\u00ff\3\2\2\2!\u0109\3\2\2\2#\u0110\3\2\2\2%\u011b\3\2\2\2\'\u011e"+
		"\3\2\2\2)\u0127\3\2\2\2+\u0139\3\2\2\2-\u013f\3\2\2\2/\u0141\3\2\2\2\61"+
		"\u0145\3\2\2\2\63\u0149\3\2\2\2\65\u014d\3\2\2\2\67\u0151\3\2\2\29\u015d"+
		"\3\2\2\2;\u015f\3\2\2\2=\u0168\3\2\2\2?\u016a\3\2\2\2A\u016d\3\2\2\2C"+
		"\u0173\3\2\2\2E\u0176\3\2\2\2G\u017a\3\2\2\2I\u017e\3\2\2\2K\u0185\3\2"+
		"\2\2M\u0188\3\2\2\2O\u018e\3\2\2\2Q\u0190\3\2\2\2S\u0196\3\2\2\2U\u019d"+
		"\3\2\2\2W\u01a0\3\2\2\2Y\u01a6\3\2\2\2[\u01a8\3\2\2\2]\u01ac\3\2\2\2_"+
		"\u01b3\3\2\2\2a\u01b6\3\2\2\2c\u01bc\3\2\2\2e\u01c0\3\2\2\2g\u01dd\3\2"+
		"\2\2i\u01df\3\2\2\2k\u01e2\3\2\2\2m\u01e5\3\2\2\2o\u01e9\3\2\2\2q\u01eb"+
		"\3\2\2\2s\u01ed\3\2\2\2u\u01fd\3\2\2\2w\u01ff\3\2\2\2y\u0202\3\2\2\2{"+
		"\u020d\3\2\2\2}\u020f\3\2\2\2\177\u0213\3\2\2\2\u0081\u0215\3\2\2\2\u0083"+
		"\u021c\3\2\2\2\u0085\u0220\3\2\2\2\u0087\u0222\3\2\2\2\u0089\u0227\3\2"+
		"\2\2\u008b\u0229\3\2\2\2\u008d\u022b\3\2\2\2\u008f\u022d\3\2\2\2\u0091"+
		"\u022f\3\2\2\2\u0093\u0231\3\2\2\2\u0095\u0233\3\2\2\2\u0097\u0235\3\2"+
		"\2\2\u0099\u0237\3\2\2\2\u009b\u0239\3\2\2\2\u009d\u0240\3\2\2\2\u009f"+
		"\u0242\3\2\2\2\u00a1\u0245\3\2\2\2\u00a3\u024b\3\2\2\2\u00a5\u0259\3\2"+
		"\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\4\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7{\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\6\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7j\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7v\2\2\u00b9\b\3\2\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2"+
		"\u00be\n\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v"+
		"\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\u00c7\7i\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\20\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7w\2\2\u00d1"+
		"\u00d2\7d\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\22\3\2\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2"+
		"\u00d9\u00da\7p\2\2\u00da\u00db\7i\2\2\u00db\24\3\2\2\2\u00dc\u00dd\7"+
		"x\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7f\2\2\u00e0\26"+
		"\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\30\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7z\2\2\u00e8"+
		"\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7f\2\2"+
		"\u00ec\u00ed\7u\2\2\u00ed\32\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7"+
		"o\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7h\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7g\2\2\u00fe\36\3\2\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7c\2\2\u0101\u0102\7o\2\2\u0102\u0103\7g\2\2"+
		"\u0103\u0104\7u\2\2\u0104\u0105\7r\2\2\u0105\u0106\7c\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7g\2\2\u0108 \3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d\u010e\7e\2\2\u010e"+
		"\u010f\7v\2\2\u010f\"\3\2\2\2\u0110\u0111\7c\2\2\u0111\u0112\7p\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7q\2\2\u0114\u0115\7v\2\2\u0115\u0116\7c\2\2"+
		"\u0116\u0117\7v\2\2\u0117\u0118\7k\2\2\u0118\u0119\7q\2\2\u0119\u011a"+
		"\7p\2\2\u011a$\3\2\2\2\u011b\u011c\7]\2\2\u011c\u011d\7_\2\2\u011d&\3"+
		"\2\2\2\u011e\u011f\7B\2\2\u011f\u0120\5\u009bN\2\u0120(\3\2\2\2\u0121"+
		"\u0128\5-\27\2\u0122\u0128\5e\63\2\u0123\u0128\5\u0081A\2\u0124\u0128"+
		"\5}?\2\u0125\u0128\5{>\2\u0126\u0128\5\u0087D\2\u0127\u0121\3\2\2\2\u0127"+
		"\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0126\3\2\2\2\u0128*\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7s\2\2\u012c\u012d\7w\2\2\u012d\u012e\7k\2\2\u012e"+
		"\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u013a\7f\2\2\u0131\u0132\7q\2\2"+
		"\u0132\u0133\7r\2\2\u0133\u0134\7v\2\2\u0134\u0135\7k\2\2\u0135\u0136"+
		"\7q\2\2\u0136\u0137\7p\2\2\u0137\u0138\7c\2\2\u0138\u013a\7n\2\2\u0139"+
		"\u0129\3\2\2\2\u0139\u0131\3\2\2\2\u013a,\3\2\2\2\u013b\u0140\5/\30\2"+
		"\u013c\u0140\5\61\31\2\u013d\u0140\5\63\32\2\u013e\u0140\5\65\33\2\u013f"+
		"\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140.\3\2\2\2\u0141\u0143\59\35\2\u0142\u0144\5\67\34\2\u0143\u0142"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\60\3\2\2\2\u0145\u0147\5G$\2\u0146"+
		"\u0148\5\67\34\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\62\3\2"+
		"\2\2\u0149\u014b\5Q)\2\u014a\u014c\5\67\34\2\u014b\u014a\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\64\3\2\2\2\u014d\u014f\5[.\2\u014e\u0150\5\67\34"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\66\3\2\2\2\u0151\u0152"+
		"\t\2\2\2\u01528\3\2\2\2\u0153\u015e\7\62\2\2\u0154\u015b\5? \2\u0155\u0157"+
		"\5;\36\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015c\3\2\2\2\u0158"+
		"\u0159\5E#\2\u0159\u015a\5;\36\2\u015a\u015c\3\2\2\2\u015b\u0156\3\2\2"+
		"\2\u015b\u0158\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0154"+
		"\3\2\2\2\u015e:\3\2\2\2\u015f\u0164\5=\37\2\u0160\u0162\5A!\2\u0161\u0160"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\5=\37\2\u0164"+
		"\u0161\3\2\2\2\u0164\u0165\3\2\2\2\u0165<\3\2\2\2\u0166\u0169\7\62\2\2"+
		"\u0167\u0169\5? \2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169>\3\2"+
		"\2\2\u016a\u016b\t\3\2\2\u016b@\3\2\2\2\u016c\u016e\5C\"\2\u016d\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"B\3\2\2\2\u0171\u0174\5=\37\2\u0172\u0174\7a\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174D\3\2\2\2\u0175\u0177\7a\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179F\3\2\2\2"+
		"\u017a\u017b\7\62\2\2\u017b\u017c\t\4\2\2\u017c\u017d\5I%\2\u017dH\3\2"+
		"\2\2\u017e\u0183\5K&\2\u017f\u0181\5M\'\2\u0180\u017f\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\5K&\2\u0183\u0180\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184J\3\2\2\2\u0185\u0186\t\5\2\2\u0186L\3\2\2\2\u0187"+
		"\u0189\5O(\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2"+
		"\2\u018a\u018b\3\2\2\2\u018bN\3\2\2\2\u018c\u018f\5K&\2\u018d\u018f\7"+
		"a\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018fP\3\2\2\2\u0190\u0192"+
		"\7\62\2\2\u0191\u0193\5E#\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\5S*\2\u0195R\3\2\2\2\u0196\u019b\5U+\2\u0197"+
		"\u0199\5W,\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2"+
		"\2\u019a\u019c\5U+\2\u019b\u0198\3\2\2\2\u019b\u019c\3\2\2\2\u019cT\3"+
		"\2\2\2\u019d\u019e\t\6\2\2\u019eV\3\2\2\2\u019f\u01a1\5Y-\2\u01a0\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"X\3\2\2\2\u01a4\u01a7\5U+\2\u01a5\u01a7\7a\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7Z\3\2\2\2\u01a8\u01a9\7\62\2\2\u01a9\u01aa\t\7\2\2"+
		"\u01aa\u01ab\5]/\2\u01ab\\\3\2\2\2\u01ac\u01b1\5_\60\2\u01ad\u01af\5a"+
		"\61\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b2\5_\60\2\u01b1\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2^\3\2\2\2"+
		"\u01b3\u01b4\t\b\2\2\u01b4`\3\2\2\2\u01b5\u01b7\5c\62\2\u01b6\u01b5\3"+
		"\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"b\3\2\2\2\u01ba\u01bd\5_\60\2\u01bb\u01bd\7a\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bdd\3\2\2\2\u01be\u01c1\5g\64\2\u01bf\u01c1\5s:\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1f\3\2\2\2\u01c2\u01c3\5;\36\2"+
		"\u01c3\u01c5\7\60\2\2\u01c4\u01c6\5;\36\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c9\5i\65\2\u01c8\u01c7\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\5q9\2\u01cb\u01ca\3\2\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01cc\u01de\3\2\2\2\u01cd\u01ce\7\60\2\2\u01ce"+
		"\u01d0\5;\36\2\u01cf\u01d1\5i\65\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\5q9\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01de\3\2\2\2\u01d5\u01d6\5;\36\2\u01d6\u01d8\5i\65\2\u01d7"+
		"\u01d9\5q9\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01de\3\2\2"+
		"\2\u01da\u01db\5;\36\2\u01db\u01dc\5q9\2\u01dc\u01de\3\2\2\2\u01dd\u01c2"+
		"\3\2\2\2\u01dd\u01cd\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd\u01da\3\2\2\2\u01de"+
		"h\3\2\2\2\u01df\u01e0\5k\66\2\u01e0\u01e1\5m\67\2\u01e1j\3\2\2\2\u01e2"+
		"\u01e3\t\t\2\2\u01e3l\3\2\2\2\u01e4\u01e6\5o8\2\u01e5\u01e4\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5;\36\2\u01e8n\3\2\2\2"+
		"\u01e9\u01ea\t\n\2\2\u01eap\3\2\2\2\u01eb\u01ec\t\13\2\2\u01ecr\3\2\2"+
		"\2\u01ed\u01ee\5u;\2\u01ee\u01f0\5w<\2\u01ef\u01f1\5q9\2\u01f0\u01ef\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1t\3\2\2\2\u01f2\u01f4\5G$\2\u01f3\u01f5"+
		"\7\60\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01fe\3\2\2\2"+
		"\u01f6\u01f7\7\62\2\2\u01f7\u01f9\t\4\2\2\u01f8\u01fa\5I%\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\60\2\2"+
		"\u01fc\u01fe\5I%\2\u01fd\u01f2\3\2\2\2\u01fd\u01f6\3\2\2\2\u01fev\3\2"+
		"\2\2\u01ff\u0200\5y=\2\u0200\u0201\5m\67\2\u0201x\3\2\2\2\u0202\u0203"+
		"\t\f\2\2\u0203z\3\2\2\2\u0204\u0205\7v\2\2\u0205\u0206\7t\2\2\u0206\u0207"+
		"\7w\2\2\u0207\u020e\7g\2\2\u0208\u0209\7h\2\2\u0209\u020a\7c\2\2\u020a"+
		"\u020b\7n\2\2\u020b\u020c\7u\2\2\u020c\u020e\7g\2\2\u020d\u0204\3\2\2"+
		"\2\u020d\u0208\3\2\2\2\u020e|\3\2\2\2\u020f\u0210\7)\2\2\u0210\u0211\5"+
		"\177@\2\u0211\u0212\7)\2\2\u0212~\3\2\2\2\u0213\u0214\n\r\2\2\u0214\u0080"+
		"\3\2\2\2\u0215\u0217\7$\2\2\u0216\u0218\5\u0083B\2\u0217\u0216\3\2\2\2"+
		"\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\7$\2\2\u021a\u0082"+
		"\3\2\2\2\u021b\u021d\5\u0085C\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2"+
		"\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0084\3\2\2\2\u0220\u0221"+
		"\n\16\2\2\u0221\u0086\3\2\2\2\u0222\u0223\7p\2\2\u0223\u0224\7w\2\2\u0224"+
		"\u0225\7n\2\2\u0225\u0226\7n\2\2\u0226\u0088\3\2\2\2\u0227\u0228\7*\2"+
		"\2\u0228\u008a\3\2\2\2\u0229\u022a\7+\2\2\u022a\u008c\3\2\2\2\u022b\u022c"+
		"\7}\2\2\u022c\u008e\3\2\2\2\u022d\u022e\7\177\2\2\u022e\u0090\3\2\2\2"+
		"\u022f\u0230\7]\2\2\u0230\u0092\3\2\2\2\u0231\u0232\7_\2\2\u0232\u0094"+
		"\3\2\2\2\u0233\u0234\7=\2\2\u0234\u0096\3\2\2\2\u0235\u0236\7.\2\2\u0236"+
		"\u0098\3\2\2\2\u0237\u0238\7\60\2\2\u0238\u009a\3\2\2\2\u0239\u023d\5"+
		"\u009dO\2\u023a\u023c\5\u009fP\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2"+
		"\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u009c\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0241\t\17\2\2\u0241\u009e\3\2\2\2\u0242\u0243\t\20\2\2"+
		"\u0243\u00a0\3\2\2\2\u0244\u0246\t\21\2\2\u0245\u0244\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\bQ\2\2\u024a\u00a2\3\2\2\2\u024b\u024c\7\61\2\2\u024c\u024d\7,"+
		"\2\2\u024d\u0251\3\2\2\2\u024e\u0250\13\2\2\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7,\2\2\u0255\u0256\7\61\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\bR\2\2\u0258\u00a4\3\2\2\2\u0259\u025a\7\61"+
		"\2\2\u025a\u025b\7\61\2\2\u025b\u025f\3\2\2\2\u025c\u025e\n\22\2\2\u025d"+
		"\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\bS\2\2\u0263"+
		"\u00a6\3\2\2\2\64\2\u0127\u0139\u013f\u0143\u0147\u014b\u014f\u0156\u015b"+
		"\u015d\u0161\u0164\u0168\u016f\u0173\u0178\u0180\u0183\u018a\u018e\u0192"+
		"\u0198\u019b\u01a2\u01a6\u01ae\u01b1\u01b8\u01bc\u01c0\u01c5\u01c8\u01cb"+
		"\u01d0\u01d3\u01d8\u01dd\u01e5\u01f0\u01f4\u01f9\u01fd\u020d\u0217\u021e"+
		"\u023d\u0247\u0251\u025f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}