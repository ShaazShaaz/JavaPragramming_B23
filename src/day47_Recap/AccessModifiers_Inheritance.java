package day47_Recap;

import utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {
    public void method(){
        System.out.println(s1);
        System.out.println(s2); // protected is visible outside class only in case of inheritance
     //   System.out.println(s3); default not visible outside package
      //  System.out.println(s4);  private
    }



}
