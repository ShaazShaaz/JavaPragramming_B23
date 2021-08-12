package Practice;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write a Java program to calculate the average value of array elements.
         */

        int[] array={20,35,30,10};
        int sum=0;
        double average=0;
        for (int element:array){
            sum+=element;
            average=(double)sum/array.length;
        }
        System.out.println(average);

    }
}
