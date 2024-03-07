package ast;
import visitor.BlockTexVisitor;

public class Number extends Expression {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // @Override
    public String toString() {
        return String.valueOf(getValue());
    }

    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return v.visit(this, t);
    }

    @Override
    public Number copy() {
        return new Number(this.value);
    }
}