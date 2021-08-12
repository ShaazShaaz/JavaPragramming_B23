import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        /*
        Imagine you have a party and need to form the list of the guests. (Assume you have at least
         one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
If yes - take the next guest input
If not - finish the program and print list of the guests.
Example:
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name= scan.next();
        System.out.println("Do you want to enter new guest name?");
        String ans= scan.next().toLowerCase();
        while (ans.equals("yes")){
            System.out.println("Please enter guest name");
             name+=", "+ scan.next();
            System.out.println("Do you want to enter new guest name?");
                ans= scan.next().toLowerCase();

            if (ans.equals("no")) {
                System.out.println(name);
            }
        }



    }
}
