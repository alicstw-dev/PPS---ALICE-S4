package BUILDER;

public class DemoBuilder {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();

        CasaSimplesBuilder builderSimples = new CasaSimplesBuilder();
        engenheiro.construirCasaSimples(builderSimples);
        Casa casa1 = builderSimples.getResultado();
        System.out.println(casa1);
    }
}
