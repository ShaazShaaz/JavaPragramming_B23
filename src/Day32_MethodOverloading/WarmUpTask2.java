package Day32_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {
    /*
     1. create a return method called addInteger that can add an Integer number after the  last index
      of an integer array
    2. create a return method called addDouble that can add a double number after the last index
    of a double array
    3. create a return method called addString that can add a String after the last index of a
    String array
    4. create a return method called addChar that can add a char after last index of a char array
     */
    public static void main(String[] args) {

       int[] array={1,2,3,4,5,6,7,8,9};
       int element=10;
       array=addInteger(array,element);
       // System.out.println(Arrays.toString(array));

        array=addInteger(array,11);
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------------");

        double[] array1={2.5,3.5};
        array1=addDouble(array1,4.5);
        array1=addDouble(array1,5.3);
        System.out.println(Arrays.toString(array1));
        System.out.println("-----------------------------");

        String[] array2={"Shazia","Yuliia","Alexandra"};
        array2=addString(array2,"Victoria");
        System.out.println(Arrays.toString(array2));
        System.out.println("------------------------------");

        char[] arr={'a','b','c'};
        arr=addChar(arr,'d');
        System.out.println(Arrays.toString(arr));

        System.out.println("=======Method Overloading============");

        int[] arr1={1,2,3,4,5};
        arr1=addElement(arr1,6);
        System.out.println(Arrays.toString(arr1));

        double[] a={1.2,3.2,1.1};
        a=addElement(a,4.5);
        System.out.println(Arrays.toString(a));

        String[] str={"eggs","banana","milk"};
        str=addElement(str,"bread");
        System.out.println(Arrays.toString(str));

        char[] ch={'a','c','d'};
        ch=addElement(ch,'f');
        System.out.println(Arrays.toString(ch));

    }




    public static int[] addInteger(int[] array, int number){
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

    public static double[] addDouble(double[] arr, double num){
        double[] result=Arrays.copyOf(arr,arr.length+1); // {1.5,2.4,1.3,5.6,0.0}
        result[result.length-1]=num;//{1.5,2.4,1.3,5.6,4.6}

        return result;
    }

                                   //  {"a","c","d"}      "k"
    public static String[] addString(String[] array, String str){
        String[] result=Arrays.copyOf(array,array.length+1);//{"a","c","d","null"}
        result[result.length-1]=str;  // {"a","c","d","k"}

        return result;
    }

    public static char[] addChar(char[] array, char ch){
        char[] result=Arrays.copyOf(array,array.length+1);//{"a","c","d","null"}
        result[result.length-1]=ch;  // {"a","c","d","k"}

        return result;
    }
    //-------------------method overloading==================

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


}
