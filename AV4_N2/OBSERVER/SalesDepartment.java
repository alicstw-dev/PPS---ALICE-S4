

// Classe responsável por atualizar projeções de vendas quando o preço do produto muda.

public class SalesDepartment implements ObserverPreco {

    @Override
    public void atualizar(Publisher p) {

        System.out.println(
            "Vendas: Atualizando dashboard de vendas para o produto "
            + p.getNome()
        );
    }
}