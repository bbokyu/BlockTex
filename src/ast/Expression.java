package ast;

import visitor.BlockTexVisitor;

public abstract class Expression extends Node{
    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return v.visit(this, t);
    }

    public abstract Expression copy();
}
