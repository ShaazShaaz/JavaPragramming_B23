import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        /*
        Create a program that will take the given String In and print out all the vowels
        from the String.
Example:
Input: howdyho
Output: oo
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();
        String result="";
        for (char i=0;i<word.length();i++){
            char eachCharacter=word.charAt(i);

            if (eachCharacter=='a'||eachCharacter=='e'||eachCharacter=='i'
                    ||eachCharacter=='o'||eachCharacter=='u'){
                result+=eachCharacter;
            }
        }

        System.out.println(result);
    }
}
