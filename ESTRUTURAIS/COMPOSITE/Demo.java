package ESTRUTURAIS.COMPOSITE;

public class Demo {
    public static void main(String[] args) {
        
        Divisao organizacaoGeral = new Divisao("Organização Global");

        Divisao ti = new Divisao("Departamento de TI");
        ti.adicionarComponente(new Pessoa("Ana (Dev)", 8000.00));
        ti.adicionarComponente(new Pessoa("Bruno (Suporte)", 4500.00));
        ti.adicionarComponente(new Maquina("Servidor Principal", 500.00));
        
        Divisao marketing = new Divisao("Departamento de Marketing");
        marketing.adicionarComponente(new Pessoa("Carlos (Gerente)", 12000.00));
        marketing.adicionarComponente(new Maquina("Impressora Gráfica", 150.00));
        
        Divisao vendas = new Divisao("Setor de Vendas");
        vendas.adicionarComponente(new Pessoa("Diana (Vendedor)", 4000.00));
        vendas.adicionarComponente(new Pessoa("Eduardo (Vendedor)", 4000.00));
        vendas.adicionarComponente(new Maquina("Notebook", 50.00));
        
        marketing.adicionarComponente(vendas); 
        organizacaoGeral.adicionarComponente(ti);
        organizacaoGeral.adicionarComponente(marketing);
        
        System.out.println("--- ESTRUTURA ORGANIZACIONAL ---");
        organizacaoGeral.exibirEstrutura("");
        
        System.out.println("\n--- RELATÓRIOS GERENCIAIS ---\n");
        
        System.out.println("-> ORGANIZAÇÃO GLOBAL (Total)");
        System.out.printf("Número Total de Ativos: %d\n", organizacaoGeral.getNumeroAtivos());
        System.out.printf("Valor de Investimento Mensal Total: R$%.2f\n", organizacaoGeral.getValorMensal());
        
        System.out.println("\n----------------------------------");
        
        System.out.println("-> DEPARTAMENTO DE MARKETING (Incluindo Vendas)");
        System.out.printf("Número de Ativos: %d\n", marketing.getNumeroAtivos());
        System.out.printf("Valor Mensal: R$%.2f\n", marketing.getValorMensal());
        
        System.out.println("\n----------------------------------");
        
        System.out.println("-> SETOR DE VENDAS (Subdivisão)");
        System.out.printf("Número de Ativos: %d\n", vendas.getNumeroAtivos());
        System.out.printf("Valor Mensal: R$%.2f\n", vendas.getValorMensal());
    }
}
