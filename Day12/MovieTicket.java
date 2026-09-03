package Day12;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre you Age: ");
        int age = sc.nextInt();

        System.out.println("Are you student ? (yes/no): ");
        String student = sc.next();

        System.out.println("Enter Day ");
        String day = sc.next();

        double originalPrice = 300;
        double price;
        if (age < 12) {
            price = 150;
        } else if (age >= 60) {
            price = 180;

        } else if (student.equalsIgnoreCase("yes")) {
            price = 200;
        } else {
            price = 300;
        }

        double discount = originalPrice - price;

        if (day.equalsIgnoreCase("Wednesday")) {

            price = price - 50;
            discount = originalPrice - price;
        }

        System.out.println();
        System.out.println("----- Ticket -----");

        System.out.println("Age: " + age);
        System.out.println("Student: " + student);
        System.out.println("Day: " + day);

        System.out.println("Original Price: ₹" + originalPrice);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + price);
    }
}
