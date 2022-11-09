package applications;

import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        //define a array , to store numbers which need to  encrypt data
        System.out.println(" please enter the quantity of numbers which need to encrypt :");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int [length];

        //type numbers which need to encrypt ;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("please enter the :" +(i+1)+"th number");
            int number = sc.nextInt();
            arr[i]= number;

        }
        // print the contents of array

        printArray(arr);
        // core logical - encrypting
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5 )% 10;
        }
        // cor logical ,make the array backwards
        for (int i = 0, j =  arr.length-1;i<j; i++,j--) {
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

        }
        printArray(arr);




    }
    public static  void printArray(int[] arr){
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1?arr[i]:arr[i] + ",");}

        System.out.println("]");
    }
}

