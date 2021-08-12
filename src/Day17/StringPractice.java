package Day17;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
/*
3. ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word= scan.next();
       // option 1- boolean endsWithLy=word.substring(word.length()-2).equals("ly");
        boolean endsLy=word.endsWith("ly");
        if (endsLy){
            System.out.println("really?");
        }else {
            System.out.println("never mind");
        }
        scan.close();


    }
}
