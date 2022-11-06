package applications;

import java.util.Scanner;

public class flightTickets {
    public static void main(String[] args) {
        //type purchase information ,using the method and get the results
        Scanner sc = new Scanner(System.in);
        System.out.println("original price");
        double money = sc.nextDouble();
        System.out.println("month");
        int month = sc.nextInt();
        System.out.println("class type");
        String type = sc.next();

        double rs = calc(money,month,type);
        System.out.println("now your price is" + rs);

    }
        //define a method
    public static double calc (double money, int month, String type){
            // judge it's peak season or off-season.
            if (month >= 5 && month <= 10) {
                // judge its economy class or first class in busy seasons
                switch (type) {
                    case "economy class ":
                        money *= 0.85;
                        break;
                    case "first class":
                        money *= 0.9;
                        break;
                    default:
                        System.out.println("please enter the right class ");
                        money = -1;
                }

            } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
                // judge its economy class or first class in off-seasons
                switch (type) {
                    case "economy class":
                        money *= 0.65;
                        break;
                    case "first class":
                        money *= 0.7;
                        break;
                    default:
                        System.out.println("please enter the right class ");
                        money = -1;
                }
            }
            return money;


     }


}