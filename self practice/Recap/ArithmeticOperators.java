package Recap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int outcome=12+6/3;
        //      12+ 2=14
        System.out.println(outcome);

        int result= 6-3*2+7-1;
        //          6-6+7-1== 0+6=6
        System.out.println(result);
        /*
        6-3*2/2%2+(7-1)
        6-3%2+6
        6-1+6=11

         */
        int result1= 6-3*2/2%2+(7-1);
        System.out.println("result: " + result1);
        
        int q=50;
        int r= q++ - --q + q-- + ++q;
        // 50-50+50+50=100
        System.out.println("r = " + r);
    }
}
