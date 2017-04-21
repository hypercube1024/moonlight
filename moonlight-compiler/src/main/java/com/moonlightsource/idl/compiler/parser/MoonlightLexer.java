package com.moonlightsource.idl.compiler.parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BOOLEAN=8, BYTE=9, 
		SHORT=10, CHAR=11, INT=12, LONG=13, FLOAT=14, DOUBLE=15, STRING=16, VOID=17, 
		ENUM=18, EXTENDS=19, IMPORT=20, INTERFACE=21, NAMESPACE=22, STRUCT=23, 
		ANNOTATION=24, EMPTY_LIST=25, AnnotationLabel=26, FieldReq=27, IntegerLiteral=28, 
		FloatingPointLiteral=29, BooleanLiteral=30, CharacterLiteral=31, StringLiteral=32, 
		NullLiteral=33, LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, LBRACK=38, 
		RBRACK=39, SEMI=40, COMMA=41, DOT=42, Identifier=43, WS=44, COMMENT=45, 
		LINE_COMMENT=46;
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
		"EMPTY_LIST", "AnnotationLabel", "FieldReq", "IntegerLiteral", "DecimalIntegerLiteral", 
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
		"'namespace'", "'struct'", "'annotation'", "'[]'", null, null, null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BOOLEAN", "BYTE", "SHORT", 
		"CHAR", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", "VOID", "ENUM", "EXTENDS", 
		"IMPORT", "INTERFACE", "NAMESPACE", "STRUCT", "ANNOTATION", "EMPTY_LIST", 
		"AnnotationLabel", "FieldReq", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Moonlight.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u027d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0153\n\34\3\35\3\35\3\35\3\35\5\35\u0159\n\35\3"+
		"\36\3\36\5\36\u015d\n\36\3\37\3\37\5\37\u0161\n\37\3 \3 \5 \u0165\n \3"+
		"!\3!\5!\u0169\n!\3\"\3\"\3#\3#\3#\5#\u0170\n#\3#\3#\3#\5#\u0175\n#\5#"+
		"\u0177\n#\3$\3$\5$\u017b\n$\3$\5$\u017e\n$\3%\3%\5%\u0182\n%\3&\3&\3\'"+
		"\6\'\u0187\n\'\r\'\16\'\u0188\3(\3(\5(\u018d\n(\3)\6)\u0190\n)\r)\16)"+
		"\u0191\3*\3*\3*\3*\3+\3+\5+\u019a\n+\3+\5+\u019d\n+\3,\3,\3-\6-\u01a2"+
		"\n-\r-\16-\u01a3\3.\3.\5.\u01a8\n.\3/\3/\5/\u01ac\n/\3/\3/\3\60\3\60\5"+
		"\60\u01b2\n\60\3\60\5\60\u01b5\n\60\3\61\3\61\3\62\6\62\u01ba\n\62\r\62"+
		"\16\62\u01bb\3\63\3\63\5\63\u01c0\n\63\3\64\3\64\3\64\3\64\3\65\3\65\5"+
		"\65\u01c8\n\65\3\65\5\65\u01cb\n\65\3\66\3\66\3\67\6\67\u01d0\n\67\r\67"+
		"\16\67\u01d1\38\38\58\u01d6\n8\39\39\59\u01da\n9\3:\3:\3:\5:\u01df\n:"+
		"\3:\5:\u01e2\n:\3:\5:\u01e5\n:\3:\3:\3:\5:\u01ea\n:\3:\5:\u01ed\n:\3:"+
		"\3:\3:\5:\u01f2\n:\3:\3:\3:\5:\u01f7\n:\3;\3;\3;\3<\3<\3=\5=\u01ff\n="+
		"\3=\3=\3>\3>\3?\3?\3@\3@\3@\5@\u020a\n@\3A\3A\5A\u020e\nA\3A\3A\3A\5A"+
		"\u0213\nA\3A\3A\5A\u0217\nA\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u0227\nD\3E\3E\3E\3E\3F\3F\3G\3G\5G\u0231\nG\3G\3G\3H\6H\u0236\nH"+
		"\rH\16H\u0237\3I\3I\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3T\3T\7T\u0255\nT\fT\16T\u0258\13T\3U\3U\3V\3V\3W"+
		"\6W\u025f\nW\rW\16W\u0260\3W\3W\3X\3X\3X\3X\7X\u0269\nX\fX\16X\u026c\13"+
		"X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\7Y\u0277\nY\fY\16Y\u027a\13Y\3Y\3Y\3\u026a"+
		"\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2"+
		"i\2k\2m\2o\2q\37s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		" \u0089!\u008b\2\u008d\"\u008f\2\u0091\2\u0093#\u0095$\u0097%\u0099&\u009b"+
		"\'\u009d(\u009f)\u00a1*\u00a3+\u00a5,\u00a7-\u00a9\2\u00ab\2\u00ad.\u00af"+
		"/\u00b1\60\3\2\23\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd"+
		"\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\6\2&&C"+
		"\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0286\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2q\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008d\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3\3\2\2"+
		"\2\5\u00b5\3\2\2\2\7\u00b7\3\2\2\2\t\u00b9\3\2\2\2\13\u00bb\3\2\2\2\r"+
		"\u00bf\3\2\2\2\17\u00c3\3\2\2\2\21\u00c8\3\2\2\2\23\u00d0\3\2\2\2\25\u00d5"+
		"\3\2\2\2\27\u00db\3\2\2\2\31\u00e0\3\2\2\2\33\u00e4\3\2\2\2\35\u00e9\3"+
		"\2\2\2\37\u00ef\3\2\2\2!\u00f6\3\2\2\2#\u00fd\3\2\2\2%\u0102\3\2\2\2\'"+
		"\u0107\3\2\2\2)\u010f\3\2\2\2+\u0116\3\2\2\2-\u0120\3\2\2\2/\u012a\3\2"+
		"\2\2\61\u0131\3\2\2\2\63\u013c\3\2\2\2\65\u013f\3\2\2\2\67\u0152\3\2\2"+
		"\29\u0158\3\2\2\2;\u015a\3\2\2\2=\u015e\3\2\2\2?\u0162\3\2\2\2A\u0166"+
		"\3\2\2\2C\u016a\3\2\2\2E\u0176\3\2\2\2G\u0178\3\2\2\2I\u0181\3\2\2\2K"+
		"\u0183\3\2\2\2M\u0186\3\2\2\2O\u018c\3\2\2\2Q\u018f\3\2\2\2S\u0193\3\2"+
		"\2\2U\u0197\3\2\2\2W\u019e\3\2\2\2Y\u01a1\3\2\2\2[\u01a7\3\2\2\2]\u01a9"+
		"\3\2\2\2_\u01af\3\2\2\2a\u01b6\3\2\2\2c\u01b9\3\2\2\2e\u01bf\3\2\2\2g"+
		"\u01c1\3\2\2\2i\u01c5\3\2\2\2k\u01cc\3\2\2\2m\u01cf\3\2\2\2o\u01d5\3\2"+
		"\2\2q\u01d9\3\2\2\2s\u01f6\3\2\2\2u\u01f8\3\2\2\2w\u01fb\3\2\2\2y\u01fe"+
		"\3\2\2\2{\u0202\3\2\2\2}\u0204\3\2\2\2\177\u0206\3\2\2\2\u0081\u0216\3"+
		"\2\2\2\u0083\u0218\3\2\2\2\u0085\u021b\3\2\2\2\u0087\u0226\3\2\2\2\u0089"+
		"\u0228\3\2\2\2\u008b\u022c\3\2\2\2\u008d\u022e\3\2\2\2\u008f\u0235\3\2"+
		"\2\2\u0091\u0239\3\2\2\2\u0093\u023b\3\2\2\2\u0095\u0240\3\2\2\2\u0097"+
		"\u0242\3\2\2\2\u0099\u0244\3\2\2\2\u009b\u0246\3\2\2\2\u009d\u0248\3\2"+
		"\2\2\u009f\u024a\3\2\2\2\u00a1\u024c\3\2\2\2\u00a3\u024e\3\2\2\2\u00a5"+
		"\u0250\3\2\2\2\u00a7\u0252\3\2\2\2\u00a9\u0259\3\2\2\2\u00ab\u025b\3\2"+
		"\2\2\u00ad\u025e\3\2\2\2\u00af\u0264\3\2\2\2\u00b1\u0272\3\2\2\2\u00b3"+
		"\u00b4\7,\2\2\u00b4\4\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\6\3\2\2\2\u00b7"+
		"\u00b8\7>\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\n\3\2\2\2\u00bb"+
		"\u00bc\7o\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7r\2\2\u00be\f\3\2\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\16\3\2\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7v\2\2"+
		"\u00c7\20\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7"+
		"q\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\22\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7{\2\2\u00d2\u00d3"+
		"\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\24\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\26\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7c\2\2\u00de"+
		"\u00df\7t\2\2\u00df\30\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\32\3\2\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7p\2\2\u00e7\u00e8\7i\2\2\u00e8\34\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\36\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7"+
		"w\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5 "+
		"\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7t\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7i\2\2\u00fc\"\3\2\2\2\u00fd"+
		"\u00fe\7x\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7f\2\2"+
		"\u0101$\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105\7w\2"+
		"\2\u0105\u0106\7o\2\2\u0106&\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7"+
		"z\2\2\u0109\u010a\7v\2\2\u010a\u010b\7g\2\2\u010b\u010c\7p\2\2\u010c\u010d"+
		"\7f\2\2\u010d\u010e\7u\2\2\u010e(\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111"+
		"\7o\2\2\u0111\u0112\7r\2\2\u0112\u0113\7q\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7v\2\2\u0115*\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7g\2\2\u011a\u011b\7t\2\2\u011b\u011c\7h\2\2"+
		"\u011c\u011d\7c\2\2\u011d\u011e\7e\2\2\u011e\u011f\7g\2\2\u011f,\3\2\2"+
		"\2\u0120\u0121\7p\2\2\u0121\u0122\7c\2\2\u0122\u0123\7o\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7u\2\2\u0125\u0126\7r\2\2\u0126\u0127\7c\2\2\u0127"+
		"\u0128\7e\2\2\u0128\u0129\7g\2\2\u0129.\3\2\2\2\u012a\u012b\7u\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e\7w\2\2\u012e\u012f\7e\2\2"+
		"\u012f\u0130\7v\2\2\u0130\60\3\2\2\2\u0131\u0132\7c\2\2\u0132\u0133\7"+
		"p\2\2\u0133\u0134\7p\2\2\u0134\u0135\7q\2\2\u0135\u0136\7v\2\2\u0136\u0137"+
		"\7c\2\2\u0137\u0138\7v\2\2\u0138\u0139\7k\2\2\u0139\u013a\7q\2\2\u013a"+
		"\u013b\7p\2\2\u013b\62\3\2\2\2\u013c\u013d\7]\2\2\u013d\u013e\7_\2\2\u013e"+
		"\64\3\2\2\2\u013f\u0140\7B\2\2\u0140\u0141\5\u00a7T\2\u0141\66\3\2\2\2"+
		"\u0142\u0143\7t\2\2\u0143\u0144\7g\2\2\u0144\u0145\7s\2\2\u0145\u0146"+
		"\7w\2\2\u0146\u0147\7k\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u0153\7f\2\2\u014a\u014b\7q\2\2\u014b\u014c\7r\2\2\u014c\u014d\7v\2\2"+
		"\u014d\u014e\7k\2\2\u014e\u014f\7q\2\2\u014f\u0150\7p\2\2\u0150\u0151"+
		"\7c\2\2\u0151\u0153\7n\2\2\u0152\u0142\3\2\2\2\u0152\u014a\3\2\2\2\u0153"+
		"8\3\2\2\2\u0154\u0159\5;\36\2\u0155\u0159\5=\37\2\u0156\u0159\5? \2\u0157"+
		"\u0159\5A!\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0157\3\2\2\2\u0159:\3\2\2\2\u015a\u015c\5E#\2\u015b\u015d\5"+
		"C\"\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d<\3\2\2\2\u015e\u0160"+
		"\5S*\2\u015f\u0161\5C\"\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		">\3\2\2\2\u0162\u0164\5]/\2\u0163\u0165\5C\"\2\u0164\u0163\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165@\3\2\2\2\u0166\u0168\5g\64\2\u0167\u0169\5C\"\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169B\3\2\2\2\u016a\u016b\t\2\2\2"+
		"\u016bD\3\2\2\2\u016c\u0177\7\62\2\2\u016d\u0174\5K&\2\u016e\u0170\5G"+
		"$\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0175\3\2\2\2\u0171"+
		"\u0172\5Q)\2\u0172\u0173\5G$\2\u0173\u0175\3\2\2\2\u0174\u016f\3\2\2\2"+
		"\u0174\u0171\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u016c\3\2\2\2\u0176\u016d"+
		"\3\2\2\2\u0177F\3\2\2\2\u0178\u017d\5I%\2\u0179\u017b\5M\'\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\5I%\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017eH\3\2\2\2\u017f\u0182\7\62\2\2"+
		"\u0180\u0182\5K&\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182J\3\2"+
		"\2\2\u0183\u0184\t\3\2\2\u0184L\3\2\2\2\u0185\u0187\5O(\2\u0186\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"N\3\2\2\2\u018a\u018d\5I%\2\u018b\u018d\7a\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018dP\3\2\2\2\u018e\u0190\7a\2\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192R\3\2\2\2"+
		"\u0193\u0194\7\62\2\2\u0194\u0195\t\4\2\2\u0195\u0196\5U+\2\u0196T\3\2"+
		"\2\2\u0197\u019c\5W,\2\u0198\u019a\5Y-\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\5W,\2\u019c\u0199\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019dV\3\2\2\2\u019e\u019f\t\5\2\2\u019fX\3\2\2\2\u01a0"+
		"\u01a2\5[.\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2"+
		"\2\u01a3\u01a4\3\2\2\2\u01a4Z\3\2\2\2\u01a5\u01a8\5W,\2\u01a6\u01a8\7"+
		"a\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\\\3\2\2\2\u01a9\u01ab"+
		"\7\62\2\2\u01aa\u01ac\5Q)\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\5_\60\2\u01ae^\3\2\2\2\u01af\u01b4\5a\61\2"+
		"\u01b0\u01b2\5c\62\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\5a\61\2\u01b4\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"`\3\2\2\2\u01b6\u01b7\t\6\2\2\u01b7b\3\2\2\2\u01b8\u01ba\5e\63\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bcd\3\2\2\2\u01bd\u01c0\5a\61\2\u01be\u01c0\7a\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0f\3\2\2\2\u01c1\u01c2\7\62\2\2\u01c2"+
		"\u01c3\t\7\2\2\u01c3\u01c4\5i\65\2\u01c4h\3\2\2\2\u01c5\u01ca\5k\66\2"+
		"\u01c6\u01c8\5m\67\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\u01cb\5k\66\2\u01ca\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"j\3\2\2\2\u01cc\u01cd\t\b\2\2\u01cdl\3\2\2\2\u01ce\u01d0\5o8\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"n\3\2\2\2\u01d3\u01d6\5k\66\2\u01d4\u01d6\7a\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d4\3\2\2\2\u01d6p\3\2\2\2\u01d7\u01da\5s:\2\u01d8\u01da\5\177@\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01dar\3\2\2\2\u01db\u01dc\5G$\2\u01dc"+
		"\u01de\7\60\2\2\u01dd\u01df\5G$\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\5u;\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5}?\2\u01e4\u01e3\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01f7\3\2\2\2\u01e6\u01e7\7\60\2\2\u01e7\u01e9\5"+
		"G$\2\u01e8\u01ea\5u;\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\3\2\2\2\u01eb\u01ed\5}?\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f7\3\2\2\2\u01ee\u01ef\5G$\2\u01ef\u01f1\5u;\2\u01f0\u01f2\5}?\2\u01f1"+
		"\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f7\3\2\2\2\u01f3\u01f4\5G"+
		"$\2\u01f4\u01f5\5}?\2\u01f5\u01f7\3\2\2\2\u01f6\u01db\3\2\2\2\u01f6\u01e6"+
		"\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7t\3\2\2\2\u01f8"+
		"\u01f9\5w<\2\u01f9\u01fa\5y=\2\u01fav\3\2\2\2\u01fb\u01fc\t\t\2\2\u01fc"+
		"x\3\2\2\2\u01fd\u01ff\5{>\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\5G$\2\u0201z\3\2\2\2\u0202\u0203\t\n\2\2\u0203"+
		"|\3\2\2\2\u0204\u0205\t\13\2\2\u0205~\3\2\2\2\u0206\u0207\5\u0081A\2\u0207"+
		"\u0209\5\u0083B\2\u0208\u020a\5}?\2\u0209\u0208\3\2\2\2\u0209\u020a\3"+
		"\2\2\2\u020a\u0080\3\2\2\2\u020b\u020d\5S*\2\u020c\u020e\7\60\2\2\u020d"+
		"\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0217\3\2\2\2\u020f\u0210\7\62"+
		"\2\2\u0210\u0212\t\4\2\2\u0211\u0213\5U+\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7\60\2\2\u0215\u0217\5U+\2\u0216"+
		"\u020b\3\2\2\2\u0216\u020f\3\2\2\2\u0217\u0082\3\2\2\2\u0218\u0219\5\u0085"+
		"C\2\u0219\u021a\5y=\2\u021a\u0084\3\2\2\2\u021b\u021c\t\f\2\2\u021c\u0086"+
		"\3\2\2\2\u021d\u021e\7v\2\2\u021e\u021f\7t\2\2\u021f\u0220\7w\2\2\u0220"+
		"\u0227\7g\2\2\u0221\u0222\7h\2\2\u0222\u0223\7c\2\2\u0223\u0224\7n\2\2"+
		"\u0224\u0225\7u\2\2\u0225\u0227\7g\2\2\u0226\u021d\3\2\2\2\u0226\u0221"+
		"\3\2\2\2\u0227\u0088\3\2\2\2\u0228\u0229\7)\2\2\u0229\u022a\5\u008bF\2"+
		"\u022a\u022b\7)\2\2\u022b\u008a\3\2\2\2\u022c\u022d\n\r\2\2\u022d\u008c"+
		"\3\2\2\2\u022e\u0230\7$\2\2\u022f\u0231\5\u008fH\2\u0230\u022f\3\2\2\2"+
		"\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7$\2\2\u0233\u008e"+
		"\3\2\2\2\u0234\u0236\5\u0091I\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2"+
		"\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0090\3\2\2\2\u0239\u023a"+
		"\n\16\2\2\u023a\u0092\3\2\2\2\u023b\u023c\7p\2\2\u023c\u023d\7w\2\2\u023d"+
		"\u023e\7n\2\2\u023e\u023f\7n\2\2\u023f\u0094\3\2\2\2\u0240\u0241\7*\2"+
		"\2\u0241\u0096\3\2\2\2\u0242\u0243\7+\2\2\u0243\u0098\3\2\2\2\u0244\u0245"+
		"\7}\2\2\u0245\u009a\3\2\2\2\u0246\u0247\7\177\2\2\u0247\u009c\3\2\2\2"+
		"\u0248\u0249\7]\2\2\u0249\u009e\3\2\2\2\u024a\u024b\7_\2\2\u024b\u00a0"+
		"\3\2\2\2\u024c\u024d\7=\2\2\u024d\u00a2\3\2\2\2\u024e\u024f\7.\2\2\u024f"+
		"\u00a4\3\2\2\2\u0250\u0251\7\60\2\2\u0251\u00a6\3\2\2\2\u0252\u0256\5"+
		"\u00a9U\2\u0253\u0255\5\u00abV\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2"+
		"\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u00a8\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025a\t\17\2\2\u025a\u00aa\3\2\2\2\u025b\u025c\t\20\2\2"+
		"\u025c\u00ac\3\2\2\2\u025d\u025f\t\21\2\2\u025e\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\bW\2\2\u0263\u00ae\3\2\2\2\u0264\u0265\7\61\2\2\u0265\u0266\7,"+
		"\2\2\u0266\u026a\3\2\2\2\u0267\u0269\13\2\2\2\u0268\u0267\3\2\2\2\u0269"+
		"\u026c\3\2\2\2\u026a\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026d\u026e\7,\2\2\u026e\u026f\7\61\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\bX\2\2\u0271\u00b0\3\2\2\2\u0272\u0273\7\61"+
		"\2\2\u0273\u0274\7\61\2\2\u0274\u0278\3\2\2\2\u0275\u0277\n\22\2\2\u0276"+
		"\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\bY\2\2\u027c"+
		"\u00b2\3\2\2\2\63\2\u0152\u0158\u015c\u0160\u0164\u0168\u016f\u0174\u0176"+
		"\u017a\u017d\u0181\u0188\u018c\u0191\u0199\u019c\u01a3\u01a7\u01ab\u01b1"+
		"\u01b4\u01bb\u01bf\u01c7\u01ca\u01d1\u01d5\u01d9\u01de\u01e1\u01e4\u01e9"+
		"\u01ec\u01f1\u01f6\u01fe\u0209\u020d\u0212\u0216\u0226\u0230\u0237\u0256"+
		"\u0260\u026a\u0278\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}