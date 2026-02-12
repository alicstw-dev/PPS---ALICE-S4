package COMPORTAMENTAIS.INTERPRETER;

public class NonterminalExpression implements IExpression {

    private IExpression expression1;
    private IExpression expression2;

    public NonterminalExpression(IExpression expression1, IExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public void interpret(Context context) {
        System.out.println("Nonterminal for " + context.getName());
        expression1.interpret(context);
        expression2.interpret(context);
    }
}
