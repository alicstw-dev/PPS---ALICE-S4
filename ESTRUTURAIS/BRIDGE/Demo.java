package ESTRUTURAIS.BRIDGE;

public class Demo {
    public static void main(String[] args) {
        // 1. Cria a Implementação concreta: Sistema de Arquivos
        RepImplement repoArquivo = new RepArquivo();
        
        // 2. Cria a Abstração e liga-a à Implementação (A Ponte é estabelecida)
        ManipularDados manipuladorArquivo = new ManipularDados(repoArquivo);
        
        // 3. A Aplicação cliente usa o Manipulador
        manipuladorArquivo.salvarObjeto("PEDIDO-001", "Dados do Cliente A");
        manipuladorArquivo.consultarObjeto("PEDIDO-001");
        
        // 1. Cria uma NOVA Implementação concreta: Banco Relacional
        RepImplement repoRelacional = new RepRelacional();
        
        // 2. Cria uma NOVA Abstração e liga-a à nova Implementação
        ManipularDados manipuladorRelacional = new ManipularDados(repoRelacional);
        
        // 3. A Aplicação cliente usa o Manipulador
        manipuladorRelacional.salvarObjeto("PROD-105", "Dados do Produto B");
        manipuladorRelacional.consultarObjeto("PROD-105");
    }
    }

