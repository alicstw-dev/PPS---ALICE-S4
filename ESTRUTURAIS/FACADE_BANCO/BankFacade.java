package ESTRUTURAIS.FACADE_BANCO;

public class BankFacade {

    private SecuritySystem security;
    private Account account;
    private NotificationService notification;

    public BankFacade() {
        security = new SecuritySystem();
        account = new Account();
        notification = new NotificationService();
    }

    public void transfer(double amount) {
        System.out.println("Iniciando transferência...");

        if (!security.checkUser()) {
            System.out.println("Usuário inválido!");
            return;
        }

        if (!account.hasMoney(amount)) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        account.debit(amount);
        notification.sendNotification();

        System.out.println("Transferência concluída!");
    }
}
