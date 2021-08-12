import java.util.Scanner;

public class Xx {
    public static void main(String[] args) {
        /*
        Given a string word, if the first or last chars are 'x' or 'X', print the string without
        those 'x' or 'X' chars, otherwise print the string unchanged.
Example:
input: xHiX
output: Hi
input: apple
output: apple
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word= scan.next();
        if((word.startsWith("x") && word.endsWith("X")) || (word.startsWith("X")&& word.endsWith("x"))){
            System.out.println(word.substring(1,word.indexOf("X")));
        }else if (word.startsWith("x") || word.startsWith("X")){
            System.out.println(word.substring(1));
        }else if (word.endsWith("X") || word.endsWith("x")){
            System.out.println(word.substring(0,word.indexOf("X")));
        }else {
            System.out.println(word);
        }






    }
}
