public class Practice {
    public static void main(String[] agrs) {
        String username = "Dedicated";
        String password = "Dedicated123";
        if (username.equals("Dedicated") && password.equals("Dedicated123")) {
            System.out.println("Login successfully");
        } else {
            System.out.println("Invalid username or password");
        }
        int age = 21;

        boolean result = age >= 18;

        System.out.println(result);
        if (result) {
            System.out.println("Adult");
        }

        int number = 0;
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else if (number == 0) {
            System.out.println("Zero");
        }
    }
}
