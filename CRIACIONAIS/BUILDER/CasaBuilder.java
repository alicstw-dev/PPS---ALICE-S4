package BUILDER;

public interface CasaBuilder {
    CasaBuilder construirQuartos( int quantidade);
    CasaBuilder construirPiscina( boolean status);
    CasaBuilder definirPiso(String tipo);

    Casa getResultado();
}
