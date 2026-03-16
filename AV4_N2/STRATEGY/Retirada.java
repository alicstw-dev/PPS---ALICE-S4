

public class Retirada implements StrategyFrete{
    // Estratégia onde o cliente retira o produto na loja física.
    @Override
    public double Calcular(Carrinho carrinho) { // Não existe custo de frete.
        return 0;
    }
}
