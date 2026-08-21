package Day5.inputTaking;

import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a = scn.nextInt();

        System.out.println("Enter you Second Number: ");
        int b = scn.nextInt();
        System.out.println("Sum " + (a + b));
        scn.close();

    }

}
