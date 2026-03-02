
public class Main {
    public static void main(String[] args) {

        Mediator sala = new RoomChat();  // Cria a sala de chat (mediador)

        // Cria os usuarios
        User u1 = new UserChat(sala, "Bob");
        User u2 = new UserChat(sala, "Alice");
        User u3 = new UserChat(sala, "Mateus");

        // Adiciona os usuarios na sala de chat
        sala.adicionarUsuario(u1);
        sala.adicionarUsuario(u2);
        sala.adicionarUsuario(u3);
 
        // envio da mensagens entre os participantes da sala
        u1.enviar("Olá pessoal!");
        System.out.println("-------------------------");
        u2.enviar("Olá Bob e mateus.");
        System.out.println("-------------------------");
        u3.enviar("Eai, o que vai ser hj?");
    }
}