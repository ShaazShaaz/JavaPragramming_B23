import java.util.Scanner;

public class SwapEmail {
    public static void main(String[] args) {
        /*
        Swap first name with last name in the email (Seperated by an underscore). If the email
         doesn't contain an underscore print the given input email.
Examples:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter email");
        String email= scan.next();
        if (email.contains("_")){
       int indexOf_=email.indexOf("_");
       int indexOfAt=email.indexOf("@");
        String firstName=email.substring(0,indexOf_);
        String lastName=email.substring(indexOf_+1,indexOfAt);
        String domain=email.substring(indexOfAt);
        String newEmail=lastName + "_" + firstName + domain;

            System.out.println(newEmail);

        }else {
            System.out.println(email);
        }

    }
}
