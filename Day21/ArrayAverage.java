package Day21;

public class ArrayAverage {
    public  static  void main(String[] args){
        int[] array = {10,20,30,40,50};
        int sum = 0;
        for(int i =0; i < array.length; i++){
            sum += array[i];
        }
        double average = (double) sum/ array.length;
        System.out.println("Average of array: "+ average);

     }
}
