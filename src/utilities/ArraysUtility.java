package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // create the function that can return the maximum number from the given array
    //   max(new int[]{10,20,30})====>30

    // create the function that can return the minimum number from the given array
    //  min(new int[]{10,20,30})====>10
    public static void main(String[] args) {
        int[] array={18,2,30};
        System.out.println(max(array));
        System.out.println(min(array));


    }
     //  maximum number
    public static int max(int[] arr){
        int max=arr[0];
        for (int each:arr) {
            // if (each>max){
            //  max=each;
            max = Math.max(each, max);
        }
     return max;
    }

    //  minimum number
    public static int min(int[] arr){
        int minimum=arr[0];
        for (int each:arr){
            if (each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            // if (each>min){
            //  min=each;
            min = Math.min(each, min);
        }
        return min;
    }
    
    public static double max(double[] arr){
        double max=arr[0];
        for (double each:arr) {
            // if (each>max){
            //  max=each;
            max = Math.max(each, max);
        }
        return max;
    }

    // merge two arrays of int
        public static int[] merge2(int[] arr1,int[] arr2){
        int [] arr3=new int[arr1.length+arr2.length];
            int j=0;
            for (int each:arr1){
                arr3[j++]=each;
            }
            return arr3;
        }

    // merge two arrays of double
    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (double each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (double each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }

    // merge two arrays of String
    public static String[] merge2(String[] arr1,String[] arr2){
        String [] arr3=new String[arr1.length+arr2.length];
        int j=0;
        for (String each:arr1){
            arr3[j++]=each;
        }
        return arr3;
    }

    // merge two arrays of char
    public static char[] merge(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (char each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (char each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }

    // Method overloading====add element to String, int, char, double array
    public static int[] addElement(int[] array, int number){
        /*int[] result=new int[array.length+1];
        int i=0;
        for (int each:array){
            result[i++]=each;
        }
        // after the loop index is on the last index
        result[i]=number;

         */
        int[] result= Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;

        return result;
    }

    public static double[] addElement(double[] arr, double num){
        double[] result=Arrays.copyOf(arr,arr.length+1); // {1.5,2.4,1.3,5.6,0.0}
        result[result.length-1]=num;//{1.5,2.4,1.3,5.6,4.6}

        return result;
    }

    public static String[] addElement(String[] array, String str){
        String[] result=Arrays.copyOf(array,array.length+1);//{"a","c","d","null"}
        result[result.length-1]=str;  // {"a","c","d","k"}

        return result;
    }

    public static char[] addElement(char[] array, char ch){
        char[] result=Arrays.copyOf(array,array.length+1);//{"a","c","d","null"}
        result[result.length-1]=ch;  // {"a","c","d","k"}

        return result;
    }

    //  remove duplicates from array  {11,2,32,11,2}
   // public static int[] removeDupli(int[] arr){
     //   int count=0;

     //   for (int each:arr) {

     //   }

  //  }

    // REMOVE ELEMENT FROM ARRAY
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

    /*
      1. create a method that accepts two parameters: one integer array and one integer number.
     The method returns true if the number is contained in the integer array, otherwise returns false

     2. create a method that accepts two parameters: one double array and one double number.
     The method returns true if the decimal number is contained in the double array, otherwise returns false

      3. create a method hat accepts two parameters: one String array and one String.
      The method returns true if the String is contained in the String array, otherwise returns false

     4. create a method hat accepts two parameters: one char array and one char.
       The method returns true if the char is contained in the char array, otherwise returns false
     */

    // REVERSE AN ARRAY
    public static int[] reverse(int[] array){
        int[] result=new int[array.length];
        for (int i = array.length-1,j=0; i >=0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    public static String[] reverse(String[] array){
        String[] result=new String[array.length];
        for (int i = array.length-1,j=0; i >=0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    public static double[] reverse(double[] array){
        double[] result=new double[array.length];
        for (int i = array.length-1,j=0; i >=0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    public static char[] reverse(char[] array){
        char[] result=new char[array.length];
        for (int i = array.length-1,j=0; i >=0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    // CONTAINS AN ELEMENT OR NOT----BOOLEAN RETURN

    public static boolean contains(int[] array,int element){
        // boolean result=false;
        for (int each:array){
            if (each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array,double element){
        // boolean result=false;
        for (double each:array){
            if (each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array,String element){
        // boolean result=false;
        for (String each:array){
            if (each.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array,char element){
        // boolean result=false;
        for (char each:array){
            if (each==element){
                return true;
            }
        }
        return false;
    }

    // method overloading for remove duplicates from array
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
