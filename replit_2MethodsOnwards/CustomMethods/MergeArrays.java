package CustomMethods;

import java.util.Arrays;

public class MergeArrays {
    /*
    mergR merges two arrays into one. It gets two int arrays and returns an int array
Example:
mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]
hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
     */
    public static void main(String[] args) {
        int[] ar={1,2,3};
        int[] ar2={4,5,6,7,8};
        System.out.println(Arrays.toString(mergR(ar,ar2)));
    }

    public static int[] mergR(int[] a,int[] b){
        int[] merged=new int[a.length+b.length];
        for (int i = 0,j=0; i < a.length; i++) {
            merged[j++]=a[i];
        }
        for (int k = 0,l=a.length; k < b.length; k++) {
            merged[l++]=b[k];
        }
        return merged;
    }
}
