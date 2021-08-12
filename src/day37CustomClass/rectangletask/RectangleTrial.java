package day37CustomClass.rectangletask;

import day37CustomClass.rectangletask.Rectangle;

public class RectangleTrial {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setInfo(2.5,3);
       // r1.getInfo(2.5,3);
        System.out.println(r1.calculateArea(2.5, 3));
        System.out.println(r1.calculatePerimeter(2.5, 3));
        System.out.println("-------------------");
        Rectangle r2=new Rectangle();
        r2.setInfo(5,3);
       // r2.getInfo(5,3);
        System.out.println(r2.calculateArea(5, 3));
        System.out.println(r2.calculatePerimeter(5, 3));
        System.out.println(r1);
        System.out.println(r2);

    }
}
