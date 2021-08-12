package ArrayList;

import day33_Methods.Str;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfStrings {
    public static void main(String[] args) {
        /*
        String numbers to sum
 Given an ArrayList of numbers in String format, add each digit of each element and store into a different
  ArrayList.
                    Ex:
                    Input:
                    “123”, “34”, “513”
                    Output:
                    [ 6, 7, 9 ]
         */
        ArrayList<String> list=new ArrayList<>(Arrays.asList("123","34","513"));
        ArrayList<Integer> result=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int total=0;
           /* for (int j = 0; j < list.get(i).length(); j++) {
                total+=Integer.parseInt(""+list.get(i).charAt(j));
            }

            */
            // option 2
           /*String[] split= list.get(i).split("");
           for (String each:split){
               total+=Integer.parseInt(each);
           }

            */
            // option 3
            char[] chars=list.get(i).toCharArray();
            for (char each:chars){
                total+=Integer.parseInt(""+each);
            }

            result.add(total);
        }
        System.out.println(result);






    }
}
