package FACTORYMETHOD;

public class TransportFer implements Transport{
    @Override
    public String entregar(){
        return "Sendo entregue por via Ferroviária!";
    }
}
