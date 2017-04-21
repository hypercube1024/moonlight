// Generated from /Users/qiupengtao/Develop/github_project/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/idl/compiler/bnf/Moonlight.g4 by ANTLR 4.7
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
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParametricTypeExprContext parametricTypeExpr() {
			return getRuleContext(ParametricTypeExprContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(MoonlightParser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
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
			match(Identifier);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(146);
				parametricTypeExpr();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(149);
				match(EXTENDS);
				setState(150);
				referenceType();
				}
			}

			setState(153);
			match(LBRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << FieldReq) | (1L << Identifier))) != 0)) {
				{
				{
				setState(154);
				structField();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					annotation();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FieldReq) {
				{
				setState(168);
				match(FieldReq);
				}
			}

			setState(171);
			fieldType();
			setState(172);
			match(Identifier);
			setState(173);
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(175);
				annotation();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(ANNOTATION);
			setState(182);
			match(Identifier);
			setState(183);
			match(LBRACE);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(184);
				baseField();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(192);
				namespaceValue();
				setState(193);
				match(DOT);
				}
			}

			setState(197);
			match(AnnotationLabel);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(198);
				match(LPAREN);
				setState(199);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(200);
				match(LPAREN);
				setState(201);
				baseAssignment();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					baseAssignment();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
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
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(213);
				annotation();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(ENUM);
			setState(220);
			match(Identifier);
			setState(221);
			match(LBRACE);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(222);
				enumField();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(230);
				annotation();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new BoolFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(BOOLEAN);
				setState(239);
				match(Identifier);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(240);
					match(T__1);
					setState(241);
					match(BooleanLiteral);
					}
				}

				setState(244);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ByteFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(BYTE);
				setState(246);
				match(Identifier);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(247);
					match(T__1);
					setState(248);
					match(IntegerLiteral);
					}
				}

				setState(251);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ShortFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(SHORT);
				setState(253);
				match(Identifier);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(254);
					match(T__1);
					setState(255);
					match(IntegerLiteral);
					}
				}

				setState(258);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new IntFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(INT);
				setState(260);
				match(Identifier);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(261);
					match(T__1);
					setState(262);
					match(IntegerLiteral);
					}
				}

				setState(265);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new LongFieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(LONG);
				setState(267);
				match(Identifier);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(268);
					match(T__1);
					setState(269);
					match(IntegerLiteral);
					}
				}

				setState(272);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new CharFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(CHAR);
				setState(274);
				match(Identifier);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(275);
					match(T__1);
					setState(276);
					match(CharacterLiteral);
					}
				}

				setState(279);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new FloatFieldContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				match(FLOAT);
				setState(281);
				match(Identifier);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(282);
					match(T__1);
					setState(283);
					match(FloatingPointLiteral);
					}
				}

				setState(286);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new DoubleFieldContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				match(DOUBLE);
				setState(288);
				match(Identifier);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(289);
					match(T__1);
					setState(290);
					match(FloatingPointLiteral);
					}
				}

				setState(293);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				match(STRING);
				setState(295);
				match(Identifier);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(296);
					match(T__1);
					setState(297);
					match(StringLiteral);
					}
				}

				setState(300);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new BoolListFieldContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(301);
				boolList();
				setState(302);
				match(Identifier);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(303);
					match(T__1);
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(304);
						boolListExpr();
						}
						break;
					case 2:
						{
						setState(305);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(310);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ByteListFieldContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(312);
				byteList();
				setState(313);
				match(Identifier);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(314);
					match(T__1);
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(315);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(316);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(321);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new ShortListFieldContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(323);
				shortList();
				setState(324);
				match(Identifier);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(325);
					match(T__1);
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(326);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(327);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(332);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new IntListFieldContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(334);
				intList();
				setState(335);
				match(Identifier);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(336);
					match(T__1);
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(337);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(338);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(343);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new LongListFieldContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(345);
				longList();
				setState(346);
				match(Identifier);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(347);
					match(T__1);
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(348);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(349);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(354);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new CharListFieldContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(356);
				charList();
				setState(357);
				match(Identifier);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(358);
					match(T__1);
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(359);
						charListExpr();
						}
						break;
					case 2:
						{
						setState(360);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(365);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new FloatListFieldContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(367);
				floatList();
				setState(368);
				match(Identifier);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(369);
					match(T__1);
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(370);
						floatListExpr();
						}
						break;
					case 2:
						{
						setState(371);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(376);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new DoubleListFieldContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(378);
				doubleList();
				setState(379);
				match(Identifier);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(380);
					match(T__1);
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(381);
						floatListExpr();
						}
						break;
					case 2:
						{
						setState(382);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(387);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new StringListFieldContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(389);
				stringList();
				setState(390);
				match(Identifier);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(391);
					match(T__1);
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(392);
						stringListExpr();
						}
						break;
					case 2:
						{
						setState(393);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(398);
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
			setState(402);
			match(Identifier);
			setState(403);
			match(T__1);
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				{
				setState(404);
				literal();
				}
				break;
			case EMPTY_LIST:
			case LBRACK:
				{
				setState(405);
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
			setState(408);
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
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				emptyListExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				boolListExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				intListExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				charListExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				floatListExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(415);
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
			setState(418);
			match(LBRACK);
			setState(419);
			match(BooleanLiteral);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(420);
				match(COMMA);
				setState(421);
				match(BooleanLiteral);
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
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
			setState(429);
			match(LBRACK);
			setState(430);
			match(IntegerLiteral);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				match(IntegerLiteral);
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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
			setState(440);
			match(LBRACK);
			setState(441);
			match(CharacterLiteral);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				match(CharacterLiteral);
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
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
			setState(451);
			match(LBRACK);
			setState(452);
			match(FloatingPointLiteral);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(453);
				match(COMMA);
				setState(454);
				match(FloatingPointLiteral);
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
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
			setState(462);
			match(LBRACK);
			setState(463);
			match(StringLiteral);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464);
				match(COMMA);
				setState(465);
				match(StringLiteral);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
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
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(EMPTY_LIST);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(LBRACK);
				setState(475);
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
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					annotation();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(484);
			functionReturnType();
			setState(485);
			match(Identifier);
			setState(486);
			match(LPAREN);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(487);
				functionParameter();
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(488);
					match(COMMA);
					setState(489);
					functionParameter();
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(RPAREN);
			setState(501);
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
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					annotation();
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(509);
			fieldType();
			setState(510);
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
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
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
				setState(513);
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
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(MoonlightParser.EXTENDS, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
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
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(516);
				annotation();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(INTERFACE);
			setState(523);
			match(Identifier);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(524);
				match(EXTENDS);
				setState(525);
				interfaceName();
				}
			}

			setState(528);
			match(LBRACE);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(529);
				functionDeclaration();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
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
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(537);
				namespaceValue();
				setState(538);
				match(DOT);
				}
				break;
			}
			setState(542);
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
			setState(547);
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
				setState(544);
				baseType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				containerType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
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
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(549);
				namespaceValue();
				setState(550);
				match(DOT);
				}
				break;
			}
			setState(554);
			match(Identifier);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(555);
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
			setState(558);
			match(T__2);
			setState(559);
			fieldType();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(560);
				match(COMMA);
				setState(561);
				fieldType();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
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
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				mapType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				setType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
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
			setState(574);
			match(T__4);
			setState(575);
			match(T__2);
			setState(576);
			fieldType();
			setState(577);
			match(COMMA);
			setState(578);
			fieldType();
			setState(579);
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
			setState(581);
			match(T__5);
			setState(582);
			match(T__2);
			setState(583);
			fieldType();
			setState(584);
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
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new BaseTypeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				baseList();
				}
				break;
			case 2:
				_localctx = new ContainerTypeListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(T__6);
				setState(588);
				match(T__2);
				setState(589);
				containerType();
				setState(590);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReferenceTypeListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(T__6);
				setState(593);
				match(T__2);
				setState(594);
				referenceType();
				setState(595);
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
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				boolList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				byteList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				shortList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				charList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				intList();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				longList();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				floatList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				doubleList();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
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
			setState(610);
			match(T__6);
			setState(611);
			match(T__2);
			setState(612);
			match(BOOLEAN);
			setState(613);
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
			setState(615);
			match(T__6);
			setState(616);
			match(T__2);
			setState(617);
			match(BYTE);
			setState(618);
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
			setState(620);
			match(T__6);
			setState(621);
			match(T__2);
			setState(622);
			match(SHORT);
			setState(623);
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
			setState(625);
			match(T__6);
			setState(626);
			match(T__2);
			setState(627);
			match(CHAR);
			setState(628);
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
			setState(630);
			match(T__6);
			setState(631);
			match(T__2);
			setState(632);
			match(INT);
			setState(633);
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
			setState(635);
			match(T__6);
			setState(636);
			match(T__2);
			setState(637);
			match(LONG);
			setState(638);
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
			setState(640);
			match(T__6);
			setState(641);
			match(T__2);
			setState(642);
			match(FLOAT);
			setState(643);
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
			setState(645);
			match(T__6);
			setState(646);
			match(T__2);
			setState(647);
			match(DOUBLE);
			setState(648);
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
			setState(650);
			match(T__6);
			setState(651);
			match(T__2);
			setState(652);
			match(STRING);
			setState(653);
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
			setState(655);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0294\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13"+
		"\2\3\2\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\7\4x\n\4\f\4\16\4{\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u0084\n\6\f\6"+
		"\16\6\u0087\13\6\3\6\3\6\5\6\u008b\n\6\3\7\7\7\u008e\n\7\f\7\16\7\u0091"+
		"\13\7\3\7\3\7\3\7\5\7\u0096\n\7\3\7\3\7\5\7\u009a\n\7\3\7\3\7\7\7\u009e"+
		"\n\7\f\7\16\7\u00a1\13\7\3\7\3\7\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b"+
		"\3\b\5\b\u00ac\n\b\3\b\3\b\3\b\3\b\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00bc\n\t\f\t\16\t\u00bf\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\5\n\u00c6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cf\n\n\f\n\16\n\u00d2"+
		"\13\n\3\n\3\n\5\n\u00d6\n\n\3\13\7\13\u00d9\n\13\f\13\16\13\u00dc\13\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00e2\n\13\f\13\16\13\u00e5\13\13\3\13\3\13"+
		"\3\f\7\f\u00ea\n\f\f\f\16\f\u00ed\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00f5"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fc\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0103\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u010a\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0111\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0118\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u011f\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0126\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u012d\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0135\n\r\5\r\u0137\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0140\n\r\5\r\u0142\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u014b"+
		"\n\r\5\r\u014d\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0156\n\r\5\r\u0158"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0161\n\r\5\r\u0163\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u016c\n\r\5\r\u016e\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0177\n\r\5\r\u0179\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0182"+
		"\n\r\5\r\u0184\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u018d\n\r\5\r\u018f"+
		"\n\r\3\r\3\r\5\r\u0193\n\r\3\16\3\16\3\16\3\16\5\16\u0199\n\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01a3\n\20\3\21\3\21\3\21\3\21"+
		"\7\21\u01a9\n\21\f\21\16\21\u01ac\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u01b4\n\22\f\22\16\22\u01b7\13\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u01bf\n\23\f\23\16\23\u01c2\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24\u01ca\n\24\f\24\16\24\u01cd\13\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\7\25\u01d5\n\25\f\25\16\25\u01d8\13\25\3\25\3\25\3\26\3\26\3\26\5\26"+
		"\u01df\n\26\3\27\7\27\u01e2\n\27\f\27\16\27\u01e5\13\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u01ed\n\27\f\27\16\27\u01f0\13\27\7\27\u01f2\n\27"+
		"\f\27\16\27\u01f5\13\27\3\27\3\27\3\27\3\30\7\30\u01fb\n\30\f\30\16\30"+
		"\u01fe\13\30\3\30\3\30\3\30\3\31\3\31\5\31\u0205\n\31\3\32\7\32\u0208"+
		"\n\32\f\32\16\32\u020b\13\32\3\32\3\32\3\32\3\32\5\32\u0211\n\32\3\32"+
		"\3\32\7\32\u0215\n\32\f\32\16\32\u0218\13\32\3\32\3\32\3\33\3\33\3\33"+
		"\5\33\u021f\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u0226\n\34\3\35\3\35\3"+
		"\35\5\35\u022b\n\35\3\35\3\35\5\35\u022f\n\35\3\36\3\36\3\36\3\36\7\36"+
		"\u0235\n\36\f\36\16\36\u0238\13\36\3\36\3\36\3\37\3\37\3\37\5\37\u023f"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0258\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0263\n#"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVX\2\4\3\2\36#\3\2\n\22\2\u02d1\2]\3\2\2\2\4p\3\2"+
		"\2\2\6t\3\2\2\2\b|\3\2\2\2\n\u0080\3\2\2\2\f\u008f\3\2\2\2\16\u00a7\3"+
		"\2\2\2\20\u00b4\3\2\2\2\22\u00c5\3\2\2\2\24\u00da\3\2\2\2\26\u00eb\3\2"+
		"\2\2\30\u0192\3\2\2\2\32\u0194\3\2\2\2\34\u019a\3\2\2\2\36\u01a2\3\2\2"+
		"\2 \u01a4\3\2\2\2\"\u01af\3\2\2\2$\u01ba\3\2\2\2&\u01c5\3\2\2\2(\u01d0"+
		"\3\2\2\2*\u01de\3\2\2\2,\u01e3\3\2\2\2.\u01fc\3\2\2\2\60\u0204\3\2\2\2"+
		"\62\u0209\3\2\2\2\64\u021e\3\2\2\2\66\u0225\3\2\2\28\u022a\3\2\2\2:\u0230"+
		"\3\2\2\2<\u023e\3\2\2\2>\u0240\3\2\2\2@\u0247\3\2\2\2B\u0257\3\2\2\2D"+
		"\u0262\3\2\2\2F\u0264\3\2\2\2H\u0269\3\2\2\2J\u026e\3\2\2\2L\u0273\3\2"+
		"\2\2N\u0278\3\2\2\2P\u027d\3\2\2\2R\u0282\3\2\2\2T\u0287\3\2\2\2V\u028c"+
		"\3\2\2\2X\u0291\3\2\2\2Z\\\5\22\n\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_]\3\2\2\2`d\5\4\3\2ac\5\b\5\2ba\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2em\3\2\2\2fd\3\2\2\2gl\5\24\13\2hl\5\20\t\2il\5\f\7\2"+
		"jl\5\62\32\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2n\3\3\2\2\2om\3\2\2\2pq\7\30\2\2qr\5\6\4\2rs\7*\2\2s\5\3\2"+
		"\2\2ty\7-\2\2uv\7,\2\2vx\7-\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z\7\3\2\2\2{y\3\2\2\2|}\7\26\2\2}~\5\n\6\2~\177\7*\2\2\177\t\3\2\2\2"+
		"\u0080\u0085\7-\2\2\u0081\u0082\7,\2\2\u0082\u0084\7-\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u008a\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7,\2\2\u0089\u008b\7\3"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008e"+
		"\5\22\n\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\7\31\2\2\u0093\u0095\7-\2\2\u0094\u0096\5:\36\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\7\25\2\2\u0098\u009a\5"+
		"8\35\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009f\7&\2\2\u009c\u009e\5\16\b\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3\r\3\2\2\2\u00a4\u00a6\5\22\n"+
		"\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7\35\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\5\66\34\2\u00ae\u00af\7-\2\2\u00af\u00b0\7*\2\2\u00b0\17\3\2\2\2\u00b1"+
		"\u00b3\5\22\n\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b8\7\32\2\2\u00b8\u00b9\7-\2\2\u00b9\u00bd\7&\2\2\u00ba\u00bc\5\30"+
		"\r\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\'"+
		"\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00c4\7,\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00d5\7\34\2\2\u00c8\u00c9\7$\2\2\u00c9\u00d6\7%\2\2\u00ca\u00cb\7$\2"+
		"\2\u00cb\u00d0\5\32\16\2\u00cc\u00cd\7+\2\2\u00cd\u00cf\5\32\16\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7%\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\23\3\2\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\7-\2\2\u00df\u00e3\7&"+
		"\2\2\u00e0\u00e2\5\26\f\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7\'\2\2\u00e7\25\3\2\2\2\u00e8\u00ea\5\22\n\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5\30\r\2\u00ef\27\3\2\2"+
		"\2\u00f0\u00f1\7\n\2\2\u00f1\u00f4\7-\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f5"+
		"\7 \2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u0193\7*\2\2\u00f7\u00f8\7\13\2\2\u00f8\u00fb\7-\2\2\u00f9\u00fa\7\4"+
		"\2\2\u00fa\u00fc\7\36\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0193\7*\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0102\7-\2"+
		"\2\u0100\u0101\7\4\2\2\u0101\u0103\7\36\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0193\7*\2\2\u0105\u0106\7\16"+
		"\2\2\u0106\u0109\7-\2\2\u0107\u0108\7\4\2\2\u0108\u010a\7\36\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0193\7*"+
		"\2\2\u010c\u010d\7\17\2\2\u010d\u0110\7-\2\2\u010e\u010f\7\4\2\2\u010f"+
		"\u0111\7\36\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0193\7*\2\2\u0113\u0114\7\r\2\2\u0114\u0117\7-\2\2\u0115"+
		"\u0116\7\4\2\2\u0116\u0118\7!\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u0193\7*\2\2\u011a\u011b\7\20\2\2\u011b"+
		"\u011e\7-\2\2\u011c\u011d\7\4\2\2\u011d\u011f\7\37\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0193\7*\2\2\u0121"+
		"\u0122\7\21\2\2\u0122\u0125\7-\2\2\u0123\u0124\7\4\2\2\u0124\u0126\7\37"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0193\7*\2\2\u0128\u0129\7\22\2\2\u0129\u012c\7-\2\2\u012a\u012b\7\4"+
		"\2\2\u012b\u012d\7\"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0193\7*\2\2\u012f\u0130\5F$\2\u0130\u0136\7-\2\2"+
		"\u0131\u0134\7\4\2\2\u0132\u0135\5 \21\2\u0133\u0135\5*\26\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0131\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7*\2\2\u0139\u0193\3\2"+
		"\2\2\u013a\u013b\5H%\2\u013b\u0141\7-\2\2\u013c\u013f\7\4\2\2\u013d\u0140"+
		"\5\"\22\2\u013e\u0140\5*\26\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2"+
		"\u0140\u0142\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\7*\2\2\u0144\u0193\3\2\2\2\u0145\u0146\5J&\2\u0146"+
		"\u014c\7-\2\2\u0147\u014a\7\4\2\2\u0148\u014b\5\"\22\2\u0149\u014b\5*"+
		"\26\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0147\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7*"+
		"\2\2\u014f\u0193\3\2\2\2\u0150\u0151\5N(\2\u0151\u0157\7-\2\2\u0152\u0155"+
		"\7\4\2\2\u0153\u0156\5\"\22\2\u0154\u0156\5*\26\2\u0155\u0153\3\2\2\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7*\2\2\u015a\u0193\3\2\2\2\u015b"+
		"\u015c\5P)\2\u015c\u0162\7-\2\2\u015d\u0160\7\4\2\2\u015e\u0161\5\"\22"+
		"\2\u015f\u0161\5*\26\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\7*\2\2\u0165\u0193\3\2\2\2\u0166\u0167\5L\'\2\u0167\u016d\7-\2"+
		"\2\u0168\u016b\7\4\2\2\u0169\u016c\5$\23\2\u016a\u016c\5*\26\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0168\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7*\2\2\u0170\u0193\3\2"+
		"\2\2\u0171\u0172\5R*\2\u0172\u0178\7-\2\2\u0173\u0176\7\4\2\2\u0174\u0177"+
		"\5&\24\2\u0175\u0177\5*\26\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\7*\2\2\u017b\u0193\3\2\2\2\u017c\u017d\5T+\2\u017d\u0183"+
		"\7-\2\2\u017e\u0181\7\4\2\2\u017f\u0182\5&\24\2\u0180\u0182\5*\26\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u017e\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7*\2\2\u0186"+
		"\u0193\3\2\2\2\u0187\u0188\5V,\2\u0188\u018e\7-\2\2\u0189\u018c\7\4\2"+
		"\2\u018a\u018d\5(\25\2\u018b\u018d\5*\26\2\u018c\u018a\3\2\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\7*\2\2\u0191\u0193\3\2\2\2\u0192\u00f0\3\2"+
		"\2\2\u0192\u00f7\3\2\2\2\u0192\u00fe\3\2\2\2\u0192\u0105\3\2\2\2\u0192"+
		"\u010c\3\2\2\2\u0192\u0113\3\2\2\2\u0192\u011a\3\2\2\2\u0192\u0121\3\2"+
		"\2\2\u0192\u0128\3\2\2\2\u0192\u012f\3\2\2\2\u0192\u013a\3\2\2\2\u0192"+
		"\u0145\3\2\2\2\u0192\u0150\3\2\2\2\u0192\u015b\3\2\2\2\u0192\u0166\3\2"+
		"\2\2\u0192\u0171\3\2\2\2\u0192\u017c\3\2\2\2\u0192\u0187\3\2\2\2\u0193"+
		"\31\3\2\2\2\u0194\u0195\7-\2\2\u0195\u0198\7\4\2\2\u0196\u0199\5\34\17"+
		"\2\u0197\u0199\5\36\20\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"\33\3\2\2\2\u019a\u019b\t\2\2\2\u019b\35\3\2\2\2\u019c\u01a3\5*\26\2\u019d"+
		"\u01a3\5 \21\2\u019e\u01a3\5\"\22\2\u019f\u01a3\5$\23\2\u01a0\u01a3\5"+
		"&\24\2\u01a1\u01a3\5(\25\2\u01a2\u019c\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2"+
		"\u019e\3\2\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2"+
		"\2\2\u01a3\37\3\2\2\2\u01a4\u01a5\7(\2\2\u01a5\u01aa\7 \2\2\u01a6\u01a7"+
		"\7+\2\2\u01a7\u01a9\7 \2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01ae\7)\2\2\u01ae!\3\2\2\2\u01af\u01b0\7(\2\2\u01b0\u01b5"+
		"\7\36\2\2\u01b1\u01b2\7+\2\2\u01b2\u01b4\7\36\2\2\u01b3\u01b1\3\2\2\2"+
		"\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7)\2\2\u01b9#\3\2\2\2\u01ba\u01bb"+
		"\7(\2\2\u01bb\u01c0\7!\2\2\u01bc\u01bd\7+\2\2\u01bd\u01bf\7!\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7)\2\2\u01c4"+
		"%\3\2\2\2\u01c5\u01c6\7(\2\2\u01c6\u01cb\7\37\2\2\u01c7\u01c8\7+\2\2\u01c8"+
		"\u01ca\7\37\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3"+
		"\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01cf\7)\2\2\u01cf\'\3\2\2\2\u01d0\u01d1\7(\2\2\u01d1\u01d6\7\"\2\2\u01d2"+
		"\u01d3\7+\2\2\u01d3\u01d5\7\"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d9\u01da\7)\2\2\u01da)\3\2\2\2\u01db\u01df\7\33\2\2"+
		"\u01dc\u01dd\7(\2\2\u01dd\u01df\7)\2\2\u01de\u01db\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01df+\3\2\2\2\u01e0\u01e2\5\22\n\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\5\60\31\2\u01e7\u01e8\7-\2\2\u01e8"+
		"\u01f3\7$\2\2\u01e9\u01ee\5.\30\2\u01ea\u01eb\7+\2\2\u01eb\u01ed\5.\30"+
		"\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7%\2\2\u01f7\u01f8\7*\2\2\u01f8-"+
		"\3\2\2\2\u01f9\u01fb\5\22\n\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2"+
		"\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01ff\u0200\5\66\34\2\u0200\u0201\7-\2\2\u0201/\3\2\2\2\u0202"+
		"\u0205\7\23\2\2\u0203\u0205\5\66\34\2\u0204\u0202\3\2\2\2\u0204\u0203"+
		"\3\2\2\2\u0205\61\3\2\2\2\u0206\u0208\5\22\n\2\u0207\u0206\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\27\2\2\u020d\u0210\7-\2\2\u020e"+
		"\u020f\7\25\2\2\u020f\u0211\5\64\33\2\u0210\u020e\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0216\7&\2\2\u0213\u0215\5,\27\2\u0214"+
		"\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7\'\2\2\u021a"+
		"\63\3\2\2\2\u021b\u021c\5\6\4\2\u021c\u021d\7,\2\2\u021d\u021f\3\2\2\2"+
		"\u021e\u021b\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221"+
		"\7-\2\2\u0221\65\3\2\2\2\u0222\u0226\5X-\2\u0223\u0226\5<\37\2\u0224\u0226"+
		"\58\35\2\u0225\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226"+
		"\67\3\2\2\2\u0227\u0228\5\6\4\2\u0228\u0229\7,\2\2\u0229\u022b\3\2\2\2"+
		"\u022a\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e"+
		"\7-\2\2\u022d\u022f\5:\36\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"9\3\2\2\2\u0230\u0231\7\5\2\2\u0231\u0236\5\66\34\2\u0232\u0233\7+\2\2"+
		"\u0233\u0235\5\66\34\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023a\7\6\2\2\u023a;\3\2\2\2\u023b\u023f\5> \2\u023c\u023f\5@!\2\u023d"+
		"\u023f\5B\"\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2"+
		"\2\2\u023f=\3\2\2\2\u0240\u0241\7\7\2\2\u0241\u0242\7\5\2\2\u0242\u0243"+
		"\5\66\34\2\u0243\u0244\7+\2\2\u0244\u0245\5\66\34\2\u0245\u0246\7\6\2"+
		"\2\u0246?\3\2\2\2\u0247\u0248\7\b\2\2\u0248\u0249\7\5\2\2\u0249\u024a"+
		"\5\66\34\2\u024a\u024b\7\6\2\2\u024bA\3\2\2\2\u024c\u0258\5D#\2\u024d"+
		"\u024e\7\t\2\2\u024e\u024f\7\5\2\2\u024f\u0250\5<\37\2\u0250\u0251\7\6"+
		"\2\2\u0251\u0258\3\2\2\2\u0252\u0253\7\t\2\2\u0253\u0254\7\5\2\2\u0254"+
		"\u0255\58\35\2\u0255\u0256\7\6\2\2\u0256\u0258\3\2\2\2\u0257\u024c\3\2"+
		"\2\2\u0257\u024d\3\2\2\2\u0257\u0252\3\2\2\2\u0258C\3\2\2\2\u0259\u0263"+
		"\5F$\2\u025a\u0263\5H%\2\u025b\u0263\5J&\2\u025c\u0263\5L\'\2\u025d\u0263"+
		"\5N(\2\u025e\u0263\5P)\2\u025f\u0263\5R*\2\u0260\u0263\5T+\2\u0261\u0263"+
		"\5V,\2\u0262\u0259\3\2\2\2\u0262\u025a\3\2\2\2\u0262\u025b\3\2\2\2\u0262"+
		"\u025c\3\2\2\2\u0262\u025d\3\2\2\2\u0262\u025e\3\2\2\2\u0262\u025f\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263E\3\2\2\2\u0264\u0265"+
		"\7\t\2\2\u0265\u0266\7\5\2\2\u0266\u0267\7\n\2\2\u0267\u0268\7\6\2\2\u0268"+
		"G\3\2\2\2\u0269\u026a\7\t\2\2\u026a\u026b\7\5\2\2\u026b\u026c\7\13\2\2"+
		"\u026c\u026d\7\6\2\2\u026dI\3\2\2\2\u026e\u026f\7\t\2\2\u026f\u0270\7"+
		"\5\2\2\u0270\u0271\7\f\2\2\u0271\u0272\7\6\2\2\u0272K\3\2\2\2\u0273\u0274"+
		"\7\t\2\2\u0274\u0275\7\5\2\2\u0275\u0276\7\r\2\2\u0276\u0277\7\6\2\2\u0277"+
		"M\3\2\2\2\u0278\u0279\7\t\2\2\u0279\u027a\7\5\2\2\u027a\u027b\7\16\2\2"+
		"\u027b\u027c\7\6\2\2\u027cO\3\2\2\2\u027d\u027e\7\t\2\2\u027e\u027f\7"+
		"\5\2\2\u027f\u0280\7\17\2\2\u0280\u0281\7\6\2\2\u0281Q\3\2\2\2\u0282\u0283"+
		"\7\t\2\2\u0283\u0284\7\5\2\2\u0284\u0285\7\20\2\2\u0285\u0286\7\6\2\2"+
		"\u0286S\3\2\2\2\u0287\u0288\7\t\2\2\u0288\u0289\7\5\2\2\u0289\u028a\7"+
		"\21\2\2\u028a\u028b\7\6\2\2\u028bU\3\2\2\2\u028c\u028d\7\t\2\2\u028d\u028e"+
		"\7\5\2\2\u028e\u028f\7\22\2\2\u028f\u0290\7\6\2\2\u0290W\3\2\2\2\u0291"+
		"\u0292\t\3\2\2\u0292Y\3\2\2\2K]dkmy\u0085\u008a\u008f\u0095\u0099\u009f"+
		"\u00a7\u00ab\u00b4\u00bd\u00c5\u00d0\u00d5\u00da\u00e3\u00eb\u00f4\u00fb"+
		"\u0102\u0109\u0110\u0117\u011e\u0125\u012c\u0134\u0136\u013f\u0141\u014a"+
		"\u014c\u0155\u0157\u0160\u0162\u016b\u016d\u0176\u0178\u0181\u0183\u018c"+
		"\u018e\u0192\u0198\u01a2\u01aa\u01b5\u01c0\u01cb\u01d6\u01de\u01e3\u01ee"+
		"\u01f3\u01fc\u0204\u0209\u0210\u0216\u021e\u0225\u022a\u022e\u0236\u023e"+
		"\u0257\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}