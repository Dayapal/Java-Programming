package Day23;

public class FindElements {
   public static void main(String[] args) {
    int[] numbers = {10,3,2,53,58,53,25,55,98};
    int target = 20;
    boolean found  = false;
    for(int i = 0; i < numbers.length;i++){
        if(numbers[i] == target){
            found = true;
            break;
        }
    }
    if(found){
        System.out.println("Found the target element");
    }else{
        System.out.println("Did not found the elements");
    }
   } 


}
