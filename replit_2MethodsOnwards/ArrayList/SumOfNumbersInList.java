package ArrayList;

import java.util.ArrayList;

public class SumOfNumbersInList {
    /*
    Given an ArrayList of Integers called list, find and print the sum of all the numbers in the list
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        int sum=0;
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);
        }
        /*for (Integer each:list){
            sum+=each;

        }

         */
        System.out.println(sum);
    }
}
