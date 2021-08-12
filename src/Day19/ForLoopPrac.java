package Day19;

import java.util.Scanner;

public class ForLoopPrac {
    public static void main(String[] args) {
        /*
        write a program that can calculate the sum of all numbers between 1 to any given num
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scan.nextInt();
        int sum=0;
        for (int i = 1; i <=num; i++) {
            sum +=i;
        }
        System.out.println("sum: "+sum);

    }
}
