package Day13;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your job title:");
        String jobTitle=scan.nextLine();

        System.out.println("Enter your gender");
        String gender= scan.next();

        System.out.println(jobTitle);
        System.out.println(gender);


    }
}
