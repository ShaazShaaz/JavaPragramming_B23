package Recap;

public class AgeGroups {
    public static void main(String[] args) {
        /*
         write a program that can define the age groups of a person
                 age groups are:
                        infant ( < 3 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
         */

        int age=6;
        boolean AgeGroup1=age < 3,
                AgeGroup2=age>=3 && age<=5,
                AgeGroup3= age>=6 && age<=9,
                AgeGroup4=age>=10 && age<=12,
                AgeGroup5 =age>=13 && age<=17,
                AgeGroup6=age>=18 && age<=20,
                AgeGroup7 =age>=21 && age<=39,
                AgeGroup8=age>=40 && age<=49,
                AgeGroup9=age>=50 && age<=54,
                AgeGroup10=age>=55 && age<=64,
                AgeGroup11=age>=65 && age<=74,
                AgeGroup12=age>=75 && age<=84,
                AgeGroup13=age>=85;
        if (AgeGroup1){
            System.out.println("Infant");
        }else if (AgeGroup2){
            System.out.println("Toddler");
        }else if (AgeGroup3){
            System.out.println("Kid");
        }else if (AgeGroup4){
            System.out.println("PreTeen");
        }else if (AgeGroup5){
            System.out.println("Teenager");
        }else if (AgeGroup6){
            System.out.println("Young Adult");
        }else if (AgeGroup7){
            System.out.println("Adult");
        }else if (AgeGroup8){
            System.out.println("Young Middle-Aged Adult");
        }else if (AgeGroup9){
            System.out.println("Middle-agedAdult");
        }else if (AgeGroup10){
            System.out.println("VeryYoungSeniorCitizen");
        }else if (AgeGroup11){
            System.out.println("Young Senior Citizen");
        }else if (AgeGroup12){
            System.out.println("Senior Citizen");
        }else {
            System.out.println("Old Senior Citizen");
        }
    }
}
