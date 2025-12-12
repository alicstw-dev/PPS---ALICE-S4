package PROTOTYPE;

public class Carro extends Transporte {
    public int numPortas;
    public boolean temAirbag;

    public Carro(String modelo, String fabricante, int ano, int numPortas, boolean temAirbag) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.numPortas = numPortas;
        this.temAirbag = temAirbag;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("--- CARRO ---");
        System.out.println("Fabricante/Modelo: " + fabricante + " " + modelo + " (" + ano + ")");
        System.out.println("Portas: " + numPortas + ", Airbag: " + (temAirbag ? "Sim" : "Não"));
    }

    // Sobrescrever clone() é bom para tipagem de retorno, mas chama a implementação da superclasse
    @Override
    public Carro clone() {
        return (Carro) super.clone();
    }
}
    

