package day37CustomClass;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public String size;
    public  String color;
    public  String gender;

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    public void play(){
        System.out.println(name+" is playing");
    }

    public void setInfo(String dogName, int dogAge, String dogGender, String dogBreed, String dogColor, String dogSize){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;

    }

    public void getInfo(){
        System.out.println("name: "+name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }

}
