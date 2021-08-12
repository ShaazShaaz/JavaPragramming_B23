package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {
    /*
    1. write a program to set the last element of the Integer arraylist to zero
    list={1,2,3,4,5}
    output={1,2,3,4,0}
    2. program that can multiply each odd number by 2
    3. program that can combine 2 string arrays
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        list.set(list.size()-1, 0);
        System.out.println(list);
        System.out.println("________________________________");

        //2
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list2);

        for (int i = 0; i <list2.size() ; i++) {
            if (list2.get(i)%2!=0){
                list2.set(i,list2.get(i)*2);
            }
        }
        System.out.println(list2);
        System.out.println("-------------------------------------");

        //3.
        String[] arr1={"A","B","C"},
        arr2={"D","E","F","G"};

        //ArrayList<String> result=new ArrayList<>();
        ArrayList<String> result=new ArrayList<>(Arrays.asList(arr1));
        result.addAll(Arrays.asList(arr2));
       /* for (String each:arr1){
            result.add(each);
        }
        for (String element:arr2){
            result.add(element);
        }*/
        System.out.println(result);

    }
}
