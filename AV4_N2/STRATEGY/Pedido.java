
// Classe responsável por gerenciar o pedido.
// Ela utiliza uma estratégia de frete para calcular o valor.
public class Pedido {
    private StrategyFrete strategy; // Variável que armazena a estratégia de frete escolhida

    public void setEstrategiaFrete(StrategyFrete strategy) { // Set para definir ou trocar a estratégia de frete dinamicamente
        this.strategy = strategy;
    }

    public double calcularFrete(Carrinho carrinho) { // Método para calcular o frete chamando a estratégia definida
        return strategy.Calcular(carrinho);
    }
}
