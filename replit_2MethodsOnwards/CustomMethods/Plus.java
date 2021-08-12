package CustomMethods;

import java.util.Scanner;

public class Plus {
  /*
       Implement the plus method. The return type is void and has no arguments.
               The method should ask the user to input two numbers, then it will add them and
               print the result.
       Hint: Create a scanner within plus method.
       Example:
       enter first number:
       1
       enter second number:
       2
       result: 3
        */
  public static void main(String[] args) {

   plus();
  }






   public static void plus(){

       Scanner scan=new Scanner(System.in);
       System.out.println("Enter first number:");
       int n1= scan.nextInt();
       System.out.println("Enter second number:");
       int n2= scan.nextInt();
       int plus=n1+n2;

       System.out.println(plus);

    }





}
