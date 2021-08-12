package Day22;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1;
        int num2;
        char operator;
        String answer="";

        while (!(answer.equals("no"))){
            System.out.println("enter 2 numbers");
            num1= scan.nextInt();
            num2= scan.nextInt();
            System.out.println("Enter a math operator:");
            operator=scan.next().charAt(0);

            if (operator=='-'){
                System.out.println("Subtraction: "+(num1-num2));
            }else if (operator=='+'){
                System.out.println("Addition: "+(num1+num2));
            }else  if (operator=='*'){
                System.out.println("Multiplication: "+(num1*num2));
            }else if (operator=='/'){
                System.out.println("Division: "+(num1/num2));
            }else {
                System.out.println("Invalid operator");
            }

            System.out.println("Do you want to continue?");
            answer= scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.out.println("invalid entry. please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }
        }


    }
}
