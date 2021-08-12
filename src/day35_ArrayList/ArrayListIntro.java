package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        // normal array
        int[] numbers=new int[10]; // size is 10 and fixed
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]); // to retrieve an element

        // ArrayList
     ArrayList<Integer> numbers1=new ArrayList<Integer>();
     // size is 0 and dynamic, can increase and decrease the size
        //   METHODS OF ARRAYLIST
        numbers1.add(10);// autoboxing happens implicitly, 0
        numbers1.add(20); // 1
        numbers1.add(30); // 2
        numbers1.add(40); // 3
        numbers1.add(1,15); // 10,15,20,30,40
        // CAN ONLY EXECUTE METHOD WHEN INDEX NO. EXISTS ALREADY IN ARRAYLIST
        System.out.println(numbers1);
        System.out.println(numbers1.get(2));  // to retrieve an element

        System.out.println(numbers1.size());
        // to get access to all elements we can use loop
        for (int i = 0; i < numbers1.size(); i++) {
            System.out.println(numbers1.get(i));

        }


    }
}
