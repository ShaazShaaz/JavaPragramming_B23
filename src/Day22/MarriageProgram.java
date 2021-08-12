package Day22;

import java.util.Scanner;

public class MarriageProgram {
    public static void main(String[] args) {
        /*
        Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it
     until the user enters either yes or no
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me?");
        String ans= scan.next().toLowerCase();

        while (!(ans.equals("yes") || ans.equals("no"))) {
            System.out.println("invalid entry, please re-enter");
            ans = scan.next().toLowerCase();

            if (ans.equals("yes")) {
                System.out.println("Congrats");
            }
            if (ans.equals("no")) {
                System.out.println("Rest in peace");
            }
        }


    }
}
