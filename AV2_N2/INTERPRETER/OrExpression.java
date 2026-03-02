package INTERPRETER;

// também é não terminal ( vai combinar com as outras usando o operador OR)
public class OrExpression implements Expression {

    private Expression left;
    private Expression right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // aqui é a verificação
    @Override
    public boolean interpret(FileData file) {
        return left.interpret(file) || right.interpret(file);
    }
}
