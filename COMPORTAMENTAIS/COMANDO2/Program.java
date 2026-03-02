package COMPORTAMENTAIS.COMANDO2;

import java.util.Scanner;

public class Program {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // Criação dos aprovadores
        Approver diego = new Clerk();
        Approver cesar = new AssistantManager();
        Approver jones = new Manager();

        // Montando a cadeia
        diego.setSuccessor(cesar);
        cesar.setSuccessor(jones);

        // Gerando e processando empréstimos

        Loan loan1 = new Loan(23000, "Car Loan", 2034);
        diego.processRequest(loan1);

        Loan loan2 = new Loan(44500, "Motorcycle Loan", 2035);
        diego.processRequest(loan2);

        Loan loan3 = new Loan(156200, "Apartment Loan", 2036);
        diego.processRequest(loan3);

        System.out.println("Pressione ENTER para continuar...");
        new Scanner(System.in).nextLine();
    }
}