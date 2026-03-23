// element do padrão visitor
// define o método aceitar(), que permite que um Visitor execute operações no produto
public interface Produto {
    void aceitar(Visitor visitor);
    double getPreco();
}