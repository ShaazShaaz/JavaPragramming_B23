import java.util.Scanner;

public class Coupons {
    public static void main(String[] args) {
        /*
        The video games machines at your local arcade outputs coupons according to how well
        you play the game.
You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You prefer candy bars.
if you the coupons are not enough for any redeem, display message:
"Not enough coupons"
Example:
Input:
Enter number of coupons:
13
Output: Number of Candies: 1
Output: Number of Gumballs: 1
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons=scan.nextInt();
        int candyCount=coupons/10;
        int gumballCount=0;
        int remainder=coupons-(candyCount*10);

        if (coupons<3){
            System.out.println("Not enough coupons");
            System.exit(0);
        }
        if (remainder<10){
            gumballCount=remainder/3;

        }
        System.out.println("Number of Candies: "+candyCount);
        System.out.println("Number of Gumballs: "+gumballCount);




    }
}
