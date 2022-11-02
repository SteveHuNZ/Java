package random_steve;

import java.util.Random;
import java.util.Scanner;

public class guessnumber2 {
    public static void main(String[] args) {

        int[]codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("please enter"+(i + 1)+"employee's number");
            int code = sc.nextInt();
            codes[i] = code;
        }
        Random r = new Random();
        for(int i=0;i<codes.length;i++){
            int index = r.nextInt(codes.length);
            int temp = codes[index];
            codes[index]=codes[i];
            codes[i] = temp;
        }
    }
}
