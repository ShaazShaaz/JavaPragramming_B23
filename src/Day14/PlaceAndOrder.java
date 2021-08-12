package Day14;

import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        /*
        PlaceAnOrder task:
                Ask User to enter the product name (multiple words)- nextline method
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)
            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"
                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the product name:");
        String name=scan.nextLine();

        System.out.println("Enter the price:");
        double price= scan.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity= scan.nextInt();
        double total=quantity*price;

        System.out.println("Enter your first name:");
        String firstName= scan.next();
        scan.close();// closes the scanner. cannot reuse the scanner again.

        System.out.println(firstName+", your order for "+quantity+" "+name+" has been placed. Your total is "+total+".");



    }
}
