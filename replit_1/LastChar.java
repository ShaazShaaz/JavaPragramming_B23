import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {
        /*
        Write a program that will print out last letter of the word (string).
Ex:
Input: java
Input: java
Output: a
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word= scan.next();

        char lastChar=word.charAt(word.length()-1);
        System.out.println(lastChar);


    }
}
