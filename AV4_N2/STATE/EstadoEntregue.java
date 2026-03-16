package STATE;

/**
 * representa o pedido já entregue, é o estado final do pedido.
 */
public class EstadoEntregue implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já foi entregue. Não pode cancelar.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já finalizado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido já entregue.");
    }
}