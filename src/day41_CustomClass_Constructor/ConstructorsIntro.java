package day41_CustomClass_Constructor;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("default constructor");
    }

    public ConstructorsIntro(int a){
        System.out.println("constructor with int arg");
    }

    public static void main(String[] args) {

        new ConstructorsIntro(100);




    }



}
