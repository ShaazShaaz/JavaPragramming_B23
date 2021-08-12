import java.util.Arrays;

public class ReveresedArrayString {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to get each word and assign to String
         reversed in reverse order.
Example:
sentence -> Java is fun
reversed > fun is Java
         */

        String sentence="Java is fun";
        String reversed="";
        String[] array=sentence.split(" ");
        for (int i=array.length-1;i>=0;i--){
            reversed+=array[i]+" ";
        }

        System.out.println(reversed);

    }
}
