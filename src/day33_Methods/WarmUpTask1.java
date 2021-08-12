package day33_Methods;

import java.util.Arrays;

public class WarmUpTask1 {
    /*
   1. create a method that can reverse an array of integer
   2. create a method that can reverse an array of double
   3. create a method that can reverse an array of String
   4. create a method that can reverse an array of cha
    */
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       arr=reverse(arr);
        System.out.println(Arrays.toString(arr));

        String[] students={"Shazia","Yuliia","Alexandra","Victoria"};
        students=reverse(students);
        System.out.println(Arrays.toString(students));

        int[] numbers={1,2,3,4,5};
        numbers=reverse(numbers);
        System.out.println(Arrays.toString(numbers));


    }
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
}
