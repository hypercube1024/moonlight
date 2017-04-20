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
		ANNOTATION=24, ARRAY=25, Label=26, Literal=27, FieldReq=28, IntegerLiteral=29, 
		FloatingPointLiteral=30, BooleanLiteral=31, CharacterLiteral=32, StringLiteral=33, 
		NullLiteral=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, 
		RBRACK=40, SEMI=41, COMMA=42, DOT=43, Identifier=44, WS=45, COMMENT=46, 
		LINE_COMMENT=47;
	public static final int
		RULE_moonlightFile = 0, RULE_namespaceDeclaration = 1, RULE_namespaceValue = 2, 
		RULE_importDeclaration = 3, RULE_importValue = 4, RULE_annotationDeclaration = 5, 
		RULE_annotation = 6, RULE_enumDeclaration = 7, RULE_baseField = 8, RULE_baseAssignment = 9, 
		RULE_baseArrayExpr = 10, RULE_structDeclaration = 11, RULE_structField = 12, 
		RULE_functionDeclaration = 13, RULE_functionParameter = 14, RULE_functionReturnType = 15, 
		RULE_interfaceDeclaration = 16, RULE_interfaceName = 17, RULE_fieldType = 18, 
		RULE_referenceType = 19, RULE_parametricType = 20, RULE_containerType = 21, 
		RULE_mapType = 22, RULE_setType = 23, RULE_listType = 24, RULE_baseType = 25;
	public static final String[] ruleNames = {
		"moonlightFile", "namespaceDeclaration", "namespaceValue", "importDeclaration", 
		"importValue", "annotationDeclaration", "annotation", "enumDeclaration", 
		"baseField", "baseAssignment", "baseArrayExpr", "structDeclaration", "structField", 
		"functionDeclaration", "functionParameter", "functionReturnType", "interfaceDeclaration", 
		"interfaceName", "fieldType", "referenceType", "parametricType", "containerType", 
		"mapType", "setType", "listType", "baseType"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(52);
				annotation();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			namespaceDeclaration();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(59);
				importDeclaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << INTERFACE) | (1L << STRUCT) | (1L << ANNOTATION) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(65);
					enumDeclaration();
					}
					break;
				case 2:
					{
					setState(66);
					annotationDeclaration();
					}
					break;
				case 3:
					{
					setState(67);
					structDeclaration();
					}
					break;
				case 4:
					{
					setState(68);
					interfaceDeclaration();
					}
					break;
				}
				}
				setState(73);
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
			setState(74);
			match(NAMESPACE);
			setState(75);
			namespaceValue();
			setState(76);
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
			setState(78);
			match(Identifier);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					match(DOT);
					setState(80);
					match(Identifier);
					}
					} 
				}
				setState(85);
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
			setState(86);
			match(IMPORT);
			setState(87);
			importValue();
			setState(88);
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
			setState(90);
			match(Identifier);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(DOT);
					setState(92);
					match(Identifier);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(98);
				match(DOT);
				setState(99);
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
		enterRule(_localctx, 10, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(102);
				annotation();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(ANNOTATION);
			setState(109);
			match(Identifier);
			setState(110);
			match(LBRACE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(111);
				baseField();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		public TerminalNode Label() { return getToken(MoonlightParser.Label, 0); }
		public List<NamespaceValueContext> namespaceValue() {
			return getRuleContexts(NamespaceValueContext.class);
		}
		public NamespaceValueContext namespaceValue(int i) {
			return getRuleContext(NamespaceValueContext.class,i);
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
		enterRule(_localctx, 12, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(119);
				namespaceValue();
				setState(120);
				match(DOT);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(Label);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				{
				setState(128);
				match(LPAREN);
				setState(129);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(130);
				match(LPAREN);
				setState(131);
				baseAssignment();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					baseAssignment();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
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
		public List<BaseFieldContext> baseField() {
			return getRuleContexts(BaseFieldContext.class);
		}
		public BaseFieldContext baseField(int i) {
			return getRuleContext(BaseFieldContext.class,i);
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
		enterRule(_localctx, 14, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(143);
				annotation();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(ENUM);
			setState(150);
			match(Identifier);
			setState(151);
			match(LBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Label || _la==Identifier) {
					{
					{
					setState(152);
					annotation();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				baseField();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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

	public static class BaseFieldContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public BaseAssignmentContext baseAssignment() {
			return getRuleContext(BaseAssignmentContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(MoonlightParser.ARRAY, 0); }
		public BaseFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseFieldContext baseField() throws RecognitionException {
		BaseFieldContext _localctx = new BaseFieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_baseField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			baseType();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(167);
				match(ARRAY);
				}
			}

			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(170);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(171);
				baseAssignment();
				}
				break;
			}
			setState(174);
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

	public static class BaseAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MoonlightParser.Identifier, 0); }
		public TerminalNode Literal() { return getToken(MoonlightParser.Literal, 0); }
		public BaseArrayExprContext baseArrayExpr() {
			return getRuleContext(BaseArrayExprContext.class,0);
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
		enterRule(_localctx, 18, RULE_baseAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Identifier);
			setState(177);
			match(T__1);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				{
				setState(178);
				match(Literal);
				}
				break;
			case ARRAY:
			case LBRACK:
				{
				setState(179);
				baseArrayExpr();
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

	public static class BaseArrayExprContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(MoonlightParser.ARRAY, 0); }
		public List<TerminalNode> Literal() { return getTokens(MoonlightParser.Literal); }
		public TerminalNode Literal(int i) {
			return getToken(MoonlightParser.Literal, i);
		}
		public BaseArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseArrayExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterBaseArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitBaseArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitBaseArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseArrayExprContext baseArrayExpr() throws RecognitionException {
		BaseArrayExprContext _localctx = new BaseArrayExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_baseArrayExpr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ARRAY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(LBRACK);
				setState(184);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(185);
				match(LBRACK);
				setState(186);
				match(Literal);
				{
				setState(187);
				match(COMMA);
				setState(188);
				match(Literal);
				}
				setState(190);
				match(RBRACK);
				}
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
		enterRule(_localctx, 22, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(193);
				annotation();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(STRUCT);
			setState(200);
			referenceType();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(201);
				match(EXTENDS);
				setState(202);
				referenceType();
				}
			}

			setState(205);
			match(LBRACE);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << FieldReq) | (1L << Identifier))) != 0)) {
				{
				{
				setState(206);
				structField();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
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
		enterRule(_localctx, 24, RULE_structField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					annotation();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FieldReq) {
				{
				setState(220);
				match(FieldReq);
				}
			}

			setState(223);
			fieldType();
			setState(224);
			match(Identifier);
			setState(225);
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
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					annotation();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(233);
			functionReturnType();
			setState(234);
			match(Identifier);
			setState(235);
			match(LPAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(236);
				functionParameter();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(237);
					match(COMMA);
					setState(238);
					functionParameter();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(RPAREN);
			setState(250);
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
		enterRule(_localctx, 28, RULE_functionParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					annotation();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(258);
			fieldType();
			setState(259);
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
		enterRule(_localctx, 30, RULE_functionReturnType);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
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
				setState(262);
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
		enterRule(_localctx, 32, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(265);
				annotation();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(INTERFACE);
			setState(272);
			interfaceName();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(273);
				match(EXTENDS);
				setState(274);
				interfaceName();
				}
			}

			setState(277);
			match(LBRACE);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(278);
				functionDeclaration();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
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
		enterRule(_localctx, 34, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(286);
				namespaceValue();
				setState(287);
				match(DOT);
				}
				break;
			}
			setState(291);
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
		enterRule(_localctx, 36, RULE_fieldType);
		try {
			setState(296);
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
				setState(293);
				baseType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				containerType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
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
		public ParametricTypeContext parametricType() {
			return getRuleContext(ParametricTypeContext.class,0);
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
		enterRule(_localctx, 38, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(298);
				namespaceValue();
				setState(299);
				match(DOT);
				}
				break;
			}
			setState(303);
			match(Identifier);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(304);
				parametricType();
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

	public static class ParametricTypeContext extends ParserRuleContext {
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public ParametricTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametricType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).enterParametricType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightListener ) ((MoonlightListener)listener).exitParametricType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightVisitor ) return ((MoonlightVisitor<? extends T>)visitor).visitParametricType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametricTypeContext parametricType() throws RecognitionException {
		ParametricTypeContext _localctx = new ParametricTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametricType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__2);
			setState(308);
			fieldType();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(310);
				fieldType();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
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
		enterRule(_localctx, 42, RULE_containerType);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				mapType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				setType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
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
		enterRule(_localctx, 44, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__4);
			setState(324);
			match(T__2);
			setState(325);
			fieldType();
			setState(326);
			match(COMMA);
			setState(327);
			fieldType();
			setState(328);
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
		enterRule(_localctx, 46, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__5);
			setState(331);
			match(T__2);
			setState(332);
			fieldType();
			setState(333);
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
		enterRule(_localctx, 48, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__6);
			setState(336);
			match(T__2);
			setState(337);
			fieldType();
			setState(338);
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
		enterRule(_localctx, 50, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0159\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6`\n"+
		"\6\f\6\16\6c\13\6\3\6\3\6\5\6g\n\6\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7"+
		"\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\b\3\b\3\b\7\b}\n\b\f\b\16\b"+
		"\u0080\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13"+
		"\b\3\b\3\b\5\b\u0090\n\b\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\t\3\t"+
		"\3\t\3\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t\3\t\7\t\u00a2\n\t\f\t\16\t"+
		"\u00a5\13\t\3\t\3\t\3\n\3\n\5\n\u00ab\n\n\3\n\3\n\5\n\u00af\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13\u00b7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00c2\n\f\3\r\7\r\u00c5\n\r\f\r\16\r\u00c8\13\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ce\n\r\3\r\3\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3\r\3\r\3\16"+
		"\7\16\u00da\n\16\f\16\16\16\u00dd\13\16\3\16\5\16\u00e0\n\16\3\16\3\16"+
		"\3\16\3\16\3\17\7\17\u00e7\n\17\f\17\16\17\u00ea\13\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00f2\n\17\f\17\16\17\u00f5\13\17\7\17\u00f7\n\17"+
		"\f\17\16\17\u00fa\13\17\3\17\3\17\3\17\3\20\7\20\u0100\n\20\f\20\16\20"+
		"\u0103\13\20\3\20\3\20\3\20\3\21\3\21\5\21\u010a\n\21\3\22\7\22\u010d"+
		"\n\22\f\22\16\22\u0110\13\22\3\22\3\22\3\22\3\22\5\22\u0116\n\22\3\22"+
		"\3\22\7\22\u011a\n\22\f\22\16\22\u011d\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u0124\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u012b\n\24\3\25\3\25\3"+
		"\25\5\25\u0130\n\25\3\25\3\25\5\25\u0134\n\25\3\26\3\26\3\26\3\26\7\26"+
		"\u013a\n\26\f\26\16\26\u013d\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u0144"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\3\3\2\n\22\2\u016a\29\3\2\2\2\4L\3\2"+
		"\2\2\6P\3\2\2\2\bX\3\2\2\2\n\\\3\2\2\2\fk\3\2\2\2\16~\3\2\2\2\20\u0094"+
		"\3\2\2\2\22\u00a8\3\2\2\2\24\u00b2\3\2\2\2\26\u00c1\3\2\2\2\30\u00c6\3"+
		"\2\2\2\32\u00db\3\2\2\2\34\u00e8\3\2\2\2\36\u0101\3\2\2\2 \u0109\3\2\2"+
		"\2\"\u010e\3\2\2\2$\u0123\3\2\2\2&\u012a\3\2\2\2(\u012f\3\2\2\2*\u0135"+
		"\3\2\2\2,\u0143\3\2\2\2.\u0145\3\2\2\2\60\u014c\3\2\2\2\62\u0151\3\2\2"+
		"\2\64\u0156\3\2\2\2\668\5\16\b\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:<\3\2\2\2;9\3\2\2\2<@\5\4\3\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2AI\3\2\2\2B@\3\2\2\2CH\5\20\t\2DH\5\f\7\2EH\5\30\r"+
		"\2FH\5\"\22\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2J\3\3\2\2\2KI\3\2\2\2LM\7\30\2\2MN\5\6\4\2NO\7+\2\2O\5\3"+
		"\2\2\2PU\7.\2\2QR\7-\2\2RT\7.\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\7\3\2\2\2WU\3\2\2\2XY\7\26\2\2YZ\5\n\6\2Z[\7+\2\2[\t\3\2\2\2\\a"+
		"\7.\2\2]^\7-\2\2^`\7.\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3"+
		"\2\2\2ca\3\2\2\2de\7-\2\2eg\7\3\2\2fd\3\2\2\2fg\3\2\2\2g\13\3\2\2\2hj"+
		"\5\16\b\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2"+
		"no\7\32\2\2op\7.\2\2pt\7\'\2\2qs\5\22\n\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7(\2\2x\r\3\2\2\2yz\5\6\4\2z{\7-\2"+
		"\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u008f\7\34\2\2\u0082\u0083\7%\2\2\u0083"+
		"\u0090\7&\2\2\u0084\u0085\7%\2\2\u0085\u008a\5\24\13\2\u0086\u0087\7,"+
		"\2\2\u0087\u0089\5\24\13\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7&\2\2\u008e\u0090\3\2\2\2\u008f\u0082\3\2\2\2\u008f"+
		"\u0084\3\2\2\2\u008f\u0090\3\2\2\2\u0090\17\3\2\2\2\u0091\u0093\5\16\b"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\24\2\2"+
		"\u0098\u0099\7.\2\2\u0099\u00a3\7\'\2\2\u009a\u009c\5\16\b\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5\22\n\2\u00a1\u009d\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7(\2\2\u00a7\21\3\2\2\2"+
		"\u00a8\u00aa\5\64\33\2\u00a9\u00ab\7\33\2\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00af\7.\2\2\u00ad\u00af\5\24"+
		"\13\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7+\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\7.\2\2\u00b3\u00b6\7\4\2\2"+
		"\u00b4\u00b7\7\35\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00c2\7\33\2\2\u00b9\u00ba\7)\2\2\u00ba"+
		"\u00c2\7*\2\2\u00bb\u00bc\7)\2\2\u00bc\u00bd\7\35\2\2\u00bd\u00be\7,\2"+
		"\2\u00be\u00bf\7\35\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7*\2\2\u00c1\u00b8"+
		"\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\27\3\2\2\2\u00c3"+
		"\u00c5\5\16\b\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\31\2\2\u00ca\u00cd\5(\25\2\u00cb\u00cc\7\25\2\2\u00cc\u00ce\5"+
		"(\25\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d3\7\'\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\31\3\2\2\2\u00d8\u00da\5\16\b"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\7\36\2\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2"+
		"\5&\24\2\u00e2\u00e3\7.\2\2\u00e3\u00e4\7+\2\2\u00e4\33\3\2\2\2\u00e5"+
		"\u00e7\5\16\b\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\5 \21\2\u00ec\u00ed\7.\2\2\u00ed\u00f8\7%\2\2\u00ee\u00f3\5\36"+
		"\20\2\u00ef\u00f0\7,\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7&\2\2\u00fc\u00fd\7+\2\2\u00fd\35\3\2\2\2\u00fe\u0100"+
		"\5\16\b\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105"+
		"\5&\24\2\u0105\u0106\7.\2\2\u0106\37\3\2\2\2\u0107\u010a\7\23\2\2\u0108"+
		"\u010a\5&\24\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a!\3\2\2\2"+
		"\u010b\u010d\5\16\b\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0112\7\27\2\2\u0112\u0115\5$\23\2\u0113\u0114\7\25\2\2\u0114\u0116\5"+
		"$\23\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011b\7\'\2\2\u0118\u011a\5\34\17\2\u0119\u0118\3\2\2\2\u011a\u011d\3"+
		"\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7(\2\2\u011f#\3\2\2\2\u0120\u0121\5\6\4\2\u0121"+
		"\u0122\7-\2\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7.\2\2\u0126%\3\2\2\2\u0127\u012b"+
		"\5\64\33\2\u0128\u012b\5,\27\2\u0129\u012b\5(\25\2\u012a\u0127\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\'\3\2\2\2\u012c\u012d\5"+
		"\6\4\2\u012d\u012e\7-\2\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\7.\2\2\u0132\u0134\5*\26"+
		"\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134)\3\2\2\2\u0135\u0136"+
		"\7\5\2\2\u0136\u013b\5&\24\2\u0137\u0138\7,\2\2\u0138\u013a\5&\24\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\6\2\2\u013f"+
		"+\3\2\2\2\u0140\u0144\5.\30\2\u0141\u0144\5\60\31\2\u0142\u0144\5\62\32"+
		"\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144-"+
		"\3\2\2\2\u0145\u0146\7\7\2\2\u0146\u0147\7\5\2\2\u0147\u0148\5&\24\2\u0148"+
		"\u0149\7,\2\2\u0149\u014a\5&\24\2\u014a\u014b\7\6\2\2\u014b/\3\2\2\2\u014c"+
		"\u014d\7\b\2\2\u014d\u014e\7\5\2\2\u014e\u014f\5&\24\2\u014f\u0150\7\6"+
		"\2\2\u0150\61\3\2\2\2\u0151\u0152\7\t\2\2\u0152\u0153\7\5\2\2\u0153\u0154"+
		"\5&\24\2\u0154\u0155\7\6\2\2\u0155\63\3\2\2\2\u0156\u0157\t\2\2\2\u0157"+
		"\65\3\2\2\2(9@GIUafkt~\u008a\u008f\u0094\u009d\u00a3\u00aa\u00ae\u00b6"+
		"\u00c1\u00c6\u00cd\u00d3\u00db\u00df\u00e8\u00f3\u00f8\u0101\u0109\u010e"+
		"\u0115\u011b\u0123\u012a\u012f\u0133\u013b\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}