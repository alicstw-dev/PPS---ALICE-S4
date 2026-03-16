

// Classe principal usada para demonstrar o funcionamento do padrão Observer.

public class Main {

    public static void main(String[] args) {

        // Criação do produto
        Publisher notebook = new Publisher("Notebook Gamer", 5000);

        // Criação dos observadores
        MarketingDepartment marketing = new MarketingDepartment();
        SalesDepartment vendas = new SalesDepartment();
        LogisticsDepartment logistica = new LogisticsDepartment();

        // Inscrevendo observadores
        notebook.addObserver(marketing);
        notebook.addObserver(vendas);
        notebook.addObserver(logistica);

        // Alteração de preço (todos são notificados)
        notebook.setPreco(4500);

        System.out.println("\nRemovendo Logística das notificações...\n");

        // Removendo um observador em tempo de execução
        notebook.removeObserver(logistica);

        // Nova alteração de preço (logística não será notificada)
        notebook.setPreco(4200);
    }
}