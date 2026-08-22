package Day7.practice;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Marks");
         int marks = sc.nextInt();

         if(marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
         }else{
            switch (marks/10) {
                case 10:
                    case 9:
                        System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade C");
                    break;
                case 6:
                    System.out.println("Grade D"); 
                    break;  
        
                default:
                    System.out.print("Fail");
                    break;

            }
         }
         sc.close();
    }
    
}
