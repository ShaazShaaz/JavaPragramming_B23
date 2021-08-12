package Day19;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
    /*
    Ask user to enter a number 5 times and then find the maximum number
     */
        Scanner scan = new Scanner(System.in);
        int max=-2147483648;  // whatever user enters, its larger than this number(lowest int number)
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int n= scan.nextInt(); //1,5,3
            if (n>max){
                max=n;
            }
            System.out.println(max);


        }


    }
}