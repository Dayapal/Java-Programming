public class TernaryOperator {
    public static void main(String[] args) {

        int age = 21;
        String ans = age >= 18 ? "Adult" : "child";
        System.out.printf("Result", ans);

        int number = 10;

        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println(result);
    }
}