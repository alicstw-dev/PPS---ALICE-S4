public class DEMO {

    public static void main(String[] args) {

        // O cliente cria a fachada do sistema
        ViagemEspacialFacade facade = new ViagemEspacialFacade();

        // O cliente define apenas o destino, sem saber como a viagem acontece
        CorpoCeleste destino = new Planeta("Marte");

        // O cliente pede para a fachada iniciar a viagem do astronauta
        String relatorio = facade.iniciarViagem("Alice", destino);

        // O cliente apenas recebe e exibe o relatório final da viagem
        System.out.println(relatorio);
    }
}
