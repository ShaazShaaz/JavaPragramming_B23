package Recap;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        /*
        write a method that asks user to enter a string.
        if the string is empty, print: string is empty
           if the string has more than 3 characters, print the last three characters
               if the string has less than or equal 3 characters, print the string itself
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string:");
        String str= scan.nextLine();
        String result="";
        if (str.isEmpty()){
            result="string is empty";
        }else if (str.length()>3){
            result=str.substring(str.length()-3);
        }else {
            result=str;
        }
        System.out.println(result);
    }
}
