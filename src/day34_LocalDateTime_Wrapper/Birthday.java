package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        birthday(1981,8,2);
    }


    public static void birthday(int year,int month, int day){
        LocalDate DoB=LocalDate.of(year,month,day);
        LocalDate today=LocalDate.now();
        int age=today.getYear()-DoB.getYear();

        if (DoB.getMonthValue()==today.getMonthValue() && DoB.getDayOfMonth()==today.getDayOfMonth()){
            System.out.println("Today is your birthday. Happy Birthday!");
            System.out.println("today you are "+age+" years old!");
        }else {
            System.out.println("Today is not your birthday");
        }

    }
}
