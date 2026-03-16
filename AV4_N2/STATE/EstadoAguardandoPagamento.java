package STATE;
/**
 * representa um pedido aguardando confirmação de pagamento.
 */
public class EstadoAguardandoPagamento implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado antes da confirmação de pagamento.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento confirmado. Pedido em separação.");
        pedido.setEstado(new EstadoEmSeparacao());
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido ainda está aguardando pagamento.");
    }
}