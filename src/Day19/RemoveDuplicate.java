package Day19;

//import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
         ask the user to enter a word. the word must be five characters long and print the word
         without the duplicated characters, but if the word is less than five characters long,
         print "Too Short." and if the word is more than five characters long, print "Too long."
        Ex: input:
                aabbc
             output: abc
         */
        //Scanner scan=new Scanner(System.in);
       // String word= scan.next();
        String word="aabbc";
        String result="";  //check one by one, if result contains character dont include,
        // if doesnt contain then include "abc"
        if (word.length()==5){
            if (!result.contains(""+word.charAt(0))){  //'a'  true
                result+=word.charAt(0);   // we use += cuz we are concatenating, not assigning
            }
            if (!result.contains(""+word.charAt(1))) {  //  'a'   false
                result += word.charAt(1);
            }
            if (!result.contains(""+word.charAt(2))) {  // 'b'  true
                result += word.charAt(2);
            }
            if (!result.contains(""+word.charAt(3))){  // 'b'   false
                result+=word.charAt(3);
            }
            if (!result.contains(""+word.charAt(4))) {  //'c'   true
                result += word.charAt(4);
            }// result will be "abc"
            System.out.println(result);
        }else if (word.length()<5){
            System.out.println("Too short");
        }else {
            System.out.println("Too long");
        }
    }
}
