package Day9;

public class DaysInMonth {
    public static void main(String[] args) {
        /*
        write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2

            output:
                    28 days

        Hints: you will need single if statements for:
              28 days: 2
              30 days: 4, 6, 9, 11
              31 days: 1, 3, 5, 7,8,10, 12
         */
        int month=2;
        if (month==2){
            System.out.println("no. of days=28");
        }

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("no of days= 31");
        }
        if (month==4 || month==6 || month==9 || month==11){
            System.out.println("no of days=30");
        }
        /* boolean has28Days= month==2;
        boolean has30Days= month==4 || month==6 || month==9 || month==11
        boolean has31Days=!has28Days && !has30Days
        if (has28days){
            System.out.println("no. of days=28");
            if (has30Days){
            System.out.println("no. of days=30");
            if (has31Days){
            System.out.println("no. of days=31");
         */
    }
}
