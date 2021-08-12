package day34_LocalDateTime_Wrapper;
import day11.Loan;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
     LocalDate eid = LocalDate.of(2021,7,20);
        System.out.println(eid);

        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println("-------------------------------");

        // print out each name with date of birth
        String[] names={"Yullia","Alex","Vcitoria","Faluk"};

        LocalDate[] DoB={LocalDate.of(1990,5,25),LocalDate.of(1989,
                6,12), LocalDate.of(1985,7,8),LocalDate.of(1983,
                9,15),LocalDate.of(1981,8,2)};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : birthday : " + DoB[i]);
        }
            System.out.println("--------------------------------------");

            LocalDate per1=LocalDate.of(1980,12,11);
            LocalDate per2=LocalDate.of(1980,12,25);

            if (per1.isBefore(per2)){
                System.out.println("Person 1 is older");
            }else {
                System.out.println("Person 2 is older");
        }

            if (per1.isAfter(per2)){
                System.out.println("person 1 is younger");
            }else {
                System.out.println("person2 is younger");
            }
        System.out.println("----------------------------------");

            boolean r1=per1.isLeapYear();
        System.out.println(r1);

        boolean r2=LocalDate.of(2023,1,1).isLeapYear();
        System.out.println(r2);
        System.out.println("------------------------------------");

        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        LocalDate unitAssessment3=currentDate.plusDays(14);
        System.out.println(unitAssessment3);

        LocalDate unitAssessment4=currentDate.plusMonths(1);
        System.out.println(unitAssessment4);

        LocalDate graduate=currentDate.plusMonths(6);
        System.out.println(graduate);

        LocalDate examDate=currentDate.plusWeeks(2);
        System.out.println(examDate);

    }


}
