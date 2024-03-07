package ast;
import visitor.BlockTexVisitor;

public abstract class EquationObject extends BlockStatement {
    @Override
    public <T, U> U accept(BlockTexVisitor<T, U> v, T t) {
        return v.visit(this, t);
    }

//    public abstract int getValue();

}
