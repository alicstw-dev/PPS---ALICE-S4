

public class UserChat extends User{ // Implementação concreta do usuario da sala de chat

    public UserChat(Mediator mediador, String nome) { // Construtor que chama o construtor da classe pai
        super(mediador, nome);
    }

    @Override
    public void enviar(String mensagem) { // Método que envia uma mensagem para o mediador

        System.out.println(this.nome + " enviou: " + mensagem);  // Mostra quem enviou a mensagem

        mediador.enviarMensagem(mensagem, this);// O usuario envia a mensagem e o mediador será responsável por distribuir.
    }

    @Override
    public void receber(String mensagem) { // Método chamado quando o usuario recebe uma mensagem
        System.out.println(this.nome + " recebeu: " + mensagem);// Mostrar a mensagem 
    }
}
