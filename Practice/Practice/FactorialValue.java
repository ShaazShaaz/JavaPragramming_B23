package Practice;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {

    /*
    Write a program to find the factorial value of any number entered through
    the keyboard.
     */
        System.out.println("Enter a number:");
        long num=new Scanner(System.in).nextInt();
         long result=1;
        for (long i = num; i >=1; i--) { // 3 2 1
            result*=i;              // 3*2*1

        }
        System.out.println(result);


    }
}
