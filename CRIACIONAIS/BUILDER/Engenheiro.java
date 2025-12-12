package BUILDER;

public class Engenheiro {
    public void construirCasaSimples(CasaBuilder builder){
        builder.construirQuartos(2)
                .construirPiscina(false)
                .definirPiso("Cimento Queimado");
    }

    public void construirCasaLuxo(CasaBuilder builder){
        builder.construirQuartos(8)
                .construirPiscina(true)
                .definirPiso("Mármore");
    }
}
