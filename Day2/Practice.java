public class Practice {
    public static void main(String[] agrs) {
        String username = "Dedicated";
        String password = "Dedicated123";
        if (username.equals("Dedicated") && password.equals("Dedicated123")) {
            System.out.println("Login successfully");
        } else {
            System.out.println("Invalid username or password");
        }
        int age = 20;

        boolean result = age >= 18;

        System.out.println(result);
        if(result){
            System.out.println("Adult");
        }
    }

}
