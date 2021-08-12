package Day12;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        ask user to input:
        - salary by hour
        - how many hours you work in a week
        - how many weeks do you work in a year
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter rate per hour:");
        double hourlyRate=input.nextDouble();

        System.out.println("Enter no. of hours you work in a week:");
        int weeklyHour=input.nextInt();

        System.out.println("Enter no. of weeks you work in a year:");
        int weeks=input.nextInt();

        double salary= hourlyRate * weeklyHour * weeks;
        System.out.println("You are making $" + hourlyRate+ " per hour");
        System.out.println("you work "+weeklyHour+ " in a week");
        System.out.println("your salary is $"+ salary);


    }
}
