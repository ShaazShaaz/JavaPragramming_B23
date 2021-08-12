package Day13;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        ask: building number- int
             street address=next line
             city name- next line
             state- next
             zipcode-next
             full name-next line
             : then print the shipping info
              shazia senol
              622 kelso rd
              pittsburgh PA 15243
         */

        System.out.println("Enter your building number:");
             int buildingNumber=scan.nextInt();

             scan.nextLine();

        System.out.println("Enter your street address:");
        String street= scan.nextLine();

        System.out.println("Enter your city:");
        String city=scan.nextLine();

        System.out.println("Enter your state:");
        String state=scan.next();

        System.out.println("Enter your zipcode:");
        String zipcode=scan.next();

        scan.nextLine();

        System.out.println("Enter full name:");
        String name= scan.nextLine();

        String shippingAddress= name+ "\n"+ buildingNumber+" "+ street+"\n"+city+" "+state+"\n"+zipcode;

        System.out.println("Shipping Address:\n "+ shippingAddress);


    }
}
