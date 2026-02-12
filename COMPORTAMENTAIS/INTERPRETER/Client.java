package COMPORTAMENTAIS.INTERPRETER;

public class Client {

    public void buildAndInterpretCommands() {

        Context context = new Context("Java context");

        NonterminalExpression root = new NonterminalExpression(
                new TerminalExpression(),
                new TerminalExpression()
        );

        root.interpret(context);
    }
}
