package utilities;

public class AccessModifiers_Inheritance extends Data2{
    public void method(){
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
       // System.out.println(s4); not visible outside its class cuz it was declared private

        publicMethod();
        protectedMethod();
        defaultMethod();
       // privateMethod(); not visible outside class



    }



}
