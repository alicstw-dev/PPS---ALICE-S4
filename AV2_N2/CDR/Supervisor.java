package CDR;

// primeiro nível da cadeia que herda de aprovador

public class Supervisor extends Aprovador {

    @Override
    public void aprovar(Pedido pedido) {
         
        // condição pra que ele possa aprovar
        if (pedido.valor <= 500) {
            pedido.aprovado = true;
            System.out.println("Supervisor aprovou a despesa de R$ " + pedido.valor);
        } else {
            
            // se não puder aprovar, passa para o próximo
            System.out.println("Supervisor não pode aprovar. Encaminhando...");
            proximo.aprovar(pedido);
        }
    }
    //essa lógica é basicamente a mesma pra as classes que implementam, só muda o valor que cada um pode aprovar
}
