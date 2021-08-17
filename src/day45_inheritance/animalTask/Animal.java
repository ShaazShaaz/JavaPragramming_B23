package day45_inheritance.animalTask;

public class Animal {
    /* PARENT CLASS
    Animal: name, breed, gender,size,age,color
    eat(),drink(),sleep(),toString()
     */

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public static boolean breathe=true;

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(String food){
        System.out.println(name+" is eating the "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking the "+drink);
    }
    public void sleep(int hours){
        System.out.println(name+" sleeps "+hours+" hours a day");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
