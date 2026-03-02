import java.util.ArrayList;
import java.util.List;

// é a coleção real de objetos, nesse caso músicas, 
public class Playlist {
    // deixa privada
    private List<Musica> musicas = new ArrayList<>();

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    // cria iterator sequencial
    public PlaylistIterator criarIteratorSequencial() {
        return new IteratorSequencial(musicas);
    }

    // cria iterator apenas favoritas
    public PlaylistIterator criarIteratorFavoritas() {
        return new IteratorFavoritas(musicas);
    }
}