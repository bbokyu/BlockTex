package ast;

import visitor.BlockTexVisitor;

public class BlockStatement extends Statement {


    public <T, U> U accept(BlockTexVisitor<T, U> v, T t, int i, int j, MatrixObject mo) {
        return v.visit(this, t, i, j, mo);
    }

    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return v.visit(this, t);
    }
}
