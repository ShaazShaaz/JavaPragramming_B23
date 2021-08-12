import java.util.Scanner;

public class LeasingRoom {
    public static void main(String[] args) {
        /*
        Write program for Leasing office.
numberOfBedrooms variable already declared and assigned value using Scanner:
startingPrice is set to 0.
prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550
Example Flow:
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!\nNumber of bedrooms you are interested in:");
        int numberOfBedrooms= scan.nextInt();
        int StartingPrice= 0;

        if (numberOfBedrooms>=1 && numberOfBedrooms<=3){
            if (numberOfBedrooms==1){
                StartingPrice=1100;
                System.out.println("One Bedroom selected\nStarting Price: "+StartingPrice);
            }else if (numberOfBedrooms==2){
                StartingPrice=1850;
                System.out.println("Two Bedroom selected\nStarting Price: "+StartingPrice);
            }else {
                StartingPrice=2550;
                System.out.println("Three Bedroom selected\nStarting Price: "+StartingPrice);
            }

        }else {
            System.out.println("No such Bedrooms available");
        }
        scan.close();

    }
}
