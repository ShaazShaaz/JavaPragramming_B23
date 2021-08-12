package day33_Methods;

import java.util.Arrays;
import java.util.StringTokenizer;

public class WarmUpTask2 {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8};
        boolean s=contains(array,8);
        System.out.println(s);

    }


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
}
