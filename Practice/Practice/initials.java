package Practice;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        /*
        print the initials
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name=scan.nextLine();
        String firstName=name.substring(0,name.indexOf(" "));
        String lastName=name.substring(name.indexOf(" ")+1);
        String initials=""+firstName.toUpperCase().charAt(0)+". "+lastName.toUpperCase().charAt(0)+".";
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(initials);





    }
}
