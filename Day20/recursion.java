package Day20;

public class recursion {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println("Hello everyone");

    };

    public static int Factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
