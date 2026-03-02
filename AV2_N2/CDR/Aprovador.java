package CDR;

// classe base da cadeia que os níveis vão herdar
public abstract class Aprovador {

    protected Aprovador proximo; // referência para o próximo da cadeia

    // define quem é o próximo da cadeia
    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    // método que cada nível deve implementar
    public abstract void aprovar(Pedido pedido);
}