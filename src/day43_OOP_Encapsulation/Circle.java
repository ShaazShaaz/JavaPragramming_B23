package day43_OOP_Encapsulation;

public class Circle {

    /*
    Create a class named Circle
            Private variables:
                radius, diameter, PI
            generate getter & setter for all private fields
                    Make sure that radius & diameter of circle can never be set to negative
            add a constructor that can set all the fields
            Extra methods:
                equal(): accepts a Circle Object and returns true if the given circle is equal
                to the current circle
                calcArea(): returns the area
                calcPerimeter(): returns the perimeter
                toString()
     */
    private double radius,diameter;
    private static final double PI=3.14; // final so that the value is never changed
    /*static {
        PI=4.12;
    }
    // gives error cuz it shouldn't change
     */

    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return diameter;
    }
    public void setRadius(double radius){
        if (radius<0){
            System.out.println("Radius cannot be negative");
            return;  // exits the method . imp step
        }
        this.radius=radius;
        diameter=radius*2;
    }
    public void setDiameter(double diameter){
        if (diameter<0){
            System.out.println("diameter cannot be negative");
            return;
        }
        this.diameter=diameter;
        radius=diameter/2;
    }

    public Circle(double radius) {  // constructor method to create object
        setRadius(radius);
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return diameter*PI;
    }
    // comparing whether radius of current circle is equal to radius of another circle object
    public boolean equals(Circle circle){
        return radius==circle.radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
