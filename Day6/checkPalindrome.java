package Day6;

public class checkPalindrome {
    public static void main(String[] args){
        String  name = "racecar";
        String str = "";
        for(int i = 0; i < name.length(); i++){
            str += name.charAt(i);
        }
        if(name==str){
            System.out.println("Yes it is a palindrom");
        }else{
            System.out.println("No This is not a palindrome");
        }
    }
    
}
