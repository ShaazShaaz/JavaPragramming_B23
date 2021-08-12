import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        /*
        Write a program that will print out the first character of the word.
Ex:
Input: jump
Input: jump
Output: j
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word= scan.nextLine();
        char f=word.charAt(0);
        System.out.println(f);



    }
}
