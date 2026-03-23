// Eletronico também é um CONCRETE ELEMENT
public class Eletronico implements Produto {

    private double preco;

    public Eletronico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor visitor) {

        // direciona o visitor para o método correto
        visitor.visitar(this);
    }
}