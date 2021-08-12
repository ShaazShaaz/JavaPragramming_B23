package Day30Review;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {

        String[] items=new  String[10];// null*10   when u only know the size
        items[3]="Milk";
        items[3]="Grape"; // no more milk.  4th element is grape now
        System.out.println(Arrays.toString(items));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));

        for (int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------");

        int[] nums={10,20,30,40};
        int[] result=new  int[nums.length];  // reverse elements
        for (int i = nums.length-1,j=0; i >=0 ; i--,j++) {
            result[j]=nums[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("---------------------------");

        String[] group1={"Sophie","Feruza","Ekaterina"};  // i
        String[] group2={"Shazia","Bilguun","Danka","Mucahit"}; // j
        String[] group3=new String[group1.length+ group2.length]; // k
        int k=0;
        for (int i=0;i<=group1.length-1;i++){
            group3[k++]=group1[i];

        }
       for (int j = 0; j <= group2.length-1 ; j++) {
            group3[k++]=group2[j];
        }

        System.out.println(Arrays.toString(group3));

    }
}
