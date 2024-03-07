package ast;
import visitor.BlockTexVisitor;

public abstract class Node {
    abstract public <T, U> U accept(BlockTexVisitor<T, U> v, T t);
}
