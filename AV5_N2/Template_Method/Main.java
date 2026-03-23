package Template_Method;

public class Main {

    public static void main(String[] args) {

        ReportGenerator relatorioPDF = new ReportGeneratorPDF(); // Cria um gerador de relatório no formato PDF
        relatorioPDF.gerarRelatorio();  // Executa o algoritmo definido no Template Method

        System.out.println();

        ReportGenaratorHTML relatorioHTML = new ReportGenaratorHTML(); // Cria um gerador de relatório no formato HTML
        relatorioHTML.gerarRelatorio(); // Executa o mesmo fluxo de geração de relatório em HTML
    }
}