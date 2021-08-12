package Day19;

import java.util.Scanner;

public class TakeHome {
    public static void main(String[] args) {
        /*
        1. ask the user to enter 5 strings, return the string
        las the maximum length
        2. ask the user to enter 5 strings, return the string las the minimum length
         */
        Scanner scanner = new Scanner(System.in);

       /* String str = "";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a string:");
            String s1 = scanner.next();
            if (s1.length() > str.length()) {
                str = s1;
            }
            System.out.println(str);

        }
        */

        System.out.println("-----------------");
        int minimum=2147483647;
        String str2 = "";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a string:");
            String s = scanner.next();
            if (s.length() < minimum) {
                str2 = s;
            }
            System.out.println(str2);
        }

        }
    }
