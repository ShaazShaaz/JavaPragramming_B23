package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeTask {
    public static void main(String[] args) {
    /*
        1. create string array to have 5 of your classmate's names
    2. create an array that contains thier DofB
    3. find out who is the youngest person
    4. find out who was born on leap year
     */
        String[] names = {"Shazia", "Yulliia", "Victoria", "Alex"};
        LocalDate[] DoB = {LocalDate.of(1990, 5, 25), LocalDate.of(1989,
                6, 12), LocalDate.of(1985, 7, 8), LocalDate.of(1983,
                9, 15), LocalDate.of(1981, 8, 2)};

        LocalDate youngest=DoB[0];
        int index=0;
        for (int i = 0; i < DoB.length; i++) {
           if (DoB[i].isAfter(youngest)){
               youngest=DoB[i];
               index=i;
           }
            if(DoB[i].isLeapYear()){
                System.out.println(names[i]+ " is born in a leap year.");
            }
        }
        System.out.println("Youngest is: "+youngest);
        System.out.println(names[index]);
        System.out.println("----------------------------");

        DateTimeFormatter DF= DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]+" was born on "+DoB[i].format(DF));

        }







    }
}
