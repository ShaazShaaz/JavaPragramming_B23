package Day13;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        /*
        Write a program for the speed check. a variable named speedLimit is given and assigned,
         ask user to enter the current speed, if the current speed is over the speedLimit print slow down,
          otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105
            output:
            You're driving 50 mph over the limit. Slow down!
            Enter current speed:
            45
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter current speed:");
        int speed=scan.nextInt();
        int speedLimit=55;
        int excess= speed-speedLimit;
        if (speed>speedLimit){
            System.out.println("You are "+ excess +"mph over the limit. Slow down");
        }// int speed=new Scanner(System.in).nextInt(); ---only in case of single time input---


    }
}
