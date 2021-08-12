package Day24Array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
   // split method
        String sentence="I love learning java programming language";
        sentence.split(" ");
        String[] words=sentence.split(" "); // will split string into separate elements by space
        System.out.println(Arrays.toString(words));  // if you dont call Array class to string, ans will be unreadable

        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
        String email= "Cybertek@gmail.com";
        String[] array=email.split("@");
        System.out.println(Arrays.toString(array));
        String firstName=array[0];
        // can also do directly-- String firstName=email.split("@")[0];
        System.out.println(firstName);

        // toCHarArray()

        String str="AB CDE!";
        char[] characters=str.toCharArray();
        System.out.println(Arrays.toString(characters));
    }
}
