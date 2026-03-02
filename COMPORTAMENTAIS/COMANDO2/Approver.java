package COMPORTAMENTAIS.COMANDO2;

public abstract class Approver {

    protected Approver successor;

    // Método que cada aprovador deve implementar
    public abstract void loanHandler(Loan loan);

    // Processa a requisição
    public void processRequest(Loan loan) {
        loanHandler(loan);
    }

    // Define o próximo da cadeia
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public Approver getSuccessor() {
        return successor;
    }
}