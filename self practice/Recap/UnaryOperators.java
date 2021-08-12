package Recap;

public class UnaryOperators {
    public static void main(String[] args) {
        int a=5;
        int b=a--;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        
        int x=8;
         x= -x - --x + ++x /-x-- * x++%2;
         // -8 - 7 + 8 /-8 *7 % 2
        //  -8-7-7%2
        // -8-7-1=-16
        System.out.println("x = " + x);
    }
}
