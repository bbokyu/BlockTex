package ast;
import visitor.BlockTexVisitor;

public class IntegralObject extends EquationObject {
    private final Name name;
    private final Expression equation;
    private final Expression start;
    private final Expression end;

    public IntegralObject(Name name, Expression start, Expression end, Expression equation) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.equation = equation;
    }

    public Name getName() {
        return this.name;
    }

    public Expression getStart() {
        return this.start;
    }

    public Expression getEnd() {
        return this.end;
    }

    public Expression getEquation() {
        return this.equation;
    }

    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return v.visit(this, t);
    }

}