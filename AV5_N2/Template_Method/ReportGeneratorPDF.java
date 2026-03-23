package Template_Method;

public class ReportGeneratorPDF extends ReportGenerator{ // Classe concreta que gera relatórios no formato PDF
    @Override
    protected void processarDados() { // Implementação específica para processamento de dados em PDF
        System.out.println("Formatando dados para PDF...");
    }

    @Override
    protected void exportarArquivo() { // Implementação específica para exportar o relatório em PDF
        System.out.println("Exportando relatório em PDF...");
    }
}