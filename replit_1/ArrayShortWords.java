import java.util.Arrays;

public class ArrayShortWords {
    public static void main(String[] args) {
        /*
        Write a program that will find out shortest words in the given string str. If there are
         few words that are evenly short, print them all. Use split method in order to split str
         string variable and create an array of strings. Print array with Arrays.toString() method.
          Sort array before printing.
Hint: Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
         */
String str="olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
String[] array=str.split(", ");
String shortest=array[0];
String shortestWords="";
for (String word:array){
    if (word.length()<array[0].length()){
        shortest=word;
        if (shortest.length()==word.length()){
            shortest=word;
        }
    }
}for (String each:array)
    if (each.length()==shortest.length()) {
        shortestWords+=each+", ";
    }
        String[] shortestW=shortestWords.split(", ");
        System.out.println(Arrays.toString(shortestW));
    }
}
