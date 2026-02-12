package COMPORTAMENTAIS.CDR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe de demonstração. Tudo se junta aqui.
 */
public class Demo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();

        // Registro de usuários
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // Todas as verificações estão vinculadas. O cliente pode construir várias cadeias usando os mesmos componentes.
        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),     // Limite de requisições por minuto
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Email: ");
            String email = reader.readLine();

            System.out.print("Senha: ");
            String password = reader.readLine();

            success = server.logIn(email, password);
        } while (!success);
    }
}

