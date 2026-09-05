package Day14;

import java.util.Scanner;

public class Functions {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + add(a, b));
        System.out.println("Subtraction = " + subtract(a, b));
        System.out.println("Multiplication = " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division = " + divide(a, b));
        }
    
    }
}