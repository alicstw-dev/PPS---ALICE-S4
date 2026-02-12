package ESTRUTURAIS.FACADE_BANCO;

public class Demo {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();
        bank.transfer(500);
    }
}
