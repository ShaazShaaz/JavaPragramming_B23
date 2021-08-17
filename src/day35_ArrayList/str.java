package day35_ArrayList;

import day33_Methods.Str;

import java.util.ArrayList;
import java.util.Arrays;

public class str {
    public static void main(String[] args) {
String[] arr={"HI","You"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
        list.add("hello");
        list.add(0,"Shazia");
        System.out.println(list);

    }
}
