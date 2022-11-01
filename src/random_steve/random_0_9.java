package random_steve;

import java.util.Random;

public class random_0_9 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0;i< 20; i++){
            int data = r.nextInt(10);
            System.out.println(data);
        }
    }
}
