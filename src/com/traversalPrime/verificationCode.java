package com.traversalPrime;

import java.util.Random;

public class verificationCode {
    public static void main(String[] args) {
       String code = createCode(22);
        System.out.println("the verification code is :" + code);
    }

    public static String createCode(int n ){
        //define a string to record the generated verification code

        String code ="";
        Random r = new Random();
        //define a for loop , circle n times to generate numbers
        for (int i = 0; i <n ; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    // upper case (A65-Z65+25)
                    char ch = (char)(r.nextInt(26)+65);
                    code += ch;
                    break;
                case 1:
                    // lower case (A97-Z97+25)
                    char ch1 = (char)(r.nextInt(26)+97);
                    code += ch1;
                    break;

                case 2:
                    code += r.nextInt(10);//0-10
                    break;
            }

        }
        return code;

    }

}
