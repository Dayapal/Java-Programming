import java.util.Scanner;

public class UserInput05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name " + name);
        System.out.println("age " + age);

        sc.close();
    }
}
