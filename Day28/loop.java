package Day28;

public class loop {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even number " + count);

     for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
            System.out.println(" i "+ i+ " j "+ j);
        }
     }

    }


}