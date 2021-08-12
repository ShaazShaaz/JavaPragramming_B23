package Day22;

import java.util.Scanner;

public class Day22Recap {
    public static void main(String[] args) {
        int i=0;
        int sumOfEven=0;
        int sumOfOdd=0;
        do {if (i%2==0){
            sumOfEven+=i;
        }else {
            sumOfOdd+=i;
        }

            System.out.println(i);
            i++;   // should be after the statement
        }while (i<=10);

        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

        System.out.println("-------------------------");
        Scanner scan=new Scanner(System.in);
        String username="JohnJames";
        String password="John123";
        String u="";
        String p="";
        int attempts=1;

        //do {
            System.out.println("enter your username:");
            u= scan.next();

            System.out.println("enter your password:");
            p= scan.next();
       // }
        while (!(u.equals(username) && u.equals(password)));
        System.out.println("enter your username:");
        u= scan.next();

        System.out.println("enter your password:");
        p= scan.next();
        attempts++;
        if (attempts==3){
            System.out.println("your account is locked");
            System.exit(0);

        }

        System.out.println("logged in");



    }
}
