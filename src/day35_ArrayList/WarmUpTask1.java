package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {
/*
create an array of LocalDate and has the next 10 days dates, use for each loop to print
 each date in the following format
MonthName/Day, DayName
: November/25, Wednesday
 */
        LocalDate[] dates=new LocalDate[10];

        for (int i = 0; i <dates.length ; i++) {
            dates[i] = LocalDate.now().plusDays(i+1);
        }
       System.out.println(Arrays.toString(dates));
       for (LocalDate each:dates){
            System.out.println(each.format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));
        }


    }
}
