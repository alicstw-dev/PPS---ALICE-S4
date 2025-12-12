package FACTORYMETHOD;

public class LogisticsFerr extends Logistica{
    @Override
    
    protected Transport criarTransport(){
        return new TransportFer();
    }
    
}
