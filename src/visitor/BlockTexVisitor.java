package visitor;
import ast.*;
import ast.Number;

public interface BlockTexVisitor<T,U> {

    U visit(Program p, T t);

    U visit(Statement s, T t);

    U visit (EquationObject eo, T t);

    U visit (FractionObject fo, T t);

    U visit (SummationObject so, T t);

    U visit (DerivativeObject deo, T t);

    U visit (IntegralObject io, T t);

    U visit(Name na, T t);

    U visit(Number nu, T t);

    U visit(Expression ex, T t);

    U visit(ArithmeticExpression ae, T t);

    U visit(Coordinate co, T t);

    U visit(UpdateMatrixElement um, T t);

    U visit(MatrixObject mo, T t);

    U visit(LatexObject lo, T t);

    U visit(Block block, T t, int row, int col, MatrixObject matrix);

    U visit(BlockStatement bs, T t, int row, int col, MatrixObject mo);

    U visit(Loop loop, T t);

    U visit(SetLoopElement sle, T t, int i, int j, MatrixObject mo);

    U visit(Condition c, T t, int i, int j, MatrixObject mo);

    U visit(Conditional  cl, T t, int i, int j, MatrixObject mo);



}
