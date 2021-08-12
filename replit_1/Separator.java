import java.util.Scanner;

public class Separator {
    public static void main(String[] args) {
        /*
        Given two strings, word and a separator sep, return a big string made of count
        occurrences of the word, separated by the separator string.
Example:
input:
Word
X
3
output: WordXWordXWord
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 words:");
        String word= scan.next();
        String separator= scan.next();
        System.out.println("Enter number of time word must occur:");
        int count=scan.nextInt();
        String result="";
        for (int i = 1; i <=count ; i++) {
            result+=word+separator;

        }

        System.out.println(result.substring(0,(result.length()-separator.length())));
    }
}
