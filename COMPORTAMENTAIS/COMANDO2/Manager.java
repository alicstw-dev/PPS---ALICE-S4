package COMPORTAMENTAIS.COMANDO2;

public class Manager extends Approver {

    @Override
    public void loanHandler(Loan loan) {

        if (loan.getAmount() < 100000) {
            System.out.println(
                    getClass().getSimpleName() +
                    " approved request# " +
                    loan.getNumber()
            );
        } else if (successor != null) {
            successor.processRequest(loan);
        } else {
            System.out.println(
                    "Request# " +
                    loan.getNumber() +
                    " requires an executive meeting!"
            );
        }
    }
}