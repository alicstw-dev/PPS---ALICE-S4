import java.util.List;

// implementação concreta da navegaçã e implementa a nav sequencial pra percorrer na ordem
public class IteratorSequencial implements PlaylistIterator {
    private List<Musica> musicas;
    private int posicao = 0;

    public IteratorSequencial(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public boolean hasNext() {
        return posicao < musicas.size();
    }

    @Override
    public Musica next() {
        return musicas.get(posicao++);
    }
}