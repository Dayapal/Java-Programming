package Day23;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {102,20,30,40,50};
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
          if(arr[i]  < min){
            min = arr[i];
          }
        }
        System.out.println(min);
    }
    
}
