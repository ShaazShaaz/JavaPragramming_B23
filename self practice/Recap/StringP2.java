package Recap;

import java.util.Scanner;

public class StringP2 {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Print first word without its first character then print the
        second word without its first character.
         Input: apple  banana
         Output: ppleanana
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 words");
        String w1= scan.next();
        String w2= scan.next();
        System.out.println(w1.substring(1)+w2.substring(1));
    }
}
