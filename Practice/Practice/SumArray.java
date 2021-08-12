package Practice;

public class SumArray {
    public static void main(String[] args) {
        /*
         Write a Java program to sum values of an array.
         */
        int[] arr={5,7,90,32,7};
        int sum=0;
        for (int element:arr){
            sum+=element;
        }
        System.out.println(sum);



    }
}
