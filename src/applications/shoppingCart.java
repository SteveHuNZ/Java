package applications;

import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        Goods[] shoppingCart = new Goods [100];
        // build the operation frame
        System.out.println(" please choose blow command to continue");
        System.out.println(" please add items to the shopping cart :add");
        System.out.println(" query items in the cart: query");
        System.out.println(" change the quantity :update ");
        System.out.println(" check out : pay ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter your commands");
        String command = sc.next();
        switch (command){
            case "add":
                addGoods(shoppingCart);

                break;

            case "query":
                queryGoods(shoppingCart);

                break;

            case"update":
                updateGoods(shoppingCart);
                break;

            case "pay":
                pay(shoppingCart);
                break;


        }



    }

    private static void pay(Goods[] shoppingCart) {
    }

    private static void updateGoods(Goods[] shoppingCart) {
    }

    private static void queryGoods(Goods[] shoppingCart) {
    }

    private static void addGoods(Goods[] shoppingCart) {
    }
}
