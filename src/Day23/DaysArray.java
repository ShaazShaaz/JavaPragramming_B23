package Day23;

import java.util.Scanner;

public class DaysArray {
    public static void main(String[] args) {
        String[] dayName={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                    // index  0       1          2           3         4          5        6
        // size of array= 7
        //cannot add or remove.. array size is always fixed
        System.out.println("Enter a number:");
        int n=new Scanner(System.in).nextInt();

        if (n>=1 && n<=7) {
            System.out.println(dayName[n - 1]);
        }else {
            System.out.println("No such day!");
        }

    }
}
