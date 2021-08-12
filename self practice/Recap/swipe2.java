package Recap;

public class swipe2 {
    public static void main(String[] args) {
        String a= "Shazia";
        String b="Sophie";
        // to swipe, declare a new variable: c
        String c= b;//c="Sophie"
        b=a;// b= Shazia
        a=c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
