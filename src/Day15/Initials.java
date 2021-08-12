package Day15;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        Ask the user:
        -first name and last name.
        -print the initials  e.g- Daniel Jones; D.J
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        // option1-
        String firstName= scan.nextLine();
        //char f=scan.nextLine().charAt(0);  // 2nd option

        System.out.println("Enter your last name");
        String lastName= scan.nextLine();

        char f=firstName.toUpperCase().charAt(0);
        char l=lastName.toUpperCase().charAt(0);
        String initial= f+"."+l;
        System.out.println("initial: "+initial);
       // System.out.println(f+"."+l);

    }
}
