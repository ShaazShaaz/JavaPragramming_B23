package Day16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Print first word without its first character then print the
        second word without its first character.
                Input: apple
                    banana
                Output: ppleanana
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1= scan.next();
        String word2= scan.next();
        if (word1.length()>=2 && word2.length()>=2) {
            String result = word1.substring(1)+ word2.substring(1); //2nd character has index num 1, rest if printed by default.
            System.out.println(result);
        }else {
            System.out.println("String too short");
        }






    }
}
