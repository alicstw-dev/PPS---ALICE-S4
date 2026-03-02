package COMPORTAMENTAIS.COMANDO2; 

public class Loan {

    private double amount;
    private String purpose;
    private int number;

    public Loan() {
    }

    public Loan(double amount, String purpose, int number) {
        this.amount = amount;
        this.purpose = purpose;
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
