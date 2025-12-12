package FACTORYMETHOD;

public class LogistcsRod extends Logistica{
    @Override
    protected Transport criarTransport(){
        return new TrasnportRod();
    }
}