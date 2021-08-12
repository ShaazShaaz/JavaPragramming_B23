package Day23;

import java.util.Scanner;

public class MonthsArray {
    public static void main(String[] args) {
        String[] months={"January","February","March","April","May","June","July","August"
                ,"September","October","November","December"};
        System.out.println("Enter a number:");
        int n=new Scanner(System.in).nextInt();


        if (n>=1 && n<=1){
            System.out.println(months[n-1]); // user will always give random num between 1~12.
        }else {
            System.out.println("Invalid number");
        }


    }
}
