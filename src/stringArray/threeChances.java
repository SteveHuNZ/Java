package stringArray;

import java.util.Scanner;

public class threeChances {
    public static void main(String[] args) {
        String okLoginName = "admin";
        String okPassword = "itheima";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <3 ; i++) {
            System.out.println("please enter your login name");
            String loginName = sc.next();
            System.out.println("please enter your password");
            String password = sc.next();
            if(okLoginName.equals(loginName)){
                if(okPassword.equals(password)){
                    System.out.println("log in successfully ");
                    break;

                }else{System.out.println("your password was not correct ,you left "+(3-i)+"changes");};





            }

            else {System.out.println("your pin login name was not correct ,you left "+(3-i)+"changes");};


        }
    }
}
