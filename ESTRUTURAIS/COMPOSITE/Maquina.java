package ESTRUTURAIS.COMPOSITE;

public class Maquina implements AtivoGerencial {
    private final String id;
    private final double custoManutencaoMensal;

    public Maquina(String id, double custoManutencaoMensal) {
        this.id = id;
        this.custoManutencaoMensal = custoManutencaoMensal;
    }

    @Override
    public int getNumeroAtivos() {
        return 1;
    }

    @Override
    public double getValorMensal() {
        return custoManutencaoMensal;
    }
}