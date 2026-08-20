public class ServerInfo {
    // Private fields can only be accessed within this class
    private String port;

    // Constructor
    public ServerInfo(String port) {
        this.port = port;
    }

    // Public method accessible anywhere
    public void start() {
        System.out.println("Server running on port " + this.port);
    }

    public static void main(String[] args) {
        ServerInfo backend = new ServerInfo("8080");
        backend.start();
    }
}