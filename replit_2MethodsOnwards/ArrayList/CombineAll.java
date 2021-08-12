package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {
    /*
    Create a static method that:
is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of numbers called numbersOne, and another ArrayList
 of numbers called numbersTwo
This method should create a new ArrayList of Integer, add all the numbers (in order)
from numbersOne, then add all the numbers (in order) from numbersTwo. In other words,
it is combining all the elements from the two lists.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> numbers2=new ArrayList<>(Arrays.asList(6,7,8,9));
        System.out.println(combineAll(numbers1,numbers2));
    }

    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbersOne,ArrayList<Integer> numbersTwo){

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(numbersOne);
        numbers.addAll(numbersTwo);
        return numbers;





    }




}
