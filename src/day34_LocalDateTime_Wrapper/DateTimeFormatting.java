package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        // if u wanna change the default pattern to MM/dd/YYYY
        // use DataTimeFormatter class
        DateTimeFormatter DF=DateTimeFormatter.ofPattern("MM/dd/YYYY E");// EEEE will print out full dayname
        LocalDate today=LocalDate.now();
        System.out.println(today);

        today.format(DF);
        System.out.println(today.format(DF));

        // in case of customizing time formats
        DateTimeFormatter TF=DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);// default- 12:08:21.069
        System.out.println(currentTime.format(TF));

        LocalTime time1=LocalTime.of(17,25);
        System.out.println(time1);
        System.out.println(time1.format(TF));
        System.out.println("----------------------------");

        // use the LocalDate & Time get the date and time in the following format:
        //            Tuesday, 1:00 pm, Nov/24/2020
        DateTimeFormatter DTF=DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");
        LocalDateTime a=LocalDateTime.now();
        System.out.println(a.format(DTF));


        LocalDateTime time2=LocalDateTime.of(2020,11,24,13,0);
        System.out.println(time2.format(DTF));

        // to find which day is 2022-01-01
        String result=LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("result is: "+result);

        System.out.println("------------------------------------");
        // using a customized method for getting the name of the day
        System.out.println(nameOfDay(2025,5,28));

    }
     // customized method for retrieving the day
    public static String nameOfDay(int year, int month, int day){
        String result=LocalDate.of(year,month,day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }
}
