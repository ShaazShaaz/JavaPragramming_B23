public class ArrayCountEvens {
    public static void main(String[] args) {
        /*
        Given an array nums, count and print the number of even numbers in the array
Examples:
nums → [2, 1, 2, 3, 4]) → 3
         */
        int[] nums={3, 1, 1, 3, 1};
        int numEven=0;
        for (int element:nums){
            if (element%2==0){
                numEven++;
            }
        }
        System.out.println(numEven);
    }
}
