package Practice;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
/*
Ask user to enter two words. Print first word without its first character then print the second word without its first
character.
	                Input:
	                    apple
	                    banana
	                Output:
	                    ppleanana
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 words:");
        String word1= scan.next();
        String word2= scan.next();
        word1=word1.substring(0,word1.length()-1);
        word2=word2.substring(0,word2.length()-1);
        System.out.println(word1+word2);







    }
}
