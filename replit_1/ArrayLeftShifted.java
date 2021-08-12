import java.util.Arrays;

public class ArrayLeftShifted {
    public static void main(String[] args) {
        /*
        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
        You may modify and print the given array, or print a new array.`
         */
        int[] nums={6, 2, 5, 3};
        int[] newArr=new int[nums.length];
        for (int i = 1,j=0; i < nums.length; i++) {
            newArr[j++]=nums[i];
        }
        newArr[newArr.length-1]=nums[0];
        System.out.println(Arrays.toString(newArr));
    }
}
