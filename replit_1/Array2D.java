import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        /*
        Given a 2d array of ints, find the biggest number(int) in the array and print it.
         */
        int[][] arr = {{90, 5}, {40, 80}};
        int biggest = arr[0][0];
        for (int[] eachS : arr) {
            for (int element : eachS) {
               // System.out.println(element);

                if (element > biggest) {
                    biggest = element;

                }
                }
            }
        System.out.println( biggest);
        }

    }

