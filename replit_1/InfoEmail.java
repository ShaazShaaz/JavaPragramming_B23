import java.util.Scanner;

public class InfoEmail {
    public static void main(String[] args) {
        /*
        Write a program that will print out information about user based on email. Print first name,
         last name, and domain. First and Last name should be printed with proper format -
          uppercase first letter and remaining lowercase.
Example:
Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email:");
        String email= scan.next();
        int indexOf_=email.indexOf("_");
        int indexOfAt=email.indexOf("@");
        int indexOfDot=email.indexOf(".");
        String firstName=email.substring(0,indexOf_);
        String lastname=email.substring(indexOf_+1,indexOfAt);
        String domain=email.substring(indexOfAt+1,indexOfDot);
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        lastname=(""+lastname.charAt(0)).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastname);
        System.out.println(domain);



    }
}
