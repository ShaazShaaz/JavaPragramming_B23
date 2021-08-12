package Day12;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=input.nextInt();
        String name="";
        if (number==1){
            name="Monday";
        }else if (number==2){
            name="Tuesday";
        }else if (number==3){
            name="wednesday";
        }else if (number==4){
            name="Thursday";
        }else if (number==5){
            name="Friday";
        }else if (number==6){
            name="Saturday";
        }else if (number==7){
            name="Sunday";
        }else {
            name="invalid number";
        }

        System.out.println(name);

    }
}
