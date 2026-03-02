package CDR;

public class Demo {

    public static void main(String[] args) {

        // onde cria os níveis hierárquicos
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();
        Aprovador ceo = new CEO();

        // montando a cadeia pra apontar para o próximo que pode processar aquele valor
        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);
        diretor.setProximo(ceo);

        // cria um pedido com um valor x
        Pedido pedido = new Pedido(111001);

        // iniciando a cadeia pelo menor nível
        supervisor.aprovar(pedido);
    }
}
