package Day20;

public class prime {
    public static void main(String[] args) {
        int number = 6;
        int count = 0;
        for(int i = 1; i <=number; i++){
            if(number%i==0){
                count += 1;
            }
        }
        if(count == 2){
            System.out.println("This number is prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
