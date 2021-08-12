package Day18;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        /*
         Ask user to enter two words. Then add them together and print. But if the last letter of
         the first word and the first letter of the last word is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 words:");
        String word1= scan.next(); // "one"
        String word2= scan.next();  //"eight"    oneeight
        String result="";
       /* if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            result=word1+word2.substring(1);
        }else {
            System.out.println(word1+word2);
        }

        */
        if (word1.substring(word1.length()-1).equalsIgnoreCase(word2.substring(0,1))){
            //""+ word2.charAt(0))){
            result=word1+word2.substring(1);
        }

        System.out.println(result);
        scan.close();


    }
}
