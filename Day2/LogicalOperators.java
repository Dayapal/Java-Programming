public class LogicalOperators {
    public static void main(String[] args) {
        int age = 1;
        
    
        boolean hasLicense = true;
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive the car ");
        }

        boolean isRaining = true;
        if(!isRaining){
            System.out.println("Go outside");
        }else{
            System.out.println("You cannot go outside");
        }
        
        

    }
}
