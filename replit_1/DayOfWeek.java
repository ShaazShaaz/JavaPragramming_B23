public class DayOfWeek {
    public static void main(String[] args) {
        /*
        Write a program that will print a week days according to the day number. Use Switch statement.
         If an invalid day is entered print: "Not a valid day"
         */
        int number = 15;
        String result="";
        if (number == 1) {
            result="it is Monday";
        }else if (number== 2) {
            result="Tuesday";
        }else if (number==3){
            result="Wednesday";
        }else if (number==4){
            result="Thursday";
        }else if (number==5){
            result="Friday";
        }else if (number==6){
            result="Saturday";
        }else if (number==7){
            result="Sunday";
        }else {
            result="Not a valid day";
        }
        System.out.println(result);




    }
}
