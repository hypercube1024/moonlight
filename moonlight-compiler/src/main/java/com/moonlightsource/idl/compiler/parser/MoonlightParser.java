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
		public TerminalNode IMPORT() { return getToken(MoonlightParser.IMPORT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MoonlightParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MoonlightParser.Identifier, i);
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
		enterRule(_localctx, 8, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(93);
				annotation();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(ANNOTATION);
			setState(100);
			match(Identifier);
			setState(101);
			match(LBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(102);
				baseField();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(110);
				namespaceValue();
				setState(111);
				match(DOT);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(Label);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(119);
				match(LPAREN);
				setState(120);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				{
				setState(121);
				match(LPAREN);
				setState(122);
				baseAssignment();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					baseAssignment();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
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
		enterRule(_localctx, 12, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(134);
				annotation();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(ENUM);
			setState(141);
			match(Identifier);
			setState(142);
			match(LBRACE);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
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
				baseField();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
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
		enterRule(_localctx, 14, RULE_baseField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			baseType();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(158);
				match(ARRAY);
				}
			}

			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(161);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(162);
				baseAssignment();
				}
				break;
			}
			setState(165);
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
		enterRule(_localctx, 16, RULE_baseAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Identifier);
			setState(168);
			match(T__1);
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				{
				setState(169);
				match(Literal);
				}
				break;
			case ARRAY:
			case LBRACK:
				{
				setState(170);
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
		enterRule(_localctx, 18, RULE_baseArrayExpr);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ARRAY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(LBRACK);
				setState(175);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(176);
				match(LBRACK);
				setState(177);
				match(Literal);
				{
				setState(178);
				match(COMMA);
				setState(179);
				match(Literal);
				}
				setState(181);
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
		enterRule(_localctx, 20, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(184);
				annotation();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(STRUCT);
			setState(191);
			referenceType();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(192);
				match(EXTENDS);
				setState(193);
				referenceType();
				}
			}

			setState(196);
			match(LBRACE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << FieldReq) | (1L << Identifier))) != 0)) {
				{
				{
				setState(197);
				structField();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		enterRule(_localctx, 22, RULE_structField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					annotation();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FieldReq) {
				{
				setState(211);
				match(FieldReq);
				}
			}

			setState(214);
			fieldType();
			setState(215);
			match(Identifier);
			setState(216);
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
		enterRule(_localctx, 24, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					annotation();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(224);
			functionReturnType();
			setState(225);
			match(Identifier);
			setState(226);
			match(LPAREN);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(227);
				functionParameter();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(228);
					match(COMMA);
					setState(229);
					functionParameter();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(RPAREN);
			setState(241);
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
		enterRule(_localctx, 26, RULE_functionParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					annotation();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(249);
			fieldType();
			setState(250);
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
		enterRule(_localctx, 28, RULE_functionReturnType);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
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
				setState(253);
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
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Label || _la==Identifier) {
				{
				{
				setState(256);
				annotation();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(INTERFACE);
			setState(263);
			interfaceName();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(264);
				match(EXTENDS);
				setState(265);
				interfaceName();
				}
			}

			setState(268);
			match(LBRACE);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << BOOLEAN) | (1L << BYTE) | (1L << SHORT) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << Label) | (1L << Identifier))) != 0)) {
				{
				{
				setState(269);
				functionDeclaration();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
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
		enterRule(_localctx, 32, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(277);
				namespaceValue();
				setState(278);
				match(DOT);
				}
				break;
			}
			setState(282);
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
		enterRule(_localctx, 34, RULE_fieldType);
		try {
			setState(287);
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
				setState(284);
				baseType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				containerType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
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
		enterRule(_localctx, 36, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(289);
				namespaceValue();
				setState(290);
				match(DOT);
				}
				break;
			}
			setState(294);
			match(Identifier);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(295);
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
		enterRule(_localctx, 38, RULE_parametricType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__2);
			setState(299);
			fieldType();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300);
				match(COMMA);
				setState(301);
				fieldType();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
		enterRule(_localctx, 40, RULE_containerType);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				mapType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				setType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
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
		enterRule(_localctx, 42, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__4);
			setState(315);
			match(T__2);
			setState(316);
			fieldType();
			setState(317);
			match(COMMA);
			setState(318);
			fieldType();
			setState(319);
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
		enterRule(_localctx, 44, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__5);
			setState(322);
			match(T__2);
			setState(323);
			fieldType();
			setState(324);
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
		enterRule(_localctx, 46, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__6);
			setState(327);
			match(T__2);
			setState(328);
			fieldType();
			setState(329);
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
		enterRule(_localctx, 48, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0150\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3"+
		"\5\3\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\6\7"+
		"\6a\n\6\f\6\16\6d\13\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0080"+
		"\n\7\f\7\16\7\u0083\13\7\3\7\3\7\5\7\u0087\n\7\3\b\7\b\u008a\n\b\f\b\16"+
		"\b\u008d\13\b\3\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3\b\7"+
		"\b\u0099\n\b\f\b\16\b\u009c\13\b\3\b\3\b\3\t\3\t\5\t\u00a2\n\t\3\t\3\t"+
		"\5\t\u00a6\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00ae\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f\7\f\u00bc\n\f\f\f\16"+
		"\f\u00bf\13\f\3\f\3\f\3\f\3\f\5\f\u00c5\n\f\3\f\3\f\7\f\u00c9\n\f\f\f"+
		"\16\f\u00cc\13\f\3\f\3\f\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\r\5\r"+
		"\u00d7\n\r\3\r\3\r\3\r\3\r\3\16\7\16\u00de\n\16\f\16\16\16\u00e1\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e9\n\16\f\16\16\16\u00ec\13\16"+
		"\7\16\u00ee\n\16\f\16\16\16\u00f1\13\16\3\16\3\16\3\16\3\17\7\17\u00f7"+
		"\n\17\f\17\16\17\u00fa\13\17\3\17\3\17\3\17\3\20\3\20\5\20\u0101\n\20"+
		"\3\21\7\21\u0104\n\21\f\21\16\21\u0107\13\21\3\21\3\21\3\21\3\21\5\21"+
		"\u010d\n\21\3\21\3\21\7\21\u0111\n\21\f\21\16\21\u0114\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u011b\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0122\n"+
		"\23\3\24\3\24\3\24\5\24\u0127\n\24\3\24\3\24\5\24\u012b\n\24\3\25\3\25"+
		"\3\25\3\25\7\25\u0131\n\25\f\25\16\25\u0134\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u013b\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\n\22\2\u0161\2\64\3"+
		"\2\2\2\4D\3\2\2\2\6H\3\2\2\2\bP\3\2\2\2\nb\3\2\2\2\fu\3\2\2\2\16\u008b"+
		"\3\2\2\2\20\u009f\3\2\2\2\22\u00a9\3\2\2\2\24\u00b8\3\2\2\2\26\u00bd\3"+
		"\2\2\2\30\u00d2\3\2\2\2\32\u00df\3\2\2\2\34\u00f8\3\2\2\2\36\u0100\3\2"+
		"\2\2 \u0105\3\2\2\2\"\u011a\3\2\2\2$\u0121\3\2\2\2&\u0126\3\2\2\2(\u012c"+
		"\3\2\2\2*\u013a\3\2\2\2,\u013c\3\2\2\2.\u0143\3\2\2\2\60\u0148\3\2\2\2"+
		"\62\u014d\3\2\2\2\648\5\4\3\2\65\67\5\b\5\2\66\65\3\2\2\2\67:\3\2\2\2"+
		"8\66\3\2\2\289\3\2\2\29A\3\2\2\2:8\3\2\2\2;@\5\16\b\2<@\5\n\6\2=@\5\26"+
		"\f\2>@\5 \21\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE\7\30\2\2EF\5\6\4\2FG\7+\2\2G\5\3"+
		"\2\2\2HM\7.\2\2IJ\7-\2\2JL\7.\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2N\7\3\2\2\2OM\3\2\2\2PQ\7\26\2\2QV\7.\2\2RS\7-\2\2SU\7.\2\2TR\3\2"+
		"\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W[\3\2\2\2XV\3\2\2\2YZ\7-\2\2Z\\\7\3"+
		"\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7+\2\2^\t\3\2\2\2_a\5\f\7\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\32\2\2fg"+
		"\7.\2\2gk\7\'\2\2hj\5\20\t\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"n\3\2\2\2mk\3\2\2\2no\7(\2\2o\13\3\2\2\2pq\5\6\4\2qr\7-\2\2rt\3\2\2\2"+
		"sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x\u0086\7"+
		"\34\2\2yz\7%\2\2z\u0087\7&\2\2{|\7%\2\2|\u0081\5\22\n\2}~\7,\2\2~\u0080"+
		"\5\22\n\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7&\2\2\u0085"+
		"\u0087\3\2\2\2\u0086y\3\2\2\2\u0086{\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\r\3\2\2\2\u0088\u008a\5\f\7\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008e\u008f\7\24\2\2\u008f\u0090\7.\2\2\u0090\u009a\7\'\2\2\u0091"+
		"\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\5\20\t\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7(\2\2\u009e\17\3\2\2\2\u009f\u00a1\5\62\32\2\u00a0\u00a2\7\33"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a6\7.\2\2\u00a4\u00a6\5\22\n\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8\21\3\2\2\2\u00a9\u00aa"+
		"\7.\2\2\u00aa\u00ad\7\4\2\2\u00ab\u00ae\7\35\2\2\u00ac\u00ae\5\24\13\2"+
		"\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00b9"+
		"\7\33\2\2\u00b0\u00b1\7)\2\2\u00b1\u00b9\7*\2\2\u00b2\u00b3\7)\2\2\u00b3"+
		"\u00b4\7\35\2\2\u00b4\u00b5\7,\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b9\7*\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00bc\5\f\7\2\u00bb\u00ba\3\2\2"+
		"\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c4\5&\24\2"+
		"\u00c2\u00c3\7\25\2\2\u00c3\u00c5\5&\24\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\7\'\2\2\u00c7\u00c9\5\30\r\2"+
		"\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce"+
		"\27\3\2\2\2\u00cf\u00d1\5\f\7\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d7\7\36\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7.\2\2\u00da\u00db"+
		"\7+\2\2\u00db\31\3\2\2\2\u00dc\u00de\5\f\7\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7.\2\2\u00e4"+
		"\u00ef\7%\2\2\u00e5\u00ea\5\34\17\2\u00e6\u00e7\7,\2\2\u00e7\u00e9\5\34"+
		"\17\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e5\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\7+\2"+
		"\2\u00f4\33\3\2\2\2\u00f5\u00f7\5\f\7\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\7.\2\2\u00fd\35\3\2\2\2"+
		"\u00fe\u0101\7\23\2\2\u00ff\u0101\5$\23\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\37\3\2\2\2\u0102\u0104\5\f\7\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\27\2\2\u0109\u010c\5\"\22\2\u010a"+
		"\u010b\7\25\2\2\u010b\u010d\5\"\22\2\u010c\u010a\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112\7\'\2\2\u010f\u0111\5\32\16\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7(\2\2\u0116"+
		"!\3\2\2\2\u0117\u0118\5\6\4\2\u0118\u0119\7-\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0117\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7."+
		"\2\2\u011d#\3\2\2\2\u011e\u0122\5\62\32\2\u011f\u0122\5*\26\2\u0120\u0122"+
		"\5&\24\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"%\3\2\2\2\u0123\u0124\5\6\4\2\u0124\u0125\7-\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7."+
		"\2\2\u0129\u012b\5(\25\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\'\3\2\2\2\u012c\u012d\7\5\2\2\u012d\u0132\5$\23\2\u012e\u012f\7,\2\2"+
		"\u012f\u0131\5$\23\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7\6\2\2\u0136)\3\2\2\2\u0137\u013b\5,\27\2\u0138\u013b\5.\30\2"+
		"\u0139\u013b\5\60\31\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b+\3\2\2\2\u013c\u013d\7\7\2\2\u013d\u013e\7\5\2\2\u013e"+
		"\u013f\5$\23\2\u013f\u0140\7,\2\2\u0140\u0141\5$\23\2\u0141\u0142\7\6"+
		"\2\2\u0142-\3\2\2\2\u0143\u0144\7\b\2\2\u0144\u0145\7\5\2\2\u0145\u0146"+
		"\5$\23\2\u0146\u0147\7\6\2\2\u0147/\3\2\2\2\u0148\u0149\7\t\2\2\u0149"+
		"\u014a\7\5\2\2\u014a\u014b\5$\23\2\u014b\u014c\7\6\2\2\u014c\61\3\2\2"+
		"\2\u014d\u014e\t\2\2\2\u014e\63\3\2\2\2\'8?AMV[bku\u0081\u0086\u008b\u0094"+
		"\u009a\u00a1\u00a5\u00ad\u00b8\u00bd\u00c4\u00ca\u00d2\u00d6\u00df\u00ea"+
		"\u00ef\u00f8\u0100\u0105\u010c\u0112\u011a\u0121\u0126\u012a\u0132\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}