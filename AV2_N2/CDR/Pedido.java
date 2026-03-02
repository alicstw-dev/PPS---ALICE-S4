package CDR;

// é a requisição que vai passar pela cadeia e os handles vão analisar

public class Pedido {

    public double valor;     
    public boolean aprovado; 

    // Construtor recebe o valor da despesa
    public Pedido(double valor) {
        this.valor = valor;
        this.aprovado = false;
    }
}