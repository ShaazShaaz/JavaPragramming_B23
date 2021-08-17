package day45_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog d1=new Dog("Tom","Alceson",'M',"Large",4,"Brown");
        d1.sleep(5);
        System.out.println(d1.gender);


        Cat c1=new Cat("Kitty","Alaskan",'F',"huge",4,"white");
        c1.eat("fish");
        System.out.println(c1.breed);

        Tiger t1=new Tiger("Leo","Bengal",'M',"white",6,"white");
        t1.roar();
        System.out.println(t1.color);
        System.out.println(Tiger.breathe);
    }
}
