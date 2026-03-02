package INTERPRETER;

import java.util.Arrays;
import java.util.List;

// é a classe do cliente, onde monta as árvores e depois executa

public class Demo {

    public static void main(String[] args) {

        FileData file1 = new FileData(
                "TrabalhoPPS.docx",
                Arrays.asList("FACULDADE")
        );

        FileData file2 = new FileData(
                "ListaSuper.txt",
                Arrays.asList("CASA")
        );

        FileData file3 = new FileData(
                "Artigo_entrega3.pdf",
                Arrays.asList("FACULDADE",  "URGENTE")
        );

        List<FileData> files = Arrays.asList(file1, file2, file3);

        // Expressão: URGENTE And FACULDADE
        Expression expression =
                new AndExpression(
                        new TagExpression("URGENTE"),
                        new TagExpression("FACULDADE")
                );

        System.out.println("Arquivos encontrados:");
                
        // onde vai printar o nome após passar pela lógica
        for (FileData file : files) {
            if (expression.interpret(file)) {
                System.out.println(file.getName());
            }
        }
    }
}
