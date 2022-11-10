package applications;

import java.util.Random;
import java.util.Scanner;

public class powerBall {
    public static void main(String[] args) {
        int [] luckNumber = createLuckNumber();
        printArray(luckNumber);

        int []userNumbers = userInputNumbers();
        printArray(userNumbers);

    }
    public static void printArray(int[] arr ){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+ "\t");

        }
        System.out.println();

    }
    public  static  int[] userInputNumbers(){
        int []numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1   ; i++) {
            System.out.println("please enter "+(i + 1 )+ "th  red ball number ,cannot repeat");
            int data = sc.nextInt();
            numbers[i]= data;
        }
        System.out.println("please enter a blue ball number (1-16): ");
       numbers[6] = sc.nextInt();
       return numbers;




    }

public static int[] createLuckNumber() {
    //define a dynamic array to store 7 numbers
    int [] numbers = new int [7];
    //traversal the array ,generate numbers for each positon  of this array
    Random r = new Random();
    for (int i = 0; i < numbers.length; i++) {
        while(true){ int data = r.nextInt(33)+ 1;

            boolean flag = true;

            for (int j = 0; j <i ; j++) {
                if(numbers[j] == data){
                    flag = false;
                    break;
                }

            }
            if (flag){
                numbers[i] = data;
                break;
            }





        }



    }

numbers[numbers.length -1 ]= r.nextInt(16) +1;
    return numbers;

}







}
