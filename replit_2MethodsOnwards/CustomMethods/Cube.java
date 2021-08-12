package CustomMethods;

import java.util.Scanner;

public class Cube {
    /*
    Create a method called cube. It is a void method with no arguments.
     Write all required code inside this method in order to read a number from the console
      and then prints the cubed value of that number:
Example:
input: 5
output: 125
     */
    public static void main(String[] args) {
        cube();
    }

    public static void cube(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int n= scan.nextInt();

        System.out.println(n*n*n);
    }




}
