import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        /*
        Write a program that will print out the longest word.
        Note: Assume the length of the two given Strings will be different
input:
bill
check
output: check
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 words:");
        String word1= scan.next();
        String word2= scan.next();
        String result="";
        if (word1.length()!=word2.length()) {
            if (word1.length() > word2.length()) {
                result=word1;
            } else {
                result=word2;
            }
        }
        System.out.println(result);



    }
}
