package Day15;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        /*
        ask from user-
        num1
        math operator
        num2
        ex. 10, -, 5  output= 5
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1=scan.nextDouble();

        System.out.println("enter math operator:");
        char operator=scan.next().charAt(0); // + - * /   this is the only way to return a mathematical operator

        System.out.println("enter 2nd number:");
        double num2= scan.nextDouble();
        double result=0;

        switch (operator){
            case '-':
                result=num1-num2;
                break;
            case '+':
                result=num1+num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("invalid operator");
        }

        System.out.println(result);



    }
}
