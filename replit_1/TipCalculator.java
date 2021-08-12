import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        Write a program for a tip calculator. There will be different service quality benchmarks
        that will determine the tip given. There will also the ability to calculate based on the
        number of people in the party and if there is a split of the bill or not.
Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
The program should display the following information based on the user input:
Split or No split (Yes or No) Number of people entered: (number) (each person = & in output)
 Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person:
 Tip per person:
Example
Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Split or No Split");
        String split= scan.next();


        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Enter number of people:");
            int people = scan.nextInt();
            System.out.println("Enter the total amount");
            double amount= scan.nextDouble();
            System.out.println("Enter service quality");
            String service= scan.next();

            double tip=0.0;


            if (service.equalsIgnoreCase("Poor")){
                tip=0.05*amount;
            }else if (service.equalsIgnoreCase("Fair")){
                tip=0.10*amount;
            }else if (service.equalsIgnoreCase("Good")){
                tip=0.15*amount;
            }else if (service.equalsIgnoreCase("Great")){
                tip=0.20*amount;
            }else if (service.equalsIgnoreCase("Excellent")){
                tip=0.25*amount;
            }
            double tipPer=tip/people;
            double totalAmount=tip+amount;
            double amountPer=totalAmount/people;
            String symbol="";
            for (int i = 0; i < people; i++) {
               symbol+="&";

            }

            System.out.println("Number of people entered: "+symbol);
            System.out.println("Total to pay: "+totalAmount);
            System.out.println("Total tip: "+tip);
            System.out.println("Total per person: "+amountPer);
            System.out.println("Tip per person: "+tipPer);


        }else if (split.equalsIgnoreCase("no")){
            System.out.println("No calculation done");
        }

    }
}
