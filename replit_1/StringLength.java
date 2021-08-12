import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        /*
        Write a program that will output length of the text (string)
Example:
Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java
input: java
Display message: "Length is: 4"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.nextLine();

        int length=text.length();
        System.out.println("Length is: "+length);


    }
}
