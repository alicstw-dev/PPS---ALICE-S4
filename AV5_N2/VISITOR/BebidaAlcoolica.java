// BebidaAlcoolica é outro CONCRETE ELEMENT
public class BebidaAlcoolica implements Produto {

    private double preco;

    public BebidaAlcoolica(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor visitor) {

        // chama o método específico para bebida alcoólica
        visitor.visitar(this);
    }
}