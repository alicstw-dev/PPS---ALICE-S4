// representa o elemento da coleção, é o objeto que vai ser percorrido pelos iterators

public class Musica {
    private String titulo;
    private String artista;
    private boolean favorita;

    public Musica(String titulo, String artista, boolean favorita) {
        this.titulo = titulo;
        this.artista = artista;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public boolean isFavorita() {
        return favorita;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}