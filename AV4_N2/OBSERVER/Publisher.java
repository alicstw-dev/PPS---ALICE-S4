
import java.util.ArrayList;
import java.util.List;

// Classe que mantém uma lista de observadores que serão notificados sempre que o preço do produto for alterado.

public class Publisher {

    private String nome;
    private double preco;

    // Lista de observadores inscritos nas mudanças de preço
    private List<ObserverPreco> observers = new ArrayList<>();

    // Construtor do produto
    public Publisher(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para adicionar um observador à lista
    public void addObserver(ObserverPreco obs) {
        observers.add(obs);
    }

    // Método para remover um observador
    public void removeObserver(ObserverPreco obs) {
        observers.remove(obs);
    }

    // Método responsável por avisar todos os observadores
    private void notifyObservers() {
        for (ObserverPreco obs : observers) {
            obs.atualizar(this);
        }
    }

    // Método para alterar o preço do produto e avisa aos observadores
    public void setPreco(double novoPreco) {

        System.out.println("Preço do produto alterado para: " + novoPreco);

        this.preco = novoPreco;

        // Sempre que o preço mudar, todos os observadores são avisados
        notifyObservers();
    }

    // Getter do preço
    public double getPreco() {
        return preco;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }
}
