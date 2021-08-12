import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        /*
        Let's say I've got a 100$ gift card and you want to buy something in your online store .
         Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 15$ Hat - 25$ Headphones - 30$ Laptop - 200$
Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$
Hint: if/ else if / else or switch statement
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the item:");
        String item= scan.nextLine();
        int cost=0;
        int balance=0;


            if (item.equals("Blanket")) {
                cost = 60;
            } else if (item.equals("Charger")) {
                cost = 15;
            } else if (item.equals("Hat")) {
                cost = 25;
            } else if (item.equals("Headphones")) {
                cost = 30;
            } else if (item.equals("Laptop")) {
                cost = 200;
            } else if (item.equals("Pants")) {
                cost = 50;
            } else if (item.equals("Pillow")) {
                cost = 40;
            } else if (item.equals("Smartphone")) {
                cost = 1000;
            } else if (item.equals("Socks")) {
                cost = 5;
            } else if (item.equals("USB cable")) {
                cost = 10;
            } else {
                System.out.println("Invalid item!");
            }
            if (cost<=100) {
                System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - cost) + "$");
            }else {

            System.out.println("Sorry, not enough funds on your gift card!");
        }


    }
}
