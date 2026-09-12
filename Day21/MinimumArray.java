package Day21;

public class MinimumArray {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("Min of array " + min);
    }

}
