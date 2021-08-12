public class Array5nextTo5 {
    public static void main(String[] args) {
        /*
        Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array.
        If no consecutive 5s or no 5s are detected in your code then print false.
nums → [1, 5, 5, 1, 1] → true
         */
        int[] nums={5, 5, 5, 1, 1};
        String result="";
        for (int i = 0; i < nums.length-1; i++) {
            int count5=0;
            int element=nums[i];
            if (element==5){
                count5++;
            }
            if ( element==5 && nums[i+1]==5){
                result="true";

            }else {
                result="false";
            }
        }
        System.out.println(result);
    }
}
