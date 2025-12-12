public class Main {
    public static void main(String[] args) {
        DocumentManager manager = DocumentManager.getInstance();

        manager.lockDocument("Alice");
        manager.unlockDocument("Alice");

        DocumentManager manager2 = DocumentManager.getInstance();
        manager2.lockDocument("Vani");
    }
}
