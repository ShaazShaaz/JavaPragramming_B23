package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTwo {
    /*
    Create a method that:
is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numb=new ArrayList<>(Arrays.asList(2,3,4));
        System.out.println(timesTwo(numb));
    }

   public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
       ArrayList<Integer> result=new ArrayList<>();
       for (int i = 0; i < nums.size(); i++) {
           result.add(i,nums.get(i)*2);
       }
       return result;
   }


}
