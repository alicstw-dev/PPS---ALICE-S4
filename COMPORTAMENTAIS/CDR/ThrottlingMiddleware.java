package COMPORTAMENTAIS.CDR;

public class ThrottlingMiddleware extends Middleware {

    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * Observe que a chamada checkNext() pode ser inserida tanto no início
     * deste método quanto no final.
     * 
     * Isso oferece muito mais flexibilidade do que um simples loop em todos os objetos middleware.
     * Por exemplo, um elemento de uma cadeia pode alterar a ordem das verificações executando
     * sua verificação após todas as outras.
     */
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Limite de requisições excedido!");
            Thread.currentThread().stop(); // ⚠ Atenção: stop() é obsoleto e perigoso
        }

        return checkNext(email, password);
    }
}
