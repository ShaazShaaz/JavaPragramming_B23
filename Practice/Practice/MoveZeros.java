package Practice;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        /*
          write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                {10, 5, 1, 0, 0, 0}
         */
       int[] array = {10, 0, 5, 0, 1, 0};
       int[] result=new int[array.length];
       int j=0;
      for (int each:array){
          if (each!=0){
              result[j]=each;
              j++;
          }
      }
        System.out.println(Arrays.toString(result));
    }
}
