
// Mediador responsável por controlar a comunicação entre todos os usuarios da sala de chat.
public interface Mediator {

    void enviarMensagem(String mensagem, User usuario); // Método responsável por enviar uma mensagem
    void adicionarUsuario(User usuario); // Método que adiciona um novo usuario na sala de chat
}