package ESTRUTURAIS.FACADE_BANCO;

public class Account {
    private double balance = 1000;

    public boolean hasMoney(double amount) {
        return balance >= amount;
    }

    public void debit(double amount) {
        balance -= amount;
        System.out.println("Novo saldo: " + balance);
    }
}