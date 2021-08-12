package utilities;

import java.util.Arrays;

public class StringUtilities {

    // reverses any given string and returns it
    public static String reverse(String str){  // abcd
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        //System.out.println(reversed);
        return reversed;
    }

    // create a method to verify if the given string is palindrome.. returns boolean
    public static boolean isPalindrome(String str){  // Java
        String reversedStr=reverse(str);   // avaJ
        return str.equalsIgnoreCase(reversedStr);
    }

    // create a method that can remove the duplicates from a string, returns string
    // removeDup "AAABBBBBCCCCCCCC"====>  "ABC"
    public static String removeDupl (String str) {
        String result = "";
       /* for (int i = 0; i <=str.length()-1; i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }*/
        for (char ch : str.toCharArray()) {  // can also use for each. should convert str to array
            if (result.indexOf(ch) < 0) {
                // if index of character in result is -1   can also use- !result.contains(""+ch)
                result += ch;   //       then concat to result
            }
        }
        // System.out.println(result);
        return result;
    }

    // isAnagram
    public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();//{'h','e','a','r','t'}
        char[] ch2=str2.toCharArray();//{'e','a','r','t','h'}
        Arrays.sort(ch1);  // aehrt
        Arrays.sort(ch2);   // aehrt

        return Arrays.equals(ch1,ch2);  // will return boolean
    }

    // frequency of a character
    public static int frequency(String str, char ch){
        int count=0;
        for (char each :str.toCharArray()){  // using for each by converting string into array
            if (each==ch){
                count++;
            }
        }

        return count;
    }

    // unique characters
    public static String uniqueCharacters(String s){
        String unique="";
        // first find the frequency of each of the characters
        for (int i = 0; i < s.length(); i++) {
            char each=s.charAt(i);
            int frequency=frequency(s,each);
            // now check the count, if 1, then unique
            if (frequency==1){
                unique+=each+" ";
            }
        }
        return unique;
    }

    // characters with frequency of characters
    public static String frequencyOfCharacters(String str){
        // find the frequency of the characters and print like a3b4c6
        //  String s3="aaabbbbcccccc";
        String result="";
        for (char each: removeDupl(str).toCharArray()){
            int frequency=frequency(str,each);
            result+=each;
            result+=frequency;
        }
        return result;
    }

    // frequency of word from sentence
    public static int frequencyOfWord(String str,String word){

        int count = 0;
        str = str.toLowerCase();

        while (str.contains(word)) {  // if statement but need to run multiple times
            str=str.replaceFirst(word, "");
            count++;
        }
        return count;

    }



}
