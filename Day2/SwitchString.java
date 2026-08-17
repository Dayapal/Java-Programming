public class SwitchString {
    public static void main(String[] args) {

        String role = "admin";

        switch (role) {

            case "admin":
                System.out.println("Full access");
                break;

            case "user":
                System.out.println("Limited access");
                break;

            case "guest":
                System.out.println("Guest access");
                break;

            default:
                System.out.println("Unknown role");
        }

    }
}