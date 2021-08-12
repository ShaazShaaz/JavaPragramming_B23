package Day15;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the full sentence:");
        String sentence= scan.nextLine();
        char firstChar=sentence.charAt(0);
        int numOfChar=sentence.length();

        System.out.println("firstChar = " + firstChar);
        System.out.println("numOfChar = " + numOfChar);
        char lastChar=sentence.charAt(18);
        System.out.println("lastChar = " + lastChar);





    }
}
