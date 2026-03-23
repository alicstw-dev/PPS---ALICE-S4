// ConcreteVisitor responsável por calcular imposto
public class ImpostoVisitor implements Visitor {

    // armazena o valor total do imposto
    private double totalImposto = 0;

    // imposto de alimento = 0%
    @Override
    public void visitar(Alimento alimento) {

        double imposto = alimento.getPreco() * 0.0;

        totalImposto += imposto;
    }

    // imposto de eletrônico = 15%
    @Override
    public void visitar(Eletronico eletronico) {

        double imposto = eletronico.getPreco() * 0.15;

        totalImposto += imposto;
    }

    // imposto de bebida alcoólica = 40%
    @Override
    public void visitar(BebidaAlcoolica bebida) {

        double imposto = bebida.getPreco() * 0.40;

        totalImposto += imposto;
    }

    // retorna o total de imposto calculado
    public double getTotalImposto() {

        return totalImposto;
    }
}