package Day20;

import java.util.Scanner;

public class BranchingStatements2 {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of numbers entered by the user until user enters a
         negative number.
            hint: you need an infinite loop
         */
        Scanner scan=new Scanner(System.in);
        int result=0;
        for (int i=0;i==0 ; ) {  // can also write for(;;) by default it is an infinite loop
            System.out.println("Enter a number");
            int n= scan.nextInt();
            if(n<0){  // if user entered a negative number, break stmt gets executed and exits the loop
                break;
            }
            result+=n;

        }
        System.out.println(result);
    }
}
