package com.steve.swit;

public class witchstev {
    public static void main(String[] args) {
        String weekday = "zhousan";

        switch (weekday){
            case "zhouyi":
                System.out.println("haha monday");
                break;

            case "zhouer":
                System.out.println("haha tuesday");
                break;



            case "zhousan":
                System.out.println("haha wednesday");
                break;

            default:
                System.out.println("there are some worng");



        }

        System.out.println("--------");
        for(int i=0 ;i<3; i++){
            System.out.println("william is gonging to camp");
        }
    }

}
    git remote add origin git@github.com:SteveHuNZ/Java.git
        git branch -M main
        git push -u origin main