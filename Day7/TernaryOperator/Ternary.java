package Day7.TernaryOperator;

public class Ternary {
    public static void main(String[] args) {

        String result = "";

        int age = 71;

        if (age >= 21) {
            result = "Adult";
        } else {
            result = "Minor";
        }
        System.out.println(result);

        String result2 = age >= 21 ? "Adult" : "Minor";
        System.out.println("Result 2 answer: " + result2);
    }
}
