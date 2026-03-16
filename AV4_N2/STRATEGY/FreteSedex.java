

// Classe responsável pelo cálculo de frete utilizando SEDEX.
public class FreteSedex implements StrategyFrete {
    @Override
    public double Calcular(Carrinho carrinho) { // Regra do SEDEX: R$30 fixos + R$2,50 por quilo
        return 30 + (2.5 * carrinho.getPesoTotal());
    }
}
