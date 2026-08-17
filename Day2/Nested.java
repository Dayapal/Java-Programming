public class Nested {

    public static void main(String[] args) {
        int age = 20;
        boolean hasId = true;
        if (age >= 18) {
            if (hasId) {
                System.out.println("Entry allowed");
            }
        } else {
            System.out.println("You are under 18");
        }

    }
}