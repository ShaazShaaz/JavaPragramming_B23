package Practice;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        /*
        create an array of the unique elements from the given array
         */
        int[] arr={1,2,2,2,3,4,4,45};  // 1 3 45
        int[] array={};
        int j=0;
        for (int each:arr){
            int count=0;
            for (int i = 0; i <arr.length ; i++) {
                if (each==arr[i]){
                    count++;
                }
            }
            if (count==1){
               System.out.println(each+" ");
               // array[j++]=each;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
