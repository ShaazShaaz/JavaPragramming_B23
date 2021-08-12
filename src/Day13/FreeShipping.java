package Day13;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {

          /*
        free shipping:
        price
        isPrime: true- free shipping
                 false- $3.99 shipping fee
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the item price:");
        double price=scan.nextDouble();

        System.out.println("Are you a prime member?");
        boolean isPrime= scan.nextBoolean();

        double totalCost=(isPrime || price>25)?price:price+3.99;

        System.out.println("total cost: " + totalCost);


    }
}
