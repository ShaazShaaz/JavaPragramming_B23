package CustomMethods;

import java.util.Arrays;

public class AddElement {
    /*
    add_to_r is a method that accepts an array and a number.
The method takes the same value of the array but adds the given number into the array at the end.
 Note: The new number is added which means there is a size difference between the two arrays
Example:
method input: add_to_r(new int{1,5,77,8}  ,2)
outputs (int array):
[1, 5, 77, 8, 2]
     */
    public static void main(String[] args) {
       int[] arr1={1,3,5,6};
        arr1=add_to_r(arr1,8);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] add_to_r(int[] r,int n){
        int[] arr=new int[r.length+1];
        int i=0;
        for (int each:r){
            arr[i++]=each;
        }
        arr[arr.length-1]=n;

        return arr;
    }
}
