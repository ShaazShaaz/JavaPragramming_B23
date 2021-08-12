package Day7;

public class PositiveAndNegativeZero {
    public static void main(String[] args) {
        /*

         */
        int number=-100;
        boolean isPositive= number>0;
        boolean isNegative= number<0;
       // boolean isZero= isNegative==false && isPositive==false;
        // boolean isPositive= isNegative==false && isZero==false;
        boolean isZero= number==0;

        System.out.println(number + "is Zero: " + isZero);
        System.out.println(number +" is Positive: " + isPositive);
        System.out.println(number +" is Negative: " + isNegative);
    }
}
