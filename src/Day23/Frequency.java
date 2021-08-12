package Day23;

//import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        /*
Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";
                input: 'c'
                output: 3
         */
       // Scanner scan=new Scanner(System.in);
        int count=0;
        String word="aabbccd";
        char character='c';
       // System.out.println("Enter the word:");
       // String word= scan.next();
       // System.out.println("Enter the character:");
        //String character=scan.next();
        for (int i = 0; i <= word.length()-1; i++) {
            char each=word.charAt(i);
            if (each=='c'){
                count++;
            }
          }
        System.out.println(count);


    }
}
