public class DocumentManager {

    private static DocumentManager instance;

    private String currentUser;

    private DocumentManager() {}

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public void lockDocument(String user) {
        if (currentUser == null) {
            currentUser = user;
            System.out.println("Documento bloqueado por: " + user);
        } else {
            System.out.println("Acesso negado! Documento está em uso por: " + currentUser);
        }
    }

    public void unlockDocument(String user) {
        if (currentUser != null && currentUser.equals(user)) {
            System.out.println("Documento liberado por: " + user);
            currentUser = null;
        } else {
            System.out.println("Não é possível liberar. Documento está com: " + currentUser);
        }
    }

    public String getCurrentUser() {
        return currentUser;
    }
}
