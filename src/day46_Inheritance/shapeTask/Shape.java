package day46_Inheritance.shapeTask;

public class Shape {
    /*
    create a class called Shape
            vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
    add a constructor that can set all the fields
    methods: calcArea(), calcPerimeter(),
    toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()
  2. create sub classes of Shape:
    Circle
    Rectangle
    Square
    give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    AFTER TODAY'S TOPIC: Overriding
  3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:
    Area of the circle:    3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:    side * side
    Perimeter of circle:   3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
     */
    private final String name;
    public static final boolean isShape,hasArea,hasPerimeter;
    static {
        isShape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    public String toString() {
        return
                "area="+area()+
                "perimeter="+perimeter()
                ;
    }
}
