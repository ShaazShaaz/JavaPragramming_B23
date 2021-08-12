package Day27_Review;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] numbers= Arrays.copyOf(nums,5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------------");
       // to merge 2 arrays and store in a new array
        // alternate solution
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8,9};
      // old approach-- int[] arr3=new int[arr1.length+arr2.length];
        int[] arr3=Arrays.copyOf(arr1,arr1.length+arr2.length);
        System.out.println(Arrays.toString(arr3));
        int i=arr1.length;  // first index of 2nd array
        for (int each:arr2){
            arr3[i++]=each;

        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("---------------------------------");

        //     copyOfRange method-- to copy some portion of a given array
        int[] data={10,20,30,40,50,60,70,80,90};
        int[] someData=Arrays.copyOfRange(data,2,6+1); // just like substring
        System.out.println(Arrays.toString(someData));
        System.out.println("----------------------------------");
               // print out all the alphabets & then print the first 10 letters in a new array
        char[] characters=new  char[26];
        int k=0;
        for (char j = 'A'; j <='Z' ; j++) {
            characters[k++]=j;

        }
        System.out.println(Arrays.toString(characters));

        char[] first10Letters= Arrays.copyOfRange(characters,0,9+1);
        System.out.println(Arrays.toString(first10Letters));

        char[] last10Letters=Arrays.copyOfRange(characters,characters.length-10,characters.length);
        System.out.println(Arrays.toString(last10Letters));

    }
}
