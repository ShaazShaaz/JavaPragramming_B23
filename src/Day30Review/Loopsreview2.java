package Day30Review;

import java.util.Scanner;

public class Loopsreview2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String answer="";
        int n=0;
        int sum=0;
        while(!answer.equalsIgnoreCase("No")) {

            System.out.println("Enter a number:");
            n = scan.nextInt();
            sum+=n;
            System.out.println("Would you like to enter another number?");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid answer. Would you like to enter another number?");
                answer = scan.next();
            }
        }
        System.out.println(sum);





    }
}
