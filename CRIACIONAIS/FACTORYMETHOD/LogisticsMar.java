package FACTORYMETHOD;

public class LogisticsMar extends Logistica{
    @Override
    protected Transport criarTransport(){
        return new TransportMar();
    }
}