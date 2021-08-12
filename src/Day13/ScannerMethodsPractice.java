package Day13;

import java.util.Scanner;

public class ScannerMethodsPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("you are full time employee:");
        boolean isFullTime= scan.nextBoolean();

        System.out.println("you are an adult");
        boolean adult= scan.nextBoolean();

        System.out.println("you are married");
        boolean isMarried= scan.nextBoolean();

        System.out.println("is Full time"+ isFullTime);
        System.out.println("adult"+ adult);
        System.out.println("is married"+ isMarried);

        /*
        free shipping:
        price
        isPrime: true- free shipping
                 false- $3.99 shipping fee
         */



    }
}
