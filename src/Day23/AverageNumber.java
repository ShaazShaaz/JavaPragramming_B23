package Day23;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int[] numbers=new int[scan.nextInt()];
        int sum=0;
        for (int i = 0; i <=numbers.length-1; i++) {  // used for getting user input and storing in array
            System.out.println("Enter a number:");
          numbers[i] = scan.nextInt();
          sum+=numbers[i];

        }
        System.out.println("sum: "+sum);
        double average=(double) sum/numbers.length;  // assign double to one of the variables in order to get accurate decimal figure
        System.out.println("Average number: "+average);
        scan.close();

    }
}
