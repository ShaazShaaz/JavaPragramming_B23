public class ArrayNeighbouring3 {
    public static void main(String[] args) {
        /*
        Print out the 3 neighboring items of the array in one line until the last line each line
         should contain 3 neighboring items of array element as displayed below
Example:
arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]
Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
         */
        String[] arr={"apple", "banana", "kiwi", "grape", "milk", "soda"};
        for (int i = 0; i < arr.length-2; i++) {
            System.out.println(arr[i]+", "+arr[i+1]+", "+arr[i+2]);

        }



    }
}
