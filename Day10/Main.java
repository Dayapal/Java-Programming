import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctEmail = "admin@gmail.com";
        String correctPassword = "12345";

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (!email.equals(correctEmail)) {

            System.out.println("Email not found");

        } else if (!password.equals(correctPassword)) {

            System.out.println("Incorrect password");

        } else {

            System.out.println("Login successful");
        }
        sc.close();
    }

}