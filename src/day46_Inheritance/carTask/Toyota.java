package day46_Inheritance.carTask;

public class Toyota extends Car{
    // must call the parent call constructor, it will assign the given arguments-brand,model etc.
    // by using super key word. constructor call has to be 1st step
    // cannot call constructor by name. only this()-for current class and super()-for parent cn be used

    public static boolean isReliable=true;// since its static no need to initialize it in constructor
    // if its a block of codes, use static block
    public Toyota( String model, int year, double price, String color, long miles) { // delete brand
        super("Toyota", model, year, price, color, miles);// add toyota,brand is always toyota
    }






}
