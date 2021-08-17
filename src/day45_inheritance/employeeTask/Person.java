package day45_inheritance.employeeTask;

public class Person {
    public String name;
    public final char gender;
    public int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void sleep(int hours){
        System.out.println(name+" sleeps "+hours+" hours a day");
    }
}
