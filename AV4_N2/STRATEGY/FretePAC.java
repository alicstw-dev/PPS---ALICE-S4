

// Classe que implementa a estratégia de cálculo de frete via PAC.
public class FretePAC implements StrategyFrete{
    @Override
    public double Calcular(Carrinho carrinho) {
        return 15 + (1 * carrinho.getPesoTotal());  // Implementação do método calcular com a regra: R$15 fixos + R$1 por quilo
    }
}
