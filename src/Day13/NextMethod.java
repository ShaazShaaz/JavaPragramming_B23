package Day13;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String name= scan.next();  // this next method only takes the first word

        System.out.println("Enter your last name");
        String lastName= scan.next();
        String fullName= name+" "+lastName;
        System.out.println("full name: "+ fullName);

        System.out.println("Enter your address:"); // 622 kelso rd
        String address= scan.next();

        System.out.println("address: "+ address);

        String gender= scan.next(); // kelso
        String state= scan.next(); // rd
        System.out.println("gender: "+gender);
        System.out.println("state: "+state);


    }
}
