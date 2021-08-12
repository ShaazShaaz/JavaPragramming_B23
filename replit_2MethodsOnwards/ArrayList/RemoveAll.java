package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    /*
    Create a static method that:
is called removeAll
returns ArrayList<String>
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
This method should go through every element of wordList and remove every instance of targetWord
 from the ArrayList.
Example:
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
removeAll(wordList,"hi");
wordList: ["hey","yo"]
     */
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));
        String str = "hi";
        System.out.println(removeAll(wordList,str));
    }


   public static ArrayList<String> removeAll(ArrayList<String> wordList,String str ) {
      /*if (!wordList.contains(str)){
          return wordList;
      }else {
          wordList.removeIf(p -> p.equalsIgnoreCase(str));
          return wordList;
      }

       */
       wordList.removeAll(Arrays.asList(str));
       return wordList;
   }




}
