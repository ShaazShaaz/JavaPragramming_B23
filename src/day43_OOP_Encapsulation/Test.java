package day43_OOP_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);
      //  System.out.println(AccessModifiers.privateVariable);  not reachable=ERROR
        System.out.println(AccessModifiers.defaultVariable);

        EncapsulationIntro obj=new EncapsulationIntro();
        /* if public
        System.out.println(obj.username);
        System.out.println(obj.password);
        obj.username="H";
        obj.password="123";
        System.out.println(obj.username);
        System.out.println(obj.password);
         */
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setUsername("H");
        obj.setPassword("123");
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());






    }
}
