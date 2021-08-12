package Day31_WarmUpMethods;

import utilities.StringUtilities;

public class WarmUpTasks2 {
    public static void main(String[] args) {
        /*
          write a return method named frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3
         */

        String str = "Java java jaVA python python";
        String word = "java";
        int count = 0;
        str = str.toLowerCase();

        while (str.contains(word)) {  // if statement but need to run multiple times
            str=str.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);
        System.out.println("------------------------------");

        String sentence="python Shazia shazia";
        String each="shazia";
        int n1=frequencyOfWord(sentence,each);
        System.out.println(n1);
        System.out.println("---------------------------");
        // find if palindrome
        String s="Racecar";
        boolean isPalindrome=StringUtilities.isPalindrome(s);
        System.out.println(isPalindrome);

        // remove duplicates
        String s2="CCCYBBBERRRTTEEEKKK";
        s2=StringUtilities.removeDupl(s2);
        System.out.println(s2);

    }


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
