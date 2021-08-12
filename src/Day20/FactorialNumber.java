package Day20;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        Write a program that can return the factorial number of any given number
   Ex:      input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        System.out.println("Enter a number:");
      int number=new Scanner(System.in).nextInt();  // only for 1 time use- create an object and call
        // nextInt and assign it to a variable
      int result=1;  // cnt write 0, cuz result will always be 0 then
      for (int i=number; i>=1;i--){ // i: 3,2,1
          result*=i;
      }

        System.out.println(result);


    }
}
