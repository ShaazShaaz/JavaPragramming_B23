package Day22;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        /*
        write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculates
             the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
         */
        Scanner scan=new Scanner(System.in);
        int total=0;
        System.out.println("Welcome to Cybertek Hotel.");
        System.out.println("Would you like to reserve a room?");
        String ans= scan.nextLine().toLowerCase();

        while (ans.equals("yes")) {
            System.out.println("Which bed type do you want?");
            String bedType = scan.nextLine().toLowerCase();

            if (bedType.equals("king bed")) {
                total += 120;
            } else if (bedType.equals("queen bed")) {
                total += 100;
            } else if (bedType.equals("single bed")) {
                total += 80;
            } else {
                System.out.println("Invalid room type is selected");
            }

            System.out.println("Do you want to reserve another room?");
            ans= scan.nextLine().toLowerCase();
        }
        System.out.println("Your total price is :"+total);


    }
}
