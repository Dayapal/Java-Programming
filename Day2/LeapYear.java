public class LeapYear {
    public static void main(String[] agrs) {
        int year = 2000;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + "is a Leap Year");
        } else {
            System.out.println(year + " It is a Normal Year");
        }
    }
}