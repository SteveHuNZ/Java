package stringArray;

import java.util.Scanner;

public class blockPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your phone number");
        String tel = sc.next();
        String before = tel.substring(0,3);
        String after = tel.substring(7);
        String s = before + "****" + after;
        System.out.println(s);
    }
}
