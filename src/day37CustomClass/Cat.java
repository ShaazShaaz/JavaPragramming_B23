package day37CustomClass;

public class Cat {
    String name;
    String breed;
    String size;
    String gender;
    int age;
    String color;
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="Leo";
        cat1.breed="wild";
        cat1.age=6;
        cat1.color="black";
        cat1.gender="male";
        cat1.size="small";
        cat1.getInfo();
        cat1.drinks("milk");
        cat1.plays("yarn");
        cat1.eats("fish");
        cat1.sleeps();

    }
    public void setInfo(String catName,String catBreed,String catGender,String catSize,String catColor,int catAge){
       name=catName;
       breed=catBreed;
       size=catSize;
       gender=catGender;
       age=catAge;
       color=catColor;
    }
    public void getInfo(){
        System.out.println("name: "+name);
        System.out.println("breed: "+breed);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("color: "+color);
        System.out.println("size: "+size);
    }

    public void eats(String food){
        System.out.println(name+" eats "+food);
    }
    public void drinks(String drink){
        System.out.println(name+" drinks "+drink);
    }
    public void plays(String game){
        System.out.println(name+" plays "+game);
    }
    public void sleeps(){
        System.out.println(name+" sleeps all day");
    }
}
