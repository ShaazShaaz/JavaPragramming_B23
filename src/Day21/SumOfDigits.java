package Day21;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
         Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3
                 output:    6   // 1+2+3
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= scan.next();
        int result=0;
        for (int i = 0; i <= str.length()-1; i++) {
            char each=str.charAt(i);
            if (each>='0' && each<='9'){
                result+=each-'0';  // result+=each-48 - value of 0 on ascii table
            }

        }
        System.out.println(result);




    }
}
