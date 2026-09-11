package Day20;

public class loop {
    public static void main(String[] args){
        int[] numbers = {10,23,30,43,50};

        for(int i = 0; i < numbers.length; i++){
            if(i%2==0){

                System.out.println(numbers[i]);
            }
        }
    }
}
