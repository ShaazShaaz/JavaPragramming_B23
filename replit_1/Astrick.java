import java.util.Scanner;

public class Astrick {
    public static void main(String[] args) {
        /*
        Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.
Example:input: 1
output: *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scan.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }


    }
}
