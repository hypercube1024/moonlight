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
		RULE_structField = 6, RULE_parametricTypeDeclaration = 7, RULE_annotationDeclaration = 8, 
		RULE_annotation = 9, RULE_enumDeclaration = 10, RULE_enumField = 11, RULE_baseAssignment = 12, 
		RULE_literal = 13, RULE_baseListExpr = 14, RULE_boolListExpr = 15, RULE_intListExpr = 16, 
		RULE_charListExpr = 17, RULE_floatListExpr = 18, RULE_stringListExpr = 19, 
		RULE_emptyListExpr = 20, RULE_functionDeclaration = 21, RULE_functionParameter = 22, 
		RULE_functionReturnType = 23, RULE_interfaceDeclaration = 24, RULE_interfaceName = 25, 
		RULE_fieldType = 26, RULE_referenceType = 27, RULE_parametricTypeExpr = 28, 
		RULE_containerType = 29, RULE_mapType = 30, RULE_setType = 31, RULE_listType = 32, 
		RULE_baseType = 33, RULE_baseField = 34;
	public static final String[] ruleNames = {
		"moonlightFile", "namespaceDeclaration", "namespaceValue", "importDeclaration", 
		"importValue", "structDeclaration", "structField", "parametricTypeDeclaration", 
		"annotationDeclaration", "annotation", "enumDeclaration", "enumField", 
		"baseAssignment", "literal", "baseListExpr", "boolListExpr", "intListExpr", 
		"charListExpr", "floatListExpr", "stringListExpr", "emptyListExpr", "functionDeclaration", 
		"functionParameter", "functionReturnType", "interfaceDeclaration", "interfaceName", 
		"fieldType", "referenceType", "parametricTypeExpr", "containerType", "mapType", 
		"setType", "listType", "baseType", "baseField"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'<'", "'>'", "'='", "'map'", "'set'", "'list'", "'boolean'", 
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(70);
				annotation();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			namespaceDeclaration();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(77);
				importDeclaration();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << INTERFACE) | (1L << STRUCT) | (1L << ANNOTATION) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(83);
					enumDeclaration();
					}
					break;
				case 2:
					{
					setState(84);
					annotationDeclaration();
					}
					break;
				case 3:
					{
					setState(85);
					structDeclaration();
					}
					break;
				case 4:
					{
					setState(86);
					interfaceDeclaration();
					}
					break;
				}
				}
				setState(91);
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
			setState(92);
			match(NAMESPACE);
			setState(93);
			namespaceValue();
			setState(94);
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
			setState(96);
			match(Identifier);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(DOT);
					setState(98);
					match(Identifier);
					}
					} 
				}
				setState(103);
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
			setState(104);
			match(IMPORT);
			setState(105);
			importValue();
			setState(106);
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
			setState(108);
			match(Identifier);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(DOT);
					setState(110);
					match(Identifier);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(116);
				match(DOT);
				setState(117);
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
		public ParametricTypeDeclarationContext parametricTypeDeclaration() {
			return getRuleContext(ParametricTypeDeclarationContext.class,0);
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(120);
				annotation();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(STRUCT);
			setState(127);
			match(Identifier);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(128);
				parametricTypeDeclaration();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(131);
				match(EXTENDS);
				setState(132);
				referenceType();
				}
			}

			setState(135);
			match(LBRACE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << FieldReq) | (1L << Identifier))) != 0)) {
				{
				{
				setState(136);
				structField();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					annotation();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FieldReq) {
				{
				setState(150);
				match(FieldReq);
				}
			}

			setState(153);
			fieldType();
			setState(154);
			match(Identifier);
			setState(155);
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

	public static class ParametricTypeDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MoonlightParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MoonlightParser.Identifier, i);
		}
		public ParametricTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametricTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterParametricTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitParametricTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitParametricTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametricTypeDeclarationContext parametricTypeDeclaration() throws RecognitionException {
		ParametricTypeDeclarationContext _localctx = new ParametricTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametricTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__1);
			setState(158);
			match(Identifier);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				match(Identifier);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__2);
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
		enterRule(_localctx, 16, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(168);
				annotation();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(ANNOTATION);
			setState(175);
			match(Identifier);
			setState(176);
			match(LBRACE);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(177);
				baseField();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		enterRule(_localctx, 18, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(185);
				namespaceValue();
				setState(186);
				match(DOT);
				}
			}

			setState(190);
			match(AnnotationLabel);
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				{
				setState(191);
				match(LPAREN);
				setState(192);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(193);
				match(LPAREN);
				setState(194);
				baseAssignment();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					baseAssignment();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
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
		enterRule(_localctx, 20, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(206);
				annotation();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(ENUM);
			setState(213);
			match(Identifier);
			setState(214);
			match(LBRACE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(215);
				enumField();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
		enterRule(_localctx, 22, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(223);
				annotation();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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
			setState(231);
			match(Identifier);
			setState(232);
			match(T__3);
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				{
				setState(233);
				literal();
				}
				break;
			case EMPTY_LIST:
			case LBRACK:
				{
				setState(234);
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
			setState(237);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				emptyListExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				boolListExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				intListExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				charListExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				floatListExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
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
			setState(247);
			match(LBRACK);
			setState(248);
			match(BooleanLiteral);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				match(BooleanLiteral);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
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
			setState(258);
			match(LBRACK);
			setState(259);
			match(IntegerLiteral);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				match(IntegerLiteral);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
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
			setState(269);
			match(LBRACK);
			setState(270);
			match(CharacterLiteral);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271);
				match(COMMA);
				setState(272);
				match(CharacterLiteral);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
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
			setState(280);
			match(LBRACK);
			setState(281);
			match(FloatingPointLiteral);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				match(FloatingPointLiteral);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
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
			setState(291);
			match(LBRACK);
			setState(292);
			match(StringLiteral);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(293);
				match(COMMA);
				setState(294);
				match(StringLiteral);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(EMPTY_LIST);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(LBRACK);
				setState(304);
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
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					annotation();
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(313);
			functionReturnType();
			setState(314);
			match(Identifier);
			setState(315);
			match(LPAREN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(316);
				functionParameter();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317);
					match(COMMA);
					setState(318);
					functionParameter();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(RPAREN);
			setState(330);
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
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					annotation();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(338);
			fieldType();
			setState(339);
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
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
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
				setState(342);
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
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AnnotationLabel || _la==Identifier) {
				{
				{
				setState(345);
				annotation();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(INTERFACE);
			setState(352);
			match(Identifier);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(353);
				match(EXTENDS);
				setState(354);
				interfaceName();
				}
			}

			setState(357);
			match(LBRACE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << AnnotationLabel) | (1L << Identifier))) != 0)) {
				{
				{
				setState(358);
				functionDeclaration();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
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
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(366);
				namespaceValue();
				setState(367);
				match(DOT);
				}
				break;
			}
			setState(371);
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
			setState(376);
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
				setState(373);
				baseType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				containerType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(378);
				namespaceValue();
				setState(379);
				match(DOT);
				}
				break;
			}
			setState(383);
			match(Identifier);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(384);
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
			setState(387);
			match(T__1);
			setState(388);
			fieldType();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				fieldType();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(T__2);
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
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				mapType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				setType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
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
			setState(403);
			match(T__4);
			setState(404);
			match(T__1);
			setState(405);
			fieldType();
			setState(406);
			match(COMMA);
			setState(407);
			fieldType();
			setState(408);
			match(T__2);
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
			setState(410);
			match(T__5);
			setState(411);
			match(T__1);
			setState(412);
			fieldType();
			setState(413);
			match(T__2);
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
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__6);
			setState(416);
			match(T__1);
			setState(417);
			fieldType();
			setState(418);
			match(T__2);
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
		enterRule(_localctx, 66, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		public TerminalNode DOUBLE() { return getToken(MoonlightParser.DOUBLE, 0); }
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
		public TerminalNode BYTE() { return getToken(MoonlightParser.BYTE, 0); }
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
		public TerminalNode STRING() { return getToken(MoonlightParser.STRING, 0); }
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
		public TerminalNode CHAR() { return getToken(MoonlightParser.CHAR, 0); }
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
		public TerminalNode FLOAT() { return getToken(MoonlightParser.FLOAT, 0); }
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
		public TerminalNode INT() { return getToken(MoonlightParser.INT, 0); }
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
		public TerminalNode LONG() { return getToken(MoonlightParser.LONG, 0); }
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
		public TerminalNode SHORT() { return getToken(MoonlightParser.SHORT, 0); }
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
		public TerminalNode BOOLEAN() { return getToken(MoonlightParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 68, RULE_baseField);
		int _la;
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new BoolFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(BOOLEAN);
				setState(423);
				match(Identifier);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(424);
					match(T__3);
					setState(425);
					match(BooleanLiteral);
					}
				}

				setState(428);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ByteFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(BYTE);
				setState(430);
				match(Identifier);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(431);
					match(T__3);
					setState(432);
					match(IntegerLiteral);
					}
				}

				setState(435);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ShortFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(SHORT);
				setState(437);
				match(Identifier);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(438);
					match(T__3);
					setState(439);
					match(IntegerLiteral);
					}
				}

				setState(442);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new IntFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				match(INT);
				setState(444);
				match(Identifier);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(445);
					match(T__3);
					setState(446);
					match(IntegerLiteral);
					}
				}

				setState(449);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new LongFieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				match(LONG);
				setState(451);
				match(Identifier);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(452);
					match(T__3);
					setState(453);
					match(IntegerLiteral);
					}
				}

				setState(456);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new CharFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(CHAR);
				setState(458);
				match(Identifier);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(459);
					match(T__3);
					setState(460);
					match(CharacterLiteral);
					}
				}

				setState(463);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new FloatFieldContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(464);
				match(FLOAT);
				setState(465);
				match(Identifier);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(466);
					match(T__3);
					setState(467);
					match(FloatingPointLiteral);
					}
				}

				setState(470);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new DoubleFieldContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(471);
				match(DOUBLE);
				setState(472);
				match(Identifier);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(473);
					match(T__3);
					setState(474);
					match(FloatingPointLiteral);
					}
				}

				setState(477);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(478);
				match(STRING);
				setState(479);
				match(Identifier);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(480);
					match(T__3);
					setState(481);
					match(StringLiteral);
					}
				}

				setState(484);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new BoolListFieldContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(485);
				match(T__6);
				setState(486);
				match(T__1);
				setState(487);
				match(BOOLEAN);
				setState(488);
				match(T__2);
				setState(489);
				match(Identifier);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(490);
					match(T__3);
					setState(493);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(491);
						boolListExpr();
						}
						break;
					case 2:
						{
						setState(492);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(497);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ByteListFieldContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(498);
				match(T__6);
				setState(499);
				match(T__1);
				setState(500);
				match(BYTE);
				setState(501);
				match(T__2);
				setState(502);
				match(Identifier);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(503);
					match(T__3);
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(504);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(505);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(510);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new ShortListFieldContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(511);
				match(T__6);
				setState(512);
				match(T__1);
				setState(513);
				match(SHORT);
				setState(514);
				match(T__2);
				setState(515);
				match(Identifier);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(516);
					match(T__3);
					setState(519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(517);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(518);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(523);
				match(SEMI);
				}
				break;
			case 13:
				_localctx = new IntListFieldContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(524);
				match(T__6);
				setState(525);
				match(T__1);
				setState(526);
				match(INT);
				setState(527);
				match(T__2);
				setState(528);
				match(Identifier);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(529);
					match(T__3);
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(530);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(531);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(536);
				match(SEMI);
				}
				break;
			case 14:
				_localctx = new LongListFieldContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(537);
				match(T__6);
				setState(538);
				match(T__1);
				setState(539);
				match(LONG);
				setState(540);
				match(T__2);
				setState(541);
				match(Identifier);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(542);
					match(T__3);
					setState(545);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(543);
						intListExpr();
						}
						break;
					case 2:
						{
						setState(544);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(549);
				match(SEMI);
				}
				break;
			case 15:
				_localctx = new CharListFieldContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(550);
				match(T__6);
				setState(551);
				match(T__1);
				setState(552);
				match(CHAR);
				setState(553);
				match(T__2);
				setState(554);
				match(Identifier);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(555);
					match(T__3);
					setState(558);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(556);
						charListExpr();
						}
						break;
					case 2:
						{
						setState(557);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(562);
				match(SEMI);
				}
				break;
			case 16:
				_localctx = new FloatListFieldContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(563);
				match(T__6);
				setState(564);
				match(T__1);
				setState(565);
				match(FLOAT);
				setState(566);
				match(T__2);
				setState(567);
				match(Identifier);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(568);
					match(T__3);
					setState(571);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(569);
						floatListExpr();
						}
						break;
					case 2:
						{
						setState(570);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(575);
				match(SEMI);
				}
				break;
			case 17:
				_localctx = new DoubleListFieldContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(576);
				match(T__6);
				setState(577);
				match(T__1);
				setState(578);
				match(DOUBLE);
				setState(579);
				match(T__2);
				setState(580);
				match(Identifier);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(581);
					match(T__3);
					setState(584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(582);
						floatListExpr();
						}
						break;
					case 2:
						{
						setState(583);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(588);
				match(SEMI);
				}
				break;
			case 18:
				_localctx = new StringListFieldContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(589);
				match(T__6);
				setState(590);
				match(T__1);
				setState(591);
				match(STRING);
				setState(592);
				match(T__2);
				setState(593);
				match(Identifier);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(594);
					match(T__3);
					setState(597);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(595);
						stringListExpr();
						}
						break;
					case 2:
						{
						setState(596);
						emptyListExpr();
						}
						break;
					}
					}
				}

				setState(601);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u025f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\7\2Q\n\2\f"+
		"\2\16\2T\13\2\3\2\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6r"+
		"\n\6\f\6\16\6u\13\6\3\6\3\6\5\6y\n\6\3\7\7\7|\n\7\f\7\16\7\177\13\7\3"+
		"\7\3\7\3\7\5\7\u0084\n\7\3\7\3\7\5\7\u0088\n\7\3\7\3\7\7\7\u008c\n\7\f"+
		"\7\16\7\u008f\13\7\3\7\3\7\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b\5"+
		"\b\u009a\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7"+
		"\13\t\3\t\3\t\3\n\7\n\u00ac\n\n\f\n\16\n\u00af\13\n\3\n\3\n\3\n\3\n\7"+
		"\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u00bf\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13"+
		"\13\3\13\3\13\5\13\u00cf\n\13\3\f\7\f\u00d2\n\f\f\f\16\f\u00d5\13\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\f\3\f\3\r\7\r\u00e3"+
		"\n\r\f\r\16\r\u00e6\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f8\n\20\3\21\3\21\3\21"+
		"\3\21\7\21\u00fe\n\21\f\21\16\21\u0101\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\7\22\u0109\n\22\f\22\16\22\u010c\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23\u0114\n\23\f\23\16\23\u0117\13\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u012a\n\25\f\25\16\25\u012d\13\25\3\25\3\25\3\26\3\26\3\26"+
		"\5\26\u0134\n\26\3\27\7\27\u0137\n\27\f\27\16\27\u013a\13\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0142\n\27\f\27\16\27\u0145\13\27\7\27\u0147"+
		"\n\27\f\27\16\27\u014a\13\27\3\27\3\27\3\27\3\30\7\30\u0150\n\30\f\30"+
		"\16\30\u0153\13\30\3\30\3\30\3\30\3\31\3\31\5\31\u015a\n\31\3\32\7\32"+
		"\u015d\n\32\f\32\16\32\u0160\13\32\3\32\3\32\3\32\3\32\5\32\u0166\n\32"+
		"\3\32\3\32\7\32\u016a\n\32\f\32\16\32\u016d\13\32\3\32\3\32\3\33\3\33"+
		"\3\33\5\33\u0174\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u017b\n\34\3\35\3"+
		"\35\3\35\5\35\u0180\n\35\3\35\3\35\5\35\u0184\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u018a\n\36\f\36\16\36\u018d\13\36\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u0194\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3$\5$\u01ad\n$\3$\3$\3$\3$\3$\5$\u01b4\n$\3$\3$\3$\3$\3"+
		"$\5$\u01bb\n$\3$\3$\3$\3$\3$\5$\u01c2\n$\3$\3$\3$\3$\3$\5$\u01c9\n$\3"+
		"$\3$\3$\3$\3$\5$\u01d0\n$\3$\3$\3$\3$\3$\5$\u01d7\n$\3$\3$\3$\3$\3$\5"+
		"$\u01de\n$\3$\3$\3$\3$\3$\5$\u01e5\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01f0"+
		"\n$\5$\u01f2\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01fd\n$\5$\u01ff\n$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\5$\u020a\n$\5$\u020c\n$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\5$\u0217\n$\5$\u0219\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0224\n$"+
		"\5$\u0226\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0231\n$\5$\u0233\n$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\5$\u023e\n$\5$\u0240\n$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\5$\u024b\n$\5$\u024d\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0258\n$\5$"+
		"\u025a\n$\3$\5$\u025d\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\4\3\2\36#\3\2\n\22\2\u029c\2K\3\2\2\2"+
		"\4^\3\2\2\2\6b\3\2\2\2\bj\3\2\2\2\nn\3\2\2\2\f}\3\2\2\2\16\u0095\3\2\2"+
		"\2\20\u009f\3\2\2\2\22\u00ad\3\2\2\2\24\u00be\3\2\2\2\26\u00d3\3\2\2\2"+
		"\30\u00e4\3\2\2\2\32\u00e9\3\2\2\2\34\u00ef\3\2\2\2\36\u00f7\3\2\2\2 "+
		"\u00f9\3\2\2\2\"\u0104\3\2\2\2$\u010f\3\2\2\2&\u011a\3\2\2\2(\u0125\3"+
		"\2\2\2*\u0133\3\2\2\2,\u0138\3\2\2\2.\u0151\3\2\2\2\60\u0159\3\2\2\2\62"+
		"\u015e\3\2\2\2\64\u0173\3\2\2\2\66\u017a\3\2\2\28\u017f\3\2\2\2:\u0185"+
		"\3\2\2\2<\u0193\3\2\2\2>\u0195\3\2\2\2@\u019c\3\2\2\2B\u01a1\3\2\2\2D"+
		"\u01a6\3\2\2\2F\u025c\3\2\2\2HJ\5\24\13\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2"+
		"\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NR\5\4\3\2OQ\5\b\5\2PO\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2S[\3\2\2\2TR\3\2\2\2UZ\5\26\f\2VZ\5\22\n\2WZ\5\f"+
		"\7\2XZ\5\62\32\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\3\3\2\2\2][\3\2\2\2^_\7\30\2\2_`\5\6\4\2`a\7*\2\2"+
		"a\5\3\2\2\2bg\7-\2\2cd\7,\2\2df\7-\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jk\7\26\2\2kl\5\n\6\2lm\7*\2\2m\t\3\2\2"+
		"\2ns\7-\2\2op\7,\2\2pr\7-\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tx\3\2\2\2us\3\2\2\2vw\7,\2\2wy\7\3\2\2xv\3\2\2\2xy\3\2\2\2y\13\3\2\2"+
		"\2z|\5\24\13\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0081\7\31\2\2\u0081\u0083\7-\2\2\u0082\u0084\5"+
		"\20\t\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0086\7\25\2\2\u0086\u0088\58\35\2\u0087\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\7&\2\2\u008a\u008c\5\16\b\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\'\2\2\u0091"+
		"\r\3\2\2\2\u0092\u0094\5\24\13\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\7\35\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\5\66\34\2\u009c\u009d\7-\2\2\u009d\u009e"+
		"\7*\2\2\u009e\17\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a5\7-\2\2\u00a1"+
		"\u00a2\7+\2\2\u00a2\u00a4\7-\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\21\3\2\2\2\u00aa\u00ac\5\24\13\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\32\2\2\u00b1"+
		"\u00b2\7-\2\2\u00b2\u00b6\7&\2\2\u00b3\u00b5\5F$\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\23\3\2\2\2\u00bb"+
		"\u00bc\5\6\4\2\u00bc\u00bd\7,\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00ce\7\34\2\2\u00c1"+
		"\u00c2\7$\2\2\u00c2\u00cf\7%\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c9\5\32\16"+
		"\2\u00c5\u00c6\7+\2\2\u00c6\u00c8\5\32\16\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7%\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00c1\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\25\3\2\2"+
		"\2\u00d0\u00d2\5\24\13\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\7-\2\2\u00d8\u00dc\7&\2\2\u00d9"+
		"\u00db\5\30\r\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7\'\2\2\u00e0\27\3\2\2\2\u00e1\u00e3\5\24\13\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5F$\2\u00e8\31\3\2\2\2"+
		"\u00e9\u00ea\7-\2\2\u00ea\u00ed\7\6\2\2\u00eb\u00ee\5\34\17\2\u00ec\u00ee"+
		"\5\36\20\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\33\3\2\2\2\u00ef"+
		"\u00f0\t\2\2\2\u00f0\35\3\2\2\2\u00f1\u00f8\5*\26\2\u00f2\u00f8\5 \21"+
		"\2\u00f3\u00f8\5\"\22\2\u00f4\u00f8\5$\23\2\u00f5\u00f8\5&\24\2\u00f6"+
		"\u00f8\5(\25\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2"+
		"\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\37\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00ff\7 \2\2\u00fb\u00fc\7+\2\2\u00fc"+
		"\u00fe\7 \2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\7)\2\2\u0103!\3\2\2\2\u0104\u0105\7(\2\2\u0105\u010a\7\36\2\2\u0106"+
		"\u0107\7+\2\2\u0107\u0109\7\36\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\7)\2\2\u010e#\3\2\2\2\u010f\u0110\7(\2\2\u0110"+
		"\u0115\7!\2\2\u0111\u0112\7+\2\2\u0112\u0114\7!\2\2\u0113\u0111\3\2\2"+
		"\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7)\2\2\u0119%\3\2\2\2\u011a\u011b"+
		"\7(\2\2\u011b\u0120\7\37\2\2\u011c\u011d\7+\2\2\u011d\u011f\7\37\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7)\2\2\u0124"+
		"\'\3\2\2\2\u0125\u0126\7(\2\2\u0126\u012b\7\"\2\2\u0127\u0128\7+\2\2\u0128"+
		"\u012a\7\"\2\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\7)\2\2\u012f)\3\2\2\2\u0130\u0134\7\33\2\2\u0131\u0132\7(\2\2\u0132"+
		"\u0134\7)\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0134+\3\2\2\2\u0135"+
		"\u0137\5\24\13\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\5\60\31\2\u013c\u013d\7-\2\2\u013d\u0148\7$\2\2\u013e\u0143\5."+
		"\30\2\u013f\u0140\7+\2\2\u0140\u0142\5.\30\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u013e\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014c\7%\2\2\u014c\u014d\7*\2\2\u014d-\3\2\2\2\u014e\u0150"+
		"\5\24\13\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155"+
		"\5\66\34\2\u0155\u0156\7-\2\2\u0156/\3\2\2\2\u0157\u015a\7\23\2\2\u0158"+
		"\u015a\5\66\34\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\61\3\2"+
		"\2\2\u015b\u015d\5\24\13\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\u0162\7\27\2\2\u0162\u0165\7-\2\2\u0163\u0164\7\25\2\2\u0164"+
		"\u0166\5\64\33\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u016b\7&\2\2\u0168\u016a\5,\27\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\'\2\2\u016f\63\3\2\2\2\u0170\u0171"+
		"\5\6\4\2\u0171\u0172\7,\2\2\u0172\u0174\3\2\2\2\u0173\u0170\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7-\2\2\u0176\65\3\2\2\2"+
		"\u0177\u017b\5D#\2\u0178\u017b\5<\37\2\u0179\u017b\58\35\2\u017a\u0177"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\67\3\2\2\2\u017c"+
		"\u017d\5\6\4\2\u017d\u017e\7,\2\2\u017e\u0180\3\2\2\2\u017f\u017c\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\7-\2\2\u0182"+
		"\u0184\5:\36\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u01849\3\2\2\2"+
		"\u0185\u0186\7\4\2\2\u0186\u018b\5\66\34\2\u0187\u0188\7+\2\2\u0188\u018a"+
		"\5\66\34\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2"+
		"\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f"+
		"\7\5\2\2\u018f;\3\2\2\2\u0190\u0194\5> \2\u0191\u0194\5@!\2\u0192\u0194"+
		"\5B\"\2\u0193\u0190\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"=\3\2\2\2\u0195\u0196\7\7\2\2\u0196\u0197\7\4\2\2\u0197\u0198\5\66\34"+
		"\2\u0198\u0199\7+\2\2\u0199\u019a\5\66\34\2\u019a\u019b\7\5\2\2\u019b"+
		"?\3\2\2\2\u019c\u019d\7\b\2\2\u019d\u019e\7\4\2\2\u019e\u019f\5\66\34"+
		"\2\u019f\u01a0\7\5\2\2\u01a0A\3\2\2\2\u01a1\u01a2\7\t\2\2\u01a2\u01a3"+
		"\7\4\2\2\u01a3\u01a4\5\66\34\2\u01a4\u01a5\7\5\2\2\u01a5C\3\2\2\2\u01a6"+
		"\u01a7\t\3\2\2\u01a7E\3\2\2\2\u01a8\u01a9\7\n\2\2\u01a9\u01ac\7-\2\2\u01aa"+
		"\u01ab\7\6\2\2\u01ab\u01ad\7 \2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u025d\7*\2\2\u01af\u01b0\7\13\2\2\u01b0"+
		"\u01b3\7-\2\2\u01b1\u01b2\7\6\2\2\u01b2\u01b4\7\36\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u025d\7*\2\2\u01b6"+
		"\u01b7\7\f\2\2\u01b7\u01ba\7-\2\2\u01b8\u01b9\7\6\2\2\u01b9\u01bb\7\36"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u025d\7*\2\2\u01bd\u01be\7\16\2\2\u01be\u01c1\7-\2\2\u01bf\u01c0\7\6"+
		"\2\2\u01c0\u01c2\7\36\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u025d\7*\2\2\u01c4\u01c5\7\17\2\2\u01c5\u01c8\7-"+
		"\2\2\u01c6\u01c7\7\6\2\2\u01c7\u01c9\7\36\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u025d\7*\2\2\u01cb\u01cc\7\r"+
		"\2\2\u01cc\u01cf\7-\2\2\u01cd\u01ce\7\6\2\2\u01ce\u01d0\7!\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u025d\7*\2\2\u01d2"+
		"\u01d3\7\20\2\2\u01d3\u01d6\7-\2\2\u01d4\u01d5\7\6\2\2\u01d5\u01d7\7\37"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u025d\7*\2\2\u01d9\u01da\7\21\2\2\u01da\u01dd\7-\2\2\u01db\u01dc\7\6"+
		"\2\2\u01dc\u01de\7\37\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u025d\7*\2\2\u01e0\u01e1\7\22\2\2\u01e1\u01e4\7-"+
		"\2\2\u01e2\u01e3\7\6\2\2\u01e3\u01e5\7\"\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u025d\7*\2\2\u01e7\u01e8\7\t"+
		"\2\2\u01e8\u01e9\7\4\2\2\u01e9\u01ea\7\n\2\2\u01ea\u01eb\7\5\2\2\u01eb"+
		"\u01f1\7-\2\2\u01ec\u01ef\7\6\2\2\u01ed\u01f0\5 \21\2\u01ee\u01f0\5*\26"+
		"\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ec"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u025d\7*\2\2\u01f4"+
		"\u01f5\7\t\2\2\u01f5\u01f6\7\4\2\2\u01f6\u01f7\7\13\2\2\u01f7\u01f8\7"+
		"\5\2\2\u01f8\u01fe\7-\2\2\u01f9\u01fc\7\6\2\2\u01fa\u01fd\5\"\22\2\u01fb"+
		"\u01fd\5*\26\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01ff\3\2"+
		"\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u025d\7*\2\2\u0201\u0202\7\t\2\2\u0202\u0203\7\4\2\2\u0203\u0204\7\f"+
		"\2\2\u0204\u0205\7\5\2\2\u0205\u020b\7-\2\2\u0206\u0209\7\6\2\2\u0207"+
		"\u020a\5\"\22\2\u0208\u020a\5*\26\2\u0209\u0207\3\2\2\2\u0209\u0208\3"+
		"\2\2\2\u020a\u020c\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u025d\7*\2\2\u020e\u020f\7\t\2\2\u020f\u0210\7\4"+
		"\2\2\u0210\u0211\7\16\2\2\u0211\u0212\7\5\2\2\u0212\u0218\7-\2\2\u0213"+
		"\u0216\7\6\2\2\u0214\u0217\5\"\22\2\u0215\u0217\5*\26\2\u0216\u0214\3"+
		"\2\2\2\u0216\u0215\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0213\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u025d\7*\2\2\u021b\u021c\7\t"+
		"\2\2\u021c\u021d\7\4\2\2\u021d\u021e\7\17\2\2\u021e\u021f\7\5\2\2\u021f"+
		"\u0225\7-\2\2\u0220\u0223\7\6\2\2\u0221\u0224\5\"\22\2\u0222\u0224\5*"+
		"\26\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0226\3\2\2\2\u0225"+
		"\u0220\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u025d\7*"+
		"\2\2\u0228\u0229\7\t\2\2\u0229\u022a\7\4\2\2\u022a\u022b\7\r\2\2\u022b"+
		"\u022c\7\5\2\2\u022c\u0232\7-\2\2\u022d\u0230\7\6\2\2\u022e\u0231\5$\23"+
		"\2\u022f\u0231\5*\26\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\u0233"+
		"\3\2\2\2\u0232\u022d\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u025d\7*\2\2\u0235\u0236\7\t\2\2\u0236\u0237\7\4\2\2\u0237\u0238\7\20"+
		"\2\2\u0238\u0239\7\5\2\2\u0239\u023f\7-\2\2\u023a\u023d\7\6\2\2\u023b"+
		"\u023e\5&\24\2\u023c\u023e\5*\26\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u0240\3\2\2\2\u023f\u023a\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u025d\7*\2\2\u0242\u0243\7\t\2\2\u0243\u0244\7\4"+
		"\2\2\u0244\u0245\7\21\2\2\u0245\u0246\7\5\2\2\u0246\u024c\7-\2\2\u0247"+
		"\u024a\7\6\2\2\u0248\u024b\5&\24\2\u0249\u024b\5*\26\2\u024a\u0248\3\2"+
		"\2\2\u024a\u0249\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u0247\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u025d\7*\2\2\u024f\u0250\7\t"+
		"\2\2\u0250\u0251\7\4\2\2\u0251\u0252\7\22\2\2\u0252\u0253\7\5\2\2\u0253"+
		"\u0259\7-\2\2\u0254\u0257\7\6\2\2\u0255\u0258\5(\25\2\u0256\u0258\5*\26"+
		"\2\u0257\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0254"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\7*\2\2\u025c"+
		"\u01a8\3\2\2\2\u025c\u01af\3\2\2\2\u025c\u01b6\3\2\2\2\u025c\u01bd\3\2"+
		"\2\2\u025c\u01c4\3\2\2\2\u025c\u01cb\3\2\2\2\u025c\u01d2\3\2\2\2\u025c"+
		"\u01d9\3\2\2\2\u025c\u01e0\3\2\2\2\u025c\u01e7\3\2\2\2\u025c\u01f4\3\2"+
		"\2\2\u025c\u0201\3\2\2\2\u025c\u020e\3\2\2\2\u025c\u021b\3\2\2\2\u025c"+
		"\u0228\3\2\2\2\u025c\u0235\3\2\2\2\u025c\u0242\3\2\2\2\u025c\u024f\3\2"+
		"\2\2\u025dG\3\2\2\2JKRY[gsx}\u0083\u0087\u008d\u0095\u0099\u00a5\u00ad"+
		"\u00b6\u00be\u00c9\u00ce\u00d3\u00dc\u00e4\u00ed\u00f7\u00ff\u010a\u0115"+
		"\u0120\u012b\u0133\u0138\u0143\u0148\u0151\u0159\u015e\u0165\u016b\u0173"+
		"\u017a\u017f\u0183\u018b\u0193\u01ac\u01b3\u01ba\u01c1\u01c8\u01cf\u01d6"+
		"\u01dd\u01e4\u01ef\u01f1\u01fc\u01fe\u0209\u020b\u0216\u0218\u0223\u0225"+
		"\u0230\u0232\u023d\u023f\u024a\u024c\u0257\u0259\u025c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}