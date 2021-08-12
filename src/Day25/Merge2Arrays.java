package Day25;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        /*
         write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}
        output
            arr3 = {1,2,3,4,5,6}
            // you will have to use 2 diff loop becuz both given arrays have different sizes
         */
        int[]  arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr3=new  int[arr1.length+arr2.length];  // making sure that arr3 has enough capacity
        // to contain all elements of arr1 and arr2
        // in beginning arr3 ={0,0,0,0,0,0}
        int j=0;  // declare for the index numbers of arr3 outside the loop cuz it will make
                  // it local and we cant use it in 2nd loop
        for (int i = 0; i <arr1.length ; i++) {  // for arr1
            arr3[j++]=arr1[i];  // retrieves each element of arr1 and assigns it to indexes of arr3
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++]=arr2[i];  // retrieves each element of arr2 and assigns it to indexes of arr3
        }

        System.out.println(Arrays.toString(arr3));
    }
}
