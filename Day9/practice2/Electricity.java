package Day9.practice2;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {

            bill = units * 5;

        } else if (units <= 200) {

            bill = units * 7;

        } else {

            bill = units * 10;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
}