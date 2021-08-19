package day46_Inheritance.carTask;

public class CarShop {
    public static void main(String[] args) {

        Toyota toy1 = new Toyota("Camry", 2010, 5000, "white", 200000);
        toy1.start();
        System.out.println("------------------------------");
        Tesla tesla1 = new Tesla("S model", 2021, 120000, "Black", 0);
        tesla1.start();
        System.out.println("------------------------------");
        BMW b1 = new BMW("X6", 2015, 100000, "red", 5000);
        b1.start();
        System.out.println("------------------------------");


    }
}
