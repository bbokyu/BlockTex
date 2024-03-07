// Generated from /Users/bbokyu/Documents/Courses/Cpsc410/410Project/src/parser/BlockTexParser.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BlockTexParser}.
 */
public interface BlockTexParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BlockTexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BlockTexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BlockTexParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BlockTexParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#render}.
	 * @param ctx the parse tree
	 */
	void enterRender(BlockTexParser.RenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#render}.
	 * @param ctx the parse tree
	 */
	void exitRender(BlockTexParser.RenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#equationObject}.
	 * @param ctx the parse tree
	 */
	void enterEquationObject(BlockTexParser.EquationObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#equationObject}.
	 * @param ctx the parse tree
	 */
	void exitEquationObject(BlockTexParser.EquationObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(BlockTexParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(BlockTexParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BlockTexParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BlockTexParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BlockTexParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BlockTexParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(BlockTexParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(BlockTexParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BlockTexParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BlockTexParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#latexObject}.
	 * @param ctx the parse tree
	 */
	void enterLatexObject(BlockTexParser.LatexObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#latexObject}.
	 * @param ctx the parse tree
	 */
	void exitLatexObject(BlockTexParser.LatexObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#matrixObject}.
	 * @param ctx the parse tree
	 */
	void enterMatrixObject(BlockTexParser.MatrixObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#matrixObject}.
	 * @param ctx the parse tree
	 */
	void exitMatrixObject(BlockTexParser.MatrixObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#matrixName}.
	 * @param ctx the parse tree
	 */
	void enterMatrixName(BlockTexParser.MatrixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#matrixName}.
	 * @param ctx the parse tree
	 */
	void exitMatrixName(BlockTexParser.MatrixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#shape_call}.
	 * @param ctx the parse tree
	 */
	void enterShape_call(BlockTexParser.Shape_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#shape_call}.
	 * @param ctx the parse tree
	 */
	void exitShape_call(BlockTexParser.Shape_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#element_call}.
	 * @param ctx the parse tree
	 */
	void enterElement_call(BlockTexParser.Element_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#element_call}.
	 * @param ctx the parse tree
	 */
	void exitElement_call(BlockTexParser.Element_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate(BlockTexParser.CoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate(BlockTexParser.CoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#fractionObject}.
	 * @param ctx the parse tree
	 */
	void enterFractionObject(BlockTexParser.FractionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#fractionObject}.
	 * @param ctx the parse tree
	 */
	void exitFractionObject(BlockTexParser.FractionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#fractionName}.
	 * @param ctx the parse tree
	 */
	void enterFractionName(BlockTexParser.FractionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#fractionName}.
	 * @param ctx the parse tree
	 */
	void exitFractionName(BlockTexParser.FractionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#numerator_call}.
	 * @param ctx the parse tree
	 */
	void enterNumerator_call(BlockTexParser.Numerator_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#numerator_call}.
	 * @param ctx the parse tree
	 */
	void exitNumerator_call(BlockTexParser.Numerator_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#denominator_call}.
	 * @param ctx the parse tree
	 */
	void enterDenominator_call(BlockTexParser.Denominator_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#denominator_call}.
	 * @param ctx the parse tree
	 */
	void exitDenominator_call(BlockTexParser.Denominator_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#derivativeObject}.
	 * @param ctx the parse tree
	 */
	void enterDerivativeObject(BlockTexParser.DerivativeObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#derivativeObject}.
	 * @param ctx the parse tree
	 */
	void exitDerivativeObject(BlockTexParser.DerivativeObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#derivativeName}.
	 * @param ctx the parse tree
	 */
	void enterDerivativeName(BlockTexParser.DerivativeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#derivativeName}.
	 * @param ctx the parse tree
	 */
	void exitDerivativeName(BlockTexParser.DerivativeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#type_call}.
	 * @param ctx the parse tree
	 */
	void enterType_call(BlockTexParser.Type_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#type_call}.
	 * @param ctx the parse tree
	 */
	void exitType_call(BlockTexParser.Type_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#order_call}.
	 * @param ctx the parse tree
	 */
	void enterOrder_call(BlockTexParser.Order_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#order_call}.
	 * @param ctx the parse tree
	 */
	void exitOrder_call(BlockTexParser.Order_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#targetVar_call}.
	 * @param ctx the parse tree
	 */
	void enterTargetVar_call(BlockTexParser.TargetVar_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#targetVar_call}.
	 * @param ctx the parse tree
	 */
	void exitTargetVar_call(BlockTexParser.TargetVar_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#summationObject}.
	 * @param ctx the parse tree
	 */
	void enterSummationObject(BlockTexParser.SummationObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#summationObject}.
	 * @param ctx the parse tree
	 */
	void exitSummationObject(BlockTexParser.SummationObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#summationName}.
	 * @param ctx the parse tree
	 */
	void enterSummationName(BlockTexParser.SummationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#summationName}.
	 * @param ctx the parse tree
	 */
	void exitSummationName(BlockTexParser.SummationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#integralObject}.
	 * @param ctx the parse tree
	 */
	void enterIntegralObject(BlockTexParser.IntegralObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#integralObject}.
	 * @param ctx the parse tree
	 */
	void exitIntegralObject(BlockTexParser.IntegralObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#integralName}.
	 * @param ctx the parse tree
	 */
	void enterIntegralName(BlockTexParser.IntegralNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#integralName}.
	 * @param ctx the parse tree
	 */
	void exitIntegralName(BlockTexParser.IntegralNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#start_call}.
	 * @param ctx the parse tree
	 */
	void enterStart_call(BlockTexParser.Start_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#start_call}.
	 * @param ctx the parse tree
	 */
	void exitStart_call(BlockTexParser.Start_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#end_call}.
	 * @param ctx the parse tree
	 */
	void enterEnd_call(BlockTexParser.End_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#end_call}.
	 * @param ctx the parse tree
	 */
	void exitEnd_call(BlockTexParser.End_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#equation_call}.
	 * @param ctx the parse tree
	 */
	void enterEquation_call(BlockTexParser.Equation_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#equation_call}.
	 * @param ctx the parse tree
	 */
	void exitEquation_call(BlockTexParser.Equation_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#set_property}.
	 * @param ctx the parse tree
	 */
	void enterSet_property(BlockTexParser.Set_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#set_property}.
	 * @param ctx the parse tree
	 */
	void exitSet_property(BlockTexParser.Set_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#set_loop_element}.
	 * @param ctx the parse tree
	 */
	void enterSet_loop_element(BlockTexParser.Set_loop_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#set_loop_element}.
	 * @param ctx the parse tree
	 */
	void exitSet_loop_element(BlockTexParser.Set_loop_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(BlockTexParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(BlockTexParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BlockTexParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BlockTexParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BlockTexParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BlockTexParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BlockTexParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BlockTexParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#rowCol}.
	 * @param ctx the parse tree
	 */
	void enterRowCol(BlockTexParser.RowColContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#rowCol}.
	 * @param ctx the parse tree
	 */
	void exitRowCol(BlockTexParser.RowColContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlockTexParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(BlockTexParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlockTexParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(BlockTexParser.OperationContext ctx);
}