package Day19;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        /*
        ask user to enter a number 5 times and find the minimum number
         */
        Scanner scan=new Scanner(System.in);
        int min=2147483647;  // so that any user entered number will be less than this num
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int n= scan.nextInt();  // 100 300 50 400 5
            if (n<min){
                min=n;
            }

        }
        System.out.println("min num is: "+min);

    }
}
