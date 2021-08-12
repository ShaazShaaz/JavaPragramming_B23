import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that will reverse a string. Your program should reverse a string only
        5 characters long. If word is shorter, display message: "Too short!". If word is longer,
        display message: "Too long!". Otherwise, reverse this word and print out result into the console.
Example:input: cat
output: Too short!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();
        String result="";
        if (word.length()<5){
            result="Too short!";
        }else if (word.length()>5){
            result="Too long!";
        }else {
            result=(word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)
            +""+word.charAt(0));
        }

        System.out.println(result);

    }
}
