package Day15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // make a program that reverses a string word
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scan.nextLine();
        //index num=01234
        String result=""; // all below characters will be concatenated one by one- knalB
        if (word.length()>5){
            result="Too long";
        }else if (word.length()<5){
            result="Too short";
        }else {
           /* result+=word.charAt(4);
            result+=word.charAt(3);
            result+=word.charAt(2);
            result+=word.charAt(1);
            result+=word.charAt(0);

            */
            result="" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }               // e                l                c                 n                u
        System.out.println("result = " + result);



    }
}
