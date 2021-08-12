package Practice;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        Write a Java program to sort a numeric array and a string array.
         */

        int[] nums={23,4,65,12,3,4};
        String[] array={"Shazia","Yuliia","Victoria"};
        Arrays.sort(nums);
        Arrays.sort(array);


        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(array));
    }
}
