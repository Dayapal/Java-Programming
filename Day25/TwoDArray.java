package Day25;

// import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
       
        int[][] Twoarr = {
                { 10, 20, 30, 50, 60 },
                { 10, 20, 30, 50, 60 },
                { 70, 80, 90, 100, 110 },
                { 70, 80, 90, 100, 110 },
                { 70, 80, 90, 100, 110 },
        };
        // System.out.println("TwoD array : " + Arrays.deepToString(Twoarr));
       
        for(int i = 0; i < Twoarr.length; i++){
            for(int j = 0; j < Twoarr[i].length; j++){
                System.out.print(Twoarr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
