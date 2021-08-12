package Day17;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        /*
         write a program that can check if the first and last characters of the string are same
            ex:
                Level
            output:
                same
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();

        String firsChar= word.substring(0,1);  //L
        String lastChar= word.substring(word.length()-1);  //l
        if (firsChar.equalsIgnoreCase(lastChar)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
        /*  2nd way:
        String firsChar= word.substring(0,1).toLowerCase();  // l
        String lastChar= word.substring(word.length()-1).toLowerCase();  // l
        if (firsChar.equals(lastChar)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }

         */


    }
}
