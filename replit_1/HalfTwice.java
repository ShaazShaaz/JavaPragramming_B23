import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        /*
        Write a program that will print out first half of the word twice.
Example:
input: java
output: jaja
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word= scan.next();
        int half=word.length()/2;
        String result=""+word.substring(0,half);

        System.out.println(result+result);

    }
}
