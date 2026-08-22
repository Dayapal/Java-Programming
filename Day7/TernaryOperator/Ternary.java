package Day7.TernaryOperator;

public class Ternary {
    public static void main(String[] args) {

        String result = "";

        int age = 71;
        int number = 21;

        if (age >= 21) {
            result = "Adult";
        } else {
            result = "Minor";
        }
        System.out.println(result);

        String result2 = age >= 21 ? "Adult" : "Minor";
        System.out.println("Result 2 answer: " + result2);

        String answer = number%2==0?"Even": "Odd";
        System.out.println("Number is odd or even : "+ answer);

        
    }
}
