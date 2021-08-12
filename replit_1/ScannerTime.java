import java.util.Scanner;

public class ScannerTime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Write a program that outputs the number of hours, minutes, and seconds that corresponds to input
         total seconds.
Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:
"Enter seconds:"
Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
Assign values to the hours, minutes, seconds variables
Display the result.
         */

        System.out.println("Enter seconds:");
        int inputSeconds= scan.nextInt();
        int hours=inputSeconds/3600;
        int minutes=(inputSeconds%3600)/60;
        int seconds=inputSeconds-(hours*3600+minutes*60);

        System.out.println(hours+" hrs "+minutes+" minutes "+seconds+" seconds");


    }
}
