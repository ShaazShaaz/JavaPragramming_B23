package Day14;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int n= scan.nextInt();
        scan.close();
        String result="";
        if (n>=1 && n<=100000){
            if (n<=9){
                result=n+" is 1 digit.";
            }else if ( n<=99){
                result=n+" is 2 digits.";
            }else if (n<=999){
                result=n+" is 3 digits.";
            }else if (n<=9999){
                result=n+" is 4 digits.";
            }else if (n<=99999){
                result=n+" is 5 digits.";
            }else {
                result=n+" is 6 digits.";
            }

        }else {
            System.out.println("Invalid number");
        }
        System.out.println(result);


    }
}
