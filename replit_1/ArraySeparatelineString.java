import java.util.Arrays;

public class ArraySeparatelineString {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to type each word in separate lines.
Example:
sentence -> "Java is fun"
Print
Java
is
fun
         */


        String sentence="Java is fun";
        String[] array=sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
