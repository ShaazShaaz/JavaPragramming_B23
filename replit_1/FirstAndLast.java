import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        /*
        Write a program that will print out first and last letters together.
Input: adobe
Input: adobe
Output: ae
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word");
        String word= scan.next();

        String firstLast=""+word.charAt(0)+(word.charAt(word.length()-1));
        System.out.println(firstLast);


    }
}
