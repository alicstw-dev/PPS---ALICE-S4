package STATE;

/**
 * Classe Context do padrão, ela mantém uma referência para o estado atual do pedido e delega as ações para esse estado.
 */
public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new EstadoNovo();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void despachar() {
        estado.despachar(this);
    }
}
