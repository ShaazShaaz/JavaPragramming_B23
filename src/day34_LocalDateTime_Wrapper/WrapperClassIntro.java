package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s=10;
        Integer num=20;
        Integer num2=(int)s;
        // AUTOBOXING >> int is IMPLICITLY CASTED TO INTEGER(primitive to wrapper class value
        // if Integer num2=s>>> will give compile error

        char ch='@';
        Character ch2=ch; // Autoboxing

        // UNBOXING---convert wrapper class to primitive
        Byte b1=10;
        byte b2=b1;
        short b3=b1;
        int b4=b1;
        long b5=b1;
        float b6=b1;
        double b7=b1;

        System.out.println("---------------------------------------------");

        byte c1=10;
        Byte c2=c1; // Wrapper Class only accepts its own primitive, Autoboxing
      //  Short c3=c1;  will give error cuz Wrapper Class Short only accepts short primitive
        // Integer c4=c1; also ERROR







    }
}
