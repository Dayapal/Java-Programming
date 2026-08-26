import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Are you a student? (yes/no): ");
        String student = sc.next();

        System.out.print("Enter day: ");
        String day = sc.next();

        double originalPrice = 300;
        double price;

        // Decide ticket price
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

        // Wednesday discount
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
        sc.close();
    }

}