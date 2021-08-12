package Day8;

public class PosNegZero {
    public static void main(String[] args) {
        int number=200;
        boolean positive= number>0;
        boolean negative=number<0;
        boolean zero= !positive && !negative;
        if (positive){ // if number is positive
            System.out.println(number+ "is positive");
        }
        if (negative){ // if number is negative
            System.out.println( number + " is negative");
        }

        if (zero){ // if number is Zero
            System.out.println( number + "is zero");

        }
        System.out.println((int)(10/3.0));
    }
}
