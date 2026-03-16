
// Classe responsável por recalcular o seguro do frete baseado no valor do produto.
public class LogisticsDepartment implements ObserverPreco {

    @Override
    public void atualizar(Publisher p) { //

        System.out.println(
            "Logística: Recalculando seguro do frete para o produto "
            + p.getNome()
        );
    }
}