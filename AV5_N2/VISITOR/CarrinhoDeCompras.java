import java.util.ArrayList;
import java.util.List;

// estrutura que contém os elementos
public class CarrinhoDeCompras {

    // lista de produtos
    private List<Produto> produtos = new ArrayList<>();

    // adiciona produto ao carrinho
    public void adicionarProduto(Produto produto) {

        produtos.add(produto);
    }

    // calcula o imposto total do carrinho
    public double calcularImposto() {

        // cria o visitor responsável pelo imposto
        ImpostoVisitor visitor = new ImpostoVisitor();

        // percorre todos os produtos
        for (Produto produto : produtos) {

            // cada produto aceita o visitor
            produto.aceitar(visitor);
        }

        // retorna o valor total do imposto
        return visitor.getTotalImposto();
    }
}