package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {
    /*
    In this assignment you will swap a position in an array list with another.
swap() gets 3 arguments, an Arraylist, a position, and another position to swap with.
Example
swap(["one","two","three"],0,2)
returns:["three","two","one"]
     */
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(swap(str,0,2));


    }


    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2){
        Collections.swap(list,pos1,pos2);
         return list;
    }

}
