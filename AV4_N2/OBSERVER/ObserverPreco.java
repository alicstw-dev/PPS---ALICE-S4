

// Interface que define o comportamento dos observadores.
// Qualquer classe que queira ser notificada quando o preço de um
// produto mudar deve implementar esta interface.
public interface ObserverPreco {
    // Método chamado automaticamente quando o preço do produto é alterado.
    void atualizar(Publisher p);

}
