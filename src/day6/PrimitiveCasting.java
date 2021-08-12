package day6;

import java.text.DecimalFormat;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a=10;
        long b=a; // implicit casting/ done automatically

        double d= 10.0;
        long f=(long) d; // explicit casting/done manually
        System.out.println(f);

        long n= 100;
        short m=(short)n;

        float q=2.5f;
        int u= (int)q;

        long r= (long)q;
        short s= (short) q;
        System.out.println((double) 2.5f);
        System.out.println((double)10L);

        int w= 129;
        byte z=(byte) w;
        System.out.println("z= " +z);

        int e= 70000;
        short g= (short) e;

        System.out.println("g="+ g);

        double num1=1000.0;
        int num2= (int) num1;

        System.out.println("num2 = " + num2); // 1000
        System.out.println("num1 = " + num1); // 1000.0

        System.out.println(100.23456);
        System.out.println((int) 100.23456); //100

       short am=200;
       long pm=am;
        System.out.println("am = " + pm);

        long cm= 300;
        short dm= (short) cm;
        System.out.println("cm = " + dm);

         long nm= 130;
         int nm2= (int)nm;
        System.out.println("nm2 = " + nm2);

    }
}
