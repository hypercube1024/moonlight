// Generated from /Users/bjhl/Develop/local_git/moonlight/moonlight-compiler/src/main/java/com/moonlightsource/parser/MoonlightParser.g4 by ANTLR 4.7
package com.moonlightsource.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoonlightParserParser extends Parser {
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
		RULE_importDeclaration = 3, RULE_annotationDeclaration = 4, RULE_annotation = 5, 
		RULE_enumDeclaration = 6, RULE_baseField = 7, RULE_baseAssignment = 8, 
		RULE_baseArrayExpr = 9, RULE_structDeclaration = 10, RULE_structField = 11, 
		RULE_functionDeclaration = 12, RULE_functionParameter = 13, RULE_functionReturnType = 14, 
		RULE_interfaceDeclaration = 15, RULE_interfaceName = 16, RULE_fieldType = 17, 
		RULE_referenceType = 18, RULE_parametricType = 19, RULE_containerType = 20, 
		RULE_mapType = 21, RULE_setType = 22, RULE_listType = 23, RULE_baseType = 24;
	public static final String[] ruleNames = {
		"moonlightFile", "namespaceDeclaration", "namespaceValue", "importDeclaration", 
		"annotationDeclaration", "annotation", "enumDeclaration", "baseField", 
		"baseAssignment", "baseArrayExpr", "structDeclaration", "structField", 
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
	public String getGrammarFileName() { return "MoonlightParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoonlightParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MoonlightFileContext extends ParserRuleContext {
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterMoonlightFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitMoonlightFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitMoonlightFile(this);
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
			setState(50);
			namespaceDeclaration();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(51);
				importDeclaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENUM) | (1L << INTERFACE) | (1L << STRUCT) | (1L << ANNOTATION) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(57);
					enumDeclaration();
					}
					break;
				case 2:
					{
					setState(58);
					annotationDeclaration();
					}
					break;
				case 3:
					{
					setState(59);
					structDeclaration();
					}
					break;
				case 4:
					{
					setState(60);
					interfaceDeclaration();
					}
					break;
				}
				}
				setState(65);
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
		public TerminalNode NAMESPACE() { return getToken(MoonlightParserParser.NAMESPACE, 0); }
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NAMESPACE);
			setState(67);
			namespaceValue();
			setState(68);
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
		public List<TerminalNode> Identifier() { return getTokens(MoonlightParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MoonlightParserParser.Identifier, i);
		}
		public NamespaceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterNamespaceValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitNamespaceValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitNamespaceValue(this);
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
			setState(70);
			match(Identifier);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					match(DOT);
					setState(72);
					match(Identifier);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode IMPORT() { return getToken(MoonlightParserParser.IMPORT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MoonlightParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MoonlightParserParser.Identifier, i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IMPORT);
			setState(79);
			match(Identifier);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(DOT);
					setState(81);
					match(Identifier);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(87);
				match(DOT);
				setState(88);
				match(T__0);
				}
			}

			setState(91);
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
		public TerminalNode ANNOTATION() { return getToken(MoonlightParserParser.ANNOTATION, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterAnnotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitAnnotationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ANNOTATION);
			setState(94);
			match(Identifier);
			setState(95);
			match(LBRACE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(96);
				baseField();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		public TerminalNode Label() { return getToken(MoonlightParserParser.Label, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(104);
				namespaceValue();
				setState(105);
				match(DOT);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(Label);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(113);
				match(LPAREN);
				setState(114);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(115);
				match(LPAREN);
				setState(116);
				baseAssignment();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(117);
					match(COMMA);
					setState(118);
					baseAssignment();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
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
		public TerminalNode ENUM() { return getToken(MoonlightParserParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(128);
				annotation();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(ENUM);
			setState(135);
			match(Identifier);
			setState(136);
			match(LBRACE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Label || _la==Identifier) {
					{
					{
					setState(137);
					annotation();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				baseField();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
		public BaseAssignmentContext baseAssignment() {
			return getRuleContext(BaseAssignmentContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(MoonlightParserParser.ARRAY, 0); }
		public BaseFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterBaseField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitBaseField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitBaseField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseFieldContext baseField() throws RecognitionException {
		BaseFieldContext _localctx = new BaseFieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_baseField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			baseType();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(152);
				match(ARRAY);
				}
			}

			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(155);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(156);
				baseAssignment();
				}
				break;
			}
			setState(159);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
		public TerminalNode Literal() { return getToken(MoonlightParserParser.Literal, 0); }
		public BaseArrayExprContext baseArrayExpr() {
			return getRuleContext(BaseArrayExprContext.class,0);
		}
		public BaseAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterBaseAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitBaseAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitBaseAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseAssignmentContext baseAssignment() throws RecognitionException {
		BaseAssignmentContext _localctx = new BaseAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_baseAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Identifier);
			setState(162);
			match(T__1);
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				{
				setState(163);
				match(Literal);
				}
				break;
			case ARRAY:
			case LBRACK:
				{
				setState(164);
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
		public TerminalNode ARRAY() { return getToken(MoonlightParserParser.ARRAY, 0); }
		public List<TerminalNode> Literal() { return getTokens(MoonlightParserParser.Literal); }
		public TerminalNode Literal(int i) {
			return getToken(MoonlightParserParser.Literal, i);
		}
		public BaseArrayExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseArrayExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterBaseArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitBaseArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitBaseArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseArrayExprContext baseArrayExpr() throws RecognitionException {
		BaseArrayExprContext _localctx = new BaseArrayExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_baseArrayExpr);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ARRAY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(LBRACK);
				setState(169);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(170);
				match(LBRACK);
				setState(171);
				match(Literal);
				{
				setState(172);
				match(COMMA);
				setState(173);
				match(Literal);
				}
				setState(175);
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
		public TerminalNode STRUCT() { return getToken(MoonlightParserParser.STRUCT, 0); }
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
		public TerminalNode EXTENDS() { return getToken(MoonlightParserParser.EXTENDS, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(178);
				annotation();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(STRUCT);
			setState(185);
			referenceType();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(186);
				match(EXTENDS);
				setState(187);
				referenceType();
				}
			}

			setState(190);
			match(LBRACE);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << FieldReq) | (1L << Identifier))) != 0)) {
				{
				{
				setState(191);
				structField();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FieldReq() { return getToken(MoonlightParserParser.FieldReq, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					annotation();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FieldReq) {
				{
				setState(205);
				match(FieldReq);
				}
			}

			setState(208);
			fieldType();
			setState(209);
			match(Identifier);
			setState(210);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					annotation();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(218);
			functionReturnType();
			setState(219);
			match(Identifier);
			setState(220);
			match(LPAREN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(221);
				functionParameter();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					functionParameter();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(RPAREN);
			setState(235);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					annotation();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(243);
			fieldType();
			setState(244);
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
		public TerminalNode VOID() { return getToken(MoonlightParserParser.VOID, 0); }
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionReturnType);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
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
				setState(247);
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
		public TerminalNode INTERFACE() { return getToken(MoonlightParserParser.INTERFACE, 0); }
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
		public TerminalNode EXTENDS() { return getToken(MoonlightParserParser.EXTENDS, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(250);
				annotation();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(INTERFACE);
			setState(257);
			interfaceName();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(258);
				match(EXTENDS);
				setState(259);
				interfaceName();
				}
			}

			setState(262);
			match(LBRACE);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(263);
				functionDeclaration();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitInterfaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(271);
				namespaceValue();
				setState(272);
				match(DOT);
				}
				break;
			}
			setState(276);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitFieldType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fieldType);
		try {
			setState(281);
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
				setState(278);
				baseType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				containerType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
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
		public TerminalNode Identifier() { return getToken(MoonlightParserParser.Identifier, 0); }
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(283);
				namespaceValue();
				setState(284);
				match(DOT);
				}
				break;
			}
			setState(288);
			match(Identifier);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(289);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterParametricType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitParametricType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitParametricType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametricTypeContext parametricType() throws RecognitionException {
		ParametricTypeContext _localctx = new ParametricTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametricType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__2);
			setState(293);
			fieldType();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				fieldType();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterContainerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitContainerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitContainerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerTypeContext containerType() throws RecognitionException {
		ContainerTypeContext _localctx = new ContainerTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_containerType);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				mapType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				setType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__4);
			setState(309);
			match(T__2);
			setState(310);
			fieldType();
			setState(311);
			match(COMMA);
			setState(312);
			fieldType();
			setState(313);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__5);
			setState(316);
			match(T__2);
			setState(317);
			fieldType();
			setState(318);
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
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__6);
			setState(321);
			match(T__2);
			setState(322);
			fieldType();
			setState(323);
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
		public TerminalNode BOOLEAN() { return getToken(MoonlightParserParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(MoonlightParserParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(MoonlightParserParser.SHORT, 0); }
		public TerminalNode CHAR() { return getToken(MoonlightParserParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(MoonlightParserParser.INT, 0); }
		public TerminalNode LONG() { return getToken(MoonlightParserParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(MoonlightParserParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MoonlightParserParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MoonlightParserParser.STRING, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoonlightParserListener ) ((MoonlightParserListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoonlightParserVisitor ) return ((MoonlightParserVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u014a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3"+
		"\5\3\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\3\7\3\7\7\7n\n\7\f\7\16"+
		"\7q\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\5"+
		"\7\u0081\n\7\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\b\3\b\7\b"+
		"\u008d\n\b\f\b\16\b\u0090\13\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3"+
		"\b\3\b\3\t\3\t\5\t\u009c\n\t\3\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u00a8\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3"+
		"\n\13\3\f\7\f\u00b6\n\f\f\f\16\f\u00b9\13\f\3\f\3\f\3\f\3\f\5\f\u00bf"+
		"\n\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3\f\3\f\3\r\7\r\u00cb\n"+
		"\r\f\r\16\r\u00ce\13\r\3\r\5\r\u00d1\n\r\3\r\3\r\3\r\3\r\3\16\7\16\u00d8"+
		"\n\16\f\16\16\16\u00db\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e3"+
		"\n\16\f\16\16\16\u00e6\13\16\7\16\u00e8\n\16\f\16\16\16\u00eb\13\16\3"+
		"\16\3\16\3\16\3\17\7\17\u00f1\n\17\f\17\16\17\u00f4\13\17\3\17\3\17\3"+
		"\17\3\20\3\20\5\20\u00fb\n\20\3\21\7\21\u00fe\n\21\f\21\16\21\u0101\13"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0107\n\21\3\21\3\21\7\21\u010b\n\21\f\21"+
		"\16\21\u010e\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u0115\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\5\24\u0121\n\24\3\24\3"+
		"\24\5\24\u0125\n\24\3\25\3\25\3\25\3\25\7\25\u012b\n\25\f\25\16\25\u012e"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u0135\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\3\3\2\n\22\2\u015a\2\64\3\2\2\2\4D\3\2\2\2\6H\3\2\2\2\bP\3\2\2\2\n"+
		"_\3\2\2\2\fo\3\2\2\2\16\u0085\3\2\2\2\20\u0099\3\2\2\2\22\u00a3\3\2\2"+
		"\2\24\u00b2\3\2\2\2\26\u00b7\3\2\2\2\30\u00cc\3\2\2\2\32\u00d9\3\2\2\2"+
		"\34\u00f2\3\2\2\2\36\u00fa\3\2\2\2 \u00ff\3\2\2\2\"\u0114\3\2\2\2$\u011b"+
		"\3\2\2\2&\u0120\3\2\2\2(\u0126\3\2\2\2*\u0134\3\2\2\2,\u0136\3\2\2\2."+
		"\u013d\3\2\2\2\60\u0142\3\2\2\2\62\u0147\3\2\2\2\648\5\4\3\2\65\67\5\b"+
		"\5\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29A\3\2\2\2:8\3\2\2"+
		"\2;@\5\16\b\2<@\5\n\6\2=@\5\26\f\2>@\5 \21\2?;\3\2\2\2?<\3\2\2\2?=\3\2"+
		"\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE\7"+
		"\30\2\2EF\5\6\4\2FG\7+\2\2G\5\3\2\2\2HM\7.\2\2IJ\7-\2\2JL\7.\2\2KI\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PQ\7\26\2\2QV\7"+
		".\2\2RS\7-\2\2SU\7.\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W[\3\2"+
		"\2\2XV\3\2\2\2YZ\7-\2\2Z\\\7\3\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7"+
		"+\2\2^\t\3\2\2\2_`\7\32\2\2`a\7.\2\2ae\7\'\2\2bd\5\20\t\2cb\3\2\2\2dg"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7(\2\2i\13\3\2\2\2"+
		"jk\5\6\4\2kl\7-\2\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pr\3\2\2\2qo\3\2\2\2r\u0080\7\34\2\2st\7%\2\2t\u0081\7&\2\2uv\7%\2\2v"+
		"{\5\22\n\2wx\7,\2\2xz\5\22\n\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2"+
		"|~\3\2\2\2}{\3\2\2\2~\177\7&\2\2\177\u0081\3\2\2\2\u0080s\3\2\2\2\u0080"+
		"u\3\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0084\5\f\7\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\24\2\2\u0089"+
		"\u008a\7.\2\2\u008a\u0094\7\'\2\2\u008b\u008d\5\f\7\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5\20\t\2\u0092\u008e\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7(\2\2\u0098\17\3\2\2\2"+
		"\u0099\u009b\5\62\32\2\u009a\u009c\7\33\2\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u00a0\7.\2\2\u009e\u00a0\5\22"+
		"\n\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7+\2\2\u00a2\21\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\u00a7\7\4\2\2"+
		"\u00a5\u00a8\7\35\2\2\u00a6\u00a8\5\24\13\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00b3\7\33\2\2\u00aa\u00ab\7)\2"+
		"\2\u00ab\u00b3\7*\2\2\u00ac\u00ad\7)\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af"+
		"\7,\2\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7*\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b3\25\3\2\2"+
		"\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\31\2\2\u00bb\u00be\5&\24\2\u00bc\u00bd\7\25\2\2\u00bd\u00bf\5"+
		"&\24\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c4\7\'\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\27\3\2\2\2\u00c9\u00cb\5\f\7\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\7\36\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3"+
		"\5$\23\2\u00d3\u00d4\7.\2\2\u00d4\u00d5\7+\2\2\u00d5\31\3\2\2\2\u00d6"+
		"\u00d8\5\f\7\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\5\36\20\2\u00dd\u00de\7.\2\2\u00de\u00e9\7%\2\2\u00df\u00e4\5\34"+
		"\17\2\u00e0\u00e1\7,\2\2\u00e1\u00e3\5\34\17\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ee\7+\2\2\u00ee\33\3\2\2\2\u00ef\u00f1"+
		"\5\f\7\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5$"+
		"\23\2\u00f6\u00f7\7.\2\2\u00f7\35\3\2\2\2\u00f8\u00fb\7\23\2\2\u00f9\u00fb"+
		"\5$\23\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\37\3\2\2\2\u00fc"+
		"\u00fe\5\f\7\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\7\27\2\2\u0103\u0106\5\"\22\2\u0104\u0105\7\25\2\2\u0105\u0107"+
		"\5\"\22\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u010c\7\'\2\2\u0109\u010b\5\32\16\2\u010a\u0109\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7(\2\2\u0110!\3\2\2\2\u0111\u0112\5\6\4\2\u0112"+
		"\u0113\7-\2\2\u0113\u0115\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7.\2\2\u0117#\3\2\2\2\u0118\u011c"+
		"\5\62\32\2\u0119\u011c\5*\26\2\u011a\u011c\5&\24\2\u011b\u0118\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c%\3\2\2\2\u011d\u011e\5"+
		"\6\4\2\u011e\u011f\7-\2\2\u011f\u0121\3\2\2\2\u0120\u011d\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\7.\2\2\u0123\u0125\5(\25"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\'\3\2\2\2\u0126\u0127"+
		"\7\5\2\2\u0127\u012c\5$\23\2\u0128\u0129\7,\2\2\u0129\u012b\5$\23\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\6\2\2\u0130"+
		")\3\2\2\2\u0131\u0135\5,\27\2\u0132\u0135\5.\30\2\u0133\u0135\5\60\31"+
		"\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135+"+
		"\3\2\2\2\u0136\u0137\7\7\2\2\u0137\u0138\7\5\2\2\u0138\u0139\5$\23\2\u0139"+
		"\u013a\7,\2\2\u013a\u013b\5$\23\2\u013b\u013c\7\6\2\2\u013c-\3\2\2\2\u013d"+
		"\u013e\7\b\2\2\u013e\u013f\7\5\2\2\u013f\u0140\5$\23\2\u0140\u0141\7\6"+
		"\2\2\u0141/\3\2\2\2\u0142\u0143\7\t\2\2\u0143\u0144\7\5\2\2\u0144\u0145"+
		"\5$\23\2\u0145\u0146\7\6\2\2\u0146\61\3\2\2\2\u0147\u0148\t\2\2\2\u0148"+
		"\63\3\2\2\2&8?AMV[eo{\u0080\u0085\u008e\u0094\u009b\u009f\u00a7\u00b2"+
		"\u00b7\u00be\u00c4\u00cc\u00d0\u00d9\u00e4\u00e9\u00f2\u00fa\u00ff\u0106"+
		"\u010c\u0114\u011b\u0120\u0124\u012c\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}