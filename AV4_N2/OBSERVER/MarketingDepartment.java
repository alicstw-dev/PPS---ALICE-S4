
// Classe que representa o departamento de marketing. Ela reage às mudanças de preço enviando notificações aos clientes.
public class MarketingDepartment implements ObserverPreco{
    @Override
    public void atualizar(Publisher p) {

        System.out.println(
            "Marketing: Enviando promoção para clientes! O produto "
            + p.getNome() + " agora custa R$ " + p.getPreco()
        );
    }
}
