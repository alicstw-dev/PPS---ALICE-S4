package ESTRUTURAIS.BRIDGE;

public interface RepImplement {
    
    void salvar(String codigo, String dados);
    String consultar(String codigo);
    void atualizar(String codigo, String novosDados);
    void remover(String codigo);
}
