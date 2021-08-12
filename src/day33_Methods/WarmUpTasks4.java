package day33_Methods;

import java.util.Arrays;
import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTasks4 {
    /*
    create a method that can remove the duplicates from an array of integer
            Ex:
              int[] array = {1,1,1,2,2,2,3,4,5,5,5};
              removeDup(array);  ===> {1,2,3,4,5}
        2. create a method that can remove the duplicates from an array of double
        3. create a method that can remove the duplicates from an array of String
        4. create a method that can remove the duplicates from an array of char
            HINT: how did you remove the duplicates from a string?
     */
    public static void main(String[] args) {
        // removing duplicates from a string
        String str = "aaabbbcdddeee";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        System.out.println("--------------------------");

        // removing duplicates from int array
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        int[] array=removeDup(arr);
        System.out.println(Arrays.toString(array));

        String[] arr1={"Shazia","Olcay","Olcay","Shazia","Beyza","Beyza"};
        String[] array1=removeDup(arr1);
        System.out.println(Arrays.toString(array1));

        double[] arr2={1.2,1.2,1.3,1.3};
        double[] array2=removeDup(arr2);
        System.out.println(Arrays.toString(array2));

        char[] arr3={'a','a','b','b'};
        char[] array3=removeDup(arr3);
        System.out.println(Arrays.toString(array3));

        // Math class
        System.out.println(Math.max(2,1));
        System.out.println(Math.min(2,1));
        System.out.println(Math.abs(-100));
        System.out.println(Math.pow(10,2));
        System.out.println(Math.sqrt(100));




    }

    public static int[] removeDup(int[] array){
        int[] newArr={};
        for (int each:array){
            if (!ArraysUtility.contains(newArr,each)){ // if element is not contained in new array,
                newArr=ArraysUtility.addElement(newArr,each); // then add element
            }
        }
       return newArr;
    }

    public static String[] removeDup(String[] array){
        String[] newArr={};
        for (String each:array){
            if (!ArraysUtility.contains(newArr,each)){ // if element is not contained in new array,
                newArr=ArraysUtility.addElement(newArr,each); // then add element
            }
        }
        return newArr;
    }

    public static double[] removeDup(double[] array){
        double[] newArr={};
        for (double each:array){
            if (!ArraysUtility.contains(newArr,each)){ // if element is not contained in new array,
                newArr=ArraysUtility.addElement(newArr,each); // then add element
            }
        }
        return newArr;
    }

    public static char[] removeDup(char[] array){
        char[] newArr={};
        for (char each:array){
            if (!ArraysUtility.contains(newArr,each)){ // if element is not contained in new array,
                newArr=ArraysUtility.addElement(newArr,each); // then add element
            }
        }
        return newArr;
    }
}
