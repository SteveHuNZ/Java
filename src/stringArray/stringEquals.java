package stringArray;

import java.util.Scanner;

public class stringEquals {
    public static void main(String[] args) {
        String okName ="ithema";
        String okPassword ="123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("login name");
        String name = sc.next();
        System.out.println("login password");
        String password = sc.next();
        if (okName.equals(name) && okPassword.equals(password)){
            System.out.println("successful");}else {
            System.out.println("wrong");
        }
    }
}
