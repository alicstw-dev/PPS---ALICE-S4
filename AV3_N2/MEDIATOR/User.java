

public abstract class User { // Classe abstrata que representa um participante do chat

    protected Mediator mediador; // Referência ao mediador (Sala de Chat)
    protected String nome;

    public User(Mediator mediador, String nome) { // Construtor que recebe o mediador e o nome do usuário
        this.mediador = mediador;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem); // metodo para  enviar mensagem aos usuarios da sala.
    public abstract void receber(String mensagem);// metodo para os destinarios recebam a mensagem.
}