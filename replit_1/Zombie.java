import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        /*
        A variable inhabitants represents a city and its respective populations. City might have
        a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
         After each day, a city will lose half of its population. Write a program to loop the city
         population and make it lose half of its population until population is zero.
          Print the each day like below for each day:
Example - inhabitants are 6
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the population:");
        int inhabitants = scan.nextInt();
        int day = 0;

            if (inhabitants!=0){
               do{
                System.out.println("Day "+day+"["+inhabitants+"]");
                day++;
                inhabitants/=2;
            }while (inhabitants>0);
            System.out.println("----EXTINCT----");
        }else {
                System.out.println("----EXTINCT----");
            }

    }
}















