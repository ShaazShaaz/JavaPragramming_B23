package Day14;

import java.util.Scanner;

public class GradeLevel2 {
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
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade number:");
        byte number= scan.nextByte();
        String gradeLevel="";
        //switch doesnt accept long, float, double and boolean
        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                gradeLevel="Elementary school";
                break;

            case 6:
            case 7:
            case 8:
                gradeLevel="Middle School";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                gradeLevel="High school";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                gradeLevel="College";
                break;

            case 17:
            case 18:
                gradeLevel="Grad school";
                break;
            default:
                gradeLevel="invalid number";

        }
        System.out.println(gradeLevel);

    }
}
