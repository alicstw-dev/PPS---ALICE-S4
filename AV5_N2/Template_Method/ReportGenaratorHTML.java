package Template_Method;

public class ReportGenaratorHTML extends ReportGenerator{ // Classe concreta responsável por gerar relatórios em HTML
    @Override
    protected void processarDados() { // Processamento específico para HTML
        System.out.println("Formatando dados para HTML...");
    }

    @Override
    protected void exportarArquivo() { // Exportação específica para HTML
        System.out.println("Exportando relatório em HTML...");
    }
}
