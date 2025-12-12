package ESTRUTURAIS.BRIDGE;

public class RepArquivo implements RepImplement{
    @Override

    public void salvar(String codigo, String dados){
        System.out.printf("[Arquivo] Salvando.. '%s'. Dados: '%s'", codigo, dados);
    }
    public String consultar(String codigo) {
        String dados = "Dados de Arquivo para " + codigo;
        System.out.printf("[Arquivo] Consultando objeto '%s'. Retorno: %s\n", codigo, dados);
        return dados;
    }

    @Override
    public void atualizar(String codigo, String novosDados) {
        System.out.printf("[Arquivo] Atualizando objeto '%s' com novos dados: %s\n", codigo, novosDados);
    }

    @Override
    public void remover(String codigo) {
        System.out.printf("[Arquivo] Removendo objeto '%s' do disco.\n", codigo);
    }
}