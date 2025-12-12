package FACTORYMETHOD;

public abstract class Logistica{
    protected abstract Transport criarTransport();

    public void iniciarEntrega(){
        Transport transport = criarTransport();

        System.out.println("Meio de Transporte selecionado: " + transport.getClass().getSimpleName());

        System.out.println("Resultado: " + transport.entregar());
    }

}