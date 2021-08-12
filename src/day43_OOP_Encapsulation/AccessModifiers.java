package day43_OOP_Encapsulation;

public class AccessModifiers {
    public static int publicVariable=100;
  //  protected static int protectedVariable=100;
    private static int privateVariable=100;
    static int defaultVariable=140;  // access modifier default

    public static void main(String[] args) {
        System.out.println(privateVariable);
        System.out.println(defaultVariable);
        System.out.println(publicVariable); // all reachable within same class
    }

}
