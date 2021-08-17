package day45_inheritance.animalTask;

public class Dog extends Animal {
    public Dog(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }
    /*
    Attributes: name, age, breed, size, gender,color
    methods: setInfo, bark, sleep, eat, drink, toString
     */
    public void bark(){
        System.out.println(name+" is barking");
    }


}
