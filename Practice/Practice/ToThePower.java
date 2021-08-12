package Practice;

import java.util.Scanner;

public class ToThePower {
    public static void main(String[] args) {
        /*
        Two numbers are entered through the keyboard. Write a program to find the value
         of one number raised to the power of another. (Do not use Java built-in method)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int result=1;
        for (int i = 1; i <=num2; i++) {  // _ _ _
            result*=num1;  // result= num1*num1*num1

        }
        System.out.println(result);

    }
}
