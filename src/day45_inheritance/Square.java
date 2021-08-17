package day45_inheritance;

public class Square {
    /*
     create a class named Square
            private variables:
                side (double)
            Encapsulate All the private fields
                (side can not be set to negative)
            Add a constructor that can set the instances when the object is created
                (avoid any duplicated code fragments)
            Extra methods:
                area(), perimeter(), toString(), equals()
     */
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side){
        if (side<0){
            System.out.println("side cannot be negative");
            return;
        }
        this.side=side;
    }

    public Square(double side) {
        setSide(side);

    }
    public double area(){
       return side*side;
    }
    public double perimeter(){
        return side*4;
    }
    public boolean equals(Square square){
        return side==square.getSide();
    }

    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                "area="+area()+
                "perimeter="+perimeter()+
                '}';
    }
}
