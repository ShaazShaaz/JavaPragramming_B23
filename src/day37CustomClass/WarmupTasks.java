package day37CustomClass;

import utilities.StringUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {
        /*
        1. write a program that can swap the first and last elements of an ArrayList
2. write a program that can return the first unique elements of an ArrayList
3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
4. Write a program that can return the nth largest number from an ArrayList of integers
         */
        //1.
        String[] names={"Esraa","Sabir","Nuhatr","Mousa"};
        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList(names));
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);

        //2.
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,5,5,5,6,6,7,8,9,10));
        /*
        int firstUnique=0;
        for (Integer each:list){
            if (Collections.frequency(list,each)==1){
                firstUnique=each;
                break;
            }
        }
         */

        ArrayList<Integer> uniques=new ArrayList<>(list);
        uniques.removeIf(p-> Collections.frequency(uniques,p) !=1);
        int firstUnique=uniques.get(0);
        System.out.println(firstUnique);

        //3.
        String str="AABBCCDDEE"; // need to convert to collections, so 1stly change into array
       // Arrays.asList(str.split(""));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list2);
        String result="";

        for (String each : StringUtilities.removeDupl(str).split("")) {  // A B C D E
            int frequency= Collections.frequency(list2,each);//  2 2 2 2 2
            result+=each+frequency;

        }
        System.out.println(result);

        System.out.println("-----------------------------------");

        //4.
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(12,23,21,12,56,4,23,8,98,98));
       /*  sort method not an option
        Collections.sort(numbers); // ascending
        Collections.reverse(numbers); // descending

        */
        int n=5;
        for (int i = 1; i <n ; i++) {
            numbers.removeIf(p -> p==Collections.max(numbers));
        }
        int fifthMaxNum=Collections.max(numbers);

        System.out.println(fifthMaxNum);
        System.out.println(numbers);



    }
}
