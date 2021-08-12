package CustomMethods;

import java.util.Arrays;

public class Person {
    /*
    The method person has a string argument with this format: "name,last name,age".
    Print out the person's information
Example:
person("jon,doe,30");
output:
person name: jon
last name: doe
age: 30
hint: use the split method to split the string to a string array where there is a "," char
     */
    public static void main(String[] args) {
        String s="jon,doe,30";
        person(s);
    }


    public static void person(String str){
        String s="jon,doe,30";
        String[] s1=s.split(",");
        String name="";
        String lastName="";
        String age="";
        //String result=name+", "+lastName+", "+age;
        for (int i = 0; i <3 ; i++) {
        name=s1[0];
        lastName=s1[1];
        age=s1[2];

        }
        System.out.println("person name: "+name);
        System.out.println("last name: "+lastName);
        System.out.println("age: "+age);


    }


}
