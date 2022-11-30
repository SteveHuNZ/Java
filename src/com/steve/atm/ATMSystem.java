package com.steve.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        // 展示系统首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============ATM系统==============");
            System.out.println("1,账户登录");
            System.out.println("2,账户开户");

            System.out.println("请您选择操作");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    //用户登录//
                    login(accounts,sc);
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
     * 登录功能
     * @param accounts 全部账户的集合
     * @param sc 扫描器
     */

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==============系统登录操作===================");
        if(accounts.size()== 0){
            System.out.println("sorry, on any account on this system,please sign up firstly");
            return;
        }
        //正式进入登录操作
        while (true) {
            System.out.println("请您输入登录卡号");
            String cardId = sc.next();
            //判断卡号是否存在： 根据卡号去账户集合中查询账户对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null){
                while (true) {
                    // the id is included
                    // let uses to enter password and verify it
                    System.out.println("please enter password");
                    String passWord = sc.next();
                    //judge if the typed password is as same as in the account
                    if(acc.getPassWord().equals(passWord)){
                        //login successful
                        System.out.println("congratulations登录成功, "+ acc.getUserName() +"your card id is :" + acc.getCardId());
                        // operation pages
                        showUserCommand(sc , acc);

                        return;//展示操作页走完了，干掉登录方法




                    }else {
                        System.out.println("your password is wrong");
                    }
                }


            }else{
                System.out.println("sorry , this id is not included in the system");
            }
        }
    }

    /**
     * 展示登陆后的操作页面
     */
    private static void showUserCommand(Scanner sc,Account acc ) {
        while (true) {
            System.out.println("==================用户操作页面===================");
            System.out.println("1,查询账户");
            System.out.println("2，存款");
            System.out.println("3 取款");
            System.out.println("4转账");
            System.out.println("5，修改密码");
            System.out.println("6 退出");
            System.out.println("注销账户");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command){
                case 1 :
                    //1,查询账户
                    showAccount(acc);
                    break;
                case 2 :
                    //存款"
                    depositeMondy(acc, sc);
                    break;
                case 3 :
                    //取款"
                    break;
                case 4 :
                    //4转账"
                    break;
                case 5 :
                    //修改密码"
                    break;
                case 6 :
                    //退出"
                    System.out.println("退出成功");
                    return;//让当前方法停止执行

                case 7 :
                    //注销账户
                    break;
                default:
                    System.out.println("您输入的命令不存在 ");
            }
        }
    }

    /**
     * 存钱
     * @param acc 当前账户对象
     * @param sc 扫描器
     */

    private static void depositeMondy(Account acc, Scanner sc) {
        System.out.println("============存款信息如下==============");
        System.out.println("请您输入存款金额");
        double money = sc.nextDouble();
        //更新余额 原来的钱加上新存入的钱
        acc.setMoney(acc.getMoney()+ money);
        System.out.println("恭喜你，存钱成功，当前账户信息如下：");
        showAccount(acc);
    }

    /**
     * 展示账户信息
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("============当前账户信息如下==============");
        System.out.println("卡号："+ acc.getCardId());
        System.out.println("户主："+ acc.getUserName());
        System.out.println("余额："+ acc.getMoney());
        System.out.println("限额："+ acc.getQuotaMoney());
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


//       创建一个８位数的账户号码且与其他不重复
        String cardId = (String) getRandomCardId(accounts);
        account.setCardId(cardId);


        //3 把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println(userName+"you sigin up successfully ,your car number is :"+ cardId);
    }

    /**
     * generate 8 numbers which different from other account numbers.
     * @return
     */

    private static Object getRandomCardId(ArrayList<Account> accounts) {
        while (true) {

            Random r = new Random();
            String cardId = "";

            for(int i = 0;i<8;i++){
                cardId += r.nextInt(10);


            }

            //根据这个卡号去查询账户对象
            Account acc = getAccountByCardId(cardId,accounts);
            if(acc == null){return cardId;}
        }

    }

    /**
     *search an account depends on the card number
     * @param cardId    account number
     * @param accounts  all accounts in the Array
     * @return
     */
    private static Account getAccountByCardId(String cardId,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get (i);
            if(acc.getCardId().equals(cardId)){return acc; }

        }
        return  null;
    };
}
