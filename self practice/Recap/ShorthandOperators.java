package Recap;

public class ShorthandOperators {
    public static void main(String[] args) {
        int salary= 500;
        salary +=200;// salary= 500+200=700
        System.out.println("salary = " + salary);

        int age= 35;
        age -=10;
        System.out.println("age = " + age);

        salary +=1000;
        System.out.println("salary = " + salary);

        double price= 200;
        price*=5; // 1000
        System.out.println("price = " + price);

        price/=3.5;
        System.out.println("price = " + price);

         price %=3;
        System.out.println("price = " + price);

    }
}
