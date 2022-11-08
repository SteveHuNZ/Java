package com.traversalPrime;

public class traversalPrime {
    public static void main(String[] args) {
        // define a loop to find all the primes between 101-200





        for (int i = 101; i <=200 ; i++) {
            // set a flag
            boolean flag = true;


            // judge the numbers in this traversal are primes or not

            for (int j = 2; j <i/2 ; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }

            }
            if(flag){
                System.out.println(i + "\t");}

        }

    }
}
