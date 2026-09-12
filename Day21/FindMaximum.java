package Day21;

public class FindMaximum {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number this array is: " + max);

    }
}
