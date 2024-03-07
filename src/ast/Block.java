package ast;

import visitor.BlockTexVisitor;

import java.util.List;

public class Block extends Node {

    private final List<BlockStatement> block_statements;

    public Block(List<BlockStatement> block_statements) {
        this.block_statements = block_statements;
    }

    public List<BlockStatement> getBlock_statements() {
        return block_statements;
    }

    public <T, U> U accept(BlockTexVisitor<T, U> v, T t, int i, int j, MatrixObject matrix) {
        return v.visit(this, t, i , j, matrix);
    }

    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return null;
    }
}
