package com.steve.traverse;

public class demo {
    public static void main(String[] args) {
        int [] arr ={1,3,5,7,55,9,10,6,2};

//        int sum = 0 ;
//        for (int i = 0; i < arr.length; i++) {
//            sum =sum + arr[i];
//
//        }
//        System.out.println(sum);
//        System.out.println("-----------");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}
