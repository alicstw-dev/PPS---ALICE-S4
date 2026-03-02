

import java.util.ArrayList;
import java.util.List;

// Classe responsável por armazenar os checkpoints, ela não modifica os dados, apenas guarda.
public class Caretaker {

    private List<CaracterMemento> checkpoints = new ArrayList<>(); // Lista dos checkpoints salvos

    public void salvar(CaracterMemento memento) {  // Salva um novo checkpoint
        checkpoints.add(memento);
    }
    
    public CaracterMemento getCheckpoint(int index) { // Recupera um checkpoint específico
        return checkpoints.get(index);
    }
}