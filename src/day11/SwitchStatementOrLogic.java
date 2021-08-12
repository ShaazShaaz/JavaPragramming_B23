package day11;

public class SwitchStatementOrLogic {
    public static void main(String[] args) {
        /*
        28 days= february
        30 days= april, june, sep, nov
        31 days= jan, march, may, july, august, oct and dec
         */
        int number=10;

        switch (number){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");



            case 2:System.out.println("28 days");



            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");

default:
    System.out.println("02");
float n1= 12_500;
float n2= 123_50;
    System.out.println(n1+n2);

        }



    }
}
