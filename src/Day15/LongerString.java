package Day15;

import java.util.Scanner;

public class LongerString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        String n1= scan.nextLine();
        String n2= scan.nextLine();
        int length1=n1.length();
        int length2=n2.length();
        if (length1>length2){  // can also write. (n1.length()>n2.length())
            System.out.println(n1);
        }else {
            System.out.println(n2);
        }

    }
}
