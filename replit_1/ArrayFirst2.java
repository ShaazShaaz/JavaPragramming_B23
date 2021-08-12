import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFirst2 {
    public static void main(String[] args) {
        /*
        Given an int array num of any length, print a new array of its first 2 elements.
         If the array is smaller than length 2, use whatever elements are present.
Examples:
input: 1, 2, 3
output: [1, 2]
         */
        int[] num = {1,5,6,4,3};
        int[] newArr = new int[2];
      if (num.length<2){
            newArr=num;
            System.out.println(Arrays.toString(newArr));
      }else {
          for (int i = 0, j = 0; i <= 1; i++) {
             newArr[j++] = num[i];
    }
    System.out.println(Arrays.toString(newArr));
}
    }
    }

