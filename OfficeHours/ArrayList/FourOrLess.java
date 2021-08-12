package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.
                    Take those Strings and put them into a different ArrayList
                    Ex:
                    Input:
                    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
                    Output:
                    [ tree, loop, cat ]
         */
        ArrayList<String> list=new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut" ));
        ArrayList<String> newList=new ArrayList<>();
        /* OPTION 1
        for (String each:list){
            if (each.length()<=4){
                newList.add(each);
            }
        }
         */

        list.removeIf(each->each.length()>4);
        System.out.println(newList);





    }
}
