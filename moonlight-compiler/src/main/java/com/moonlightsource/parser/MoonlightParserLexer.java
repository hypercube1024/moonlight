// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/parser/MoonlightParser.g4 by ANTLR 4.7
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
public class MoonlightParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BOOLEAN=8, BYTE=9, 
		SHORT=10, CHAR=11, INT=12, LONG=13, FLOAT=14, DOUBLE=15, STRING=16, VOID=17, 
		ENUM=18, EXTENDS=19, IMPORT=20, INTERFACE=21, NAMESPACE=22, STRUCT=23, 
		ANNOTATION=24, ARRAY=25, Label=26, Literal=27, FieldReq=28, IntegerLiteral=29, 
		FloatingPointLiteral=30, BooleanLiteral=31, CharacterLiteral=32, StringLiteral=33, 
		NullLiteral=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, 
		RBRACK=40, SEMI=41, COMMA=42, DOT=43, Identifier=44, WS=45, COMMENT=46, 
		LINE_COMMENT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "BOOLEAN", "BYTE", 
		"SHORT", "CHAR", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", "VOID", "ENUM", 
		"EXTENDS", "IMPORT", "INTERFACE", "NAMESPACE", "STRUCT", "ANNOTATION", 
		"ARRAY", "Label", "Literal", "FieldReq", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
		"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "Identifier", "Letter", "LetterOrDigit", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'='", "'<'", "'>'", "'map'", "'set'", "'list'", "'boolean'", 
		"'byte'", "'short'", "'char'", "'int'", "'long'", "'float'", "'double'", 
		"'string'", "'void'", "'enum'", "'extends'", "'import'", "'interface'", 
		"'namespace'", "'struct'", "'annotation'", null, null, null, null, null, 
		null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BOOLEAN", "BYTE", "SHORT", 
		"CHAR", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", "VOID", "ENUM", "EXTENDS", 
		"IMPORT", "INTERFACE", "NAMESPACE", "STRUCT", "ANNOTATION", "ARRAY", "Label", 
		"Literal", "FieldReq", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "Identifier", 
		"WS", "COMMENT", "LINE_COMMENT"
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


	public MoonlightParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MoonlightParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0287\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014b\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u015d\n\35\3\36\3\36\3\36\3\36\5\36\u0163\n\36\3\37\3\37\5\37\u0167\n"+
		"\37\3 \3 \5 \u016b\n \3!\3!\5!\u016f\n!\3\"\3\"\5\"\u0173\n\"\3#\3#\3"+
		"$\3$\3$\5$\u017a\n$\3$\3$\3$\5$\u017f\n$\5$\u0181\n$\3%\3%\5%\u0185\n"+
		"%\3%\5%\u0188\n%\3&\3&\5&\u018c\n&\3\'\3\'\3(\6(\u0191\n(\r(\16(\u0192"+
		"\3)\3)\5)\u0197\n)\3*\6*\u019a\n*\r*\16*\u019b\3+\3+\3+\3+\3,\3,\5,\u01a4"+
		"\n,\3,\5,\u01a7\n,\3-\3-\3.\6.\u01ac\n.\r.\16.\u01ad\3/\3/\5/\u01b2\n"+
		"/\3\60\3\60\5\60\u01b6\n\60\3\60\3\60\3\61\3\61\5\61\u01bc\n\61\3\61\5"+
		"\61\u01bf\n\61\3\62\3\62\3\63\6\63\u01c4\n\63\r\63\16\63\u01c5\3\64\3"+
		"\64\5\64\u01ca\n\64\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u01d2\n\66\3\66"+
		"\5\66\u01d5\n\66\3\67\3\67\38\68\u01da\n8\r8\168\u01db\39\39\59\u01e0"+
		"\n9\3:\3:\5:\u01e4\n:\3;\3;\3;\5;\u01e9\n;\3;\5;\u01ec\n;\3;\5;\u01ef"+
		"\n;\3;\3;\3;\5;\u01f4\n;\3;\5;\u01f7\n;\3;\3;\3;\5;\u01fc\n;\3;\3;\3;"+
		"\5;\u0201\n;\3<\3<\3<\3=\3=\3>\5>\u0209\n>\3>\3>\3?\3?\3@\3@\3A\3A\3A"+
		"\5A\u0214\nA\3B\3B\5B\u0218\nB\3B\3B\3B\5B\u021d\nB\3B\3B\5B\u0221\nB"+
		"\3C\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0231\nE\3F\3F\3F\3F\3G"+
		"\3G\3H\3H\5H\u023b\nH\3H\3H\3I\6I\u0240\nI\rI\16I\u0241\3J\3J\3K\3K\3"+
		"K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\7"+
		"U\u025f\nU\fU\16U\u0262\13U\3V\3V\3W\3W\3X\6X\u0269\nX\rX\16X\u026a\3"+
		"X\3X\3Y\3Y\3Y\3Y\7Y\u0273\nY\fY\16Y\u0276\13Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z"+
		"\3Z\7Z\u0281\nZ\fZ\16Z\u0284\13Z\3Z\3Z\3\u0274\2[\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I\2"+
		"K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s u\2w\2y"+
		"\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089!\u008b\"\u008d\2"+
		"\u008f#\u0091\2\u0093\2\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f)\u00a1"+
		"*\u00a3+\u00a5,\u00a7-\u00a9.\u00ab\2\u00ad\2\u00af/\u00b1\60\u00b3\61"+
		"\3\2\23\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63"+
		"\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\6\2&&C\\aac|\7\2"+
		"&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0295\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2s\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\3\u00b5\3\2\2"+
		"\2\5\u00b7\3\2\2\2\7\u00b9\3\2\2\2\t\u00bb\3\2\2\2\13\u00bd\3\2\2\2\r"+
		"\u00c1\3\2\2\2\17\u00c5\3\2\2\2\21\u00ca\3\2\2\2\23\u00d2\3\2\2\2\25\u00d7"+
		"\3\2\2\2\27\u00dd\3\2\2\2\31\u00e2\3\2\2\2\33\u00e6\3\2\2\2\35\u00eb\3"+
		"\2\2\2\37\u00f1\3\2\2\2!\u00f8\3\2\2\2#\u00ff\3\2\2\2%\u0104\3\2\2\2\'"+
		"\u0109\3\2\2\2)\u0111\3\2\2\2+\u0118\3\2\2\2-\u0122\3\2\2\2/\u012c\3\2"+
		"\2\2\61\u0133\3\2\2\2\63\u013e\3\2\2\2\65\u0141\3\2\2\2\67\u014a\3\2\2"+
		"\29\u015c\3\2\2\2;\u0162\3\2\2\2=\u0164\3\2\2\2?\u0168\3\2\2\2A\u016c"+
		"\3\2\2\2C\u0170\3\2\2\2E\u0174\3\2\2\2G\u0180\3\2\2\2I\u0182\3\2\2\2K"+
		"\u018b\3\2\2\2M\u018d\3\2\2\2O\u0190\3\2\2\2Q\u0196\3\2\2\2S\u0199\3\2"+
		"\2\2U\u019d\3\2\2\2W\u01a1\3\2\2\2Y\u01a8\3\2\2\2[\u01ab\3\2\2\2]\u01b1"+
		"\3\2\2\2_\u01b3\3\2\2\2a\u01b9\3\2\2\2c\u01c0\3\2\2\2e\u01c3\3\2\2\2g"+
		"\u01c9\3\2\2\2i\u01cb\3\2\2\2k\u01cf\3\2\2\2m\u01d6\3\2\2\2o\u01d9\3\2"+
		"\2\2q\u01df\3\2\2\2s\u01e3\3\2\2\2u\u0200\3\2\2\2w\u0202\3\2\2\2y\u0205"+
		"\3\2\2\2{\u0208\3\2\2\2}\u020c\3\2\2\2\177\u020e\3\2\2\2\u0081\u0210\3"+
		"\2\2\2\u0083\u0220\3\2\2\2\u0085\u0222\3\2\2\2\u0087\u0225\3\2\2\2\u0089"+
		"\u0230\3\2\2\2\u008b\u0232\3\2\2\2\u008d\u0236\3\2\2\2\u008f\u0238\3\2"+
		"\2\2\u0091\u023f\3\2\2\2\u0093\u0243\3\2\2\2\u0095\u0245\3\2\2\2\u0097"+
		"\u024a\3\2\2\2\u0099\u024c\3\2\2\2\u009b\u024e\3\2\2\2\u009d\u0250\3\2"+
		"\2\2\u009f\u0252\3\2\2\2\u00a1\u0254\3\2\2\2\u00a3\u0256\3\2\2\2\u00a5"+
		"\u0258\3\2\2\2\u00a7\u025a\3\2\2\2\u00a9\u025c\3\2\2\2\u00ab\u0263\3\2"+
		"\2\2\u00ad\u0265\3\2\2\2\u00af\u0268\3\2\2\2\u00b1\u026e\3\2\2\2\u00b3"+
		"\u027c\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\4\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8"+
		"\6\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba\b\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc"+
		"\n\3\2\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\f\3\2\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\16\3\2\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7u\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\20\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7p\2\2\u00d1\22\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7"+
		"{\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\24\3\2\2\2\u00d7\u00d8"+
		"\7u\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7j\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\30\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\32\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7q\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7i\2\2\u00ea\34\3\2\2\2\u00eb"+
		"\u00ec\7h\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7c\2\2"+
		"\u00ef\u00f0\7v\2\2\u00f0\36\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7"+
		"q\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7 \3\2\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7t\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7i\2\2\u00fe"+
		"\"\3\2\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7q\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7f\2\2\u0103$\3\2\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u0108\7o\2\2\u0108&\3\2\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7z\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2\u010d\u010e\7p\2\2"+
		"\u010e\u010f\7f\2\2\u010f\u0110\7u\2\2\u0110(\3\2\2\2\u0111\u0112\7k\2"+
		"\2\u0112\u0113\7o\2\2\u0113\u0114\7r\2\2\u0114\u0115\7q\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7v\2\2\u0117*\3\2\2\2\u0118\u0119\7k\2\2\u0119\u011a"+
		"\7p\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7h\2\2\u011e\u011f\7c\2\2\u011f\u0120\7e\2\2\u0120\u0121\7g\2\2"+
		"\u0121,\3\2\2\2\u0122\u0123\7p\2\2\u0123\u0124\7c\2\2\u0124\u0125\7o\2"+
		"\2\u0125\u0126\7g\2\2\u0126\u0127\7u\2\2\u0127\u0128\7r\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7e\2\2\u012a\u012b\7g\2\2\u012b.\3\2\2\2\u012c\u012d"+
		"\7u\2\2\u012d\u012e\7v\2\2\u012e\u012f\7t\2\2\u012f\u0130\7w\2\2\u0130"+
		"\u0131\7e\2\2\u0131\u0132\7v\2\2\u0132\60\3\2\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7p\2\2\u0135\u0136\7p\2\2\u0136\u0137\7q\2\2\u0137\u0138\7v\2\2"+
		"\u0138\u0139\7c\2\2\u0139\u013a\7v\2\2\u013a\u013b\7k\2\2\u013b\u013c"+
		"\7q\2\2\u013c\u013d\7p\2\2\u013d\62\3\2\2\2\u013e\u013f\7]\2\2\u013f\u0140"+
		"\7_\2\2\u0140\64\3\2\2\2\u0141\u0142\7B\2\2\u0142\u0143\5\u00a9U\2\u0143"+
		"\66\3\2\2\2\u0144\u014b\5;\36\2\u0145\u014b\5s:\2\u0146\u014b\5\u008f"+
		"H\2\u0147\u014b\5\u008bF\2\u0148\u014b\5\u0089E\2\u0149\u014b\5\u0095"+
		"K\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014a"+
		"\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b8\3\2\2\2"+
		"\u014c\u014d\7t\2\2\u014d\u014e\7g\2\2\u014e\u014f\7s\2\2\u014f\u0150"+
		"\7w\2\2\u0150\u0151\7k\2\2\u0151\u0152\7t\2\2\u0152\u0153\7g\2\2\u0153"+
		"\u015d\7f\2\2\u0154\u0155\7q\2\2\u0155\u0156\7r\2\2\u0156\u0157\7v\2\2"+
		"\u0157\u0158\7k\2\2\u0158\u0159\7q\2\2\u0159\u015a\7p\2\2\u015a\u015b"+
		"\7c\2\2\u015b\u015d\7n\2\2\u015c\u014c\3\2\2\2\u015c\u0154\3\2\2\2\u015d"+
		":\3\2\2\2\u015e\u0163\5=\37\2\u015f\u0163\5? \2\u0160\u0163\5A!\2\u0161"+
		"\u0163\5C\"\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0161\3\2\2\2\u0163<\3\2\2\2\u0164\u0166\5G$\2\u0165\u0167"+
		"\5E#\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167>\3\2\2\2\u0168\u016a"+
		"\5U+\2\u0169\u016b\5E#\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"@\3\2\2\2\u016c\u016e\5_\60\2\u016d\u016f\5E#\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016fB\3\2\2\2\u0170\u0172\5i\65\2\u0171\u0173\5E#\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173D\3\2\2\2\u0174\u0175\t\2\2\2"+
		"\u0175F\3\2\2\2\u0176\u0181\7\62\2\2\u0177\u017e\5M\'\2\u0178\u017a\5"+
		"I%\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017f\3\2\2\2\u017b"+
		"\u017c\5S*\2\u017c\u017d\5I%\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2\2"+
		"\u017e\u017b\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0176\3\2\2\2\u0180\u0177"+
		"\3\2\2\2\u0181H\3\2\2\2\u0182\u0187\5K&\2\u0183\u0185\5O(\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\5K&\2\u0187"+
		"\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188J\3\2\2\2\u0189\u018c\7\62\2\2"+
		"\u018a\u018c\5M\'\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018cL\3\2"+
		"\2\2\u018d\u018e\t\3\2\2\u018eN\3\2\2\2\u018f\u0191\5Q)\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"P\3\2\2\2\u0194\u0197\5K&\2\u0195\u0197\7a\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197R\3\2\2\2\u0198\u019a\7a\2\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019cT\3\2\2\2"+
		"\u019d\u019e\7\62\2\2\u019e\u019f\t\4\2\2\u019f\u01a0\5W,\2\u01a0V\3\2"+
		"\2\2\u01a1\u01a6\5Y-\2\u01a2\u01a4\5[.\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\5Y-\2\u01a6\u01a3\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7X\3\2\2\2\u01a8\u01a9\t\5\2\2\u01a9Z\3\2\2\2\u01aa"+
		"\u01ac\5]/\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2"+
		"\2\u01ad\u01ae\3\2\2\2\u01ae\\\3\2\2\2\u01af\u01b2\5Y-\2\u01b0\u01b2\7"+
		"a\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2^\3\2\2\2\u01b3\u01b5"+
		"\7\62\2\2\u01b4\u01b6\5S*\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\5a\61\2\u01b8`\3\2\2\2\u01b9\u01be\5c\62\2"+
		"\u01ba\u01bc\5e\63\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01bf\5c\62\2\u01be\u01bb\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"b\3\2\2\2\u01c0\u01c1\t\6\2\2\u01c1d\3\2\2\2\u01c2\u01c4\5g\64\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6f\3\2\2\2\u01c7\u01ca\5c\62\2\u01c8\u01ca\7a\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01c8\3\2\2\2\u01cah\3\2\2\2\u01cb\u01cc\7\62\2\2\u01cc"+
		"\u01cd\t\7\2\2\u01cd\u01ce\5k\66\2\u01cej\3\2\2\2\u01cf\u01d4\5m\67\2"+
		"\u01d0\u01d2\5o8\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d5\5m\67\2\u01d4\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"l\3\2\2\2\u01d6\u01d7\t\b\2\2\u01d7n\3\2\2\2\u01d8\u01da\5q9\2\u01d9\u01d8"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"p\3\2\2\2\u01dd\u01e0\5m\67\2\u01de\u01e0\7a\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0r\3\2\2\2\u01e1\u01e4\5u;\2\u01e2\u01e4\5\u0081A\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4t\3\2\2\2\u01e5\u01e6\5"+
		"I%\2\u01e6\u01e8\7\60\2\2\u01e7\u01e9\5I%\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\5w<\2\u01eb\u01ea\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01ef\5\177@\2\u01ee"+
		"\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u0201\3\2\2\2\u01f0\u01f1\7\60"+
		"\2\2\u01f1\u01f3\5I%\2\u01f2\u01f4\5w<\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\5\177@\2\u01f6\u01f5\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u0201\3\2\2\2\u01f8\u01f9\5I%\2\u01f9\u01fb"+
		"\5w<\2\u01fa\u01fc\5\177@\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u0201\3\2\2\2\u01fd\u01fe\5I%\2\u01fe\u01ff\5\177@\2\u01ff\u0201\3\2"+
		"\2\2\u0200\u01e5\3\2\2\2\u0200\u01f0\3\2\2\2\u0200\u01f8\3\2\2\2\u0200"+
		"\u01fd\3\2\2\2\u0201v\3\2\2\2\u0202\u0203\5y=\2\u0203\u0204\5{>\2\u0204"+
		"x\3\2\2\2\u0205\u0206\t\t\2\2\u0206z\3\2\2\2\u0207\u0209\5}?\2\u0208\u0207"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5I%\2\u020b"+
		"|\3\2\2\2\u020c\u020d\t\n\2\2\u020d~\3\2\2\2\u020e\u020f\t\13\2\2\u020f"+
		"\u0080\3\2\2\2\u0210\u0211\5\u0083B\2\u0211\u0213\5\u0085C\2\u0212\u0214"+
		"\5\177@\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0082\3\2\2\2"+
		"\u0215\u0217\5U+\2\u0216\u0218\7\60\2\2\u0217\u0216\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0221\3\2\2\2\u0219\u021a\7\62\2\2\u021a\u021c\t\4\2\2"+
		"\u021b\u021d\5W,\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e\u021f\7\60\2\2\u021f\u0221\5W,\2\u0220\u0215\3\2\2\2\u0220"+
		"\u0219\3\2\2\2\u0221\u0084\3\2\2\2\u0222\u0223\5\u0087D\2\u0223\u0224"+
		"\5{>\2\u0224\u0086\3\2\2\2\u0225\u0226\t\f\2\2\u0226\u0088\3\2\2\2\u0227"+
		"\u0228\7v\2\2\u0228\u0229\7t\2\2\u0229\u022a\7w\2\2\u022a\u0231\7g\2\2"+
		"\u022b\u022c\7h\2\2\u022c\u022d\7c\2\2\u022d\u022e\7n\2\2\u022e\u022f"+
		"\7u\2\2\u022f\u0231\7g\2\2\u0230\u0227\3\2\2\2\u0230\u022b\3\2\2\2\u0231"+
		"\u008a\3\2\2\2\u0232\u0233\7)\2\2\u0233\u0234\5\u008dG\2\u0234\u0235\7"+
		")\2\2\u0235\u008c\3\2\2\2\u0236\u0237\n\r\2\2\u0237\u008e\3\2\2\2\u0238"+
		"\u023a\7$\2\2\u0239\u023b\5\u0091I\2\u023a\u0239\3\2\2\2\u023a\u023b\3"+
		"\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\7$\2\2\u023d\u0090\3\2\2\2\u023e"+
		"\u0240\5\u0093J\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0092\3\2\2\2\u0243\u0244\n\16\2\2"+
		"\u0244\u0094\3\2\2\2\u0245\u0246\7p\2\2\u0246\u0247\7w\2\2\u0247\u0248"+
		"\7n\2\2\u0248\u0249\7n\2\2\u0249\u0096\3\2\2\2\u024a\u024b\7*\2\2\u024b"+
		"\u0098\3\2\2\2\u024c\u024d\7+\2\2\u024d\u009a\3\2\2\2\u024e\u024f\7}\2"+
		"\2\u024f\u009c\3\2\2\2\u0250\u0251\7\177\2\2\u0251\u009e\3\2\2\2\u0252"+
		"\u0253\7]\2\2\u0253\u00a0\3\2\2\2\u0254\u0255\7_\2\2\u0255\u00a2\3\2\2"+
		"\2\u0256\u0257\7=\2\2\u0257\u00a4\3\2\2\2\u0258\u0259\7.\2\2\u0259\u00a6"+
		"\3\2\2\2\u025a\u025b\7\60\2\2\u025b\u00a8\3\2\2\2\u025c\u0260\5\u00ab"+
		"V\2\u025d\u025f\5\u00adW\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u00aa\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0263\u0264\t\17\2\2\u0264\u00ac\3\2\2\2\u0265\u0266\t\20\2\2\u0266"+
		"\u00ae\3\2\2\2\u0267\u0269\t\21\2\2\u0268\u0267\3\2\2\2\u0269\u026a\3"+
		"\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026d\bX\2\2\u026d\u00b0\3\2\2\2\u026e\u026f\7\61\2\2\u026f\u0270\7,"+
		"\2\2\u0270\u0274\3\2\2\2\u0271\u0273\13\2\2\2\u0272\u0271\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0277\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0277\u0278\7,\2\2\u0278\u0279\7\61\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\bY\2\2\u027b\u00b2\3\2\2\2\u027c\u027d\7\61"+
		"\2\2\u027d\u027e\7\61\2\2\u027e\u0282\3\2\2\2\u027f\u0281\n\22\2\2\u0280"+
		"\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0285\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\bZ\2\2\u0286"+
		"\u00b4\3\2\2\2\64\2\u014a\u015c\u0162\u0166\u016a\u016e\u0172\u0179\u017e"+
		"\u0180\u0184\u0187\u018b\u0192\u0196\u019b\u01a3\u01a6\u01ad\u01b1\u01b5"+
		"\u01bb\u01be\u01c5\u01c9\u01d1\u01d4\u01db\u01df\u01e3\u01e8\u01eb\u01ee"+
		"\u01f3\u01f6\u01fb\u0200\u0208\u0213\u0217\u021c\u0220\u0230\u023a\u0241"+
		"\u0260\u026a\u0274\u0282\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}