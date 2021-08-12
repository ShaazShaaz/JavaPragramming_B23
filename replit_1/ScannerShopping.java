import java.util.Scanner;

public class ScannerShopping {
    public static void main(String[] args) {
        /*
        In this assignment you will write a program to create a shopping list and prices.
You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate
 total price and show as a report.
-Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3, totalPrice
-Create a Scanner object named scan.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st item and price:");
        String item1= scan.nextLine();
        double price1= scan.nextDouble();

        scan.nextLine();

        System.out.println("enter 2nd item and price:");
        String item2= scan.nextLine();
        double price2= scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter 3rd item and price:");
        String item3= scan.nextLine();
        double price3= scan.nextDouble();

        double totalPrice=price1+price2+price3;

        System.out.println("Item1: " + item1+ " Price: "+price1+", Item2: " + item2+ " Price: " +
                ""+price2+", Item3: "+item3+", Price: "+price3);
        System.out.println("TotalPrice: " + totalPrice);



    }
}
