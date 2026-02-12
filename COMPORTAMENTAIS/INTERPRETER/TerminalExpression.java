package COMPORTAMENTAIS.INTERPRETER;

public class TerminalExpression implements IExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("Terminal for " + context.getName());
    }
}
