public class Main {

    public static void main(String[] args) {

        // cria o carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // adiciona produtos
        carrinho.adicionarProduto(new Alimento(20.0));
        carrinho.adicionarProduto(new Eletronico(1000.0));
        carrinho.adicionarProduto(new BebidaAlcoolica(50.0));

        // calcula imposto total
        double imposto = carrinho.calcularImposto();

        // exibe resultado
        System.out.println("Total de imposto: R$ " + imposto);
    }
}