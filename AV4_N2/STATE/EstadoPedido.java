package STATE;

/**
 * Interface do padrão, aqui define as ações possíveis de um pedido.
 * os estados concretos implementam essas ações de acordo com suas próprias regras.
 */

public interface EstadoPedido {

    void cancelar(Pedido pedido);

    void pagar(Pedido pedido);

    void despachar(Pedido pedido);
}