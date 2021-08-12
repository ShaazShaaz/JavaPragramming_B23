package day39_CustomClass_Statics.CarpetTask;

import java.text.DecimalFormat;

public class Circle {
    /*
    CircleTask
        1. create a class named Student that has the followings features
            Attributes:
                    radius, diameter
                methods:
                    calculate(): returns the area of the circle
                    calculatePerimeter(): returns the perimeter of the circle
                    setInfo(): initializes all the instance of the Circle
                    toString(): displays the radius, diameter, perimeter and area of the circle object

     */

    public double radius,diameter;
    //public static double PI=3.14;// only 1 copy of static variable will be shared by all circle objects
    public void setInfo(double radius){
        this.radius=radius;
        diameter=radius*2;
    }

    public double areaOfCircle(){
      return radius*radius*Math.PI;
    }

    public double perimeter(){
        return diameter*Math.PI;
    }

    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "Circle {" +
                "radius= " + radius +
                ", diameter= " + diameter +
                ", area= "+df.format(areaOfCircle())+
                ", perimeter= "+df.format(perimeter())+
                '}';
    }
}
