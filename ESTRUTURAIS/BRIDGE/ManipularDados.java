package ESTRUTURAIS.BRIDGE;

public class ManipularDados {
    protected RepImplement implementador;

    public ManipularDados(RepImplement implementador){
        this.implementador = implementador;
    }

    public void salvarObjeto(String codigo, String dados) {
        implementador.salvar(codigo, dados);
    }
    
    public String consultarObjeto(String codigo) {
        return implementador.consultar(codigo);
    }

}
