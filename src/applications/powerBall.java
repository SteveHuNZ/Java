package applications;

import java.util.Random;
import java.util.Scanner;

public class powerBall {
    public static void main(String[] args) {
        int [] luckNumbers = createLuckNumber();


        int []userNumbers = userInputNumbers();


        //judge it's wining or not
        judge(luckNumbers,userNumbers);

    }

    public  static void judge(int [] luckNumbers, int[]userNumbers){
        int redHitNumbers = 0 ;
        int blueHitNumbers = 0;

        for (int i = 0; i < userNumbers.length -1 ; i++) {
            for (int j=0;j< luckNumbers.length -1;j++){
                if(userNumbers[i] == luckNumbers[j]){
                    redHitNumbers ++ ;
                    break;
                }
            }

        }

blueHitNumbers=luckNumbers[6] ==userNumbers[6]? 1:0;
        System.out.println("win number is :");
        printArray(luckNumbers);
        System.out.println("your own number is :");
        printArray(userNumbers);
        System.out.println("How many balls you've got :"+ redHitNumbers);
        System.out.println("if you got blue ball :"+(blueHitNumbers == 1? "yes" :"no"));


        // judge the situation of win the lottery
        if (blueHitNumbers== 1 && redHitNumbers<3){
            System.out.println("congratulations you got $5");
        }else if (blueHitNumbers== 1 && redHitNumbers==3
                ||blueHitNumbers ==0 && redHitNumbers ==4
        ){
            System.out.println("congratulations you got $10");
        }else if (blueHitNumbers== 1 && redHitNumbers==4
                ||blueHitNumbers ==0 && redHitNumbers ==5
        ){
            System.out.println("congratulations you got $200");
        }
        else if (blueHitNumbers== 1 && redHitNumbers==5
                ||blueHitNumbers ==0 && redHitNumbers ==6
        ){
            System.out.println("congratulations you got $3000");
        }
        else if (blueHitNumbers== 0 && redHitNumbers==6

        ){
            System.out.println("congratulations you got $5000000");
        }
        else if (blueHitNumbers== 1 && redHitNumbers==6

        ){
            System.out.println("congratulations you got $10000000, you are financial freedom");
        }else{
            System.out.println("thanks for your contribution,you won nothing");
        }
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
            System.out.println("please enter "+(i + 1 )+ "th  red ball number ,numbers should be no repeated");
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
