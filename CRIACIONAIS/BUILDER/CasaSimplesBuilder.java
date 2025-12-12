package BUILDER;

public class CasaSimplesBuilder implements CasaBuilder {
    
    private int quartos;
    private boolean piscina;
    private String piso;

    @Override
    public CasaBuilder construirQuartos(int quantidade){
        // Apenas seta o valor
        this.quartos = quantidade;
        return this;
    }

    @Override
    public CasaBuilder construirPiscina(boolean status){
        // Apenas seta o status
        this.piscina = status;
        return this;
    }

    @Override
    public CasaBuilder definirPiso(String tipoPisoSolicitado){
        // Apenas seta o piso solicitado
        this.piso = tipoPisoSolicitado; 
        return this;
    }

    @Override
    public Casa getResultado(){
        return new Casa(quartos, piscina, piso);
    }
}