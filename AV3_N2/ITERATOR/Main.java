public class Main {
    //classe de teste
    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.adicionarMusica(new Musica("West Coast", "Lana del Rey", false));
        playlist.adicionarMusica(new Musica("Quando Bate Aquela Saudade", "Rubel", true));
        playlist.adicionarMusica(new Musica("Every Breath You Take", "The Police", true));
        playlist.adicionarMusica(new Musica("Rigth Here", "Justin Bieber", false));

        System.out.println("Todas as músicas:");
        PlaylistIterator it1 = playlist.criarIteratorSequencial();

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("\n Apenas favoritas:");
        PlaylistIterator it2 = playlist.criarIteratorFavoritas();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}