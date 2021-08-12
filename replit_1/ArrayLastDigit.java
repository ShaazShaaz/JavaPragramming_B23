import java.util.Arrays;

public class ArrayLastDigit {
    public static void main(String[] args) {
        /*
        Given an int array nums print a new array with double the length where its last
        element is the same as the original array, and all the other elements are 0.
        The original array will be length 1 or more. Hint: by default, a new int array
         contains all 0's.
Examples:
input: 4 5 6
output: [0, 0, 0, 0, 0, 6]
         */
        int[] array={4,5,6};
        int[] newArray=new int[array.length*2]; // 0,0,0,0,0,0

          newArray[newArray.length-1]  =array[array.length-1];

        System.out.println(Arrays.toString(newArray));

    }
}
