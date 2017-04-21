// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/idl/compiler/bnf/Moonlight.g4 by ANTLR 4.7
package com.moonlightsource.idl.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoonlightParser extends Parser {
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
	public static final int
		RULE_moonlightFile = 0, RULE_namespaceDeclaration = 1, RULE_namespaceValue = 2, 
		RULE_importDeclaration = 3, RULE_importValue = 4, RULE_structDeclaration = 5, 
		RULE_structField = 6, RULE_annotationDeclaration = 7, RULE_annotation = 8, 
		RULE_enumDeclaration = 9, RULE_enumField = 10, RULE_baseField = 11, RULE_baseAssignment = 12, 
		RULE_literal = 13, RULE_baseListExpr = 14, RULE_boolListExpr = 15, RULE_intListExpr = 16, 
		RULE_charListExpr = 17, RULE_floatListExpr = 18, RULE_stringListExpr = 19, 
		RULE_emptyListExpr = 20, RULE_functionDeclaration = 21, RULE_functionParameter = 22, 
		RULE_functionReturnType = 23, RULE_interfaceDeclaration = 24, RULE_interfaceName = 25, 
		RULE_fieldType = 26, RULE_referenceType = 27, RULE_parametricTypeExpr = 28, 
		RULE_containerType = 29, RULE_mapType = 30, RULE_setType = 31, RULE_listType = 32, 
		RULE_baseList = 33, RULE_boolList = 34, RULE_byteList = 35, RULE_shortList = 36, 
		RULE_charList = 37, RULE_intList = 38, RULE_longList = 39, RULE_floatList = 40, 
		RULE_doubleList = 41, RULE_stringList = 42, RULE_baseType = 43;
	public static final String[] ruleNames = {
		"moonlightFile", "namespaceDeclaration", "namespaceValue", "importDeclaration", 
		"importValue", "structDeclaration", "structField", "annotationDeclaration", 
		"annotation", "enumDeclaration", "enumField", "baseField", "baseAssignment", 
		"literal", "baseListExpr", "boolListExpr", "intListExpr", "charListExpr", 
		"floatListExpr", "stringListExpr", "emptyListExpr", "functionDeclaration", 
		"functionParameter", "functionReturnType", "interfaceDeclaration", "interfaceName", 
		"fieldType", "referenceType", "parametricTypeExpr", "containerType", "mapType", 
		"setType", "listType", "baseList", "boolList", "byteList", "shortList", 
		"charList", "intList", "longList", "floatList", "doubleList", "stringList", 
		"baseType"
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

	@Override
	public String getGrammarFileName() { return "Moonlight.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoonlightParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MoonlightFileContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<EnumDeclarationContext> enumDeclaration() {
			return getRuleContexts(EnumDeclarationContext.class);
		}
		public EnumDeclarationContext enumDeclaration(int i) {
			return getRuleContext(EnumDeclarationContext.class,i);
		}
		public List<AnnotationDeclarationContext> annotationDeclaration() {
			return getRuleContexts(AnnotationDeclarationContext.class);
		}
		public AnnotationDeclarationContext annotationDeclaration(int i) {
			return getRuleContext(AnnotationDeclarationContext.class,i);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public MoonlightFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moonlightFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterMoonlightFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitMoonlightFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitMoonlightFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoonlightFileContext moonlightFile() throws RecognitionException {
		MoonlightFileContext _localctx = new MoonlightFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_moonlightFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(88);
				annotation();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			namespaceDeclaration();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(95);
				importDeclaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << INTERFACE) | (1L << STRUCT) | (1L << ANNOTATION) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(101);
					enumDeclaration();
					}
					break;
				case 2:
					{
					setState(102);
					annotationDeclaration();
					}
					break;
				case 3:
					{
					setState(103);
					structDeclaration();
					}
					break;
				case 4:
					{
					setState(104);
					interfaceDeclaration();
					}
					break;
				}
				}
				setState(109);
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

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(MoonlightParser.NAMESPACE, 0); }
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(NAMESPACE);
			setState(111);
			namespaceValue();
			setState(112);
			match(SEMI);
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

	public static class NamespaceValueContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MoonlightParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MoonlightParser.Identifier, i);
		}
		public NamespaceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterNamespaceValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitNamespaceValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitNamespaceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceValueContext namespaceValue() throws RecognitionException {
		NamespaceValueContext _localctx = new NamespaceValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespaceValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Identifier);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(DOT);
					setState(116);
					match(Identifier);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MoonlightParser.IMPORT, 0); }
		public ImportValueContext importValue() {
			return getRuleContext(ImportValueContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IMPORT);
			setState(123);
			importValue();
			setState(124);
			match(SEMI);
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

	public static class ImportValueContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MoonlightParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MoonlightParser.Identifier, i);
		}
		public ImportValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterImportValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitImportValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitImportValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportValueContext importValue() throws RecognitionException {
		ImportValueContext _localctx = new ImportValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Identifier);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(DOT);
					setState(128);
					match(Identifier);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(134);
				match(DOT);
				setState(135);
				match(T__0);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(MoonlightParser.STRUCT, 0); }
		public List<ReferenceTypeContext> referenceType() {
			return getRuleContexts(ReferenceTypeContext.class);
		}
		public ReferenceTypeContext referenceType(int i) {
			return getRuleContext(ReferenceTypeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(MoonlightParser.EXTENDS, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(138);
				annotation();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(STRUCT);
			setState(145);
			referenceType();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(146);
				match(EXTENDS);
				setState(147);
				referenceType();
				}
			}

			setState(150);
			match(LBRACE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << FieldReq) | (1L << Identifier))) != 0)) {
				{
				{
				setState(151);
				structField();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(RBRACE);
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

	public static class StructFieldContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FieldReq() { return getToken(MoonlightParser.FieldReq, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					annotation();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FieldReq) {
				{
				setState(165);
				match(FieldReq);
				}
			}

			setState(168);
			fieldType();
			setState(169);
			match(Identifier);
			setState(170);
			match(SEMI);
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

	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(MoonlightParser.ANNOTATION, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<BaseFieldContext> baseField() {
			return getRuleContexts(BaseFieldContext.class);
		}
		public BaseFieldContext baseField(int i) {
			return getRuleContext(BaseFieldContext.class,i);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterAnnotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitAnnotationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(172);
				annotation();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(ANNOTATION);
			setState(179);
			match(Identifier);
			setState(180);
			match(LBRACE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(181);
				baseField();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(RBRACE);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AnnotationLabel() { return getToken(MoonlightParser.AnnotationLabel, 0); }
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public List<BaseAssignmentContext> baseAssignment() {
			return getRuleContexts(BaseAssignmentContext.class);
		}
		public BaseAssignmentContext baseAssignment(int i) {
			return getRuleContext(BaseAssignmentContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(189);
				namespaceValue();
				setState(190);
				match(DOT);
				}
			}

			setState(194);
			match(AnnotationLabel);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(195);
				match(LPAREN);
				setState(196);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(197);
				match(LPAREN);
				setState(198);
				baseAssignment();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(199);
					match(COMMA);
					setState(200);
					baseAssignment();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(RPAREN);
				}
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(MoonlightParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(210);
				annotation();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(ENUM);
			setState(217);
			match(Identifier);
			setState(218);
			match(LBRACE);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(219);
				enumField();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(RBRACE);
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

	public static class EnumFieldContext extends ParserRuleContext {
		public BaseFieldContext baseField() {
			return getRuleContext(BaseFieldContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitEnumField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitEnumField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(227);
				annotation();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			baseField();
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

	public static class BaseFieldContext extends ParserRuleContext {
		public BaseFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseField; }
	 
		public BaseFieldContext() { }
		public void copyFrom(BaseFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatFieldContext extends BaseFieldContext {
		public TerminalNode FLOAT() { return getToken(MoonlightParser.FLOAT, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(MoonlightParser.FloatingPointLiteral, 0); }
		public FloatFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFloatField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFloatField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFloatField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongFieldContext extends BaseFieldContext {
		public TerminalNode LONG() { return getToken(MoonlightParser.LONG, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MoonlightParser.IntegerLiteral, 0); }
		public LongFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterLongField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitLongField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitLongField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleFieldContext extends BaseFieldContext {
		public TerminalNode DOUBLE() { return getToken(MoonlightParser.DOUBLE, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(MoonlightParser.FloatingPointLiteral, 0); }
		public DoubleFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterDoubleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitDoubleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitDoubleField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleListFieldContext extends BaseFieldContext {
		public DoubleListContext doubleList() {
			return getRuleContext(DoubleListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public FloatListExprContext floatListExpr() {
			return getRuleContext(FloatListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public DoubleListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterDoubleListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitDoubleListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitDoubleListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharFieldContext extends BaseFieldContext {
		public TerminalNode CHAR() { return getToken(MoonlightParser.CHAR, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode CharacterLiteral() { return getToken(MoonlightParser.CharacterLiteral, 0); }
		public CharFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterCharField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitCharField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitCharField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ByteListFieldContext extends BaseFieldContext {
		public ByteListContext byteList() {
			return getRuleContext(ByteListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public IntListExprContext intListExpr() {
			return getRuleContext(IntListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public ByteListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterByteListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitByteListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitByteListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringListFieldContext extends BaseFieldContext {
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public StringListExprContext stringListExpr() {
			return getRuleContext(StringListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public StringListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterStringListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitStringListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitStringListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ByteFieldContext extends BaseFieldContext {
		public TerminalNode BYTE() { return getToken(MoonlightParser.BYTE, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MoonlightParser.IntegerLiteral, 0); }
		public ByteFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterByteField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitByteField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitByteField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntFieldContext extends BaseFieldContext {
		public TerminalNode INT() { return getToken(MoonlightParser.INT, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MoonlightParser.IntegerLiteral, 0); }
		public IntFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterIntField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitIntField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitIntField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFieldContext extends BaseFieldContext {
		public TerminalNode BOOLEAN() { return getToken(MoonlightParser.BOOLEAN, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode BooleanLiteral() { return getToken(MoonlightParser.BooleanLiteral, 0); }
		public BoolFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBoolField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBoolField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBoolField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShortFieldContext extends BaseFieldContext {
		public TerminalNode SHORT() { return getToken(MoonlightParser.SHORT, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MoonlightParser.IntegerLiteral, 0); }
		public ShortFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterShortField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitShortField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitShortField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharListFieldContext extends BaseFieldContext {
		public CharListContext charList() {
			return getRuleContext(CharListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public CharListExprContext charListExpr() {
			return getRuleContext(CharListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public CharListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterCharListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitCharListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitCharListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatListFieldContext extends BaseFieldContext {
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public FloatListExprContext floatListExpr() {
			return getRuleContext(FloatListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public FloatListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFloatListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFloatListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFloatListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntListFieldContext extends BaseFieldContext {
		public IntListContext intList() {
			return getRuleContext(IntListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public IntListExprContext intListExpr() {
			return getRuleContext(IntListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public IntListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterIntListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitIntListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitIntListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongListFieldContext extends BaseFieldContext {
		public LongListContext longList() {
			return getRuleContext(LongListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public IntListExprContext intListExpr() {
			return getRuleContext(IntListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public LongListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterLongListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitLongListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitLongListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShortListFieldContext extends BaseFieldContext {
		public ShortListContext shortList() {
			return getRuleContext(ShortListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public IntListExprContext intListExpr() {
			return getRuleContext(IntListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public ShortListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterShortListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitShortListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitShortListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolListFieldContext extends BaseFieldContext {
		public BoolListContext boolList() {
			return getRuleContext(BoolListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public BoolListExprContext boolListExpr() {
			return getRuleContext(BoolListExprContext.class,0);
		}
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public BoolListFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBoolListField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBoolListField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBoolListField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFieldContext extends BaseFieldContext {
		public TerminalNode STRING() { return getToken(MoonlightParser.STRING, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(MoonlightParser.StringLiteral, 0); }
		public StringFieldContext(BaseFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterStringField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitStringField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitStringField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseFieldContext baseField() throws RecognitionException {
		BaseFieldContext _localctx = new BaseFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_baseField);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new BoolFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(BOOLEAN);
				setState(236);
				match(Identifier);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(237);
					match(T__1);
					setState(238);
					match(BooleanLiteral);
					}
				}

				setState(241);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ByteFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(BYTE);
				setState(243);
				match(Identifier);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(244);
					match(T__1);
					setState(245);
					match(IntegerLiteral);
					}
				}

				setState(248);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ShortFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(SHORT);
				setState(250);
				match(Identifier);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(251);
					match(T__1);
					setState(252);
					match(IntegerLiteral);
					}
				}

				setState(255);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new IntFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(INT);
				setState(257);
				match(Identifier);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(258);
					match(T__1);
					setState(259);
					match(IntegerLiteral);
					}
				}

				setState(262);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new LongFieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(LONG);
				setState(264);
				match(Identifier);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(265);
					match(T__1);
					setState(266);
					match(IntegerLiteral);
					}
				}

				setState(269);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new CharFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(CHAR);
				setState(271);
				match(Identifier);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(272);
					match(T__1);
					setState(273);
					match(CharacterLiteral);
					}
				}

				setState(276);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new FloatFieldContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				match(FLOAT);
				setState(278);
				match(Identifier);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(279);
					match(T__1);
					setState(280);
					match(FloatingPointLiteral);
					}
				}

				setState(283);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new DoubleFieldContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				match(DOUBLE);
				setState(285);
				match(Identifier);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(286);
					match(T__1);
					setState(287);
					match(FloatingPointLiteral);
					}
				}

				setState(290);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(STRING);
				setState(292);
				match(Identifier);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(293);
					match(T__1);
					setState(294);
					match(StringLiteral);
					}
				}

				setState(297);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new BoolListFieldContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(298);
				boolList();
				setState(299);
				match(Identifier);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(300);
					match(T__1);
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(301);
						boolListExpr();
						}
						break;
					case 2:
						{
						setState(302);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(307);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ByteListFieldContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(309);
				byteList();
				setState(310);
				match(Identifier);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(311);
					match(T__1);
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(312);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(313);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(318);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new ShortListFieldContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(320);
				shortList();
				setState(321);
				match(Identifier);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(322);
					match(T__1);
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(323);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(324);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(329);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new IntListFieldContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(331);
				intList();
				setState(332);
				match(Identifier);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(333);
					match(T__1);
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(334);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(335);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(340);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new LongListFieldContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(342);
				longList();
				setState(343);
				match(Identifier);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(344);
					match(T__1);
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(345);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(346);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(351);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new CharListFieldContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(353);
				charList();
				setState(354);
				match(Identifier);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(355);
					match(T__1);
					setState(358);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(356);
						charListExpr();
						}
						break;
					case 2:
						{
						setState(357);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(362);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new FloatListFieldContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(364);
				floatList();
				setState(365);
				match(Identifier);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(366);
					match(T__1);
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(367);
						floatListExpr();
						}
						break;
					case 2:
						{
						setState(368);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(373);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new DoubleListFieldContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(375);
				doubleList();
				setState(376);
				match(Identifier);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(377);
					match(T__1);
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(378);
						floatListExpr();
						}
						break;
					case 2:
						{
						setState(379);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(384);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new StringListFieldContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(386);
				stringList();
				setState(387);
				match(Identifier);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(388);
					match(T__1);
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(389);
						stringListExpr();
						}
						break;
					case 2:
						{
						setState(390);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(395);
				match(SEMI);
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

	public static class BaseAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BaseListExprContext baseListExpr() {
			return getRuleContext(BaseListExprContext.class,0);
		}
		public BaseAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseAssignmentContext baseAssignment() throws RecognitionException {
		BaseAssignmentContext _localctx = new BaseAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_baseAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(Identifier);
			setState(400);
			match(T__1);
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				{
				setState(401);
				literal();
				}
				break;
			case EMPTY_LIST:
			case LBRACK:
				{
				setState(402);
				baseListExpr();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(MoonlightParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(MoonlightParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(MoonlightParser.CharacterLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(MoonlightParser.FloatingPointLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(MoonlightParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(MoonlightParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class BaseListExprContext extends ParserRuleContext {
		public EmptyListExprContext emptyListExpr() {
			return getRuleContext(EmptyListExprContext.class,0);
		}
		public BoolListExprContext boolListExpr() {
			return getRuleContext(BoolListExprContext.class,0);
		}
		public IntListExprContext intListExpr() {
			return getRuleContext(IntListExprContext.class,0);
		}
		public CharListExprContext charListExpr() {
			return getRuleContext(CharListExprContext.class,0);
		}
		public FloatListExprContext floatListExpr() {
			return getRuleContext(FloatListExprContext.class,0);
		}
		public StringListExprContext stringListExpr() {
			return getRuleContext(StringListExprContext.class,0);
		}
		public BaseListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseListExprContext baseListExpr() throws RecognitionException {
		BaseListExprContext _localctx = new BaseListExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_baseListExpr);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				emptyListExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				boolListExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				intListExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				charListExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				floatListExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				stringListExpr();
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

	public static class BoolListExprContext extends ParserRuleContext {
		public List<TerminalNode> BooleanLiteral() { return getTokens(MoonlightParser.BooleanLiteral); }
		public TerminalNode BooleanLiteral(int i) {
			return getToken(MoonlightParser.BooleanLiteral, i);
		}
		public BoolListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBoolListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBoolListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBoolListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolListExprContext boolListExpr() throws RecognitionException {
		BoolListExprContext _localctx = new BoolListExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolListExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LBRACK);
			setState(416);
			match(BooleanLiteral);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(417);
				match(COMMA);
				setState(418);
				match(BooleanLiteral);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(RBRACK);
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

	public static class IntListExprContext extends ParserRuleContext {
		public List<TerminalNode> IntegerLiteral() { return getTokens(MoonlightParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(MoonlightParser.IntegerLiteral, i);
		}
		public IntListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterIntListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitIntListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitIntListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntListExprContext intListExpr() throws RecognitionException {
		IntListExprContext _localctx = new IntListExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_intListExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LBRACK);
			setState(427);
			match(IntegerLiteral);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428);
				match(COMMA);
				setState(429);
				match(IntegerLiteral);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(RBRACK);
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

	public static class CharListExprContext extends ParserRuleContext {
		public List<TerminalNode> CharacterLiteral() { return getTokens(MoonlightParser.CharacterLiteral); }
		public TerminalNode CharacterLiteral(int i) {
			return getToken(MoonlightParser.CharacterLiteral, i);
		}
		public CharListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterCharListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitCharListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitCharListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharListExprContext charListExpr() throws RecognitionException {
		CharListExprContext _localctx = new CharListExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_charListExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(LBRACK);
			setState(438);
			match(CharacterLiteral);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(439);
				match(COMMA);
				setState(440);
				match(CharacterLiteral);
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(RBRACK);
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

	public static class FloatListExprContext extends ParserRuleContext {
		public List<TerminalNode> FloatingPointLiteral() { return getTokens(MoonlightParser.FloatingPointLiteral); }
		public TerminalNode FloatingPointLiteral(int i) {
			return getToken(MoonlightParser.FloatingPointLiteral, i);
		}
		public FloatListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFloatListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFloatListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFloatListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatListExprContext floatListExpr() throws RecognitionException {
		FloatListExprContext _localctx = new FloatListExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floatListExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(LBRACK);
			setState(449);
			match(FloatingPointLiteral);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(450);
				match(COMMA);
				setState(451);
				match(FloatingPointLiteral);
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			match(RBRACK);
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

	public static class StringListExprContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(MoonlightParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(MoonlightParser.StringLiteral, i);
		}
		public StringListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterStringListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitStringListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitStringListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListExprContext stringListExpr() throws RecognitionException {
		StringListExprContext _localctx = new StringListExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringListExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(LBRACK);
			setState(460);
			match(StringLiteral);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(461);
				match(COMMA);
				setState(462);
				match(StringLiteral);
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(RBRACK);
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

	public static class EmptyListExprContext extends ParserRuleContext {
		public TerminalNode EMPTY_LIST() { return getToken(MoonlightParser.EMPTY_LIST, 0); }
		public EmptyListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyListExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterEmptyListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitEmptyListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitEmptyListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyListExprContext emptyListExpr() throws RecognitionException {
		EmptyListExprContext _localctx = new EmptyListExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_emptyListExpr);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(EMPTY_LIST);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(LBRACK);
				setState(472);
				match(RBRACK);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(475);
					annotation();
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(481);
			functionReturnType();
			setState(482);
			match(Identifier);
			setState(483);
			match(LPAREN);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(484);
				functionParameter();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(485);
					match(COMMA);
					setState(486);
					functionParameter();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(RPAREN);
			setState(498);
			match(SEMI);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(500);
					annotation();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(506);
			fieldType();
			setState(507);
			match(Identifier);
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

	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MoonlightParser.VOID, 0); }
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionReturnType);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(VOID);
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case BOOLEAN:
			case BYTE:
			case SHORT:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				fieldType();
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(MoonlightParser.INTERFACE, 0); }
		public List<InterfaceNameContext> interfaceName() {
			return getRuleContexts(InterfaceNameContext.class);
		}
		public InterfaceNameContext interfaceName(int i) {
			return getRuleContext(InterfaceNameContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(MoonlightParser.EXTENDS, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(513);
				annotation();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(INTERFACE);
			setState(520);
			interfaceName();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(521);
				match(EXTENDS);
				setState(522);
				interfaceName();
				}
			}

			setState(525);
			match(LBRACE);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(526);
				functionDeclaration();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			match(RBRACE);
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

	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitInterfaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(534);
				namespaceValue();
				setState(535);
				match(DOT);
				}
				break;
			}
			setState(539);
			match(Identifier);
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

	public static class FieldTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public ContainerTypeContext containerType() {
			return getRuleContext(ContainerTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFieldType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldType);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case SHORT:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				baseType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				containerType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				referenceType();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public ParametricTypeExprContext parametricTypeExpr() {
			return getRuleContext(ParametricTypeExprContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(546);
				namespaceValue();
				setState(547);
				match(DOT);
				}
				break;
			}
			setState(551);
			match(Identifier);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(552);
				parametricTypeExpr();
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

	public static class ParametricTypeExprContext extends ParserRuleContext {
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public ParametricTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametricTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterParametricTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitParametricTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitParametricTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametricTypeExprContext parametricTypeExpr() throws RecognitionException {
		ParametricTypeExprContext _localctx = new ParametricTypeExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametricTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__2);
			setState(556);
			fieldType();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(557);
				match(COMMA);
				setState(558);
				fieldType();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
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

	public static class ContainerTypeContext extends ParserRuleContext {
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ContainerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterContainerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitContainerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitContainerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerTypeContext containerType() throws RecognitionException {
		ContainerTypeContext _localctx = new ContainerTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_containerType);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				mapType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				setType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				listType();
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

	public static class MapTypeContext extends ParserRuleContext {
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__4);
			setState(572);
			match(T__2);
			setState(573);
			fieldType();
			setState(574);
			match(COMMA);
			setState(575);
			fieldType();
			setState(576);
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

	public static class SetTypeContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__5);
			setState(579);
			match(T__2);
			setState(580);
			fieldType();
			setState(581);
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

	public static class ListTypeContext extends ParserRuleContext {
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
	 
		public ListTypeContext() { }
		public void copyFrom(ListTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContainerTypeListContext extends ListTypeContext {
		public ContainerTypeContext containerType() {
			return getRuleContext(ContainerTypeContext.class,0);
		}
		public ContainerTypeListContext(ListTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterContainerTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitContainerTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitContainerTypeList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseTypeListContext extends ListTypeContext {
		public BaseListContext baseList() {
			return getRuleContext(BaseListContext.class,0);
		}
		public BaseTypeListContext(ListTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseTypeList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReferenceTypeListContext extends ListTypeContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ReferenceTypeListContext(ListTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterReferenceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitReferenceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitReferenceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listType);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new BaseTypeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				baseList();
				}
				break;
			case 2:
				_localctx = new ContainerTypeListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(T__6);
				setState(585);
				match(T__2);
				setState(586);
				containerType();
				setState(587);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReferenceTypeListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(T__6);
				setState(590);
				match(T__2);
				setState(591);
				referenceType();
				setState(592);
				match(T__3);
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

	public static class BaseListContext extends ParserRuleContext {
		public BoolListContext boolList() {
			return getRuleContext(BoolListContext.class,0);
		}
		public ByteListContext byteList() {
			return getRuleContext(ByteListContext.class,0);
		}
		public ShortListContext shortList() {
			return getRuleContext(ShortListContext.class,0);
		}
		public CharListContext charList() {
			return getRuleContext(CharListContext.class,0);
		}
		public IntListContext intList() {
			return getRuleContext(IntListContext.class,0);
		}
		public LongListContext longList() {
			return getRuleContext(LongListContext.class,0);
		}
		public FloatListContext floatList() {
			return getRuleContext(FloatListContext.class,0);
		}
		public DoubleListContext doubleList() {
			return getRuleContext(DoubleListContext.class,0);
		}
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public BaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseListContext baseList() throws RecognitionException {
		BaseListContext _localctx = new BaseListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_baseList);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				boolList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				byteList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				shortList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				charList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				intList();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
				longList();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(602);
				floatList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(603);
				doubleList();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(604);
				stringList();
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

	public static class BoolListContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MoonlightParser.BOOLEAN, 0); }
		public BoolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBoolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBoolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBoolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolListContext boolList() throws RecognitionException {
		BoolListContext _localctx = new BoolListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_boolList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__6);
			setState(608);
			match(T__2);
			setState(609);
			match(BOOLEAN);
			setState(610);
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

	public static class ByteListContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(MoonlightParser.BYTE, 0); }
		public ByteListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterByteList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitByteList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitByteList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteListContext byteList() throws RecognitionException {
		ByteListContext _localctx = new ByteListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_byteList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T__6);
			setState(613);
			match(T__2);
			setState(614);
			match(BYTE);
			setState(615);
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

	public static class ShortListContext extends ParserRuleContext {
		public TerminalNode SHORT() { return getToken(MoonlightParser.SHORT, 0); }
		public ShortListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterShortList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitShortList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitShortList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortListContext shortList() throws RecognitionException {
		ShortListContext _localctx = new ShortListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shortList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__6);
			setState(618);
			match(T__2);
			setState(619);
			match(SHORT);
			setState(620);
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

	public static class CharListContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MoonlightParser.CHAR, 0); }
		public CharListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterCharList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitCharList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitCharList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharListContext charList() throws RecognitionException {
		CharListContext _localctx = new CharListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_charList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__6);
			setState(623);
			match(T__2);
			setState(624);
			match(CHAR);
			setState(625);
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

	public static class IntListContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MoonlightParser.INT, 0); }
		public IntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterIntList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitIntList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitIntList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntListContext intList() throws RecognitionException {
		IntListContext _localctx = new IntListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_intList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(T__6);
			setState(628);
			match(T__2);
			setState(629);
			match(INT);
			setState(630);
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

	public static class LongListContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(MoonlightParser.LONG, 0); }
		public LongListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterLongList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitLongList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitLongList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongListContext longList() throws RecognitionException {
		LongListContext _localctx = new LongListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_longList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(T__6);
			setState(633);
			match(T__2);
			setState(634);
			match(LONG);
			setState(635);
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

	public static class FloatListContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(MoonlightParser.FLOAT, 0); }
		public FloatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterFloatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitFloatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitFloatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatListContext floatList() throws RecognitionException {
		FloatListContext _localctx = new FloatListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_floatList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T__6);
			setState(638);
			match(T__2);
			setState(639);
			match(FLOAT);
			setState(640);
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

	public static class DoubleListContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(MoonlightParser.DOUBLE, 0); }
		public DoubleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterDoubleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitDoubleList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitDoubleList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleListContext doubleList() throws RecognitionException {
		DoubleListContext _localctx = new DoubleListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_doubleList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__6);
			setState(643);
			match(T__2);
			setState(644);
			match(DOUBLE);
			setState(645);
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

	public static class StringListContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MoonlightParser.STRING, 0); }
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_stringList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__6);
			setState(648);
			match(T__2);
			setState(649);
			match(STRING);
			setState(650);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MoonlightParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(MoonlightParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(MoonlightParser.SHORT, 0); }
		public TerminalNode CHAR() { return getToken(MoonlightParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(MoonlightParser.INT, 0); }
		public TerminalNode LONG() { return getToken(MoonlightParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(MoonlightParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MoonlightParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MoonlightParser.STRING, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0291\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13"+
		"\2\3\2\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\7\4x\n\4\f\4\16\4{\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u0084\n\6\f\6"+
		"\16\6\u0087\13\6\3\6\3\6\5\6\u008b\n\6\3\7\7\7\u008e\n\7\f\7\16\7\u0091"+
		"\13\7\3\7\3\7\3\7\3\7\5\7\u0097\n\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e"+
		"\13\7\3\7\3\7\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\5\b\u00a9\n\b"+
		"\3\b\3\b\3\b\3\b\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00c3\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\5"+
		"\n\u00d3\n\n\3\13\7\13\u00d6\n\13\f\13\16\13\u00d9\13\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00df\n\13\f\13\16\13\u00e2\13\13\3\13\3\13\3\f\7\f\u00e7\n"+
		"\f\f\f\16\f\u00ea\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00f2\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00f9\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0100\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0107\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0115\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u011c\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0123\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u012a\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0132\n\r\5\r\u0134\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013d"+
		"\n\r\5\r\u013f\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0148\n\r\5\r\u014a"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0153\n\r\5\r\u0155\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u015e\n\r\5\r\u0160\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0169\n\r\5\r\u016b\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0174"+
		"\n\r\5\r\u0176\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u017f\n\r\5\r\u0181"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u018a\n\r\5\r\u018c\n\r\3\r\3\r\5"+
		"\r\u0190\n\r\3\16\3\16\3\16\3\16\5\16\u0196\n\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u01a0\n\20\3\21\3\21\3\21\3\21\7\21\u01a6\n\21"+
		"\f\21\16\21\u01a9\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u01b1\n\22"+
		"\f\22\16\22\u01b4\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u01bc\n\23"+
		"\f\23\16\23\u01bf\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u01c7\n\24"+
		"\f\24\16\24\u01ca\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u01d2\n\25"+
		"\f\25\16\25\u01d5\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u01dc\n\26\3\27"+
		"\7\27\u01df\n\27\f\27\16\27\u01e2\13\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u01ea\n\27\f\27\16\27\u01ed\13\27\7\27\u01ef\n\27\f\27\16\27\u01f2"+
		"\13\27\3\27\3\27\3\27\3\30\7\30\u01f8\n\30\f\30\16\30\u01fb\13\30\3\30"+
		"\3\30\3\30\3\31\3\31\5\31\u0202\n\31\3\32\7\32\u0205\n\32\f\32\16\32\u0208"+
		"\13\32\3\32\3\32\3\32\3\32\5\32\u020e\n\32\3\32\3\32\7\32\u0212\n\32\f"+
		"\32\16\32\u0215\13\32\3\32\3\32\3\33\3\33\3\33\5\33\u021c\n\33\3\33\3"+
		"\33\3\34\3\34\3\34\5\34\u0223\n\34\3\35\3\35\3\35\5\35\u0228\n\35\3\35"+
		"\3\35\5\35\u022c\n\35\3\36\3\36\3\36\3\36\7\36\u0232\n\36\f\36\16\36\u0235"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\5\37\u023c\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0255\n"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0260\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\4\3\2"+
		"\36#\3\2\n\22\2\u02cd\2]\3\2\2\2\4p\3\2\2\2\6t\3\2\2\2\b|\3\2\2\2\n\u0080"+
		"\3\2\2\2\f\u008f\3\2\2\2\16\u00a4\3\2\2\2\20\u00b1\3\2\2\2\22\u00c2\3"+
		"\2\2\2\24\u00d7\3\2\2\2\26\u00e8\3\2\2\2\30\u018f\3\2\2\2\32\u0191\3\2"+
		"\2\2\34\u0197\3\2\2\2\36\u019f\3\2\2\2 \u01a1\3\2\2\2\"\u01ac\3\2\2\2"+
		"$\u01b7\3\2\2\2&\u01c2\3\2\2\2(\u01cd\3\2\2\2*\u01db\3\2\2\2,\u01e0\3"+
		"\2\2\2.\u01f9\3\2\2\2\60\u0201\3\2\2\2\62\u0206\3\2\2\2\64\u021b\3\2\2"+
		"\2\66\u0222\3\2\2\28\u0227\3\2\2\2:\u022d\3\2\2\2<\u023b\3\2\2\2>\u023d"+
		"\3\2\2\2@\u0244\3\2\2\2B\u0254\3\2\2\2D\u025f\3\2\2\2F\u0261\3\2\2\2H"+
		"\u0266\3\2\2\2J\u026b\3\2\2\2L\u0270\3\2\2\2N\u0275\3\2\2\2P\u027a\3\2"+
		"\2\2R\u027f\3\2\2\2T\u0284\3\2\2\2V\u0289\3\2\2\2X\u028e\3\2\2\2Z\\\5"+
		"\22\n\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`"+
		"d\5\4\3\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2em\3\2\2\2"+
		"fd\3\2\2\2gl\5\24\13\2hl\5\20\t\2il\5\f\7\2jl\5\62\32\2kg\3\2\2\2kh\3"+
		"\2\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\3\3\2\2\2om"+
		"\3\2\2\2pq\7\30\2\2qr\5\6\4\2rs\7*\2\2s\5\3\2\2\2ty\7-\2\2uv\7,\2\2vx"+
		"\7-\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\7\3\2\2\2{y\3\2\2\2|"+
		"}\7\26\2\2}~\5\n\6\2~\177\7*\2\2\177\t\3\2\2\2\u0080\u0085\7-\2\2\u0081"+
		"\u0082\7,\2\2\u0082\u0084\7-\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7,\2\2\u0089\u008b\7\3\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008e\5\22\n\2\u008d\u008c\3\2\2"+
		"\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\31\2\2\u0093\u0096\58\35\2"+
		"\u0094\u0095\7\25\2\2\u0095\u0097\58\35\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\7&\2\2\u0099\u009b\5\16\b\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\'\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u00a3\5\22\n\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a9\7\35\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5\66\34\2\u00ab\u00ac\7-\2\2\u00ac\u00ad"+
		"\7*\2\2\u00ad\17\3\2\2\2\u00ae\u00b0\5\22\n\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\32\2\2\u00b5\u00b6\7-\2\2\u00b6"+
		"\u00ba\7&\2\2\u00b7\u00b9\5\30\r\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7\'\2\2\u00be\21\3\2\2\2\u00bf\u00c0\5\6\4"+
		"\2\u00c0\u00c1\7,\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00d2\7\34\2\2\u00c5\u00c6\7$\2\2\u00c6"+
		"\u00d3\7%\2\2\u00c7\u00c8\7$\2\2\u00c8\u00cd\5\32\16\2\u00c9\u00ca\7+"+
		"\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7%\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2"+
		"\u00c7\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d6\5\22\n"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\24\2\2"+
		"\u00db\u00dc\7-\2\2\u00dc\u00e0\7&\2\2\u00dd\u00df\5\26\f\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4\25\3\2\2"+
		"\2\u00e5\u00e7\5\22\n\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\5\30\r\2\u00ec\27\3\2\2\2\u00ed\u00ee\7\n\2\2\u00ee\u00f1"+
		"\7-\2\2\u00ef\u00f0\7\4\2\2\u00f0\u00f2\7 \2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0190\7*\2\2\u00f4\u00f5\7\13"+
		"\2\2\u00f5\u00f8\7-\2\2\u00f6\u00f7\7\4\2\2\u00f7\u00f9\7\36\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0190\7*"+
		"\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00ff\7-\2\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u0100\7\36\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u0190\7*\2\2\u0102\u0103\7\16\2\2\u0103\u0106\7-\2\2\u0104"+
		"\u0105\7\4\2\2\u0105\u0107\7\36\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u0190\7*\2\2\u0109\u010a\7\17\2\2\u010a"+
		"\u010d\7-\2\2\u010b\u010c\7\4\2\2\u010c\u010e\7\36\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0190\7*\2\2\u0110"+
		"\u0111\7\r\2\2\u0111\u0114\7-\2\2\u0112\u0113\7\4\2\2\u0113\u0115\7!\2"+
		"\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0190"+
		"\7*\2\2\u0117\u0118\7\20\2\2\u0118\u011b\7-\2\2\u0119\u011a\7\4\2\2\u011a"+
		"\u011c\7\37\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u0190\7*\2\2\u011e\u011f\7\21\2\2\u011f\u0122\7-\2\2\u0120"+
		"\u0121\7\4\2\2\u0121\u0123\7\37\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0190\7*\2\2\u0125\u0126\7\22\2\2\u0126"+
		"\u0129\7-\2\2\u0127\u0128\7\4\2\2\u0128\u012a\7\"\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0190\7*\2\2\u012c"+
		"\u012d\5F$\2\u012d\u0133\7-\2\2\u012e\u0131\7\4\2\2\u012f\u0132\5 \21"+
		"\2\u0130\u0132\5*\26\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0134"+
		"\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\7*\2\2\u0136\u0190\3\2\2\2\u0137\u0138\5H%\2\u0138\u013e\7-\2\2"+
		"\u0139\u013c\7\4\2\2\u013a\u013d\5\"\22\2\u013b\u013d\5*\26\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7*\2\2\u0141\u0190\3\2"+
		"\2\2\u0142\u0143\5J&\2\u0143\u0149\7-\2\2\u0144\u0147\7\4\2\2\u0145\u0148"+
		"\5\"\22\2\u0146\u0148\5*\26\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2"+
		"\u0148\u014a\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\7*\2\2\u014c\u0190\3\2\2\2\u014d\u014e\5N(\2\u014e"+
		"\u0154\7-\2\2\u014f\u0152\7\4\2\2\u0150\u0153\5\"\22\2\u0151\u0153\5*"+
		"\26\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u014f\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7*"+
		"\2\2\u0157\u0190\3\2\2\2\u0158\u0159\5P)\2\u0159\u015f\7-\2\2\u015a\u015d"+
		"\7\4\2\2\u015b\u015e\5\"\22\2\u015c\u015e\5*\26\2\u015d\u015b\3\2\2\2"+
		"\u015d\u015c\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7*\2\2\u0162\u0190\3\2\2\2\u0163"+
		"\u0164\5L\'\2\u0164\u016a\7-\2\2\u0165\u0168\7\4\2\2\u0166\u0169\5$\23"+
		"\2\u0167\u0169\5*\26\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016b"+
		"\3\2\2\2\u016a\u0165\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\7*\2\2\u016d\u0190\3\2\2\2\u016e\u016f\5R*\2\u016f\u0175\7-\2\2"+
		"\u0170\u0173\7\4\2\2\u0171\u0174\5&\24\2\u0172\u0174\5*\26\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0170\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7*\2\2\u0178\u0190\3\2"+
		"\2\2\u0179\u017a\5T+\2\u017a\u0180\7-\2\2\u017b\u017e\7\4\2\2\u017c\u017f"+
		"\5&\24\2\u017d\u017f\5*\26\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017b\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\7*\2\2\u0183\u0190\3\2\2\2\u0184\u0185\5V,\2\u0185\u018b"+
		"\7-\2\2\u0186\u0189\7\4\2\2\u0187\u018a\5(\25\2\u0188\u018a\5*\26\2\u0189"+
		"\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0186\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7*\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u00ed\3\2\2\2\u018f\u00f4\3\2\2\2\u018f\u00fb\3\2"+
		"\2\2\u018f\u0102\3\2\2\2\u018f\u0109\3\2\2\2\u018f\u0110\3\2\2\2\u018f"+
		"\u0117\3\2\2\2\u018f\u011e\3\2\2\2\u018f\u0125\3\2\2\2\u018f\u012c\3\2"+
		"\2\2\u018f\u0137\3\2\2\2\u018f\u0142\3\2\2\2\u018f\u014d\3\2\2\2\u018f"+
		"\u0158\3\2\2\2\u018f\u0163\3\2\2\2\u018f\u016e\3\2\2\2\u018f\u0179\3\2"+
		"\2\2\u018f\u0184\3\2\2\2\u0190\31\3\2\2\2\u0191\u0192\7-\2\2\u0192\u0195"+
		"\7\4\2\2\u0193\u0196\5\34\17\2\u0194\u0196\5\36\20\2\u0195\u0193\3\2\2"+
		"\2\u0195\u0194\3\2\2\2\u0196\33\3\2\2\2\u0197\u0198\t\2\2\2\u0198\35\3"+
		"\2\2\2\u0199\u01a0\5*\26\2\u019a\u01a0\5 \21\2\u019b\u01a0\5\"\22\2\u019c"+
		"\u01a0\5$\23\2\u019d\u01a0\5&\24\2\u019e\u01a0\5(\25\2\u019f\u0199\3\2"+
		"\2\2\u019f\u019a\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\37\3\2\2\2\u01a1\u01a2\7(\2\2"+
		"\u01a2\u01a7\7 \2\2\u01a3\u01a4\7+\2\2\u01a4\u01a6\7 \2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7)\2\2\u01ab!\3\2\2\2\u01ac"+
		"\u01ad\7(\2\2\u01ad\u01b2\7\36\2\2\u01ae\u01af\7+\2\2\u01af\u01b1\7\36"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7)"+
		"\2\2\u01b6#\3\2\2\2\u01b7\u01b8\7(\2\2\u01b8\u01bd\7!\2\2\u01b9\u01ba"+
		"\7+\2\2\u01ba\u01bc\7!\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01c0\u01c1\7)\2\2\u01c1%\3\2\2\2\u01c2\u01c3\7(\2\2\u01c3\u01c8"+
		"\7\37\2\2\u01c4\u01c5\7+\2\2\u01c5\u01c7\7\37\2\2\u01c6\u01c4\3\2\2\2"+
		"\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7)\2\2\u01cc\'\3\2\2\2\u01cd"+
		"\u01ce\7(\2\2\u01ce\u01d3\7\"\2\2\u01cf\u01d0\7+\2\2\u01d0\u01d2\7\"\2"+
		"\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7)\2\2\u01d7"+
		")\3\2\2\2\u01d8\u01dc\7\33\2\2\u01d9\u01da\7(\2\2\u01da\u01dc\7)\2\2\u01db"+
		"\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc+\3\2\2\2\u01dd\u01df\5\22\n\2"+
		"\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\5\60\31\2"+
		"\u01e4\u01e5\7-\2\2\u01e5\u01f0\7$\2\2\u01e6\u01eb\5.\30\2\u01e7\u01e8"+
		"\7+\2\2\u01e8\u01ea\5.\30\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ee\u01e6\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7%"+
		"\2\2\u01f4\u01f5\7*\2\2\u01f5-\3\2\2\2\u01f6\u01f8\5\22\n\2\u01f7\u01f6"+
		"\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5\66\34\2\u01fd\u01fe\7"+
		"-\2\2\u01fe/\3\2\2\2\u01ff\u0202\7\23\2\2\u0200\u0202\5\66\34\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\61\3\2\2\2\u0203\u0205\5\22\n"+
		"\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\27\2\2"+
		"\u020a\u020d\5\64\33\2\u020b\u020c\7\25\2\2\u020c\u020e\5\64\33\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0213\7&"+
		"\2\2\u0210\u0212\5,\27\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u0217\7\'\2\2\u0217\63\3\2\2\2\u0218\u0219\5\6\4\2\u0219\u021a"+
		"\7,\2\2\u021a\u021c\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\7-\2\2\u021e\65\3\2\2\2\u021f\u0223\5X-\2\u0220"+
		"\u0223\5<\37\2\u0221\u0223\58\35\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0222\u0221\3\2\2\2\u0223\67\3\2\2\2\u0224\u0225\5\6\4\2\u0225\u0226"+
		"\7,\2\2\u0226\u0228\3\2\2\2\u0227\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\7-\2\2\u022a\u022c\5:\36\2\u022b\u022a\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c9\3\2\2\2\u022d\u022e\7\5\2\2\u022e\u0233"+
		"\5\66\34\2\u022f\u0230\7+\2\2\u0230\u0232\5\66\34\2\u0231\u022f\3\2\2"+
		"\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236"+
		"\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7\6\2\2\u0237;\3\2\2\2\u0238"+
		"\u023c\5> \2\u0239\u023c\5@!\2\u023a\u023c\5B\"\2\u023b\u0238\3\2\2\2"+
		"\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c=\3\2\2\2\u023d\u023e\7"+
		"\7\2\2\u023e\u023f\7\5\2\2\u023f\u0240\5\66\34\2\u0240\u0241\7+\2\2\u0241"+
		"\u0242\5\66\34\2\u0242\u0243\7\6\2\2\u0243?\3\2\2\2\u0244\u0245\7\b\2"+
		"\2\u0245\u0246\7\5\2\2\u0246\u0247\5\66\34\2\u0247\u0248\7\6\2\2\u0248"+
		"A\3\2\2\2\u0249\u0255\5D#\2\u024a\u024b\7\t\2\2\u024b\u024c\7\5\2\2\u024c"+
		"\u024d\5<\37\2\u024d\u024e\7\6\2\2\u024e\u0255\3\2\2\2\u024f\u0250\7\t"+
		"\2\2\u0250\u0251\7\5\2\2\u0251\u0252\58\35\2\u0252\u0253\7\6\2\2\u0253"+
		"\u0255\3\2\2\2\u0254\u0249\3\2\2\2\u0254\u024a\3\2\2\2\u0254\u024f\3\2"+
		"\2\2\u0255C\3\2\2\2\u0256\u0260\5F$\2\u0257\u0260\5H%\2\u0258\u0260\5"+
		"J&\2\u0259\u0260\5L\'\2\u025a\u0260\5N(\2\u025b\u0260\5P)\2\u025c\u0260"+
		"\5R*\2\u025d\u0260\5T+\2\u025e\u0260\5V,\2\u025f\u0256\3\2\2\2\u025f\u0257"+
		"\3\2\2\2\u025f\u0258\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u025a\3\2\2\2\u025f"+
		"\u025b\3\2\2\2\u025f\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2"+
		"\2\2\u0260E\3\2\2\2\u0261\u0262\7\t\2\2\u0262\u0263\7\5\2\2\u0263\u0264"+
		"\7\n\2\2\u0264\u0265\7\6\2\2\u0265G\3\2\2\2\u0266\u0267\7\t\2\2\u0267"+
		"\u0268\7\5\2\2\u0268\u0269\7\13\2\2\u0269\u026a\7\6\2\2\u026aI\3\2\2\2"+
		"\u026b\u026c\7\t\2\2\u026c\u026d\7\5\2\2\u026d\u026e\7\f\2\2\u026e\u026f"+
		"\7\6\2\2\u026fK\3\2\2\2\u0270\u0271\7\t\2\2\u0271\u0272\7\5\2\2\u0272"+
		"\u0273\7\r\2\2\u0273\u0274\7\6\2\2\u0274M\3\2\2\2\u0275\u0276\7\t\2\2"+
		"\u0276\u0277\7\5\2\2\u0277\u0278\7\16\2\2\u0278\u0279\7\6\2\2\u0279O\3"+
		"\2\2\2\u027a\u027b\7\t\2\2\u027b\u027c\7\5\2\2\u027c\u027d\7\17\2\2\u027d"+
		"\u027e\7\6\2\2\u027eQ\3\2\2\2\u027f\u0280\7\t\2\2\u0280\u0281\7\5\2\2"+
		"\u0281\u0282\7\20\2\2\u0282\u0283\7\6\2\2\u0283S\3\2\2\2\u0284\u0285\7"+
		"\t\2\2\u0285\u0286\7\5\2\2\u0286\u0287\7\21\2\2\u0287\u0288\7\6\2\2\u0288"+
		"U\3\2\2\2\u0289\u028a\7\t\2\2\u028a\u028b\7\5\2\2\u028b\u028c\7\22\2\2"+
		"\u028c\u028d\7\6\2\2\u028dW\3\2\2\2\u028e\u028f\t\3\2\2\u028fY\3\2\2\2"+
		"J]dkmy\u0085\u008a\u008f\u0096\u009c\u00a4\u00a8\u00b1\u00ba\u00c2\u00cd"+
		"\u00d2\u00d7\u00e0\u00e8\u00f1\u00f8\u00ff\u0106\u010d\u0114\u011b\u0122"+
		"\u0129\u0131\u0133\u013c\u013e\u0147\u0149\u0152\u0154\u015d\u015f\u0168"+
		"\u016a\u0173\u0175\u017e\u0180\u0189\u018b\u018f\u0195\u019f\u01a7\u01b2"+
		"\u01bd\u01c8\u01d3\u01db\u01e0\u01eb\u01f0\u01f9\u0201\u0206\u020d\u0213"+
		"\u021b\u0222\u0227\u022b\u0233\u023b\u0254\u025f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}