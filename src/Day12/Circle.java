package Day12;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        System.out.println("Enter the radius: ");
        double radius=scan.nextDouble();

        double area= 3.14*(radius*radius);
        System.out.println("area of circle:" + area);





    }
}
