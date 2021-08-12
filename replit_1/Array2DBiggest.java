import java.util.Arrays;

public class Array2DBiggest {
    public static void main(String[] args) {
        /*
        Given a 2d array of ints, find the biggest number(integer) and replace all array
        values on biggest number in the array then print an array.
Example:
Given values: [[1, 2, 3], [5, 33, 9]]
output: [[33, 33, 33], [33, 33, 33]]
         */
        int[][] arr={{1, 2, 3},{5, 33, 9}};
        int biggest=arr[0][0];
        int[][] arr2=new int[2][3];
        for (int[] eachS:arr){
            for (int element:eachS){
                if (element>biggest){
                    biggest=element;
                }
            }
        }
       // System.out.println(biggest);

        for (int i = 0 ;i < arr2.length; i++) {//0,1
            int[] eachS=arr2[i];
            for (int k = 0; k < eachS.length; k++) {
                eachS[k]=biggest;
            }

        }

        System.out.println(Arrays.deepToString(arr2));

    }
}
