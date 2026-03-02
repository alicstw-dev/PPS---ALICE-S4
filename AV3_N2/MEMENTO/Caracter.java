

public class Caracter {
    private int level;
    private int vida;
    private int mana;
    private String posicao;
    private int atk;

    
    public Caracter(int level,int vida, int mana, String posicao, int atk) { // Construtor do personagem
        this.level = level;
        this.vida = vida;
        this.mana = mana;
        this.posicao = posicao;
        this.atk = atk;
    }

    public void setEstado(int level, int vida, int mana, String posicao, int atk) { // Método que altera o estado do personagem
        this.level = level;
        this.vida = vida;
        this.mana = mana;
        this.posicao = posicao;
        this.atk = atk;
    }
    
    public CaracterMemento salvarCheckpoint() {// Cria um checkpoint (memento)
        System.out.println("Checkpoint salvo!");
        return new CaracterMemento(level, vida, mana, posicao, atk);
    }

    public void restaurarCheckpoint(CaracterMemento memento) { // Restaura um estado salvo
        this.level = memento.getLevel();
        this.vida = memento.getVida();
        this.mana = memento.getMana();
        this.posicao = memento.getPosicao();
        this.atk = memento.getAtk();
        System.out.println("Estado restaurado!");
    }

    // Mostra o estado atual do personagem
    public void mostrarStatus() {
        System.out.println("Level: " + level);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Posição: " + posicao);
        System.out.println("Ataque: " + atk);
        System.out.println("---------------------");
        
    }
}
