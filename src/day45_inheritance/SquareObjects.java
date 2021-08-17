package day45_inheritance;

public class SquareObjects {
    public static void main(String[] args) {

       Square square1=new Square(-4);
        System.out.println(square1.getSide());
        System.out.println(square1.area());
        square1.setSide(10);
        System.out.println(square1.getSide());

        Square square2=new Square(10);
        System.out.println(square1.equals(square2));

        System.out.println(square1.area());

        Square s1=new Square(5);
        Square s2=s1;
        s2.setSide(10);
        System.out.println(s1.getSide()+":"+ s2.getSide());

        Square l1=new Square(3);
        l1=new Square(4);







    }
}
