package Day26MultiDimensionalArray;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        /*
        write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
         */
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] result=new int[array.length];  // {10,5,1,0,0,0}

        int i=0;  // index number of result
        for (int number:array){
            //System.out.println(number);

            if (number!=0){  // becuz by default, result={0,0,0,0,0,0}
                result[i++]=number;  // number will be assigned to i/index of result.
                // or result[i]=number
                // i++;        dont forget to i++ cuz the index has to increase
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
