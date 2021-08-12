package Day12;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();

        System.out.println( (number%2==0)? "even":"odd");
        System.out.println( (number>0)?"Positive":(number<0)?"Negative":"Zero");

    }
}
