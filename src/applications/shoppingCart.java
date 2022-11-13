package applications;

import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class shoppingCart {
    public static void main(String[] args) {
        Goods[] shoppingCart = new Goods [100];
        // build the operation frame
       while (true){
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
                   addGoods(shoppingCart, sc);

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
               default:
                   System.out.println("don't have this function");


           }
       }



    }

    private static void pay(Goods[] shoppingCart) {
    }

    private static void updateGoods(Goods[] shoppingCart) {
    }




// query information and then displaying.
    private static void queryGoods(Goods[] shoppingCart) {

        System.out.println("=========queried information as blow============");
        System.out.println("number\t\tname\t\tprice\t\tquantity");
        for (int i = 0; i < shoppingCart.length; i++) {
            Goods g = shoppingCart[i];
            if(g != null){
                System.out.println(g.id + "\t\t" +g.name + "\t\t"+g.price + "\t\t"+ g.buyNumber + "\t\t");

            }else {break;}

        }
    }

    private static void addGoods(Goods[] shoppingCart,Scanner sc) {
        // enter users purchase information
        System.out.println("please enter the goods number, no repeating:");
        int id = sc.nextInt();
        System.out.println("please enter goods name: ");
        String name = sc.next();
        System.out.println("please enter quantity:");
        int buyNumber = sc.nextInt();
        System.out.println("please enter goods' price");
        double price = sc.nextDouble();

        // turn purchase information into an object
        Goods g  = new Goods();
        g.id = id ;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        // 3. put this object into the array of shopping cart (using for loop);
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i] == null){
                shoppingCart[i] = g ;
                break;
            }

        }
        System.out.println("your item:"+ g.name + " already put in the trolley");


    }
}
