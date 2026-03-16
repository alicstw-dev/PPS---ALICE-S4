package STATE;

/**
 * representa um pedido recém-criado.
 */

public class EstadoNovo implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado com sucesso.");
    }

    //permite pagar ou cancelar o pedido.
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado. Pedido aguardando confirmação.");
        pedido.setEstado(new EstadoAguardandoPagamento());
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido ainda não foi pago.");
    }
}