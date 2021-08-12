package Day17;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        /*
         write a program that can return the initials of the user
            ex: cybertek
                school
            output: C.S
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= scan.next();
        System.out.println("Enter your last name:");
        String lastName= scan.next();
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        // 2nd way- CREATE SUBSTRING FOR FIRSTNAME AND LASTNAME THEN CALL TOUPPERCASE
        //String initial=firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();  // c.s
        // cannot use charAt method because it returns character ..
        // so we cant call char to uppercase(string method) so use substring
        //3rd way-FIRST CALL TOUPPERCASE AND THEN TO CHARAT
        //String initial=firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);
        System.out.println(initial);


    }
}
