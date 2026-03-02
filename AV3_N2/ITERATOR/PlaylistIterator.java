// é aqui que define os métodos obrigatórios que todo iterator deve ter

public interface PlaylistIterator {
    boolean hasNext();
    Musica next();
}