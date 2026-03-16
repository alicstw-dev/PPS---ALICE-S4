package STATE;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.pagar();      
        pedido.pagar();      
        pedido.despachar(); 
        pedido.cancelar();   
    }
}