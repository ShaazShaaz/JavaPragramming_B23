package Day21;

import java.util.Scanner;

public class LetterDigitSpecCHar {
    public static void main(String[] args) {
        /*
        write a program that can retrieve the digits, letters and special characters from a string
            Ex: input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String password= scan.next();
        String letters="";
        String digits="";
        String special="";
        for (int i = 0; i <=password.length()-1; i++) {
            char each=password.charAt(i);
            if (each>='A' && each<='Z'){
                letters+=each;
            }else if (each>='a' && each<='z'){
                letters+=each;
            }else if (each>='0' && each<='9'){
                digits+=each;
            }else {
                special+=each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

    }
}
