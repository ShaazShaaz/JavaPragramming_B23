package Day21;

import java.util.Scanner;

public class ForLoopMultiply {
    public static void main(String[] args) {
        /*
        write a program that can multiply two numbers without using * operator
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int result=0;
        for (int i = 0; i <n1; i++) {
            result+=n2;


        }
        System.out.println(result);


    }
}
