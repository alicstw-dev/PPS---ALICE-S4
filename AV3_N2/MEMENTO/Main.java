

public class Main {

    public static void main(String[] args) {

        // Criação do personagem
        Caracter heroi = new Caracter(5,100, 50, "Inicio do mapa", 10);

        // Gerenciador de checkpoints
        Caretaker manager = new Caretaker();

        heroi.mostrarStatus();

        // Salva checkpoint inicial
        manager.salvar(heroi.salvarCheckpoint());

        // Personagem sofre dano e muda de posição
        heroi.setEstado(10, 40, 30, "Caverna Sombria", 15);
        heroi.mostrarStatus();

        // Salva novo checkpoint
        manager.salvar(heroi.salvarCheckpoint());

        // Personagem morre
        heroi.setEstado(14, 0, 10, "Boss Final", 21);
        System.out.println("Personagem morreu!");
        heroi.mostrarStatus();

        // Restaura checkpoint anterior
        heroi.restaurarCheckpoint(manager.getCheckpoint(1));

        heroi.mostrarStatus();
    }
}