package Template_Method;

public abstract class ReportGenerator { // Classe abstrata que define o modelo (template) do algoritmo

    // Template Method
    // Define o fluxo fixo para gerar qualquer relatório, o método é final para impedir que subclasses alterem a sequência
    public final void gerarRelatorio() {
        lerDadosBanco(); // leitura do BD
        processarDados(); // Processamento/formatacao dos dados
        adicionarCabecalho(); // Adicionar cabeçalho e rodapé padrão da empresa
        adicionarRodape(); // Adicionar cabeçalho e rodapé padrão da empresa
        exportarArquivo(); // exportação do arquivo
    }

    private void lerDadosBanco() { // Simula a leitura de dados do banco de dados
        System.out.println("Lendo dados do banco de dados...");
    }

    protected abstract void processarDados(); // Método para cada classe definir sua própria forma de processar os dados

    private void adicionarCabecalho() { // Método comum que adiciona o padrão visual da empresa ao Cabeçalho
        System.out.println("Adicionando cabeçalho padrão da empresa...");
    }
    private void adicionarRodape() { // Método comum que adiciona o padrão visual da empresa ao Rodapé
        System.out.println("Adicionando rodapé padrão da empresa...");
    }

    protected abstract void exportarArquivo(); // Método responsavel pela exportação. Cada classe implementa de forma diferente (PDF, HTML etc.)
}
