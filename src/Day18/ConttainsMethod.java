package Day18;

import java.util.Scanner;

public class ConttainsMethod {
    public static void main(String[] args) {
        /*
        Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();
       //  if(word.charAt(0)=='x'){
        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }
        scan.close();
        System.out.println("------------------------");
        String sentence="I love Java programming language";
        // java or Java   =>has Java
        if (sentence.toUpperCase().contains("JAVA")){
            System.out.println("has Java");
        }else {
            System.out.println("does not have Java");
        }
        System.out.println("-----------------");
        String s1="I love cats and dogs";
        boolean lovesCats=s1.equalsIgnoreCase("cats"); // verifies if s1 is equal to cats
        boolean lovesCats2=s1.toLowerCase().contains("cats");  // verifies if s1 has cats
        System.out.println(lovesCats2);

    }
}
