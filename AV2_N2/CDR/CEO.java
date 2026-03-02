package CDR;

public class CEO extends Aprovador {

     @Override
    public void aprovar(Pedido pedido) {

        // CEO aprova qualquer valor então não a mesma lógica que os demais
        pedido.aprovado = true;
        System.out.println("CEO aprovou a despesa de R$ " + pedido.valor);
    }
}
