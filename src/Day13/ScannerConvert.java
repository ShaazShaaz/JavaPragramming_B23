package Day13;

import java.util.Scanner;

public class ScannerConvert {
    public static void main(String[] args) {
        /*
        Write a program that can convert cents to dollars, if there is any remainder
        include them in the result as cents
            Ex:
                Enter cents
                225
                output:
                225 cents equal to: 2 dollars and 25 cents
                Enter cents
                300 cents equal to: 3 dollars

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents: ");
        int cents= scan.nextInt();
        int dollars= cents/100;
        int remainder=cents%100;
        if (cents>=0) {   // if the input is valid
            if (remainder == 0) {
                System.out.println(cents + " is equal to $" + dollars);
            } else {
                System.out.println(cents + " cents is equal to $" + dollars + " and " + remainder + " cents");
            }
        }else {  // if the input is not valid
            System.out.println("invalid amount");
        }

    }
}
