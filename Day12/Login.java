package Day12;

import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String correctEmail = "admin@gmail.com";
        String correctpassword = "12345";

        System.out.println("Enter you email");
        String email = sc.nextLine();

        System.out.println("Enter your password");
        String password = sc.nextLine();
    }
}
