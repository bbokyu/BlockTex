// Generated from /Users/bbokyu/Desktop/BlockTex/src/parser/BlockTexParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BlockTexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, SET=2, LOOP_START=3, RENDER_START=4, THIS=5, ASSIGN=6, DOT=7, 
		COMMA=8, LOOP_END=9, MULTIPLY=10, SUBTRACT=11, DIVIDE=12, ADD=13, WS=14, 
		IF=15, ELSE=16, EQUALS=17, G_T=18, L_T=19, GEQ=20, LEQ=21, OPEN_PAREN=22, 
		CLOSE_PAREN=23, OPEN_BRACE=24, CLOSE_BRACE=25, ROW=26, COL=27, CONST=28, 
		A_NUM=29, A_IDENTIFIER=30, A_ROW=31, A_COL=32, COORDINATE_START=33, RAW_LATEX=34, 
		LATEX=35, FRACTION=36, INTEGRAL=37, SUMMATION=38, DERIVATIVE=39, MATRIX=40, 
		NUMERATOR=41, DENOMINATOR=42, START=43, END=44, EQUATION=45, METHOD=46, 
		TYPE=47, ORDER=48, TARGETVAR=49, MATRIX_SHAPE=50, MATRIX_ELEMENT=51, IDENTIFIER=52, 
		COORDINATE_END=53, COORD_NUM=54, SEP=55;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_render = 2, RULE_equationObject = 3, 
		RULE_block_statement = 4, RULE_block = 5, RULE_condition = 6, RULE_conditional = 7, 
		RULE_loop = 8, RULE_latexObject = 9, RULE_matrixObject = 10, RULE_matrixName = 11, 
		RULE_shape_call = 12, RULE_element_call = 13, RULE_coordinate = 14, RULE_fractionObject = 15, 
		RULE_fractionName = 16, RULE_numerator_call = 17, RULE_denominator_call = 18, 
		RULE_derivativeObject = 19, RULE_derivativeName = 20, RULE_type_call = 21, 
		RULE_order_call = 22, RULE_targetVar_call = 23, RULE_summationObject = 24, 
		RULE_summationName = 25, RULE_integralObject = 26, RULE_integralName = 27, 
		RULE_start_call = 28, RULE_end_call = 29, RULE_equation_call = 30, RULE_set_property = 31, 
		RULE_set_loop_element = 32, RULE_name = 33, RULE_number = 34, RULE_expression = 35, 
		RULE_term = 36, RULE_rowCol = 37, RULE_operation = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "render", "equationObject", "block_statement", 
			"block", "condition", "conditional", "loop", "latexObject", "matrixObject", 
			"matrixName", "shape_call", "element_call", "coordinate", "fractionObject", 
			"fractionName", "numerator_call", "denominator_call", "derivativeObject", 
			"derivativeName", "type_call", "order_call", "targetVar_call", "summationObject", 
			"summationName", "integralObject", "integralName", "start_call", "end_call", 
			"equation_call", "set_property", "set_loop_element", "name", "number", 
			"expression", "term", "rowCol", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'This'", null, "'.'", "','", "'End'", 
			null, null, null, null, null, null, "'else'", "'=='", "'>'", "'<'", "'>='", 
			"'<='", null, "')'", "'{'", "'}'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'numerator'", 
			"'denominator'", "'start'", "'end'", "'equation'", "'method'", "'type'", 
			"'order'", "'targetVar'", "'shape'", "'element'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "SET", "LOOP_START", "RENDER_START", "THIS", "ASSIGN", 
			"DOT", "COMMA", "LOOP_END", "MULTIPLY", "SUBTRACT", "DIVIDE", "ADD", 
			"WS", "IF", "ELSE", "EQUALS", "G_T", "L_T", "GEQ", "LEQ", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "ROW", "COL", "CONST", "A_NUM", 
			"A_IDENTIFIER", "A_ROW", "A_COL", "COORDINATE_START", "RAW_LATEX", "LATEX", 
			"FRACTION", "INTEGRAL", "SUMMATION", "DERIVATIVE", "MATRIX", "NUMERATOR", 
			"DENOMINATOR", "START", "END", "EQUATION", "METHOD", "TYPE", "ORDER", 
			"TARGETVAR", "MATRIX_SHAPE", "MATRIX_ELEMENT", "IDENTIFIER", "COORDINATE_END", 
			"COORD_NUM", "SEP"
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
	public String getGrammarFileName() { return "BlockTexParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BlockTexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BlockTexParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<RenderContext> render() {
			return getRuleContexts(RenderContext.class);
		}
		public RenderContext render(int i) {
			return getRuleContext(RenderContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(BlockTexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BlockTexParser.WS, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(78);
				statement();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RENDER_START) {
				{
				{
				setState(84);
				render();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(90);
				match(WS);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public EquationObjectContext equationObject() {
			return getRuleContext(EquationObjectContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Element_callContext element_call() {
			return getRuleContext(Element_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				{
				setState(98);
				equationObject();
				}
				break;
			case LOOP_START:
				{
				setState(99);
				loop();
				}
				break;
			case SET:
				{
				setState(100);
				element_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RenderContext extends ParserRuleContext {
		public TerminalNode RENDER_START() { return getToken(BlockTexParser.RENDER_START, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_render; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterRender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitRender(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitRender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenderContext render() throws RecognitionException {
		RenderContext _localctx = new RenderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_render);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(RENDER_START);
			setState(104);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquationObjectContext extends ParserRuleContext {
		public FractionObjectContext fractionObject() {
			return getRuleContext(FractionObjectContext.class,0);
		}
		public SummationObjectContext summationObject() {
			return getRuleContext(SummationObjectContext.class,0);
		}
		public DerivativeObjectContext derivativeObject() {
			return getRuleContext(DerivativeObjectContext.class,0);
		}
		public IntegralObjectContext integralObject() {
			return getRuleContext(IntegralObjectContext.class,0);
		}
		public MatrixObjectContext matrixObject() {
			return getRuleContext(MatrixObjectContext.class,0);
		}
		public LatexObjectContext latexObject() {
			return getRuleContext(LatexObjectContext.class,0);
		}
		public EquationObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equationObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterEquationObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitEquationObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitEquationObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationObjectContext equationObject() throws RecognitionException {
		EquationObjectContext _localctx = new EquationObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_equationObject);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				fractionObject();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				summationObject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				derivativeObject();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				integralObject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				matrixObject();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				latexObject();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statementContext extends ParserRuleContext {
		public EquationObjectContext equationObject() {
			return getRuleContext(EquationObjectContext.class,0);
		}
		public Set_loop_elementContext set_loop_element() {
			return getRuleContext(Set_loop_elementContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				{
				setState(114);
				equationObject();
				}
				break;
			case THIS:
				{
				setState(115);
				set_loop_element();
				}
				break;
			case IF:
				{
				setState(116);
				conditional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(BlockTexParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(BlockTexParser.CLOSE_BRACE, 0); }
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OPEN_BRACE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32802L) != 0)) {
				{
				{
				setState(120);
				block_statement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(BlockTexParser.EQUALS, 0); }
		public TerminalNode G_T() { return getToken(BlockTexParser.G_T, 0); }
		public TerminalNode L_T() { return getToken(BlockTexParser.L_T, 0); }
		public TerminalNode GEQ() { return getToken(BlockTexParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(BlockTexParser.LEQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BlockTexParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(BlockTexParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(BlockTexParser.CLOSE_PAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlockTexParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IF);
			setState(131);
			match(OPEN_PAREN);
			setState(132);
			expression();
			setState(133);
			condition();
			setState(134);
			expression();
			setState(135);
			match(CLOSE_PAREN);
			setState(136);
			block();
			setState(137);
			match(ELSE);
			setState(138);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP_START() { return getToken(BlockTexParser.LOOP_START, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LOOP_END() { return getToken(BlockTexParser.LOOP_END, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LOOP_START);
			setState(141);
			name();
			setState(142);
			block();
			setState(143);
			match(LOOP_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LatexObjectContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlockTexParser.CREATE, 0); }
		public TerminalNode LATEX() { return getToken(BlockTexParser.LATEX, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public TerminalNode RAW_LATEX() { return getToken(BlockTexParser.RAW_LATEX, 0); }
		public LatexObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latexObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterLatexObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitLatexObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitLatexObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatexObjectContext latexObject() throws RecognitionException {
		LatexObjectContext _localctx = new LatexObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_latexObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CREATE);
			setState(146);
			match(LATEX);
			setState(147);
			name();
			setState(148);
			match(ASSIGN);
			setState(149);
			match(RAW_LATEX);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixObjectContext extends ParserRuleContext {
		public MatrixNameContext matrixName() {
			return getRuleContext(MatrixNameContext.class,0);
		}
		public Shape_callContext shape_call() {
			return getRuleContext(Shape_callContext.class,0);
		}
		public MatrixObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterMatrixObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitMatrixObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitMatrixObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixObjectContext matrixObject() throws RecognitionException {
		MatrixObjectContext _localctx = new MatrixObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matrixObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			matrixName();
			setState(152);
			shape_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixNameContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlockTexParser.CREATE, 0); }
		public TerminalNode MATRIX() { return getToken(BlockTexParser.MATRIX, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MatrixNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterMatrixName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitMatrixName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitMatrixName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixNameContext matrixName() throws RecognitionException {
		MatrixNameContext _localctx = new MatrixNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matrixName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CREATE);
			setState(155);
			match(MATRIX);
			setState(156);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Shape_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode MATRIX_SHAPE() { return getToken(BlockTexParser.MATRIX_SHAPE, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public Shape_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterShape_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitShape_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitShape_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_callContext shape_call() throws RecognitionException {
		Shape_callContext _localctx = new Shape_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shape_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			set_property();
			setState(159);
			match(MATRIX_SHAPE);
			setState(160);
			match(ASSIGN);
			setState(161);
			coordinate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Element_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode MATRIX_ELEMENT() { return getToken(BlockTexParser.MATRIX_ELEMENT, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(BlockTexParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(BlockTexParser.ASSIGN, i);
		}
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Element_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterElement_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitElement_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitElement_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_callContext element_call() throws RecognitionException {
		Element_callContext _localctx = new Element_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			set_property();
			setState(164);
			match(MATRIX_ELEMENT);
			setState(165);
			match(ASSIGN);
			setState(166);
			coordinate();
			setState(167);
			match(ASSIGN);
			setState(168);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoordinateContext extends ParserRuleContext {
		public TerminalNode COORDINATE_START() { return getToken(BlockTexParser.COORDINATE_START, 0); }
		public List<TerminalNode> COORD_NUM() { return getTokens(BlockTexParser.COORD_NUM); }
		public TerminalNode COORD_NUM(int i) {
			return getToken(BlockTexParser.COORD_NUM, i);
		}
		public TerminalNode SEP() { return getToken(BlockTexParser.SEP, 0); }
		public TerminalNode COORDINATE_END() { return getToken(BlockTexParser.COORDINATE_END, 0); }
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitCoordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(COORDINATE_START);
			setState(171);
			match(COORD_NUM);
			setState(172);
			match(SEP);
			setState(173);
			match(COORD_NUM);
			setState(174);
			match(COORDINATE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FractionObjectContext extends ParserRuleContext {
		public FractionNameContext fractionName() {
			return getRuleContext(FractionNameContext.class,0);
		}
		public Numerator_callContext numerator_call() {
			return getRuleContext(Numerator_callContext.class,0);
		}
		public Denominator_callContext denominator_call() {
			return getRuleContext(Denominator_callContext.class,0);
		}
		public FractionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterFractionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitFractionObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitFractionObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionObjectContext fractionObject() throws RecognitionException {
		FractionObjectContext _localctx = new FractionObjectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fractionObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			fractionName();
			setState(177);
			numerator_call();
			setState(178);
			denominator_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FractionNameContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlockTexParser.CREATE, 0); }
		public TerminalNode FRACTION() { return getToken(BlockTexParser.FRACTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FractionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterFractionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitFractionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitFractionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FractionNameContext fractionName() throws RecognitionException {
		FractionNameContext _localctx = new FractionNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fractionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CREATE);
			setState(181);
			match(FRACTION);
			setState(182);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numerator_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode NUMERATOR() { return getToken(BlockTexParser.NUMERATOR, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Numerator_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerator_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterNumerator_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitNumerator_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitNumerator_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerator_callContext numerator_call() throws RecognitionException {
		Numerator_callContext _localctx = new Numerator_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numerator_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			set_property();
			setState(185);
			match(NUMERATOR);
			setState(186);
			match(ASSIGN);
			setState(187);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Denominator_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode DENOMINATOR() { return getToken(BlockTexParser.DENOMINATOR, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Denominator_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_denominator_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterDenominator_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitDenominator_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitDenominator_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Denominator_callContext denominator_call() throws RecognitionException {
		Denominator_callContext _localctx = new Denominator_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_denominator_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			set_property();
			setState(190);
			match(DENOMINATOR);
			setState(191);
			match(ASSIGN);
			setState(192);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DerivativeObjectContext extends ParserRuleContext {
		public DerivativeNameContext derivativeName() {
			return getRuleContext(DerivativeNameContext.class,0);
		}
		public Type_callContext type_call() {
			return getRuleContext(Type_callContext.class,0);
		}
		public Order_callContext order_call() {
			return getRuleContext(Order_callContext.class,0);
		}
		public TargetVar_callContext targetVar_call() {
			return getRuleContext(TargetVar_callContext.class,0);
		}
		public DerivativeObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivativeObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterDerivativeObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitDerivativeObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitDerivativeObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivativeObjectContext derivativeObject() throws RecognitionException {
		DerivativeObjectContext _localctx = new DerivativeObjectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_derivativeObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			derivativeName();
			setState(195);
			type_call();
			setState(196);
			order_call();
			setState(197);
			targetVar_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DerivativeNameContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlockTexParser.CREATE, 0); }
		public TerminalNode DERIVATIVE() { return getToken(BlockTexParser.DERIVATIVE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DerivativeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivativeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterDerivativeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitDerivativeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitDerivativeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivativeNameContext derivativeName() throws RecognitionException {
		DerivativeNameContext _localctx = new DerivativeNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_derivativeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CREATE);
			setState(200);
			match(DERIVATIVE);
			setState(201);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(BlockTexParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterType_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitType_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitType_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_callContext type_call() throws RecognitionException {
		Type_callContext _localctx = new Type_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			set_property();
			setState(204);
			match(TYPE);
			setState(205);
			match(ASSIGN);
			setState(206);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Order_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(BlockTexParser.ORDER, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Order_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterOrder_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitOrder_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitOrder_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_callContext order_call() throws RecognitionException {
		Order_callContext _localctx = new Order_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_order_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			set_property();
			setState(209);
			match(ORDER);
			setState(210);
			match(ASSIGN);
			setState(211);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TargetVar_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode TARGETVAR() { return getToken(BlockTexParser.TARGETVAR, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TargetVar_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetVar_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterTargetVar_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitTargetVar_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitTargetVar_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetVar_callContext targetVar_call() throws RecognitionException {
		TargetVar_callContext _localctx = new TargetVar_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_targetVar_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			set_property();
			setState(214);
			match(TARGETVAR);
			setState(215);
			match(ASSIGN);
			setState(216);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SummationObjectContext extends ParserRuleContext {
		public SummationNameContext summationName() {
			return getRuleContext(SummationNameContext.class,0);
		}
		public Start_callContext start_call() {
			return getRuleContext(Start_callContext.class,0);
		}
		public End_callContext end_call() {
			return getRuleContext(End_callContext.class,0);
		}
		public Equation_callContext equation_call() {
			return getRuleContext(Equation_callContext.class,0);
		}
		public SummationObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summationObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterSummationObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitSummationObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitSummationObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummationObjectContext summationObject() throws RecognitionException {
		SummationObjectContext _localctx = new SummationObjectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_summationObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			summationName();
			setState(219);
			start_call();
			setState(220);
			end_call();
			setState(221);
			equation_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SummationNameContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlockTexParser.CREATE, 0); }
		public TerminalNode SUMMATION() { return getToken(BlockTexParser.SUMMATION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SummationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterSummationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitSummationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitSummationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummationNameContext summationName() throws RecognitionException {
		SummationNameContext _localctx = new SummationNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_summationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(CREATE);
			setState(224);
			match(SUMMATION);
			setState(225);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegralObjectContext extends ParserRuleContext {
		public IntegralNameContext integralName() {
			return getRuleContext(IntegralNameContext.class,0);
		}
		public Start_callContext start_call() {
			return getRuleContext(Start_callContext.class,0);
		}
		public End_callContext end_call() {
			return getRuleContext(End_callContext.class,0);
		}
		public Equation_callContext equation_call() {
			return getRuleContext(Equation_callContext.class,0);
		}
		public IntegralObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterIntegralObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitIntegralObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitIntegralObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralObjectContext integralObject() throws RecognitionException {
		IntegralObjectContext _localctx = new IntegralObjectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_integralObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			integralName();
			setState(228);
			start_call();
			setState(229);
			end_call();
			setState(230);
			equation_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegralNameContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlockTexParser.CREATE, 0); }
		public TerminalNode INTEGRAL() { return getToken(BlockTexParser.INTEGRAL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IntegralNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterIntegralName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitIntegralName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitIntegralName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralNameContext integralName() throws RecognitionException {
		IntegralNameContext _localctx = new IntegralNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integralName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CREATE);
			setState(233);
			match(INTEGRAL);
			setState(234);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Start_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode START() { return getToken(BlockTexParser.START, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Start_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterStart_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitStart_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitStart_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_callContext start_call() throws RecognitionException {
		Start_callContext _localctx = new Start_callContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_start_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			set_property();
			setState(237);
			match(START);
			setState(238);
			match(ASSIGN);
			setState(239);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode END() { return getToken(BlockTexParser.END, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public End_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterEnd_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitEnd_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitEnd_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_callContext end_call() throws RecognitionException {
		End_callContext _localctx = new End_callContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_end_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			set_property();
			setState(242);
			match(END);
			setState(243);
			match(ASSIGN);
			setState(244);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equation_callContext extends ParserRuleContext {
		public Set_propertyContext set_property() {
			return getRuleContext(Set_propertyContext.class,0);
		}
		public TerminalNode EQUATION() { return getToken(BlockTexParser.EQUATION, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Equation_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterEquation_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitEquation_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitEquation_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equation_callContext equation_call() throws RecognitionException {
		Equation_callContext _localctx = new Equation_callContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equation_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			set_property();
			setState(247);
			match(EQUATION);
			setState(248);
			match(ASSIGN);
			setState(249);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_propertyContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(BlockTexParser.SET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BlockTexParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(BlockTexParser.DOT, 0); }
		public Set_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterSet_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitSet_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitSet_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_propertyContext set_property() throws RecognitionException {
		Set_propertyContext _localctx = new Set_propertyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_set_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SET);
			setState(252);
			match(IDENTIFIER);
			setState(253);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Set_loop_elementContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(BlockTexParser.THIS, 0); }
		public TerminalNode ASSIGN() { return getToken(BlockTexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_loop_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_loop_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterSet_loop_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitSet_loop_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitSet_loop_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_loop_elementContext set_loop_element() throws RecognitionException {
		Set_loop_elementContext _localctx = new Set_loop_elementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_set_loop_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(THIS);
			setState(256);
			match(ASSIGN);
			setState(257);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BlockTexParser.IDENTIFIER, 0); }
		public TerminalNode A_IDENTIFIER() { return getToken(BlockTexParser.A_IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==A_IDENTIFIER || _la==IDENTIFIER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode A_NUM() { return getToken(BlockTexParser.A_NUM, 0); }
		public TerminalNode CONST() { return getToken(BlockTexParser.CONST, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==A_NUM) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			term();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) {
				{
				setState(264);
				operation();
				setState(265);
				term();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public RowColContext rowCol() {
			return getRuleContext(RowColContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(269);
				name();
				}
				break;
			case CONST:
			case A_NUM:
				{
				setState(270);
				number();
				}
				break;
			case ROW:
			case COL:
				{
				setState(271);
				rowCol();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowColContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(BlockTexParser.ROW, 0); }
		public TerminalNode COL() { return getToken(BlockTexParser.COL, 0); }
		public RowColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterRowCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitRowCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitRowCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowColContext rowCol() throws RecognitionException {
		RowColContext _localctx = new RowColContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rowCol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==COL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(BlockTexParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(BlockTexParser.SUBTRACT, 0); }
		public TerminalNode MULTIPLY() { return getToken(BlockTexParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(BlockTexParser.DIVIDE, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlockTexParserListener ) ((BlockTexParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlockTexParserVisitor ) return ((BlockTexParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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
		"\u0004\u00017\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0005\u0000V\b\u0000\n"+
		"\u0000\f\u0000Y\t\u0000\u0001\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000"+
		"_\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005z\b\u0005\n\u0005\f\u0005}\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u010c\b#\u0001$\u0001$\u0001$\u0003$\u0111\b$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJL\u0000\u0005\u0001\u0000\u0011\u0015\u0002\u0000\u001e\u001e"+
		"44\u0001\u0000\u001c\u001d\u0001\u0000\u001a\u001b\u0001\u0000\n\r\u00ff"+
		"\u0000Q\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004g"+
		"\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\bu\u0001\u0000"+
		"\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000"+
		"\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000"+
		"\u0012\u0091\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000"+
		"\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000"+
		"\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000"+
		"\u001e\u00b0\u0001\u0000\u0000\u0000 \u00b4\u0001\u0000\u0000\u0000\""+
		"\u00b8\u0001\u0000\u0000\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00c2\u0001"+
		"\u0000\u0000\u0000(\u00c7\u0001\u0000\u0000\u0000*\u00cb\u0001\u0000\u0000"+
		"\u0000,\u00d0\u0001\u0000\u0000\u0000.\u00d5\u0001\u0000\u0000\u00000"+
		"\u00da\u0001\u0000\u0000\u00002\u00df\u0001\u0000\u0000\u00004\u00e3\u0001"+
		"\u0000\u0000\u00006\u00e8\u0001\u0000\u0000\u00008\u00ec\u0001\u0000\u0000"+
		"\u0000:\u00f1\u0001\u0000\u0000\u0000<\u00f6\u0001\u0000\u0000\u0000>"+
		"\u00fb\u0001\u0000\u0000\u0000@\u00ff\u0001\u0000\u0000\u0000B\u0103\u0001"+
		"\u0000\u0000\u0000D\u0105\u0001\u0000\u0000\u0000F\u0107\u0001\u0000\u0000"+
		"\u0000H\u0110\u0001\u0000\u0000\u0000J\u0112\u0001\u0000\u0000\u0000L"+
		"\u0114\u0001\u0000\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RW\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TV\u0003\u0004\u0002\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X]\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0005\u000e\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000bf\u0003"+
		"\u0006\u0003\u0000cf\u0003\u0010\b\u0000df\u0003\u001a\r\u0000eb\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"f\u0003\u0001\u0000\u0000\u0000gh\u0005\u0004\u0000\u0000hi\u0003B!\u0000"+
		"i\u0005\u0001\u0000\u0000\u0000jq\u0003\u001e\u000f\u0000kq\u00030\u0018"+
		"\u0000lq\u0003&\u0013\u0000mq\u00034\u001a\u0000nq\u0003\u0014\n\u0000"+
		"oq\u0003\u0012\t\u0000pj\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000"+
		"pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rv\u0003"+
		"\u0006\u0003\u0000sv\u0003@ \u0000tv\u0003\u000e\u0007\u0000ur\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\t\u0001"+
		"\u0000\u0000\u0000w{\u0005\u0018\u0000\u0000xz\u0003\b\u0004\u0000yx\u0001"+
		"\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0019\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0007\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u000f\u0000\u0000\u0083\u0084\u0005\u0016\u0000\u0000\u0084"+
		"\u0085\u0003F#\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0087\u0003"+
		"F#\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088\u0089\u0003\n\u0005"+
		"\u0000\u0089\u008a\u0005\u0010\u0000\u0000\u008a\u008b\u0003\n\u0005\u0000"+
		"\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000"+
		"\u008d\u008e\u0003B!\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090"+
		"\u0005\t\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u0001\u0000\u0000\u0092\u0093\u0005#\u0000\u0000\u0093\u0094\u0003B!"+
		"\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095\u0096\u0005\"\u0000\u0000"+
		"\u0096\u0013\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0016\u000b\u0000"+
		"\u0098\u0099\u0003\u0018\f\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0001\u0000\u0000\u009b\u009c\u0005(\u0000\u0000\u009c\u009d"+
		"\u0003B!\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0003>"+
		"\u001f\u0000\u009f\u00a0\u00052\u0000\u0000\u00a0\u00a1\u0005\u0006\u0000"+
		"\u0000\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2\u0019\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0003>\u001f\u0000\u00a4\u00a5\u00053\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0006\u0000\u0000\u00a6\u00a7\u0003\u001c\u000e\u0000\u00a7"+
		"\u00a8\u0005\u0006\u0000\u0000\u00a8\u00a9\u0003F#\u0000\u00a9\u001b\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab\u00ac\u00056\u0000"+
		"\u0000\u00ac\u00ad\u00057\u0000\u0000\u00ad\u00ae\u00056\u0000\u0000\u00ae"+
		"\u00af\u00055\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0003 \u0010\u0000\u00b1\u00b2\u0003\"\u0011\u0000\u00b2\u00b3\u0003"+
		"$\u0012\u0000\u00b3\u001f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0001"+
		"\u0000\u0000\u00b5\u00b6\u0005$\u0000\u0000\u00b6\u00b7\u0003B!\u0000"+
		"\u00b7!\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003>\u001f\u0000\u00b9\u00ba"+
		"\u0005)\u0000\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0003"+
		"F#\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0003>\u001f\u0000"+
		"\u00be\u00bf\u0005*\u0000\u0000\u00bf\u00c0\u0005\u0006\u0000\u0000\u00c0"+
		"\u00c1\u0003F#\u0000\u00c1%\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003"+
		"(\u0014\u0000\u00c3\u00c4\u0003*\u0015\u0000\u00c4\u00c5\u0003,\u0016"+
		"\u0000\u00c5\u00c6\u0003.\u0017\u0000\u00c6\'\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00c9\u0005\'\u0000\u0000\u00c9"+
		"\u00ca\u0003B!\u0000\u00ca)\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003"+
		">\u001f\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd\u00ce\u0005\u0006\u0000"+
		"\u0000\u00ce\u00cf\u0003F#\u0000\u00cf+\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003>\u001f\u0000\u00d1\u00d2\u00050\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0006\u0000\u0000\u00d3\u00d4\u0003F#\u0000\u00d4-\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0003>\u001f\u0000\u00d6\u00d7\u00051\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9\u0003F#\u0000\u00d9/\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u00032\u0019\u0000\u00db\u00dc\u00038\u001c"+
		"\u0000\u00dc\u00dd\u0003:\u001d\u0000\u00dd\u00de\u0003<\u001e\u0000\u00de"+
		"1\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0001\u0000\u0000\u00e0\u00e1"+
		"\u0005&\u0000\u0000\u00e1\u00e2\u0003B!\u0000\u00e23\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u00036\u001b\u0000\u00e4\u00e5\u00038\u001c\u0000\u00e5"+
		"\u00e6\u0003:\u001d\u0000\u00e6\u00e7\u0003<\u001e\u0000\u00e75\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u0001\u0000\u0000\u00e9\u00ea\u0005"+
		"%\u0000\u0000\u00ea\u00eb\u0003B!\u0000\u00eb7\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0003>\u001f\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0006\u0000\u0000\u00ef\u00f0\u0003F#\u0000\u00f09\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0003>\u001f\u0000\u00f2\u00f3\u0005,\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0006\u0000\u0000\u00f4\u00f5\u0003F#\u0000\u00f5;"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003>\u001f\u0000\u00f7\u00f8\u0005"+
		"-\u0000\u0000\u00f8\u00f9\u0005\u0006\u0000\u0000\u00f9\u00fa\u0003F#"+
		"\u0000\u00fa=\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0002\u0000\u0000"+
		"\u00fc\u00fd\u00054\u0000\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe"+
		"?\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0005\u0000\u0000\u0100\u0101"+
		"\u0005\u0006\u0000\u0000\u0101\u0102\u0003F#\u0000\u0102A\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0007\u0001\u0000\u0000\u0104C\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0007\u0002\u0000\u0000\u0106E\u0001\u0000\u0000\u0000"+
		"\u0107\u010b\u0003H$\u0000\u0108\u0109\u0003L&\u0000\u0109\u010a\u0003"+
		"H$\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010cG\u0001\u0000\u0000\u0000"+
		"\u010d\u0111\u0003B!\u0000\u010e\u0111\u0003D\"\u0000\u010f\u0111\u0003"+
		"J%\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111I\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0007\u0003\u0000\u0000\u0113K\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0007\u0004\u0000\u0000\u0115M\u0001\u0000\u0000\u0000\tQW]epu"+
		"{\u010b\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}