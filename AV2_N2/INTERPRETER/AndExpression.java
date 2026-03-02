package INTERPRETER;

// é não terminal ( vai combinar com as outras usando o operador AND) 
public class AndExpression implements Expression {

    private Expression left;
    private Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // aqui é a verificação
    @Override
    public boolean interpret(FileData file) {
        return left.interpret(file) && right.interpret(file);
    }
}
