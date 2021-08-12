package CustomMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Populate {
    /*
    The populate method accepts an empty int array and populates it with numbers counting up.
Example:
populate(new int[3])
returns:[1,2,3]
     */

    public static void main(String[] args) {
        int[] n=new int[5];
        populate(n);
       System.out.println(Arrays.toString(n));
    }

    public static int[] populate(int[] r){
        Scanner scan=new Scanner(System.in);

        for (int i = 1,j=0; i <= r.length; i++) {
            r[j++]=i;
        }

     return r;
    }
}
