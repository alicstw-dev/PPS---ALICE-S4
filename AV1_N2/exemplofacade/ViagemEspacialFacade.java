public class ViagemEspacialFacade {

    // Método único que a Estação de Controle usa 
    public String iniciarViagem(String nomeAstronauta, CorpoCeleste destino) {

        // fachada cria o astronauta (o cliente não precisa saber como isso funciona)
        Astronauta astronauta = new Astronauta(nomeAstronauta);

        // escolhe qual roupa espacial será usada
        RoupaEspacial roupa = new RoupaPadrao("Roupa Espacial Padrão");

        // cria a nave e associa o astronauta a ela
        Nave nave = new Nave("Horus", astronauta);

        // manda o astronauta vestir a roupa (coordenação dos subsistemas)
        String etapaRoupa = astronauta.vestir(roupa);

        // manda a nave iniciar a viagem até o destino
        String etapaViagem = nave.partir(destino);

        // atualiza onde o astronauta está agora (controle de estado)
        astronauta.setLocalAtual(destino);

        // monta e devolve o relatório final para o cliente
        return "\nO astronauta " + astronauta.getNome()
                + etapaRoupa
                + ", entrou na nave de nome " + nave.getNome()
                + etapaViagem;
    }
}
