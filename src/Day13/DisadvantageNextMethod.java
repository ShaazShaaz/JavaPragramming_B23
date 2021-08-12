package Day13;

import java.util.Scanner;

public class DisadvantageNextMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scan.nextInt(); // 19Enter   only 19 is assigned, enter is left in scanner

        scan.nextLine();// Enter will be taken out
        System.out.println("Enter your job title:");
        String jobTitle= scan.nextLine(); //

        System.out.println("age: "+ age);
        System.out.println("job title: "+ jobTitle);


    }
}
