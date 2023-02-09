package com.steve.run;

import com.steve.bean.Business;
import com.steve.bean.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MovieSystem {
    /**
     *
     * 定义系统数据容器用户存储数据
     */
    public static final List<User> ALL_USERS = new ArrayList<>();
    //store  all the business and movie information
    public static Map<Business, List<Movie>> ALL_MOVIES =  new HashMap<>();
    public static final Scanner SYS_SC = new Scanner(System.in);

    /**
     * prepare some test data
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b , movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies3); // b2 = []
    }
    public static void main(String[] args) {
        showMain();

    }

    /**
     * 首页展示
     */

    private static void showMain() {
        System.out.println("================William 电影首页========================");
        System.out.println("1登录");
        System.out.println("2用户注册");
        System.out.println("3商家注册");
        while (true) {
            System.out.println("请输入操作命令");
            String command = SYS_SC.nextLine();
            switch(command){
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("command is wrong , please enter a proper one");
            }
        }
    }

    private static void login() {
    }
}
