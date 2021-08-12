package day37CustomClass.rectangletask;


public class Rectangle {
    /*
    create a custom class named Rectangle
    Attributes:
        length, width
    Actions:
        setInfo: sets the length and width of the rectangle
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        getInfo(): prints the width, length, area and perimeter of the rectangle
     */
    double length;
    double width;

    public void setInfo(double length,double width){
        // if parameter/local variable has same name as instance var-(double length, double width)
         this.length=length;//use the keyword this to assign the local variable to instance variable
         this.width=width;
       // length=length1;
       // width=width1;
    }
    public double calculateArea(double length,double width){
        return length*width;

    }
    public double calculatePerimeter(double length,double width){
        return 2*(length+width);

    }
   /* public void getInfo(double length,double width){
        System.out.println("width: "+width);
        System.out.println("length: "+length);
        System.out.println("area: "+(length*width));
        System.out.println("perimeter: "+(2*(length+width)));
    }*/

    public String toString() {
        return "Rectangle{" +
                "length= " + length +
                ", width= " + width +
               // "area= "+calculateArea()+
              //  " perimeter= "+calculatePerimeter()+
                '}';
    }
}
