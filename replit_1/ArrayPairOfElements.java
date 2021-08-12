public class ArrayPairOfElements {
    public static void main(String[] args) {
        /*
   The code provided in your main method will take in eight Strings and save them into an array arr.
Print out the 4 lines using for loop: each line should contain a pair of array elements
Example:
arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
         */
        String[] arr={"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};

        for (int i=0;i<arr.length;i+=2){
            System.out.println(arr[i]+", "+arr[i+1]);
        }


    }
}
