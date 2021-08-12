package Day10;

public class NameOfMonths {
    public static void main(String[] args) {
        int num=13; // 1~12
        String name="";
        if (num>=1 && num<=12) {

            if (num == 1) {
                name = "January";
            } else if (num == 2) {
                name = "february";
            } else if (num == 3) {
                name = "march";
            } else if (num == 4) {
                name = "April";
            } else if (num == 5) {
                name = "May";
            } else if (num == 6) {
                name = "June";
            } else if (num == 7) {
                name = "July";
            } else if (num == 8) {
                name = "August";
            } else if (num == 9) {
                name = "September";
            } else if (num == 10) {
                name = "October";
            } else if (num == 11) {
                name = "november";
            } else {
                name = "December";
            }


        }else {
            name="no such month";
        }
        System.out.println(name);



    }
}
