package Day17;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        /*
         write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();  // Cybertek School

        String firstName=fullName.substring(0,fullName.indexOf(" "));
        String lastName=fullName.substring(fullName.indexOf(" ")+1);
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println(initial);



    }
}
