package Day19;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // racecar   palindrome means words that are the same when reversed
        System.out.println("Enter a word:");
        String word=new Scanner(System.in).next();
        String reverseWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverseWord+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reverseWord);
        if (isPalindrome){
            System.out.println(word + " is palindrome");
        }else {
            System.out.println(word + " is not palindrome");
        }


    }
}
