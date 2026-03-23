
// Alimento é um CONCRETE ELEMENT
// Implementa a interface Produto
public class Alimento implements Produto {

    private double preco;

    // construtor para definir o preço
    public Alimento(double preco) {
        this.preco = preco;
    }

    // retorna o preço do alimento
    public double getPreco() {
        return preco;
    }

    // aceita um visitante
    @Override
    public void aceitar(Visitor visitor) {

        // chama o método específico do visitor para Alimento
        visitor.visitar(this);
    }
}