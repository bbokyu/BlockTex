package ast;

import visitor.BlockTexVisitor;

public class Statement extends Node {


    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return v.visit(this, t);
    }
}
