
// Classe que para o carrinho de compras.
// Aqui guardamos informações para o cálculo do frete.

public class Carrinho {
     private double totalWeight; // peso total

    public Carrinho(double totalWeight) { // Construtor que recebe o peso dos produtos
        this.totalWeight = totalWeight;
    }

    public double getPesoTotal() { // get para o  retorno do peso no carrinho
        return totalWeight;
    }
}
