package Day26MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // 2 dimensional arrays: must contain 1 dimensional array

        int[][] arr2D={{1,2,3},{4,5},{6,7,8}};
        //  index        0       1     2
        System.out.println(arr2D.length);
        System.out.println(Arrays.deepToString(arr2D)); // Array.toString will not work for multi

        // {4,5}
        System.out.println(Arrays.toString(arr2D[1]));

        //5
        System.out.println(arr2D[1][1]);  // no toString cuz we just need element
        System.out.println("-----------------");

        for (int i = 0; i < arr2D.length; i++) {
          int[] each1DArray= arr2D[i];  //  retrieve each single dimensional array
            System.out.println(Arrays.toString(each1DArray));
    for (int j = 0; j < each1DArray.length; j++) {// j is the index of elements inside each single dim array
                System.out.println(each1DArray[j]);
                System.out.println("---------------------");

                for (int[] each1D:arr2D){
                    System.out.println(Arrays.toString(each1D));
                    for (int element:each1D){
                        System.out.println(element);
                    }
                }

            }

        }


    }
}
