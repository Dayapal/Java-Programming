package Day7.TernaryOperator;

public class practice {
    public static void main(String[] args){
        int number = 21;

        String result = number > 0 ? "Positive": "Negative";
        System.out.println("result: "+ result);


        int day = 00;
       
        switch (day) {
            case 1:{
                   System.out.println("Today is Monday");
                break;
            }
            case 2:{
                   System.out.println("Today is Tuesday");
                break;
            }
            case 3:{
                   System.out.println("Today is Wednesday");
                break;
            }
            case 4:{
                   System.out.println("Today is Thursday");
                break;
            }
            case 5:{
                   System.out.println("Today is Friday");
                break;
            }
            case 6:{
                   System.out.println("Today is Saturday");
                break;
            }
            case 7:{
                   System.out.println("Today is Sunday");
                break;
            }
            
            default:{
                System.out.println("Invalid Input");
            }

                break;
        }
    }
}
