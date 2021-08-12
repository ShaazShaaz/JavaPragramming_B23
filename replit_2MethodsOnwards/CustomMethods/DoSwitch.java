package CustomMethods;

import java.util.Arrays;

public class DoSwitch {
    /*
    Implement the do_switch method Switch the last element in an array with the first and return the array.
Examples:
do_switch([1,2,3,4])
returns:[4,2,3,1]
     */
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        arr1=do_switch(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] do_switch(int[] array){
        int temp=0;
            temp=array[0];
            array[0]=array[array.length-1];
            array[array.length-1]=temp;


return array;

    }
}
