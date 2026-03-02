package CDR;

// segundo nível da cadeia que herda de aprovador

public class Gerente extends Aprovador {

    @Override
    public void aprovar(Pedido pedido) {
         
        // condição pra que ele possa aprovar
        if (pedido.valor <= 1000) {
            pedido.aprovado = true;
            System.out.println("Gerente aprovou a despesa de R$ " + pedido.valor);
        } else {
            
            // se não puder aprovar, passa para o próximo
            System.out.println("Gerente não pode aprovar. Encaminhando...");
            proximo.aprovar(pedido);
        }
    }
    //essa lógica é basicamente a mesma pra as classes que implementam, só muda o valor que cada um pode aprovar
}