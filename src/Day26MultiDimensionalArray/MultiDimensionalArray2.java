package Day26MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        //int[] nums={1,2,3};
        //int[][] nums={{1,2,3},{5,3}}; // length==2  cn store many 1D arrays
        int [][][] arr3D={{{1,2,3},{5,3}},{{1,2,3},{5,3}}}; // length==2  cn store as many 2D
          // index                0              1

        // {{1,2,3},{5,3}}   to retrieve a 2D array  use deepToString
        System.out.println(Arrays.deepToString(arr3D[1]));

        // {5,3}   use toString cuz its singleD array
        System.out.println(Arrays.toString(arr3D[0][1]));

        //3
        System.out.println(arr3D[1][0][2]);
        System.out.println("-------------------");

        // print out every single element of the 3D array
        for (int[][] each2D:arr3D){ // for getting each 2D array from aar3D
            for (int[] each:each2D){  // for getting each singleD array from each 2D array
                for (int element:each){  // for getting each element from each singleD array
                    System.out.print(element+" ");
                }
                System.out.println();  // outside innermost loop, to prnt elements of each loop in sep lines

            }
        }
        System.out.println("------------------");

        int [][][][] arr4D={{{{1,2,3},{5,3}},{{1,2,3},{5,3}}},{{{5,2,3},{5,8}},{{4,6,3},{2,3}}}};

    }
}
