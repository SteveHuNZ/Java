package com.steve.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        // 展示系统首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============ATM系统==============");
            System.out.println("1,账户登录");
            System.out.println("1,账户开户");

            System.out.println("请您选择操作");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    //用户登录//
                    break;
                case 2:
                    //用户开户//
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("您输入的命令不存在");
            }
        }

    }

    /**
     * 实现开户功能
     * @param accounts
     */

    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==============系统开户操作====================");
        //创建一个用户对象， 用于后期封装账户信息
        Account account = new Account();
        //录入这个账户的信息， 注入到账户的对象中去。
        System.out.println("请您输入账户用户名");
        String userName = sc.next();
        account.setUserName(userName);


        while (true) {
            System.out.println("请您输入账户密码");
            String passWord = sc.next();
            System.out.println("请您输入确认账户密码");
            String okPassWord = sc.next();
            if(okPassWord.equals(passWord)){
                //密码认证通过， 可以注入到账户对象
                account.setPassWord(okPassWord);
                break;
            }else{
                System.out.println("密码不一致请重新输入");
            }
        }
        System.out.println("请您输入当此限制额");
       double quotaMoney = sc.nextDouble();
       account.setQuotaMoney(quotaMoney);


        //3 把账户对象添加到账户集合中去
    }
}
