package Day23;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
       // toString method to see the entire value of an array variable
       int[] array={1,2,3,4,5,6};
        System.out.println(array); // will give unreadable result called hashcode
        System.out.println(Arrays.toString(array));

        String[] array2=new String[5];

        System.out.println(array2); // will print a hashcode
        System.out.println(Arrays.toString(array2));

        int[] nums=new int[5];
        System.out.println(Arrays.toString(nums));

        double[] num1=new double[5];
        System.out.println(Arrays.toString(num1));

        // sorts the elements of the array in ascending order
        String[] students={"Shazia","Aysu","Kemal","Boburbek"};
        System.out.println(Arrays.toString(students));  // no changes
        Arrays.sort(students); // it will call the Arrays to sort the elements in ascending order
        System.out.println(Arrays.toString(students));

        int[] numbers={9,10,14,4,8,-1,2};
        System.out.println(Arrays.toString(numbers));  // unsorted
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));  // sorted
        System.out.println("Minimum num: "+numbers[0]);
        System.out.println("maximum num: "+numbers[numbers.length-1]);

        char[] chars={'z','r','s','a'};
     System.out.println(Arrays.toString(chars));  // unsorted
        Arrays.sort(chars);
     System.out.println(Arrays.toString(chars));  // sorted

     // equals method
     //equals(arr1,arr2)
     int[] number1={1,2,3};
     int[] number2={1,2,3};
     int[] number3={3,2,1};
     int[] number4={2,3,1};
     boolean r1=Arrays.equals(number1,number2);
     boolean r2=Arrays.equals(number2,number3);

     System.out.println("r1: "+r1);
     System.out.println("r2: "+r2);

     Arrays.sort(number3);
     Arrays.sort(number4);
     boolean r3=Arrays.equals(number3,number4);
     System.out.println("r3: "+r3);





    }
}
