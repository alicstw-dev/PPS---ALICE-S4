package ESTRUTURAIS.COMPOSITE;

public class Pessoa implements AtivoGerencial {
    
    private final String nome;
    private final double salarioMensal;

    public Pessoa(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public int getNumeroAtivos() {
        return 1;
    }

    @Override
    public double getValorMensal() {
        return salarioMensal;
    }
    
}
