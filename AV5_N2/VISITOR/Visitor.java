// Visitor define quais operações podem ser feitas nos produtos
public interface Visitor {

    // método específico para alimento
    void visitar(Alimento alimento);

    // método específico para eletrônico
    void visitar(Eletronico eletronico);

    // método específico para bebida alcoólica
    void visitar(BebidaAlcoolica bebida);
}