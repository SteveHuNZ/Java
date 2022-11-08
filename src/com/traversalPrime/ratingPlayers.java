package com.traversalPrime;

import java.util.Scanner;

public class ratingPlayers {
    public static void main(String[] args) {
        // define a dynamic array , to gather information
        int []scores = new int [6];
        // gather judge's scores
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("please enter the "+(i+1)+"judge's score");
            int score = sc.nextInt();
            scores[i]=score;

        }
        //traversal every score in the array , and find max and min.
        //int max = scores[o],min = scores[0],sum =0;
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i]> max){
                max = scores[i];}
            if (scores[i]< min){
                min = scores[i];}
            sum += scores[i];

        }
        System.out.println("max is :"+ max);
        System.out.println("min is :"+ min);
        double result =(sum - max - min )* 1.0 /(scores.length -2);
        System.out.println("player's final score is :"+ result);
    }

}
