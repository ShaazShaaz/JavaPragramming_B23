package Day16;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        /*
        Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 3 words:");
        String word1= scan.next();
        String word2= scan.next();
        String word3= scan.next();
        boolean allSame=word1.length()==word2.length() && word1.length()==word3.length();
        boolean allDiff=word1.length()!=word2.length() && word1.length()!=word3.length()
                && word2.length()!=word3.length();
        /*
        if (word1.length()==word2.length() && word1.length()==word3.length()){

            System.out.println("All words have same length");
        }else  if (word1.length()!=word2.length() && word1.length()!=word3.length()
                && word2.length()!=word3.length());
        */
        if (allSame){
            System.out.println("all have same length");
        }else if (allDiff){
            System.out.println("all have different length");
        }else {
            System.out.println("not same nor different length");
        }

    }
}
