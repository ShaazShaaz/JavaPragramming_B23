package Day19;

import java.util.Scanner;

public class HomeTsk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str2 = "";
        int min=2140000000;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a string:");
            String s = scan.next();
            if (s.length() < min) {
                min = s.length();
                str2=s;
            }


        }
        System.out.println(str2);

    }
}
