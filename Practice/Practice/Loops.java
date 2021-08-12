package Practice;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Write a program to print numbers from 1 to 10
         */

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
            System.out.println();
        }
        /*
        Write a program to calculate the sum of first 10 natural number.
         */
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
           sum+=i;

        }
        System.out.println(sum);

        /*
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
         */
        System.out.println("Enter a number:");
        int num=new Scanner(System.in).nextInt();

        if (num>=1){
        for (int i = 1; i <=10 ; i++) {

            System.out.println(num+"X"+i+"= "+(num*i));
        }

        }else {
            System.out.println("Invalid entry");

        }

    }
}
