package Day28_Methods;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //OddNumbers(scan.nextInt(), scan.nextInt());// to get the range from user
        OddNumbers(1,100);  // ()should hold the argument/the range-information needed to be given
        EvenNumbers(100,200);
        calculateAge(1981);
        eligibleToVote(31,false);
        calculate2Numbers(100,'-',200);

    }


    public static void OddNumbers(int from,int to) {
        /*
         create a method that can print odd numbers between 1~100/any given range in a same line separated by space
         */
        for (int i=from;i<=to;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
         System.out.println();
    }

    public static void EvenNumbers(int from, int to){

        for (int i=from;i<=to;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void calculateAge(int birthYear){
        System.out.println("Age: "+(2021-birthYear));

    }

    public static void eligibleToVote(int age, boolean isUsCitizen){
        if (age>=21 && isUsCitizen){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void calculate2Numbers(int num1,char operator,int num2){ // + - / * %
        switch (operator){  // create 5 case blocks and 1 default block
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '+':
                System.out.println("Addition:"+(num1+num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Multiplication: "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder: "+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator");


        }

    }


}
