package OfficeHours;

public class CamelCase {
    public static void main(String[] args) {
        /*
          Camel Case
     Given a String of words that follow Camel Case convention.
Every word, except the first word, begin with an uppercase letter.
The other characters of the word will be lowercase
Task 1  : Find and print how many words are in the given String.
Input: thisHasManyWordsToFind Output: 6
Task 2  : Find and print each words are in the given String.
            Input: thisHasManyWordsToFind
                                        Output: This
                                                Has
                                                Many
                                                Words
                                                To
                                                Find
         */

        String str="thisHasManyWordsToFind";
        int count=1;  // not 0 otherwise it wont count the 1st word
               // but to prevent a bug, we have to pass an if statement
        if (str.isEmpty()){
            count=0;
        }
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){

                count++;
            }

        }
        System.out.println(count);

        System.out.println("-------------------");




    }
}
