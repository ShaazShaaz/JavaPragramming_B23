package Day9;

public class DaysInWeek {
    public static void main(String[] args) {
        int day=5;  // 1~7
        String name="";
        if (day==1){
            name="Monday";
        }else if (day==2){
            name="Tuesday";
        }else if (day==3){
            name="Wednesday";
        }else if (day==4){
            name="Thursday";
        }else if (day==5){
            name="Friday";
        }else if (day==6){
            name="Saturday";
        }else {
            name="Sunday";
        }
        System.out.println(name + " is the name of the day");
    }
}
