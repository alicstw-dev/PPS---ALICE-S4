

// Estratégia de frete usando motoboy local.

public class FreteMotoboy implements StrategyFrete{

    @Override
    public double Calcular(Carrinho carrinho) { // Nesse caso o peso do carrinho é ignorado. Apenas o valor fixo de R$20
        return 20;
    }
}
