import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        /*
        Write a program that will verify if the sentence contains word.
        Print out the result as a boolean value.
         */
        Scanner scan=new Scanner( System.in);
        System.out.println("enter a sentence");
        String sentence= scan.nextLine();
        System.out.println("enter a word:");
        String word= scan.next();
        System.out.println(sentence.contains(word));


    }
}
