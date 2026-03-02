import java.util.List;

// também implementa playlist iteraror mas de uma forma diferente, só com as marcadas de favoritas

public class IteratorFavoritas implements PlaylistIterator {
    private List<Musica> musicas;
    private int posicao = 0;

    public IteratorFavoritas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public boolean hasNext() {
        while (posicao < musicas.size()) {
            if (musicas.get(posicao).isFavorita()) {
                return true;
            }
            posicao++;
        }
        return false;
    }

    @Override
    public Musica next() {
        return musicas.get(posicao++);
    }
}