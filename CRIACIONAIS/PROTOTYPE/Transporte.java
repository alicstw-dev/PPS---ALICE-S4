package PROTOTYPE;

public abstract class Transporte implements Cloneable {
    
    public String modelo;
    public String fabricante;
    public int ano;

    public Transporte() {}
    public abstract void exibirDetalhes();

    @Override
    public Transporte clone() {  
        try {
            return (Transporte) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("O objeto de transporte não suporta clonagem.", e);
        }
    }


}