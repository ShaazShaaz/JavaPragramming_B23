package Day12;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age:");

        int age=input.nextInt();
        if(age>=21){
            System.out.println("you are eligible to buy alcohol");
        }else {
            System.out.println("Get out");
        }


    }
}
