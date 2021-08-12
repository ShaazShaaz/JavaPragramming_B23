import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.util.Scanner;

public class StudentTeacher {
    public static void main(String[] args) {
        /*
        The variable name holds a String user input
Write a conditional statement that will determine if the person is a student or teacher.
If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:
input: Chen
output: teacher
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= scan.next();
        switch (name){
            case "Chen":
                System.out.println("teacher");
                break;
            default:
                System.out.println("student");
        }



    }
}
