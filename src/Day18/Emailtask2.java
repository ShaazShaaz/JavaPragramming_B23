package Day18;

import java.util.Scanner;

public class Emailtask2 {
    public static void main(String[] args) {
        /*
        EmailTask2:
Assume that email address is constructed by person's first name and followed by an underscore and
last name.Write a program that will print out information about user based on email. Print first name,
 last name, and domain.First and Last name should be printed with proper format - uppercase first letter
  and remaining lowercase.
               Ex:
                   input:
                       craig_federighi@apple.com
                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
         */
        // if you want to get just 1 input, u can call the scanner this way, no need to declare a
        // variable
        System.out.println("Enter your email address");
        String email=new Scanner(System.in).next();

        //String email="craig_federighi@apple.com";
        int indexOf_=email.indexOf("_");
        int indexOfAt=email.indexOf("@");
        String firstName=email.substring(0,indexOf_);
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
          // first character of first name is uppercase and rest of character is lower case
        String lastName=email.substring(indexOf_+1,indexOfAt);
        System.out.println(firstName);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        // first character of last name is uppercase and rest of character is lower case
        System.out.println(lastName);
        String domain=email.substring(indexOfAt+1,email.indexOf("."));
        System.out.println(domain);




    }
}
