package day41_CustomClass_Constructor.CircleTask;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI;

    static {
        PI=3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter=radius*2;
    }

    public double areaOfCircle(){
        return Math.pow(radius,2)*PI;
    }

    public double perimeterOfCircle(){
        return diameter*PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area="+areaOfCircle()+
                ", perimeter="+perimeterOfCircle()+
                '}';
    }
}
