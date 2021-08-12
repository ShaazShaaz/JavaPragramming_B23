package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.StringTokenizer;

public class WarmUpTasks3 {
        /*
        create method that accepts one integer array and one integer number and returns the frequency
        of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
        2. create method that accepts one double array and one double number and returns the frequency
        of the number
        3. create method that accepts one String array and one String and returns the frequency of the String
                Ex:
                    String[] array = {"Apple", "Apple", "Apple", "Orange"}
                    frequency(array, "Orange") ==> 1
        4. create method that accepts one char array and a char and returns the frequency of the char
         */
        public static void main(String[] args) {
            // putting the unique elements in a new array
            int[] arr = {1, 2, 3, 4, 4, 4, 3, 3, 5};
            int[] result = {};
            System.out.println(Arrays.toString(result));
            for (int each : arr) {
                if (frequency(arr, each) == 1) {
                    result = ArraysUtility.addElement(result, each);
                }
            }
            System.out.println(Arrays.toString(result));
            System.out.println("--------------------------------");

            int[] arr1={100,200,200,500,400,300,400,500};
            int[] r1=unique(arr1);
            System.out.println(Arrays.toString(r1));

            String[] arr2={"eggs","milk","apple","apple","milk"};
            String[] r2=unique(arr2);
            System.out.println(Arrays.toString(r2));

        }


    // putting the unique elements in a new array
        public static int[] unique(int[] array){
            int[] result = {};
            for (int each : array) {
                if (frequency(array, each) == 1) {
                    result = ArraysUtility.addElement(result, each);
                }
            }
            return result;

}

    public static double[] unique(double[] array){
        double[] result = {};
        for (double each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    public static String[] unique(String[] array){
        String[] result = {};
        for (String each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    public static char[] unique(char[] array){
        char[] result = {};
        for (char each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }


    public static int frequency(int[] array, int element) {
         int count=0;
         for (int each:array){
             if (each==element){
                 count++;
             }
         }
         return count;

    }

    public static int frequency(double[] array, double element) {
        int count=0;
        for (double each:array){
            if (each==element){
                count++;
            }
        }
        return count;

    }

    public static int frequency(String[] array, String element) {
        int count=0;
        for (String each:array){
            if (each.equals(element)){
                count++;
            }
        }
        return count;

    }

    public static int frequency(char[] array, char element) {
        int count=0;
        for (char each:array){
            if (each==element){
                count++;
            }
        }
        return count;

    }
}
