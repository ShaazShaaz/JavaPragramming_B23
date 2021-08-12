import java.util.Arrays;

public class ArraySplitEmail {
    public static void main(String[] args) {
        /*
        Given a String variable email, write code using split method to print email id and
         domain in separate lines.
Example:
email -> info@cybertekschool.com
Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:
email -> hello-gmail.com
Output:
invalid email
         */
        String email="info@cybertekschool.com";
        int count=0;

        String[] emailId=email.split("@");
        for (int i=0;i<email.length();i++) {
            if (email.charAt(i)=='@'){
                count++;
            }
        }
        if (count>1 || count==0){
            System.out.println("invalid email");
        }else {
            System.out.println("Email id: " + emailId[0]);
            System.out.println("Email  domain: " + emailId[1]);
        }


    }
}
