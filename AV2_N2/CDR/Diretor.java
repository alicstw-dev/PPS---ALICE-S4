package CDR;

public class Diretor extends Aprovador {

    @Override
    public void aprovar(Pedido pedido) {
         
        // condição pra que ele possa aprovar
        if (pedido.valor <= 10000) {
            pedido.aprovado = true;
            System.out.println("Diretor aprovou a despesa de R$ " + pedido.valor);
        } else {
            
            // se não puder aprovar, passa para o próximo
            System.out.println("Diretor não pode aprovar. Encaminhando...");
            proximo.aprovar(pedido);
        }
    }
    //essa lógica é basicamente a mesma pra as classes que implementam, só muda o valor que cada um pode aprovar
}