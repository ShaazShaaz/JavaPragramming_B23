package Recap;

public class Swipe {
    public static void main(String[] args) {
        int a=500;
        int b=700;
        int c=b;//c=700
         b=a;// b=500
        a=c;// a=700

        System.out.println("b = " + b);

        System.out.println("a = " + a);


    }
}
