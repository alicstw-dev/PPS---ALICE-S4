package FACTORYMETHOD;

public class Demo {
    static void executarLog(Logistica logistica){
        logistica.iniciarEntrega();
    }

    public static void main(String[] args) {
        // Cliente 1: Deseja Logística Rodoviária
        Logistica logistica1 = new LogistcsRod();
        executarLog(logistica1);

        // Cliente 2: Deseja Logística Marítima
        Logistica logistica2 = new LogisticsMar();
        executarLog(logistica2);

        // Cliente 3: Deseja Logística Ferroviária
        Logistica logistica3 = new LogisticsFerr();
        executarLog(logistica3);
    }
}
