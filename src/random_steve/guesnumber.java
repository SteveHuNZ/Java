package random_steve;

import java.util.Random;
import java.util.Scanner;

public class guesnumber {
    public static void main(String[] args) {
        Random r = new Random() ;
        int luckNumber = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("please guess one number 1-100");
            int guessNumber =sc.nextInt();
            if (guessNumber > luckNumber) {
                System.out.println("your guessing number is too big ");
            } else if (guessNumber<luckNumber) {
                System.out.println("your guessing number is too small");

            }else{
                System.out.println(" lucky ,your are right,please pay the bill");
                break;
            }
        }
    }
}
