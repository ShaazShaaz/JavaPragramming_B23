package Day15;

// import java.lang.String; this step can be avoided for string class. java.lang is a
// built-in package that imports classes implicitly.
public class StringIntro {
    public static void main(String[] args) {


        // Scanner scan=new Scanner(System.in); doesn't run without import statement.
        String name = "Cybertek";  // Literal
        String name2 = new String("Cybertek");
        System.out.println(name2);
        System.out.println("-------------");

        String s1="cat";  //only 1 object will be saved in String Pool cuz they are all same.
        String s2="cat";  // 2 doors to same room.
        String s3="cAt";  // object is different, so this object will hold its own space in pool.
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println("----------------");

        String s4= new String("Dog");
        String s5= new String("Dog");
        String s6=s4;

        System.out.println(s4==s5);// false cuz new keyword will store it in Java Heap, separately
        System.out.println(s6==s4);// true

    }
}
