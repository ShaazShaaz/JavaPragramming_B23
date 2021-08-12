package day37CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {
    public static void main(String[] args) {
      Dog dog1=new Dog();
      dog1.name="Kangal"; // need to call the object to give attributes
        dog1.age= 5;
        dog1.breed="Kangal";
        dog1.size="large";
        dog1.gender="Female";
        dog1.color="yellow";
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.gender);
        System.out.println(dog1.color);

        Dog dog2=new Dog();
        dog2.setInfo("Bobby",3,"Female","Sheperd","brown","large");

        Dog dog3=new Dog();
        dog3.setInfo("Bella",6,"female","shihpoo","white","average");

        dog1.bark();
        dog2.bark();
        dog3.bark();

      dog2.eat("pizza");
      dog3.drink("milk");
      System.out.println("---------------------------------");

      dog2.getInfo();
      dog3.getInfo();

      System.out.println("--------------------------------");

      Dog[] dogs={dog1,dog2,dog3};
      ArrayList<Dog> dogsList=new ArrayList<>();
      dogsList.addAll(Arrays.asList(dog1,dog2,dog3));
      System.out.println(dogsList);
    }


}
