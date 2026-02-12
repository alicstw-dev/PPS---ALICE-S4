package COMPORTAMENTAIS.CDR;

public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("Este email não está registrado!");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Senha incorreta!");
            return false;
        }

        return checkNext(email, password);
    }
}
