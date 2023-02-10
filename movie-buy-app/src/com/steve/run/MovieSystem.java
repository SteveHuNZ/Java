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
    //定义一个静态的User类的变量，记住当前登录成功的客户对象
    public static User loginUser;

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
        while (true) {
        System.out.println("================William 电影首页========================");
        System.out.println("1登录");
        System.out.println("2用户注册");
        System.out.println("3商家注册");

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
        while (true) {
            System.out.println("请输入登录名称");
            String loginName = SYS_SC.nextLine();
            System.out.println("请输入登录密码");
            String passWord = SYS_SC.nextLine();
            //根据用户名查询用户对象
            User u = getUserByLoginName(loginName);
            if (u != null){
                //比对密码是否正确
                if (u.getPassWord().equals(passWord)){
                    //登录成功
                    loginUser = u;//记住登录成功的用户
                    //判断是用户还是商家登录
                    if(u instanceof Customer){
                        //当前登录是普通客户
                        showCustomerMain();

                    }else {
                        showBusinessMain();
                        //当前登录是用户
                    }
                    return;
                }else {
                    System.out.println("密码有误");

                }


            }else {
                System.out.println("登录名错误，请确认");
            }
        }
    }

    /**
     * 商家页面操作
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() +"请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 用户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
                    scoreMovie();
                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    public static User getUserByLoginName(String loginName){
        for (User user : ALL_USERS) {
            //判断这个用户的登录名称是否是我们想要的
            if(user.getLoginName().equals(loginName)){
                return user;
            }

            
        }
        return null;
    }
}
