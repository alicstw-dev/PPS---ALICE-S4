package PROTOTYPE;

public class Onibus extends Transporte {
    public int capacidadePassageiros;
    public String tipoCombustivel;

    public Onibus(String modelo, String fabricante, int ano, int capacidadePassageiros, String tipoCombustivel) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- ÔNIBUS ---");
        System.out.println("Fabricante/Modelo: " + fabricante + " " + modelo + " (" + ano + ")");
        System.out.println("Capacidade: " + capacidadePassageiros + " passageiros, Combustível: " + tipoCombustivel);
    }

    @Override
    public Onibus clone() {
        return (Onibus) super.clone();
    }
}
    

