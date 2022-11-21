package com.steve.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        // 展示系统首页
        while (true) {
            System.out.println("=============ATM系统==============");
            System.out.println("1,账户登录");
            System.out.println("1,账户开户");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您选择操作");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    //用户登录//
                    break;
                case 2:
                    //用户开户//
                    break;
                default:
                    System.out.println("您输入的命令不存在");
            }
        }

    }
}
