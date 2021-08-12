import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        /*
        You have two numbers already declared and assigned values.
Check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        if(num1==num2){
            System.out.println(num1+" and "+num2+" are equal");
        }if (num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }if (num2>num1){
            System.out.println(num2+" is greater than "+num1);
        }






    }
}
