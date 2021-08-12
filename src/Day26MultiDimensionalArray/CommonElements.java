package Day26MultiDimensionalArray;

public class CommonElements {
    public static void main(String[] args) {
        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          solution 1:
              DO NOT use for each loop
          solution 2:
              MUST use for each loops
         */
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
// take one element from one array and compare with all elements of 2nd array
        for (int element:arr2){ // gets the elements of arr2
        for (int each:arr1) {  // each = each element in arr1
            if (each == element) {
                System.out.println(each);
            }
        }
        }
        System.out.println("-----------------------");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    System.out.println(arr1[j]);
                }
            }

        }

    }
}
