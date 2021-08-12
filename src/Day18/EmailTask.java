package Day18;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        /*
        EmailTask1:
Assume that email address is constructed by person's first name and followed by an
underscore and last name.
 Write a program that can swap first name with last name in the email (Seperated by an underscore).
             If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email");
        String email= scan.next();
        int indexOf_=email.indexOf("_");  // returns index num of _
        int indexOfAt=email.indexOf("@");  // returns the index num of @
        String remaining=email.substring(indexOfAt);
        String firstName=email.substring(0,indexOf_);
        String lastName=email.substring(indexOf_+1,indexOfAt);
       // System.out.println(firstName);
       // System.out.println(lastName);
       // System.out.println(remaining);
        String newEmail=lastName+"_"+firstName+remaining;
        System.out.println(newEmail);



    }
}
