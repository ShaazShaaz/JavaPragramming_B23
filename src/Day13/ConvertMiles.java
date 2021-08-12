package Day13;

import java.util.Scanner;

public class ConvertMiles {
    public static void main(String[] args) {
        /*
         Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0
                output:
                10.0 miles equal to 16.09 kilometers
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Miles:");
        double miles=scan.nextDouble();
        double Km= miles*1.609;
        System.out.println(" miles is equal to " + Km+ " kilometers");


    }
}
