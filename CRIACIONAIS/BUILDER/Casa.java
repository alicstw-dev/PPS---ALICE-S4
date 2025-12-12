package BUILDER;


public class Casa {
    private final int numQuartos;
    private final boolean temPiscina;
    private final String tipoPiso;

    public Casa(int numQuartos, boolean temPiscina, String tipoPiso){
        this.numQuartos = numQuartos;
        this.temPiscina = temPiscina;
        this.tipoPiso = tipoPiso;
    }

    @Override
    public String toString(){
        return String.format(tipoPiso, temPiscina ? "Sim" : "Não", numQuartos);
    }
}
