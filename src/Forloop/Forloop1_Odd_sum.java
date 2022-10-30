package Forloop;

public class Forloop1_Odd_sum {
    public static void main(String[] args) {
//        int sum= 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += i;
//
//        }
//        System.out.println("the sum from1-5 s :" +sum);


        //the sum of odd from 1-10

        int sum= 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1){
                sum += i;
            }




        }
        System.out.println(" the sum of odd from 1-10 is :"+ sum);
    }
}
