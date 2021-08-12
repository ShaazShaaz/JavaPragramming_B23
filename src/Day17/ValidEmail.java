package Day17;

import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        /*
        1. write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email account:");
        String email= scan.nextLine();
        // better to add- email=email.toLowerCase();
        boolean isValid=email.endsWith("@gmail.com");
        if (isValid){
            System.out.println(isValid);
        }else {
            System.out.println("Invalid account");
        }
        scan.close();
        /*   ANOTHER WAY - OTHER THAN ENDSWITH METHOD
        String domain=email.substring(email.indexOf("@"));
        boolean isValid=email.equals(domain);
        System.out.println(isValid);   TRUE
         */


    }
}
