package Day30Review;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers={10,20,30};
        for (int each: numbers){  // each is only the element, not index
            System.out.println(each);// will print out each of the elements
        }
        System.out.println("---------------------");
        // to find the maximum and minimum nums in the array
        int max=numbers[0];
        int min=numbers[0];
        for (int number:numbers){
            max=Math.max(number,max);
            min=Math.min(number,min);
           // if (number>max){
            //    max=number;
           // }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("------------------------");

        System.out.println(Math.sqrt(4));  // square root of
        System.out.println(Math.pow(4,2));  // tto the power of
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println("==========================");

        String[] group1={"Sophie","Feruza","Ekaterina"};  // i
        String[] group2={"Shazia","Bilguun","Danka","Mucahit"}; // j
        String[] group3=new String[group1.length+ group2.length]; // k

        int i=0;
        for (String each1:group1){
            group3[i++]=each1;
        }
        for (String each2:group2){
            group3[i++]=each2;
        }
        System.out.println(Arrays.toString(group3));



    }
}
