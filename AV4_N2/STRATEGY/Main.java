

public class Main { // Classe para testar o funcionamento dos frete

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho(10);
        Carrinho carrinho2 = new Carrinho(25);
        Carrinho carrinho3 = new Carrinho(3.5);

        Pedido pedido = new Pedido();

        // Escolhe SEDEX
        pedido.setEstrategiaFrete(new FreteSedex());
        System.out.println("Frete SEDEX: " + pedido.calcularFrete(carrinho2));

        // altera para PAC
        pedido.setEstrategiaFrete(new FretePAC());
        System.out.println("Frete PAC: " + pedido.calcularFrete(carrinho));

        // depois muda para Motoboy
        pedido.setEstrategiaFrete(new FreteMotoboy());
        System.out.println("Frete Motoboy: " + pedido.calcularFrete(carrinho));

        // E finaliza com a Retirada
        pedido.setEstrategiaFrete(new Retirada());
        System.out.println("Retirada na loja: " + pedido.calcularFrete(carrinho3));
    }
}