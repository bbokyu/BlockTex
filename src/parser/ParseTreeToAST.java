package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ParseTreeToAST extends BlockTexParserBaseVisitor<Node> {

    @Override
    public Node visitProgram(BlockTexParser.ProgramContext ctx) {
        // program : statement* render*  WS* EOF;

        // Convert Statements
        List<Statement> statements = new ArrayList<>();
        for (BlockTexParser.StatementContext st : ctx.statement()) {
            statements.add((Statement) st.accept(this));
        }

        // Convert RenderObjects
        List<Name> renderObjects = new ArrayList<>();
        for (BlockTexParser.RenderContext ROCtx : ctx.render()) {
            renderObjects.add((Name) ROCtx.accept(this));;
        }

        return new Program(statements, renderObjects);
    }



    @Override
    public Node visitStatement(BlockTexParser.StatementContext ctx) {
        // statement : (equationObject | loop);
        return ctx.children.get(0).accept(this);
    }

    public Node visitLatexObject(BlockTexParser.LatexObjectContext ctx) {
        // CREATE LATEX name ASSIGN RAW_LATEX;
        String rawLatex = ctx.RAW_LATEX().getText();
        String result = ctx.RAW_LATEX().getText().substring(1, rawLatex.length() - 1);

        Name name = (Name) ctx.name().accept(this);
        return new LatexObject(name, result);
    }

    public Node visitLoop(BlockTexParser.LoopContext ctx) {
        Name loopName = (Name) ctx.name().accept(this);

        Block block = (Block) ctx.block().accept(this);
        return new Loop(loopName, block);
    }

    public Node visitBlock(BlockTexParser.BlockContext ctx) {
        List<BlockStatement> result = new ArrayList<>();
        for (BlockTexParser.Block_statementContext blockStatementContext : ctx.block_statement()) {
            result.add((BlockStatement) blockStatementContext.accept(this));
        }

        return new Block(result);
    }

    public Node visitBlock_statement(BlockTexParser.Block_statementContext ctx) {
        return ctx.children.get(0).accept(this);
    }

    public Conditional visitConditional(BlockTexParser.ConditionalContext ctx) {
        // conditional : IF OPEN_PAREN (CONST| ROW | COL) condition (CONST| ROW | COL) CLOSE_PAREN block ELSE block;
        Expression left = (Expression) ctx.expression(0).accept(this);
        Expression right = (Expression) ctx.expression(1).accept(this);
        String comparison = ctx.condition().getText();

        Condition cond = new Condition(left, right, comparison);

        Block ifBlock = (Block) ctx.block(0).accept(this);
        Block elseBlock = (Block) ctx.block(1).accept(this);

        return new Conditional(cond, ifBlock, elseBlock);
    }


    public Node visitSet_loop_element(BlockTexParser.Set_loop_elementContext ctx) {
        // set_loop_element: THIS ASSIGN expression;
        return new SetLoopElement((Expression) ctx.expression().accept(this));
    }


    public Node visitElement_call(BlockTexParser.Element_callContext ctx) {
        // element_call : set_property MATRIX_ELEMENT ASSIGN coordinate ASSIGN expression;
        Name matrixName = (Name) ctx.set_property().accept(this);
        Coordinate coordinate = (Coordinate) ctx.coordinate().accept(this);
        Expression expression = (Expression) ctx.expression().accept(this);
        return new UpdateMatrixElement(matrixName, coordinate, expression);
    }

    public Node visitSet_property(BlockTexParser.Set_propertyContext ctx) {
        return new Name(ctx.children.get(1).getText());
    }


    public Node visitMatrixObject(BlockTexParser.MatrixObjectContext ctx) {
        int lastMatName = ctx.matrixName().children.size() - 1;
        Name matrixName = (Name) ctx.matrixName().children.get(lastMatName).accept(this);

        Coordinate coordinate = (Coordinate) ctx.shape_call().accept(this);

        return new MatrixObject(matrixName, coordinate.getRow(), coordinate.getCol());
    }

    public Node visitShape_call(BlockTexParser.Shape_callContext ctx) {
        return ctx.coordinate().accept(this);
    }

    public Node visitCoordinate(BlockTexParser.CoordinateContext ctx) {
        int row = Integer.parseInt(ctx.COORD_NUM().get(0).getText());
        int lastCol = ctx.COORD_NUM().size() - 1;
        int col = Integer.parseInt(ctx.COORD_NUM().get(lastCol).getText());

        return new Coordinate(row, col);
    }


    @Override
    public Node visitFractionObject(BlockTexParser.FractionObjectContext ctx) {
//        fractionObject : fractionName numerator_call denominator_call;

        // Parse fractionName
        // Get last child
        int lastFracPos = ctx.fractionName().children.size() - 1;
        Name fractionName = (Name) ctx.fractionName().children.get(lastFracPos).accept(this);

        // Parse numerator_call
        int lastNumePos = ctx.numerator_call().children.size() - 1;
        Expression numerator = (Expression) ctx.numerator_call().children.get(lastNumePos).accept(this);

        // Parse denominator_call
        int lastDenomPos = ctx.denominator_call().children.size() - 1;
        Expression denominator = (Expression) ctx.denominator_call().children.get(lastDenomPos).accept(this);

        return new FractionObject(fractionName, numerator, denominator);
    }

    @Override
    public Node visitSummationObject(BlockTexParser.SummationObjectContext ctx) {
        int lastSumPos = ctx.summationName().children.size() - 1;
        Name summationName = (Name) ctx.summationName().children.get(lastSumPos).accept(this);

        int lastStartPos = ctx.start_call().children.size() - 1;
        Expression startCall = (Expression) ctx.start_call().children.get(lastStartPos).accept(this);

        int lastEndPos = ctx.end_call().children.size() - 1;
        Expression endCall = (Expression) ctx.end_call().children.get(lastEndPos).accept(this);

        int lastEquPos = ctx.equation_call().children.size() - 1;
        Expression equCall = (Expression) ctx.equation_call().children.get(lastEquPos).accept(this);

        return new SummationObject(summationName, startCall, endCall, equCall);
    }

    @Override
    public Node visitIntegralObject(BlockTexParser.IntegralObjectContext ctx) {
        int lastSumPos = ctx.integralName().children.size() - 1;
        Name summationName = (Name) ctx.integralName().children.get(lastSumPos).accept(this);
        System.out.println("integral Name:" + summationName);

        int lastStarPos = ctx.start_call().children.size() - 1;
        Expression startCall = (Expression) ctx.start_call().children.get(lastStarPos).accept(this);
        System.out.println("integral startCall:" + startCall);

        int lastEndPos = ctx.end_call().children.size() - 1;
        Expression endCall = (Expression) ctx.end_call().children.get(lastEndPos).accept(this);
        System.out.println("integral endCall:" + endCall);

        int lastEquPos = ctx.equation_call().children.size() - 1;
        Expression equCall = (Expression) ctx.equation_call().children.get(lastEquPos).accept(this);
        System.out.println("integral equCall:" + equCall);

        return new IntegralObject(summationName, startCall, endCall, equCall);
    }

    // TODO see if we need visitStart_call, visitEnd_call, visitEquation_Call or just use visitExpression
    public Node visitStart_call(BlockTexParser.Start_callContext ctx) {
        return (Expression) ctx.expression().accept(this);
    }

    // TODO FIX THIS. issue i think is only accepting int rn or Expression?
    public Node visitEnd_call(BlockTexParser.End_callContext ctx) {
        return (Expression) ctx.expression().accept(this);
    }

    // TODO FIX THIS. issue is only accepting the int in equation rn?
    public Node visitEquation_Call(BlockTexParser.Equation_callContext ctx) {
        return (Expression) ctx.expression().accept(this);
    }

    @Override
    public Node visitDerivativeObject(BlockTexParser.DerivativeObjectContext ctx) {
        int lastDerivPos = ctx.derivativeName().children.size() - 1;
        Name derivName = (Name) ctx.derivativeName().children.get(lastDerivPos).accept(this);
        // System.out.println("derivativeName:" + derivName);

        int lastEndPos = ctx.type_call().children.size() - 1;
        Expression typeCall = (Expression) ctx.type_call().children.get(lastEndPos).accept(this);
        // System.out.println("derivative type:" + typeCall);

        int lastOrderPos = ctx.order_call().children.size() - 1;
        Expression orderCall = (Expression) ctx.order_call().children.get(lastOrderPos).accept(this);
        // System.out.println("derivative orderCall:" + orderCall);

        int lastTargVarPos = ctx.targetVar_call().children.size() - 1;
        // System.out.println("derivative tarVarCall size:" + ctx.targetVar_call().children.size());
        Expression tarVarCall = (Expression) ctx.targetVar_call().children.get(lastTargVarPos).accept(this);
        // System.out.println("derivative tarVarCall:" + tarVarCall);

        return new DerivativeObject(derivName, typeCall, orderCall, tarVarCall);
    }

    public Node visitName(BlockTexParser.NameContext ctx) {
        return new Name(ctx.children.get(0).getText());
    }

    public Node visitNumber(BlockTexParser.NumberContext ctx) {
        return new ast.Number(Integer.parseInt( ctx.children.get(0).getText()));
    }

    public Node visitRowCol(BlockTexParser.RowColContext ctx) {
        return new RowCol(ctx.getText());
    }

    public Node visitExpression(BlockTexParser.ExpressionContext ctx) {
        if (ctx.operation() != null) {
            // Create ArithmeticOperation
            Expression firstTerm = (Expression) ctx.term(0).accept(this);
            Expression secondTerm = (Expression) ctx.term(1).accept(this);
            String operation = ctx.operation().getText();
            return new ArithmeticExpression(firstTerm, secondTerm, operation);
        } else {
            // It's not arithmetic, go to visitNumber or visitName or visitRowCol
            return ctx.term().get(0).accept(this);
        }

    }

    @Override
    public Node visitRender(BlockTexParser.RenderContext ctx) {
        // render : RENDER_START name;
        return (Name) ctx.name().accept(this);
    }











}
