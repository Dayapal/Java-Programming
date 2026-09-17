package Day25;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[] SingleArray = { 10, 20, 30, 40, 50 };
        int[][] Twoarr = {
                { 10, 20, 30, 50, 60 },
                { 10, 20, 30, 50, 60 },
                { 70, 80, 90, 100, 110 },
                { 70, 80, 90, 100, 110 },
                { 70, 80, 90, 100, 110 },
        };
        System.out.println("TwoD array : " + Arrays.deepToString(Twoarr));
        System.out.println("Single Array " + SingleArray);

    }
}
