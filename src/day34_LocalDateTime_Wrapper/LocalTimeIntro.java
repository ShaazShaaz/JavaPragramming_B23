package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        System.out.println(now);
        LocalTime breakTime=now.plusMinutes(15);
        System.out.println(breakTime);
        System.out.println(breakTime.getMinute());

        LocalTime quizDueBy=breakTime.plusMinutes(20);
        System.out.println(quizDueBy);

    }
}
