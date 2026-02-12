package COMPORTAMENTAIS.CDR;

public class RoleCheckMiddleware extends Middleware {

    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Olá, administrador!");
            return true;
        }

        System.out.println("Olá, usuário!");
        return checkNext(email, password);
    }
}
