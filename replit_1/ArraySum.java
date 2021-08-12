public class ArraySum {
    public static void main(String[] args) {
        /*
        Given an array num, calculate the sum of all numbers in the array and print out to the console.
nums → [2, 1, 2, 3, 4]) → 12
nums → [1, 3, 5, 7, 9]) → 25
         */
        int[] num={2, 1, 2, 3, 4};
        int sum=0;
        for (int element:num){
            sum+=element;
        }
        System.out.println(sum);
    }
}
