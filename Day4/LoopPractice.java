package Day4;

public class LoopPractice {
    public static void main(String[] args){
        
        for(int i = 1; i < 100; i++){
            if(i%2==0){
                System.out.println("There are the even number" + i);
            }
        }

        int sum = 0;
        for(int i = 1; i <=5; i++){
            sum += i;
            System.out.println("Sum of total number from 1 to 5 is : "+ sum);
        }
    }
}