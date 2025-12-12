package ESTRUTURAIS.BRIDGE;

public class RepRelacional implements RepImplement{
    
    @Override
    public void salvar(String codigo, String dados){
        System.out.printf("[Relacional] Executando.. '%s'. Dados: '%s' ", codigo, dados);
    }
    @Override
    public String consultar(String codigo){
        String dados = "Dados de BD Relacional para " + codigo;
        System.out.printf("[Relacional] Executando.. '%s' ", codigo);
        return dados;
    }
    @Override
    public void atualizar(String codigo, String novosDados) {
        System.out.printf("[Relacional] Executando SQL UPDATE para o código '%s'.\n", codigo);
    }

    @Override
    public void remover(String codigo) {
        System.out.printf("[Relacional] Executando SQL DELETE para o código '%s'.\n", codigo);
    }
}
