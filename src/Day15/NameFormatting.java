package Day15;

import java.util.Scanner;

public class NameFormatting {
    public static void main(String[] args) {
        //ask the user for first name
        // make sure there is no white space
        // first character is upper case and rest are lower case
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name= scan.nextLine().trim();
        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        System.out.println(name);

        System.out.println("Enter your last name:");
        String lastName=scan.nextLine().trim();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String fullName=name+" "+lastName;
        System.out.println(fullName);



    }
}
