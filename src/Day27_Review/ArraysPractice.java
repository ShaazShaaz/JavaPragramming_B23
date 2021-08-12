package Day27_Review;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] array=new int[2];
        array[0]=10;
        array[1]=20;
        // cannot store any further, only if we re-initialize the array variable,
        // but all previous array value is lost
        array=new int[4];   //{0,0,0,0}
        array[2]=30;
        array[3]=40;

        System.out.println(Arrays.toString(array));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers.length);
        System.out.println(numbers[0]);// first element
        System.out.println(numbers.length-1);// last element

        // to retrieve the elements
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");

        }









    }
}
