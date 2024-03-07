// Generated from /Users/bbokyu/Desktop/BlockTex/src/parser/BlockTexParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BlockTexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BlockTexParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BlockTexParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BlockTexParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#render}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRender(BlockTexParser.RenderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#equationObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationObject(BlockTexParser.EquationObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(BlockTexParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BlockTexParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(BlockTexParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(BlockTexParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BlockTexParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#latexObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatexObject(BlockTexParser.LatexObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#matrixObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixObject(BlockTexParser.MatrixObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#matrixName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixName(BlockTexParser.MatrixNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#shape_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_call(BlockTexParser.Shape_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#element_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_call(BlockTexParser.Element_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(BlockTexParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#fractionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractionObject(BlockTexParser.FractionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#fractionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFractionName(BlockTexParser.FractionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#numerator_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerator_call(BlockTexParser.Numerator_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#denominator_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDenominator_call(BlockTexParser.Denominator_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#derivativeObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivativeObject(BlockTexParser.DerivativeObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#derivativeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivativeName(BlockTexParser.DerivativeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#type_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_call(BlockTexParser.Type_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#order_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_call(BlockTexParser.Order_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#targetVar_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetVar_call(BlockTexParser.TargetVar_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#summationObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummationObject(BlockTexParser.SummationObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#summationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummationName(BlockTexParser.SummationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#integralObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralObject(BlockTexParser.IntegralObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#integralName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralName(BlockTexParser.IntegralNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#start_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_call(BlockTexParser.Start_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#end_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_call(BlockTexParser.End_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#equation_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation_call(BlockTexParser.Equation_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#set_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_property(BlockTexParser.Set_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#set_loop_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_loop_element(BlockTexParser.Set_loop_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(BlockTexParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BlockTexParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BlockTexParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BlockTexParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#rowCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowCol(BlockTexParser.RowColContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlockTexParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(BlockTexParser.OperationContext ctx);
}