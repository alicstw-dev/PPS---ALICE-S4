

// Interface que define todas as estratégias de frete.

// Qualquer classe que implemente essa interface deverá o método de calcular,
// que retorna o valor do frete baseado no peso do carrinho.

public interface StrategyFrete {

    // Método responsável por calcular o valor do frete
    double Calcular(Carrinho carrinho);
}
