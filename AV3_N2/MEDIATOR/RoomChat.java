

import java.util.ArrayList;
import java.util.List;

public class RoomChat implements Mediator { // Classe que implementa o mediador.

    private List<User> usuarios; // Lista que armazena todos os usuarios conectados na sala.

    public RoomChat() { // Construtor que inicializa a lista de usuarios.
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionarUsuario(User usuario) { // Método que adiciona o usuario.
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, User remetente) { // Método que distribui a mensagem.

        for (User u : usuarios) { // Verifica se o usuario NÃO é o remetente
            if (u != remetente) { // não envia para quem mandou.
                u.receber(mensagem);
            }
        }
    }
}
