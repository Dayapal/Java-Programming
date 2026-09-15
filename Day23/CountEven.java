package Day23;

public class CountEven {
    public static void main(String[] args) {
        int[] numbers = {10,30,52,32,53,32,33,5,510};
        int count = 0;

        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] % 2==0){
                count++;
            }
        }
      System.out.println("Event Count Numbres "+ count);
    }
}
