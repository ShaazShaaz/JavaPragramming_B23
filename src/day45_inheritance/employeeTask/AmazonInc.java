package day45_inheritance.employeeTask;

public class AmazonInc {
    public static void main(String[] args) {
       Tester t1=new Tester("Shazia",'F',40,9284,"SDET",120000);
       Developer d1=new Developer("Olcay",'M',40,12345,"Dev",130000);
       Driver dr1=new Driver("John",'M',45,23456,"Driver",50000);
        System.out.println(t1.name);
        t1.drink("Cola");
        System.out.println(d1.name);
        d1.sleep(9);
        d1.code();
        System.out.println(dr1.name);
        dr1.eat("sushi");



    }
}
