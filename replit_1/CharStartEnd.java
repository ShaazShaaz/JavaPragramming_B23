import java.util.Scanner;

public class CharStartEnd {
    public static void main(String[] args) {
        /*
        Write a program that will print out letters in the alphabetic order accordingly to
         the given range within 2 chars.
Example:
input:
A
Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two characters:");
        char start=scan.next().charAt(0);
        char end=scan.next().charAt(0);
        for (char i=start;i<=end;i++){
            System.out.print(i+" ");
        }




    }
}
