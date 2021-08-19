package day46_Inheritance.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle c1 = new Circle(3);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1);
        System.out.println("--------------------------------------");
        Rectangle r1=new Rectangle(4,2);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1);
        System.out.println("--------------------------------------");
        Square s1=new Square(4);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
        System.out.println(s1);




    }
}
