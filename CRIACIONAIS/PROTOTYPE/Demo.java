package PROTOTYPE;

public class Demo {
    
    public static void main(String[] args) {

        // 1. O Cliente Cria e Mantém os Protótipos Originais (Bases)
        
        Carro prototipoCarroExecutivo = new Carro("Sedan Master", "Alpha", 2024, 4, true);
        System.out.println("Protótipo Base A criado: " + prototipoCarroExecutivo.modelo);
        
        Onibus prototipoOnibusUrbano = new Onibus("City Runner", "BetaBus", 2010, 50, "Diesel");
        System.out.println("Protótipo Base B criado: " + prototipoOnibusUrbano.modelo);
  
        // 2. Clonagem Direta pelo Cliente (Substituindo o Registro)
        
        // Cria Carro para o Cliente 1 (usando o clone() direto do objeto)
        Carro carroCliente1 = prototipoCarroExecutivo.clone();
        System.out.println("Cópia 1 (Cliente 1):");
        carroCliente1.exibirDetalhes();

        // CÓPIA 2: Cria Carro para o Cliente 2
        Carro carroCliente2 = prototipoCarroExecutivo.clone();
        System.out.println("Cópia 2 (Cliente 2):");
        carroCliente2.exibirDetalhes();
        
        
        // CÓPIA 3: Criando um ônibus para ser adaptado para turismo
        // Cria Onibus a partir do protótipo B
        Onibus onibusTurismo = prototipoOnibusUrbano.clone(); 
        onibusTurismo.modelo = "Mountain Explorer";
        onibusTurismo.capacidadePassageiros = 30;
        
        System.out.println("Cópia 3 (Ônibus de Turismo):");
        onibusTurismo.exibirDetalhes();
    
        System.out.println("Estado final do Protótipo A: " + prototipoCarroExecutivo.modelo + ", " + prototipoCarroExecutivo.ano);

    }
}