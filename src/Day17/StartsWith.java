package Day17;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        /*
        write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the website:");
        String website= scan.next();
        website=website.toLowerCase();
        boolean isValid=website.startsWith("www.") && (website.endsWith(".com")
                ||website.endsWith(".edu")  ||website.endsWith(".gov")) ;
        if (isValid){
            System.out.println("valid website");
        }else {
            System.out.println("invalid website");
        }
        scan.close();

    }
}
