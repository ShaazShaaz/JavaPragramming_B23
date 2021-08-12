package CustomMethods;
import java.util.Arrays;

public class isAnagram {
    /*
    Anagram is a word, phrase, or name formed by rearranging the letters of another,
    such as cinema, formed from iceman.
The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:
isAnagram("listen", "Silent") ==> true
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","Silent"));
    }



    public static boolean isAnagram(String word1, String word2){
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

       char[] ch1=word1.toCharArray();
       char[] ch2=word2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       return Arrays.equals(ch1,ch2);


    }


}
