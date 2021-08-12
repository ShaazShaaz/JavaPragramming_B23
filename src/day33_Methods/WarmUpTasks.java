package day33_Methods;

import java.util.Arrays;
import utilities.ArraysUtility;

public class WarmUpTasks {
    // remove the element from the given index of the array

    //{1,2,3,4,5}... remove element at index 2
    //{1,2,4,5}   USE CONTINUE STATEMENT

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400};
        numbers = removeElement(numbers, 10);
        System.out.println(Arrays.toString(numbers));

        double[] array1={1.2,3.4,1.4,1.5};
        array1=removeElement(array1,2);
        System.out.println(Arrays.toString(array1));

        String[] array2={"Shazia","Yuliia","Alexandra","Victoria"};
        array2=removeElement(array2,3);
        System.out.println(Arrays.toString(array2));

        // merge 2 arrays
        char[] array3={'a','b','c','d'};
        char[] array4={'e','f','g','h'};
        // call the ArraysUtilities class and import the method
        char[] array5=ArraysUtility.merge(array3,array4);

       // array3=removeElement(array3,0);
        System.out.println(Arrays.toString(array5));

    }

    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            // System.exit(0);  or if u want to return the original array
            return array;

        } else {
            int[] result = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i == index) {  // move all the elements of array to result, except element at index 2
                    continue;
                } else {
                    result[j++] = array[i];
                }

            }
            return result;
        }
    }

    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            // System.exit(0);  or if u want to return the original array
            return array;

        } else {
            double[] result = new double[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i == index) {  // move all the elements of array to result, except element at index 2
                    continue;
                } else {
                    result[j++] = array[i];
                }

            }
            return result;
        }
    }

    public static String[] removeElement(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            // System.exit(0);  or if u want to return the original array
            return array;

        } else {
            String[] result = new String[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i == index) {  // move all the elements of array to result, except element at index 2
                    continue;
                } else {
                    result[j++] = array[i];
                }

            }
            return result;
        }
    }

    public static char[] removeElement(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            // System.exit(0);  or if u want to return the original array
            return array;

        } else {
            char[] result = new char[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i == index) {  // move all the elements of array to result, except element at index 2
                    continue;
                } else {
                    result[j++] = array[i];
                }

            }
            return result;
        }
    }
}
