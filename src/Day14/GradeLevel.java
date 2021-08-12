package Day14;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given
    Switch:
        Ask the user how many people they live with?
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade number:");
        byte number = scan.nextByte();
        scan.nextLine();
        String name = "";
        if (number >= 1 && number <= 18) {
            name = (number <= 5) ? "Elementary school" : (number <= 8) ? "Middle school" :
                    (number <= 12) ? "High school" : (number <= 16) ? "College" : "Grad school";
        } else {
            name = "invalid grade level given";
        }
        System.out.println(name);
    }


}
