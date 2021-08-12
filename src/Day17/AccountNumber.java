package Day17;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        /*
        Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not
    meet the expected results print “Invalid account number”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your account number:");
        String account= scan.next();
        /*
        if (account.length()==7 || account.length()==10){
            if (account.charAt(0)=='2' && account.length()==7){
                System.out.println("Valid account");
            }else if (account.charAt(0)==5 && account.length()==10){
                System.out.println("Valid account");
            }else {
                System.out.println("Invalid account");
            }

        }else {
            System.out.println("Invalid account");
        }
*/
        char firstChar= account.charAt(0);
        String result="";
        switch (firstChar){
            case '2':  // if the first character of account is 2
                if (account.length()==7){ // if the length ==7
                    result="Valid account";
                }else {  // if length is not==7
                    result="INVALID- should be 7 characters long";
                }
                break;
            case '5': // if the first character of account is 5
                if (account.length()==10){  // if the length is 10
                    result="Valid account";
                }else {  // if the length is not 10
                    result="INVALID- should be 10 characters long";
                }
                break;
            default:
                result="Invalid account";

        }
        System.out.println(result);
        scan.close();

    }
}
