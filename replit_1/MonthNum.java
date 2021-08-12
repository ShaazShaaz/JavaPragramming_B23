public class MonthNum {
    public static void main(String[] args) {
        /*
        Write a program that will print out month names by receiving a number. Use Switch Statement.
         If an invalid month number is entered print "Invalid month number"
         */
        int monthNum=2;
        String monthName="";
        if (monthNum==1){
            monthName="January";
        }else if (monthNum==2){
            monthName="February";
        }else if (monthNum==3){
            monthName="March";
        }else if (monthNum==4){
            monthName="April";
        }else if (monthNum==5){
            monthName="May";
        }else if (monthNum==6){
            monthName="June";
        }else if (monthNum==7){
            monthName="July";
        }else if (monthNum==8){
            monthName="August";
        }else if (monthNum==9){
            monthName="September";
        }else if (monthNum==10){
            monthName="October";
        }else if (monthNum==11){
            monthName="November";
        }else if (monthNum==12){
            monthName="December";
        }else {
            monthName="Invalid month number";
        }
        System.out.println("Enter month number: "+ monthNum);
        System.out.println(monthName);



    }
}
