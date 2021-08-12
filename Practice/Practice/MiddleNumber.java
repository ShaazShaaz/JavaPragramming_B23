package Practice;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        /*
        You have a word, do the following:
When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();
        if (word.length()%2!=0) {
            if (word.length() == 1) {
                System.out.println(word + word + word);

            }else {

            }

        }
    }
}
