package STATE;

/**
 * representa o pedido sendo preparado e pelo estoque para envio.
 */
public class EstadoEmSeparacao implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Aviso enviado ao estoque para interromper separação.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já está pago.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido enviado para entrega.");
        pedido.setEstado(new EstadoEnviado());
    }
}