package day44_Recap;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {
      Person per1=new Person("John",'M',
              LocalDate.of(1998,10,4),"Turkey","Turkish");
        System.out.println(per1);
per1.setName("Senol");
        System.out.println(per1);
per1.setGender('f');
        System.out.println(per1);

        per1.drink("cola");




    }
}
