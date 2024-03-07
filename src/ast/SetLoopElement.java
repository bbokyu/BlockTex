package ast;

import visitor.BlockTexVisitor;

public class SetLoopElement extends BlockStatement{

    private final Expression expression;

    public SetLoopElement(Expression ex) {
        this.expression = ex;
    }


    public Expression getExpression() {
        return expression;
    }


    public <T, U> U accept(BlockTexVisitor<T, U> v, T t, int i, int j, MatrixObject m) {
        return v.visit(this, t, i, j, m);
    }
}
