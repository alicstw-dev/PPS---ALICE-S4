package STATE;

/**
 * representa um pedido já enviado para o cliente.
 */
public class EstadoEnviado implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar. Iniciar logística reversa.");
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já foi pago.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido entregue ao cliente.");
        pedido.setEstado(new EstadoEntregue());
    }
}