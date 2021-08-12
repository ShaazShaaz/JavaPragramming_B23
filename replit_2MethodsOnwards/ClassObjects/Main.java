package ClassObjects;

public class Main {
    public static void main(String[] args) {
        Attributes n=new Attributes();
        n.setInfo("table","brown",20);
        System.out.println(n.amount);
        System.out.println(n.asString());

        LameCalculator cal=new LameCalculator();
        cal.setInfo(2,3);
        System.out.println(cal.multiply(4,3));




    }
}
