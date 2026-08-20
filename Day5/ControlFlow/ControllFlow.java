public class ControllFlow {
    public static void main(String[] args){
        int status = 404;

        String response  = switch (status){
            case 200 -> "Ok";
            case 404 -> "Not Found";
            case 500 -> "Server Error";
            default -> "Unknown Status";
        };
        System.out.println("Status " + response);
    

    }
}