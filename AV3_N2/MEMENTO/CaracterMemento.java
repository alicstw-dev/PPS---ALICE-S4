

public class CaracterMemento {
    private int level;
    private int vida;
    private int mana;
    private String posicao;
    private int atk;

    // Construtor que salva os dados do personagem
    public CaracterMemento(int level, int vida, int mana, String posicao, int atk) {
        this.level = level;
        this.vida = vida;
        this.mana = mana;
        this.posicao = posicao;
        this.atk = atk;
    }

    // Métodos getters para acessar os dados salvos
    public int getLevel(){
        return level;
    }
    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getAtk() {
        return atk;
    }


}
