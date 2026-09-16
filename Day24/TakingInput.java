package Day24;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + " numbers");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }

      sc.close();
    }
}