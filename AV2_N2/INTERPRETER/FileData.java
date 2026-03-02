package INTERPRETER;

// classe que representa o contexto da interpretação, é onde ficam as info que vão ser usados
import java.util.List;

public class FileData {
 
    //guarda essas duas info
    private String name;
    private List<String> tags;

    public FileData(String name, List<String> tags) {
        this.name = name;
        this.tags = tags;
    }

    // get padrão
    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }
}
