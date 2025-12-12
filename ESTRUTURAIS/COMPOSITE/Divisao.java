package ESTRUTURAIS.COMPOSITE;


import java.util.ArrayList;
import java.util.List;

public class Divisao implements AtivoGerencial {
    private final String nome;
    private final List<AtivoGerencial> subComponentes = new ArrayList<>();

    public Divisao(String nome) {
        this.nome = nome;
    }
    
    public void adicionarComponente(AtivoGerencial componente) {
        subComponentes.add(componente);
    }
    
    public void removerComponente(AtivoGerencial componente) {
        subComponentes.remove(componente);
    }

    @Override
    public int getNumeroAtivos() {
        int total = 0;
        for (AtivoGerencial componente : subComponentes) {
            total += componente.getNumeroAtivos(); 
        }
        return total;
    }

    @Override
    public double getValorMensal() {
        double total = 0.0;
        for (AtivoGerencial componente : subComponentes) {
            total += componente.getValorMensal(); 
        }
        return total;
    }

    public void exibirEstrutura(String prefix) {
        System.out.println(prefix + "Divisão: " + nome + 
                           " (Ativos: " + getNumeroAtivos() + 
                           ", Custo: R$" + String.format("%.2f", getValorMensal()) + ")");
        for (AtivoGerencial componente : subComponentes) {
            if (componente instanceof Divisao) {
                ((Divisao) componente).exibirEstrutura(prefix + "  |-- ");
            } else {
                System.out.println(prefix + "  |-- " + componente.getClass().getSimpleName() + 
                                   " (Custo: R$" + String.format("%.2f", componente.getValorMensal()) + ")");
            }
        }
    }
}
