package COMPORTAMENTAIS.COMANDO2;

public class Clerk extends Approver {

    @Override
    public void loanHandler(Loan loan) {

        if (loan.getAmount() < 25000) {
            System.out.println(
                    getClass().getSimpleName() +
                    " approved request# " +
                    loan.getNumber()
            );
        } else if (successor != null) {
            successor.processRequest(loan);
        }
    }
}