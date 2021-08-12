package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEveryOther {
    /*
    Create a method that:
is called removeEveryOther
returns ArrayList of Strings
takes in a single parameter - an ArrayList of Strings called words
This method should take the ArrayList parameter and modify it by removing every other element
 in the list, starting with removing the 0th element.
For example, if the parameter is:
("hi","yo","sup","yolo","book")
The modified ArrayList should be:
("yo","yolo")
     */
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","book"));
        System.out.println(removeEveryOther(array));
    }

    public static ArrayList<String> removeEveryOther(ArrayList<String> words){
        ArrayList<String> str=new ArrayList<>();
        str.addAll(words);
        for (int i = 0; i < words.size(); i+=2) {
            str.remove(words.get(i));
        }
return str;
    }
}
