package COMPORTAMENTAIS.CDR;

public abstract class Middleware {

    private Middleware next;

    /**
     * Constrói cadeias de objetos middleware.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * As subclasses implementarão este método com verificações concretas.
     */
    public abstract boolean check(String email, String password);

    /**
     * Executa a verificação no próximo objeto da cadeia ou encerra a travessia se estivermos no
     * último objeto da cadeia.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
