package Day13;
import java.util.Scanner;

public class LargestOf_Three {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Entet Third Number");
        int c = sc.nextInt();

        if(a >=b && a >= 3){
            System.out.println("C i s greater");
        }else if(b >= 1 && b >= c){
            System.out.println("B is greater");
        }else {
            System.out.println("C is greater");
        }

        
    }
}
