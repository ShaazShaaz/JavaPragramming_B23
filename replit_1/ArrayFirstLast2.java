import java.util.Arrays;

public class ArrayFirstLast2 {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first and last letter
         of each element in the format below. Put each first and last letter in an array.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

         */
        String[] words={"hello", "why", "by", "apple" , "note"};
        String[] array=new String[words.length];
        for (int i=0,j=0;j< words.length;i++){
            String each=words[i];
            array[j++]=each.substring(0,1)+each.substring(each.length()-1);
        }



        System.out.println(Arrays.toString(array));


    }
}
